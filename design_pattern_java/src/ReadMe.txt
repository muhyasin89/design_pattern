

When To use The obeserver Pattern
---------------------------------
1. When you need many objects to receive an update when another objects changes
    * Stock market with thousand of stock needs to send updates to objects representing individual stocks
    * The Subject(publisher) send many stocks to the obeserver
    * The Observer (subscribers) takes the ones they want and use them