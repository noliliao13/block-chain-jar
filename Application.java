package com.bc;

import org.tron.trident.core.ApiWrapper;
import org.tron.trident.proto.Response;

public class Application {
    public static void main(String[] args) {
        ApiWrapper wrapper = ApiWrapper.ofMainnet("1111111111222222222233333333334444444444555555555566666666667777", "f215a852-a3e1-d698c882d891");
        Response.Account account = wrapper.getAccount("TGLp89yzK2MQha1CRaiaJufPyZRFFnvonW");
        System.out.println(account.getBalance());
        Response.AssetIssueList list = wrapper.getAssetIssueByAccount("TSAhByujvgHgFgL9U48NiUBjkLasP2zCGb");
        System.out.println(list);
    }
}
