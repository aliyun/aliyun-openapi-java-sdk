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
import com.aliyuncs.yundun.model.v20150416.LogineventLogResponse;
import com.aliyuncs.yundun.model.v20150416.LogineventLogResponse.LoginEventLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class LogineventLogResponseUnmarshaller {

	public static LogineventLogResponse unmarshall(LogineventLogResponse logineventLogResponse, UnmarshallerContext context) {
		
		logineventLogResponse.setRequestId(context.stringValue("LogineventLogResponse.RequestId"));
		logineventLogResponse.setStartTime(context.stringValue("LogineventLogResponse.StartTime"));
		logineventLogResponse.setEndTime(context.stringValue("LogineventLogResponse.EndTime"));
		logineventLogResponse.setPageNumber(context.integerValue("LogineventLogResponse.PageNumber"));
		logineventLogResponse.setPageSize(context.integerValue("LogineventLogResponse.PageSize"));
		logineventLogResponse.setTotalCount(context.integerValue("LogineventLogResponse.TotalCount"));

		List<LoginEventLog> logList = new ArrayList<LoginEventLog>();
		for (int i = 0; i < context.lengthValue("LogineventLogResponse.LogList.Length"); i++) {
			LoginEventLog  loginEventLog = new LoginEventLog();
			loginEventLog.setBlockTimes(context.integerValue("LogineventLogResponse.LogList["+ i +"].BlockTimes"));
			loginEventLog.setSourceIp(context.stringValue("LogineventLogResponse.LogList["+ i +"].SourceIp"));
			loginEventLog.setStatus(context.integerValue("LogineventLogResponse.LogList["+ i +"].Status"));
			loginEventLog.setTime(context.stringValue("LogineventLogResponse.LogList["+ i +"].Time"));
			loginEventLog.setLocation(context.stringValue("LogineventLogResponse.LogList["+ i +"].Location"));

			logList.add(loginEventLog);
		}
		logineventLogResponse.setLogList(logList);
	 
	 	return logineventLogResponse;
	}
}