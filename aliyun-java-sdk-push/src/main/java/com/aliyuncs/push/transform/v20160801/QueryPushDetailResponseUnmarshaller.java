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

import com.aliyuncs.push.model.v20160801.QueryPushDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushDetailResponseUnmarshaller {

	public static QueryPushDetailResponse unmarshall(QueryPushDetailResponse queryPushDetailResponse, UnmarshallerContext context) {
		
		queryPushDetailResponse.setRequestId(context.stringValue("QueryPushDetailResponse.RequestId"));
		queryPushDetailResponse.setAppKey(context.longValue("QueryPushDetailResponse.AppKey"));
		queryPushDetailResponse.setTarget(context.stringValue("QueryPushDetailResponse.Target"));
		queryPushDetailResponse.setTargetValue(context.stringValue("QueryPushDetailResponse.TargetValue"));
		queryPushDetailResponse.setPushType(context.stringValue("QueryPushDetailResponse.PushType"));
		queryPushDetailResponse.setDeviceType(context.stringValue("QueryPushDetailResponse.DeviceType"));
		queryPushDetailResponse.setTitle(context.stringValue("QueryPushDetailResponse.Title"));
		queryPushDetailResponse.setBody(context.stringValue("QueryPushDetailResponse.Body"));
		queryPushDetailResponse.setPushTime(context.stringValue("QueryPushDetailResponse.PushTime"));
		queryPushDetailResponse.setExpireTime(context.stringValue("QueryPushDetailResponse.ExpireTime"));
		queryPushDetailResponse.setAntiHarassStartTime(context.integerValue("QueryPushDetailResponse.AntiHarassStartTime"));
		queryPushDetailResponse.setAntiHarassDuration(context.integerValue("QueryPushDetailResponse.AntiHarassDuration"));
		queryPushDetailResponse.setStoreOffline(context.booleanValue("QueryPushDetailResponse.StoreOffline"));
		queryPushDetailResponse.setBatchNumber(context.stringValue("QueryPushDetailResponse.BatchNumber"));
		queryPushDetailResponse.setProvinceId(context.stringValue("QueryPushDetailResponse.ProvinceId"));
		queryPushDetailResponse.setiOSApnsEnv(context.stringValue("QueryPushDetailResponse.iOSApnsEnv"));
		queryPushDetailResponse.setiOSRemind(context.booleanValue("QueryPushDetailResponse.iOSRemind"));
		queryPushDetailResponse.setiOSRemindBody(context.stringValue("QueryPushDetailResponse.iOSRemindBody"));
		queryPushDetailResponse.setiOSBadge(context.integerValue("QueryPushDetailResponse.iOSBadge"));
		queryPushDetailResponse.setiOSMusic(context.stringValue("QueryPushDetailResponse.iOSMusic"));
		queryPushDetailResponse.setiOSSubtitle(context.stringValue("QueryPushDetailResponse.iOSSubtitle"));
		queryPushDetailResponse.setiOSNotificationCategory(context.stringValue("QueryPushDetailResponse.iOSNotificationCategory"));
		queryPushDetailResponse.setiOSMutableContent(context.booleanValue("QueryPushDetailResponse.iOSMutableContent"));
		queryPushDetailResponse.setiOSExtParameters(context.stringValue("QueryPushDetailResponse.iOSExtParameters"));
		queryPushDetailResponse.setAndroidNotifyType(context.stringValue("QueryPushDetailResponse.AndroidNotifyType"));
		queryPushDetailResponse.setAndroidOpenType(context.stringValue("QueryPushDetailResponse.AndroidOpenType"));
		queryPushDetailResponse.setAndroidActivity(context.stringValue("QueryPushDetailResponse.AndroidActivity"));
		queryPushDetailResponse.setAndroidMusic(context.stringValue("QueryPushDetailResponse.AndroidMusic"));
		queryPushDetailResponse.setAndroidOpenUrl(context.stringValue("QueryPushDetailResponse.AndroidOpenUrl"));
		queryPushDetailResponse.setAndroidXiaoMiActivity(context.stringValue("QueryPushDetailResponse.AndroidXiaoMiActivity"));
		queryPushDetailResponse.setAndroidXiaoMiNotifyTitle(context.stringValue("QueryPushDetailResponse.AndroidXiaoMiNotifyTitle"));
		queryPushDetailResponse.setAndroidXiaoMiNotifyBody(context.stringValue("QueryPushDetailResponse.AndroidXiaoMiNotifyBody"));
		queryPushDetailResponse.setAndroidNotificationBarType(context.integerValue("QueryPushDetailResponse.AndroidNotificationBarType"));
		queryPushDetailResponse.setAndroidNotificationBarPriority(context.integerValue("QueryPushDetailResponse.AndroidNotificationBarPriority"));
		queryPushDetailResponse.setAndroidExtParameters(context.stringValue("QueryPushDetailResponse.AndroidExtParameters"));
	 
	 	return queryPushDetailResponse;
	}
}