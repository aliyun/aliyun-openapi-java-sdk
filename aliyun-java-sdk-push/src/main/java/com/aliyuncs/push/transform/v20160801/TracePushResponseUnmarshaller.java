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

import com.aliyuncs.push.model.v20160801.TracePushResponse;
import com.aliyuncs.push.model.v20160801.TracePushResponse.PushBasicInfo;
import com.aliyuncs.push.model.v20160801.TracePushResponse.PushDeviceInfo;
import com.aliyuncs.push.model.v20160801.TracePushResponse.PushTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class TracePushResponseUnmarshaller {

	public static TracePushResponse unmarshall(TracePushResponse tracePushResponse, UnmarshallerContext context) {
		
		tracePushResponse.setRequestId(context.stringValue("TracePushResponse.RequestId"));

		PushBasicInfo pushBasicInfo = new PushBasicInfo();
		pushBasicInfo.setAppId(context.longValue("TracePushResponse.PushBasicInfo.AppId"));
		pushBasicInfo.setTitle(context.stringValue("TracePushResponse.PushBasicInfo.Title"));
		pushBasicInfo.setTargetType(context.stringValue("TracePushResponse.PushBasicInfo.TargetType"));
		pushBasicInfo.setPushType(context.stringValue("TracePushResponse.PushBasicInfo.PushType"));
		pushBasicInfo.setPushTime(context.stringValue("TracePushResponse.PushBasicInfo.PushTime"));
		pushBasicInfo.setExpireTime(context.stringValue("TracePushResponse.PushBasicInfo.ExpireTime"));
		tracePushResponse.setPushBasicInfo(pushBasicInfo);

		PushTaskInfo pushTaskInfo = new PushTaskInfo();
		pushTaskInfo.setBroadcast(context.booleanValue("TracePushResponse.PushTaskInfo.Broadcast"));
		pushTaskInfo.setAcceptTime(context.stringValue("TracePushResponse.PushTaskInfo.AcceptTime"));
		pushTaskInfo.setAndroidTaskStatus(context.stringValue("TracePushResponse.PushTaskInfo.AndroidTaskStatus"));
		pushTaskInfo.setiOSTaskStatus(context.stringValue("TracePushResponse.PushTaskInfo.iOSTaskStatus"));
		pushTaskInfo.setAndroidTaskErrCode(context.stringValue("TracePushResponse.PushTaskInfo.AndroidTaskErrCode"));
		pushTaskInfo.setiOSTaskErrCode(context.stringValue("TracePushResponse.PushTaskInfo.iOSTaskErrCode"));

		List<String> deviceSet = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("TracePushResponse.PushTaskInfo.DeviceSet.Length"); i++) {
			deviceSet.add(context.stringValue("TracePushResponse.PushTaskInfo.DeviceSet["+ i +"]"));
		}
		pushTaskInfo.setDeviceSet(deviceSet);
		tracePushResponse.setPushTaskInfo(pushTaskInfo);

		PushDeviceInfo pushDeviceInfo = new PushDeviceInfo();
		pushDeviceInfo.setOnline(context.booleanValue("TracePushResponse.PushDeviceInfo.Online"));
		pushDeviceInfo.setCreateTime(context.stringValue("TracePushResponse.PushDeviceInfo.CreateTime"));
		pushDeviceInfo.setSentTime(context.stringValue("TracePushResponse.PushDeviceInfo.SentTime"));
		pushDeviceInfo.setArriveTime(context.stringValue("TracePushResponse.PushDeviceInfo.ArriveTime"));
		pushDeviceInfo.setClickTime(context.stringValue("TracePushResponse.PushDeviceInfo.ClickTime"));
		pushDeviceInfo.setCleanTime(context.stringValue("TracePushResponse.PushDeviceInfo.CleanTime"));
		pushDeviceInfo.setDeviceStatus(context.stringValue("TracePushResponse.PushDeviceInfo.DeviceStatus"));
		pushDeviceInfo.setDeviceErrCode(context.stringValue("TracePushResponse.PushDeviceInfo.DeviceErrCode"));
		tracePushResponse.setPushDeviceInfo(pushDeviceInfo);
	 
	 	return tracePushResponse;
	}
}