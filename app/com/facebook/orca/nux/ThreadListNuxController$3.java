package com.facebook.orca.nux;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.analytics.AnalyticsLogger;
import com.facebook.analytics.HoneyClientEvent;

class ThreadListNuxController$3
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    ThreadListNuxController.a(this.a).a(new HoneyClientEvent("click").e("button").f("find_contacts_skip_btn"));
    ThreadListNuxController.b(this.a);
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.orca.nux.ThreadListNuxController.3
 * JD-Core Version:    0.6.0
 */