"# spring-config-repo" 

echo "# spring-config-repo" >> README.md
git init
git add .
git commit -m "first commit"
git branch -M master
git remote add origin https://github.com/vikramjitsaha/spring-config-repo.git
git push -u origin master

-----------------------------
ENDPOINTS :-

http://localhost:8888/file/default
http://localhost:8888/file/dev
http://localhost:8888/file/qa
http://localhost:8889/endpoint