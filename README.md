# DeliKioskapp

This application is a point of sales application for a sandwich shop. It allows a user to order a sandwich with diffrient toppings and size of sandwich. Besides that, it can add also a drink along with chips and will write a reciept once you checkout with your order.

5-24-24

Started off white boarding the main parts of the project and figuring out what I needed and to start on first. 
Picture of the white board below.
![alt text](WhiteBoard.jpg)

I started off eventually with making the classes I would need and folders to organize them.
Picture of the organization below.

![alt text](HowIOrderedTheClasses.jpg)

 I then started making the screens 1st to make sure I had a way of testing sections were working as I kept going with the project.
 Pictures of the MainScreen (first screenshot) and OrderScreen (Second Picture) below.
 ![alt text](MainScreenpic.jpg)
 ![alt text](OrderScreenpic.jpg)

 bugs or errors: 
 -3:10 screens having a stack overflow error(fixed at 3:25)

 5-28-24

 Today was a day of trying to get things to work. Currently things still not functioning as intended ,but made progress into actually adding a sandwich order along with getting a receipt to print. I also started adding many of the other functions to the orderscreen that I thought I could get going and get help later for.

 With the addSandwich function I'm using switches to get the user input of the type of sandwich they want and putting it into a list so that it can be recorded and added onto the receipt. So far having a issue of setting it up to add onto the list ,but hopefully can fix that by tommrow.
 as for the ReceiptWriter class. I don't quite have it running 100% ,but I was able to at least get it written out in a way that I know what I need to do.
 checkout function "works" ,but since the receiptWriter isn't ready yet to print, it will not work as intended.

 bugs or errors:
 -Add sandwich dosen't actually add anything yet due to lists not working yet (in progress)
 -ReceiptWriter not working yet (In progress)