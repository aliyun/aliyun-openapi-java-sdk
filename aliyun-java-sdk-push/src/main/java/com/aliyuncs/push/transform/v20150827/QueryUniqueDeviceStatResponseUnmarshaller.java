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

import com.aliyuncs.push.model.v20150827.QueryUniqueDeviceStatResponse;
import com.aliyuncs.push.model.v20150827.QueryUniqueDeviceStatResponse.AppDeviceStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUniqueDeviceStatResponseUnmarshaller {

	public static QueryUniqueDeviceStatResponse unmarshall(QueryUniqueDeviceStatResponse queryUniqueDeviceStatResponse, UnmarshallerContext context) {
		
		queryUniqueDeviceStatResponse.setRequestId(context.stringValue("QueryUniqueDeviceStatResponse.RequestId"));

		List<AppDeviceStat> appDeviceStats = new ArrayList<AppDeviceStat>();
		for (int i = 0; i < context.lengthValue("QueryUniqueDeviceStatResponse.AppDeviceStats.Length"); i++) {
			AppDeviceStat appDeviceStat = new AppDeviceStat();
			appDeviceStat.setTime(context.stringValue("QueryUniqueDeviceStatResponse.AppDeviceStats["+ i +"].Time"));
			appDeviceStat.setCount(context.longValue("QueryUniqueDeviceStatResponse.AppDeviceStats["+ i +"].Count"));

			appDeviceStats.add(appDeviceStat);
		}
		queryUniqueDeviceStatResponse.setAppDeviceStats(appDeviceStats);
	 
	 	return queryUniqueDeviceStatResponse;
	}
}