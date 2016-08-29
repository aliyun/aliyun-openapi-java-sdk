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
package com.aliyuncs.push.transform.v20150827;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.push.model.v20150827.ListDevicePushRecordsResponse;
import com.aliyuncs.push.model.v20150827.ListDevicePushRecordsResponse.DevicePushStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicePushRecordsResponseUnmarshaller {

	public static ListDevicePushRecordsResponse unmarshall(ListDevicePushRecordsResponse listDevicePushRecordsResponse, UnmarshallerContext context) {
		
		listDevicePushRecordsResponse.setRequestId(context.stringValue("ListDevicePushRecordsResponse.RequestId"));
		listDevicePushRecordsResponse.setTotal(context.integerValue("ListDevicePushRecordsResponse.Total"));
		listDevicePushRecordsResponse.setPageSize(context.integerValue("ListDevicePushRecordsResponse.PageSize"));
		listDevicePushRecordsResponse.setPage(context.integerValue("ListDevicePushRecordsResponse.Page"));

		List<DevicePushStat> messageList = new ArrayList<DevicePushStat>();
		for (int i = 0; i < context.lengthValue("ListDevicePushRecordsResponse.MessageList.Length"); i++) {
			DevicePushStat devicePushStat = new DevicePushStat();
			devicePushStat.setMessageId(context.stringValue("ListDevicePushRecordsResponse.MessageList["+ i +"].MessageId"));
			devicePushStat.setPushStatus(context.stringValue("ListDevicePushRecordsResponse.MessageList["+ i +"].PushStatus"));
			devicePushStat.setDeviceStatusWhenPush(context.stringValue("ListDevicePushRecordsResponse.MessageList["+ i +"].DeviceStatusWhenPush"));
			devicePushStat.setPushTime(context.stringValue("ListDevicePushRecordsResponse.MessageList["+ i +"].PushTime"));
			devicePushStat.setLastModifyTime(context.stringValue("ListDevicePushRecordsResponse.MessageList["+ i +"].LastModifyTime"));

			messageList.add(devicePushStat);
		}
		listDevicePushRecordsResponse.setMessageList(messageList);
	 
	 	return listDevicePushRecordsResponse;
	}
}