Android-Binder-Service-Example
==============================

An example of how to communicate to a service class threw a Binder.

Here's how to set it up:

1)In your service, create an instance of Binder that either:
  a)contains public methods that the client can call
  b) returns the current Service instance, which has public methods the client can call
  c) or, returns an instance of another class hosted by the service with public methods the client can call
2)Return this instance of Binder from the onBind() callback method.
3)In the client, receive the Binder from the onServiceConnected() callback method and make calls to the bound
service using the methods provided.

See https://developer.android.com/guide/components/bound-services.html#Binder for more info.

This is a slightly altered example from https://developer.android.com
