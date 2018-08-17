package com.aliyuncs.regions;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.exceptions.ClientException;

/**
 * Created by hi.yan.li on 2016/4/26.
 */
@SuppressWarnings("deprecation")
public interface DescribeEndpointService {
    DescribeEndpointResponse describeEndpoint(String regionId, String serviceCode, String endpointType,
                                              Credential credential,
                                              LocationConfig locationConfig) throws ClientException;
}
