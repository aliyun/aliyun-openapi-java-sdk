/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.push.transform.v20160801;

import com.aliyuncs.push.model.v20160801.QueryAppConfigResponse;
import com.aliyuncs.push.model.v20160801.QueryAppConfigResponse.AppConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppConfigResponseUnmarshaller {

	public static QueryAppConfigResponse unmarshall(QueryAppConfigResponse queryAppConfigResponse, UnmarshallerContext context) {
		
		queryAppConfigResponse.setRequestId(context.stringValue("QueryAppConfigResponse.RequestId"));

		AppConfig appConfig = new AppConfig();
		appConfig.setAppKey(context.longValue("QueryAppConfigResponse.AppConfig.AppKey"));
		appConfig.setAppId(context.stringValue("QueryAppConfigResponse.AppConfig.AppId"));
		appConfig.setAppName(context.stringValue("QueryAppConfigResponse.AppConfig.AppName"));
		appConfig.setBundleId(context.stringValue("QueryAppConfigResponse.AppConfig.BundleId"));
		appConfig.setPackageName(context.stringValue("QueryAppConfigResponse.AppConfig.PackageName"));
		appConfig.setBoxFlag(context.booleanValue("QueryAppConfigResponse.AppConfig.BoxFlag"));
		appConfig.setAndroid(context.booleanValue("QueryAppConfigResponse.AppConfig.Android"));
		appConfig.setIOS(context.booleanValue("QueryAppConfigResponse.AppConfig.IOS"));
		appConfig.setProductCertKey(context.stringValue("QueryAppConfigResponse.AppConfig.ProductCertKey"));
		appConfig.setProductCertPass(context.stringValue("QueryAppConfigResponse.AppConfig.ProductCertPass"));
		appConfig.setDevCertKey(context.stringValue("QueryAppConfigResponse.AppConfig.DevCertKey"));
		appConfig.setDevCertPass(context.stringValue("QueryAppConfigResponse.AppConfig.DevCertPass"));
		queryAppConfigResponse.setAppConfig(appConfig);
	 
	 	return queryAppConfigResponse;
	}
}