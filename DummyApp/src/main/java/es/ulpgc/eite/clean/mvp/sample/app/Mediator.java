package es.ulpgc.eite.clean.mvp.sample.app;

import es.ulpgc.eite.clean.mvp.sample.bye.Bye;
import es.ulpgc.eite.clean.mvp.sample.dummy.Dummy;
import es.ulpgc.eite.clean.mvp.sample.hello.Hello;

public interface Mediator {
  void startingDummyScreen(Dummy.ToDummy presenter);

  void startingHelloScreen(Hello.ToHello presenter);

  void startingByeScreen(Bye.ToBye presenter);
}
