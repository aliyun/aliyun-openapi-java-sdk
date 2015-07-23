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
package com.aliyuncs.yundun.transform.v20150416;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150416.BruteforceLogResponse;
import com.aliyuncs.yundun.model.v20150416.BruteforceLogResponse.BruteforceLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class BruteforceLogResponseUnmarshaller {

	public static BruteforceLogResponse unmarshall(BruteforceLogResponse bruteforceLogResponse, UnmarshallerContext context) {
		
		bruteforceLogResponse.setRequestId(context.stringValue("BruteforceLogResponse.RequestId"));
		bruteforceLogResponse.setStartTime(context.stringValue("BruteforceLogResponse.StartTime"));
		bruteforceLogResponse.setEndTime(context.stringValue("BruteforceLogResponse.EndTime"));
		bruteforceLogResponse.setPageNumber(context.integerValue("BruteforceLogResponse.PageNumber"));
		bruteforceLogResponse.setPageSize(context.integerValue("BruteforceLogResponse.PageSize"));
		bruteforceLogResponse.setTotalCount(context.integerValue("BruteforceLogResponse.TotalCount"));

		List<BruteforceLog> logList = new ArrayList<BruteforceLog>();
		for (int i = 0; i < context.lengthValue("BruteforceLogResponse.LogList.Length"); i++) {
			BruteforceLog  bruteforceLog = new BruteforceLog();
			bruteforceLog.setBlockTimes(context.integerValue("BruteforceLogResponse.LogList["+ i +"].BlockTimes"));
			bruteforceLog.setSourceIp(context.stringValue("BruteforceLogResponse.LogList["+ i +"].SourceIp"));
			bruteforceLog.setStatus(context.integerValue("BruteforceLogResponse.LogList["+ i +"].Status"));
			bruteforceLog.setTime(context.stringValue("BruteforceLogResponse.LogList["+ i +"].Time"));
			bruteforceLog.setLocation(context.stringValue("BruteforceLogResponse.LogList["+ i +"].Location"));

			logList.add(bruteforceLog);
		}
		bruteforceLogResponse.setLogList(logList);
	 
	 	return bruteforceLogResponse;
	}
}