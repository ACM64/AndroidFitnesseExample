# AndroidFitnesseExample
Sample project to show capabilities of Fitnesse running on Android

# Building project
Project has 2 parts, Fitnesse server itself and Android application that running Slim client communicating with server.

**!Note**: Before launching server please make sure that you have connected Android device as 
script also trying to do port forwarding from Device to your local machine so that Slim
client configuration shouldn't change if device changed IP.
## Launching server
> fitnesse/launchFitnesse.sh

If you did everything right, then you can access server using hardcoded port - 8113, [http://localhost:8113](http://localhost:8113)
 . 
 And the sample test located at [/ExampleSuite.AndroidExampleTest](http://localhost:8113/ExampleSuite.AndroidExampleTest)
 . 
 
## Launching app
Nothing specific required, just build and run application. The socket server launches with the app start.


