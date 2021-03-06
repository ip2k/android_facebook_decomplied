package com.facebook.uberbar.resolvers;

import android.content.ContentResolver;
import android.database.Cursor;
import com.facebook.ipc.connections.ConnectionsContract;
import com.facebook.ipc.data.uberbar.UberbarResult;
import com.facebook.orca.common.util.AndroidThreadUtil;
import com.google.common.base.Function;
import java.util.List;

public class PagesLocalUberbarResultResolverFactory
{
  public static final Function<Cursor, List<UberbarResult>> a = new PagesLocalUberbarResultResolverFactory.1();
  public static final String[] b = { "user_id", "display_name", "user_image_url" };

  public static LocalUberbarResultResolver a(ContentResolver paramContentResolver, AndroidThreadUtil paramAndroidThreadUtil)
  {
    return new LocalUberbarResultResolver(paramContentResolver, paramAndroidThreadUtil, ConnectionsContract.k, b, a);
  }
}

/* Location:           /data1/software/apk2java/dex2jar-0.0.9.12/secondary-1.dex_dex2jar.jar
 * Qualified Name:     com.facebook.uberbar.resolvers.PagesLocalUberbarResultResolverFactory
 * JD-Core Version:    0.6.2
 */