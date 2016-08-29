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

import com.aliyuncs.push.model.v20150827.QueryAppPushStatResponse;
import com.aliyuncs.push.model.v20150827.QueryAppPushStatResponse.AppPushStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAppPushStatResponseUnmarshaller {

	public static QueryAppPushStatResponse unmarshall(QueryAppPushStatResponse queryAppPushStatResponse, UnmarshallerContext context) {
		
		queryAppPushStatResponse.setRequestId(context.stringValue("QueryAppPushStatResponse.RequestId"));

		List<AppPushStat> appPushStats = new ArrayList<AppPushStat>();
		for (int i = 0; i < context.lengthValue("QueryAppPushStatResponse.AppPushStats.Length"); i++) {
			AppPushStat appPushStat = new AppPushStat();
			appPushStat.setTime(context.stringValue("QueryAppPushStatResponse.AppPushStats["+ i +"].Time"));
			appPushStat.setSentCount(context.longValue("QueryAppPushStatResponse.AppPushStats["+ i +"].SentCount"));
			appPushStat.setReceivedCount(context.longValue("QueryAppPushStatResponse.AppPushStats["+ i +"].ReceivedCount"));
			appPushStat.setOpenedCount(context.longValue("QueryAppPushStatResponse.AppPushStats["+ i +"].OpenedCount"));
			appPushStat.setDeletedCount(context.longValue("QueryAppPushStatResponse.AppPushStats["+ i +"].DeletedCount"));

			appPushStats.add(appPushStat);
		}
		queryAppPushStatResponse.setAppPushStats(appPushStats);
	 
	 	return queryAppPushStatResponse;
	}
}