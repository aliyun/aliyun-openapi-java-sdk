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

import com.aliyuncs.push.model.v20160801.QueryPushStatByAppResponse;
import com.aliyuncs.push.model.v20160801.QueryPushStatByAppResponse.AppPushStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPushStatByAppResponseUnmarshaller {

	public static QueryPushStatByAppResponse unmarshall(QueryPushStatByAppResponse queryPushStatByAppResponse, UnmarshallerContext context) {
		
		queryPushStatByAppResponse.setRequestId(context.stringValue("QueryPushStatByAppResponse.RequestId"));

		List<AppPushStat> appPushStats = new ArrayList<AppPushStat>();
		for (int i = 0; i < context.lengthValue("QueryPushStatByAppResponse.AppPushStats.Length"); i++) {
			AppPushStat appPushStat = new AppPushStat();
			appPushStat.setTime(context.stringValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].Time"));
			appPushStat.setAcceptCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].AcceptCount"));
			appPushStat.setSentCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SentCount"));
			appPushStat.setReceivedCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].ReceivedCount"));
			appPushStat.setOpenedCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].OpenedCount"));
			appPushStat.setDeletedCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].DeletedCount"));
			appPushStat.setSmsSentCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsSentCount"));
			appPushStat.setSmsSkipCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsSkipCount"));
			appPushStat.setSmsFailedCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsFailedCount"));
			appPushStat.setSmsReceiveSuccessCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsReceiveSuccessCount"));
			appPushStat.setSmsReceiveFailedCount(context.longValue("QueryPushStatByAppResponse.AppPushStats["+ i +"].SmsReceiveFailedCount"));

			appPushStats.add(appPushStat);
		}
		queryPushStatByAppResponse.setAppPushStats(appPushStats);
	 
	 	return queryPushStatByAppResponse;
	}
}