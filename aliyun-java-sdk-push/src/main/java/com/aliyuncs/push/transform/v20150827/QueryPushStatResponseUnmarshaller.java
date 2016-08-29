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

import com.aliyuncs.push.model.v20150827.QueryPushStatResponse;
import com.aliyuncs.push.model.v20150827.QueryPushStatResponse.PushStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushStatResponseUnmarshaller {

	public static QueryPushStatResponse unmarshall(QueryPushStatResponse queryPushStatResponse, UnmarshallerContext context) {
		
		queryPushStatResponse.setRequestId(context.stringValue("QueryPushStatResponse.RequestId"));

		List<PushStat> pushStats = new ArrayList<PushStat>();
		for (int i = 0; i < context.lengthValue("QueryPushStatResponse.PushStats.Length"); i++) {
			PushStat pushStat = new PushStat();
			pushStat.setMessageId(context.stringValue("QueryPushStatResponse.PushStats["+ i +"].MessageId"));
			pushStat.setSentCount(context.longValue("QueryPushStatResponse.PushStats["+ i +"].SentCount"));
			pushStat.setReceivedCount(context.longValue("QueryPushStatResponse.PushStats["+ i +"].ReceivedCount"));
			pushStat.setOpenedCount(context.longValue("QueryPushStatResponse.PushStats["+ i +"].OpenedCount"));
			pushStat.setDeletedCount(context.longValue("QueryPushStatResponse.PushStats["+ i +"].DeletedCount"));

			pushStats.add(pushStat);
		}
		queryPushStatResponse.setPushStats(pushStats);
	 
	 	return queryPushStatResponse;
	}
}