package com.facebook.background;

class BackgroundTaskRunner$3
  implements Runnable
{
  public void run()
  {
    synchronized (BackgroundTaskRunner.a(this.a))
    {
      BackgroundTaskRunner.a(this.a, null);
      BackgroundTaskRunner.b(this.a);
      return;
    }
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.background.BackgroundTaskRunner.3
 * JD-Core Version:    0.6.0
 */