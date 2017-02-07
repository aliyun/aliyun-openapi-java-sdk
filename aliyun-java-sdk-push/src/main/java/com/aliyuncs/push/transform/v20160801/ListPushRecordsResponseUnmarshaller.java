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

import com.aliyuncs.push.model.v20160801.ListPushRecordsResponse;
import com.aliyuncs.push.model.v20160801.ListPushRecordsResponse.PushMessageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPushRecordsResponseUnmarshaller {

	public static ListPushRecordsResponse unmarshall(ListPushRecordsResponse listPushRecordsResponse, UnmarshallerContext context) {
		
		listPushRecordsResponse.setRequestId(context.stringValue("ListPushRecordsResponse.RequestId"));
		listPushRecordsResponse.setTotal(context.integerValue("ListPushRecordsResponse.Total"));
		listPushRecordsResponse.setPage(context.integerValue("ListPushRecordsResponse.Page"));
		listPushRecordsResponse.setPageSize(context.integerValue("ListPushRecordsResponse.PageSize"));

		List<PushMessageInfo> pushMessageInfos = new ArrayList<PushMessageInfo>();
		for (int i = 0; i < context.lengthValue("ListPushRecordsResponse.PushMessageInfos.Length"); i++) {
			PushMessageInfo pushMessageInfo = new PushMessageInfo();
			pushMessageInfo.setAppKey(context.longValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].AppKey"));
			pushMessageInfo.setAppName(context.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].AppName"));
			pushMessageInfo.setMessageId(context.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].MessageId"));
			pushMessageInfo.setType(context.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].Type"));
			pushMessageInfo.setDeviceType(context.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].DeviceType"));
			pushMessageInfo.setPushTime(context.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].PushTime"));
			pushMessageInfo.setTitle(context.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].Title"));
			pushMessageInfo.setBody(context.stringValue("ListPushRecordsResponse.PushMessageInfos["+ i +"].Body"));

			pushMessageInfos.add(pushMessageInfo);
		}
		listPushRecordsResponse.setPushMessageInfos(pushMessageInfos);
	 
	 	return listPushRecordsResponse;
	}
}