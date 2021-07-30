.How To access to API Documentation
https://modyopokedex.herokuapp.com/swagger-ui.html

.Postman Collection
Pokemon.postman_collection.json

.How to deploy on Heroku
1.Clone github repository 
git clone https://github.com/morteriwi/modyopokedex.git

2.Login on heroku
$ heroku login

3.Create an app
$heroku create example

4.Link to github branch
heroku git:remote -a https://github.com/morteriwi/modyopokedex.git

5.Push changes to heroku
git push heroku master

Wait for deploy successfull message.