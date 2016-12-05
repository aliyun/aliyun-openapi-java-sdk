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

import com.aliyuncs.push.model.v20160801.QueryAppInfoResponse;
import com.aliyuncs.push.model.v20160801.QueryAppInfoResponse.AppInfo;
import com.aliyuncs.push.model.v20160801.QueryAppInfoResponse.AppInfo.Extension;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppInfoResponseUnmarshaller {

	public static QueryAppInfoResponse unmarshall(QueryAppInfoResponse queryAppInfoResponse, UnmarshallerContext context) {
		
		queryAppInfoResponse.setRequestId(context.stringValue("QueryAppInfoResponse.RequestId"));

		AppInfo appInfo = new AppInfo();
		appInfo.setAppKey(context.longValue("QueryAppInfoResponse.AppInfo.AppKey"));
		appInfo.setAppId(context.stringValue("QueryAppInfoResponse.AppInfo.AppId"));
		appInfo.setPushAppId(context.stringValue("QueryAppInfoResponse.AppInfo.PushAppId"));
		appInfo.setAppName(context.stringValue("QueryAppInfoResponse.AppInfo.AppName"));
		appInfo.setDescription(context.stringValue("QueryAppInfoResponse.AppInfo.Description"));
		appInfo.setIndustryId(context.integerValue("QueryAppInfoResponse.AppInfo.IndustryId"));
		appInfo.setAndroidStatus(context.integerValue("QueryAppInfoResponse.AppInfo.AndroidStatus"));
		appInfo.setIOSStatus(context.integerValue("QueryAppInfoResponse.AppInfo.IOSStatus"));
		appInfo.setDeviceCount(context.longValue("QueryAppInfoResponse.AppInfo.DeviceCount"));
		appInfo.setAppStatus(context.integerValue("QueryAppInfoResponse.AppInfo.AppStatus"));
		appInfo.setStatus(context.integerValue("QueryAppInfoResponse.AppInfo.Status"));

		Extension extension = new Extension();
		extension.setXmAppSecretKey(context.stringValue("QueryAppInfoResponse.AppInfo.Extension.XmAppSecretKey"));
		extension.setHwAppKey(context.stringValue("QueryAppInfoResponse.AppInfo.Extension.HwAppKey"));
		extension.setHwAppSecretKey(context.stringValue("QueryAppInfoResponse.AppInfo.Extension.HwAppSecretKey"));
		appInfo.setExtension(extension);
		queryAppInfoResponse.setAppInfo(appInfo);
	 
	 	return queryAppInfoResponse;
	}
}