#1
SELECT matchid, player FROM goal 
WHERE teamid = 'GER'

#2
SELECT id,stadium,team1,team2
FROM game WHERE id = 1012

#3
SELECT player, teamid, stadium, mdate
FROM game JOIN goal ON (id=matchid)
WHERE goal.teamid = 'GER';

#4
SELECT game.team1, game.team2, goal.player
FROM game LEFT JOIN goal on game.id = goal.matchid
WHERE player like 'Mario%';

#5
SELECT player, teamid, gtime
FROM goal 
WHERE gtime<=10

#6
SELECT game.mdate, eteam.teamname
FROM game
JOIN eteam ON (game.team1=eteam.id)
WHERE eteam.coach = 'Fernando Santos';

#7
SELECT goal.player
FROM goal
LEFT JOIN game on goal.matchid = game.id
WHERE game.stadium = 'National Stadium, Warsaw';

#8
SELECT distinct(player)
FROM game JOIN goal ON matchid = id 
WHERE (team1='GER' OR team2='GER') AND goal.teamid <> 'GER';

#9
SELECT teamname, count(*)
FROM eteam JOIN goal ON id=teamid
GROUP BY teamname;

#10
SELECT stadium, count(*)
FROM game JOIN goal ON id=matchid
GROUP BY stadium;

#11
SELECT matchid, mdate, count(teamid)
FROM game JOIN goal ON matchid = id 
WHERE (team1 = 'POL' OR team2 = 'POL')
GROUP BY matchid, mdate;

#12
SELECT matchid, mdate, COUNT(teamid)
FROM goal INNER JOIN game on matchid=id
WHERE (team1 = 'GER' OR team2 = 'GER') AND teamid='GER'
GROUP BY matchid, mdate;

#13
SELECT mdate,team1,
sum(CASE WHEN teamid=team1 THEN 1 ELSE 0 END) AS score1,
team2, sum(CASE WHEN teamid=team2 THEN 1 ELSE 0 END) AS score2
FROM game LEFT JOIN goal ON matchid = id 
GROUP BY mdate, team1, team2
GROUP BY mdate, matchid, team1, team2;
