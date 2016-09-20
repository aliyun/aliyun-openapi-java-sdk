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

import com.aliyuncs.push.model.v20150827.QueryPushDataResponse;
import com.aliyuncs.push.model.v20150827.QueryPushDataResponse.BillInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushDataResponseUnmarshaller {

	public static QueryPushDataResponse unmarshall(QueryPushDataResponse queryPushDataResponse, UnmarshallerContext context) {
		
		queryPushDataResponse.setRequestId(context.stringValue("QueryPushDataResponse.RequestId"));

		List<BillInfo> pushDataInfos = new ArrayList<BillInfo>();
		for (int i = 0; i < context.lengthValue("QueryPushDataResponse.PushDataInfos.Length"); i++) {
			BillInfo billInfo = new BillInfo();
			billInfo.setDate(context.stringValue("QueryPushDataResponse.PushDataInfos["+ i +"].Date"));
			billInfo.setAccepted(context.integerValue("QueryPushDataResponse.PushDataInfos["+ i +"].Accepted"));
			billInfo.setSent(context.integerValue("QueryPushDataResponse.PushDataInfos["+ i +"].Sent"));
			billInfo.setReceived(context.integerValue("QueryPushDataResponse.PushDataInfos["+ i +"].Received"));
			billInfo.setOpened(context.integerValue("QueryPushDataResponse.PushDataInfos["+ i +"].Opened"));
			billInfo.setDeleted(context.integerValue("QueryPushDataResponse.PushDataInfos["+ i +"].Deleted"));

			pushDataInfos.add(billInfo);
		}
		queryPushDataResponse.setPushDataInfos(pushDataInfos);
	 
	 	return queryPushDataResponse;
	}
}