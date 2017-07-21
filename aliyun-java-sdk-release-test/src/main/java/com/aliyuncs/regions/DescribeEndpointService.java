package com.aliyuncs.regions;

import com.aliyuncs.auth.Credential;

/**
 * Created by hi.yan.li on 2016/4/26.
 */
public interface DescribeEndpointService {
    DescribeEndpointResponse describeEndpoint(String regionId, String serviceCode, String endpointType,
                                              Credential credential,
                                              LocationConfig locationConfig);
}
