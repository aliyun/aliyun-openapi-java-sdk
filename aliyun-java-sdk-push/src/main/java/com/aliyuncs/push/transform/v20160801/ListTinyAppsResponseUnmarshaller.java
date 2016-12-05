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

import com.aliyuncs.push.model.v20160801.ListTinyAppsResponse;
import com.aliyuncs.push.model.v20160801.ListTinyAppsResponse.TinyAppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTinyAppsResponseUnmarshaller {

	public static ListTinyAppsResponse unmarshall(ListTinyAppsResponse listTinyAppsResponse, UnmarshallerContext context) {
		
		listTinyAppsResponse.setRequestId(context.stringValue("ListTinyAppsResponse.RequestId"));

		List<TinyAppInfo> tinyAppInfos = new ArrayList<TinyAppInfo>();
		for (int i = 0; i < context.lengthValue("ListTinyAppsResponse.TinyAppInfos.Length"); i++) {
			TinyAppInfo tinyAppInfo = new TinyAppInfo();
			tinyAppInfo.setAppName(context.stringValue("ListTinyAppsResponse.TinyAppInfos["+ i +"].AppName"));
			tinyAppInfo.setPlatform(context.stringValue("ListTinyAppsResponse.TinyAppInfos["+ i +"].Platform"));
			tinyAppInfo.setAppKey(context.longValue("ListTinyAppsResponse.TinyAppInfos["+ i +"].AppKey"));

			tinyAppInfos.add(tinyAppInfo);
		}
		listTinyAppsResponse.setTinyAppInfos(tinyAppInfos);
	 
	 	return listTinyAppsResponse;
	}
}