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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20160801.ListAppsResponse;
import com.aliyuncs.push.model.v20160801.ListAppsResponse.AppInfo;
import com.aliyuncs.push.model.v20160801.ListAppsResponse.AppInfo.Extension;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext context) {
		
		listAppsResponse.setRequestId(context.stringValue("ListAppsResponse.RequestId"));

		List<AppInfo> appInfos = new ArrayList<AppInfo>();
		for (int i = 0; i < context.lengthValue("ListAppsResponse.AppInfos.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setAppId(context.stringValue("ListAppsResponse.AppInfos["+ i +"].AppId"));
			appInfo.setAppKey(context.longValue("ListAppsResponse.AppInfos["+ i +"].AppKey"));
			appInfo.setAppName(context.stringValue("ListAppsResponse.AppInfos["+ i +"].AppName"));
			appInfo.setDescription(context.stringValue("ListAppsResponse.AppInfos["+ i +"].Description"));
			appInfo.setIndustryId(context.integerValue("ListAppsResponse.AppInfos["+ i +"].IndustryId"));
			appInfo.setAndroidStatus(context.integerValue("ListAppsResponse.AppInfos["+ i +"].AndroidStatus"));
			appInfo.setIOSStatus(context.integerValue("ListAppsResponse.AppInfos["+ i +"].IOSStatus"));
			appInfo.setDeviceCount(context.longValue("ListAppsResponse.AppInfos["+ i +"].DeviceCount"));
			appInfo.setAppStatus(context.integerValue("ListAppsResponse.AppInfos["+ i +"].AppStatus"));
			appInfo.setStatus(context.integerValue("ListAppsResponse.AppInfos["+ i +"].Status"));
			appInfo.setPushAppId(context.stringValue("ListAppsResponse.AppInfos["+ i +"].PushAppId"));
			appInfo.setSource(context.stringValue("ListAppsResponse.AppInfos["+ i +"].Source"));

			Extension extension = new Extension();
			extension.setXmAppSecretKey(context.stringValue("ListAppsResponse.AppInfos["+ i +"].Extension.XmAppSecretKey"));
			extension.setHwAppKey(context.longValue("ListAppsResponse.AppInfos["+ i +"].Extension.HwAppKey"));
			extension.setHwAppSecretKey(context.stringValue("ListAppsResponse.AppInfos["+ i +"].Extension.HwAppSecretKey"));
			appInfo.setExtension(extension);

			appInfos.add(appInfo);
		}
		listAppsResponse.setAppInfos(appInfos);
	 
	 	return listAppsResponse;
	}
}