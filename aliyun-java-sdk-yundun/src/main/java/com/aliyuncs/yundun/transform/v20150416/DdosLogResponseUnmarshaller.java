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
import com.aliyuncs.yundun.model.v20150416.DdosLogResponse;
import com.aliyuncs.yundun.model.v20150416.DdosLogResponse.DdosLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DdosLogResponseUnmarshaller {

	public static DdosLogResponse unmarshall(DdosLogResponse ddosLogResponse, UnmarshallerContext context) {
		
		ddosLogResponse.setRequestId(context.stringValue("DdosLogResponse.RequestId"));
		ddosLogResponse.setAttackStatus(context.integerValue("DdosLogResponse.AttackStatus"));
		ddosLogResponse.setStartTime(context.stringValue("DdosLogResponse.StartTime"));
		ddosLogResponse.setEndTime(context.stringValue("DdosLogResponse.EndTime"));
		ddosLogResponse.setPageNumber(context.integerValue("DdosLogResponse.PageNumber"));
		ddosLogResponse.setPageSize(context.integerValue("DdosLogResponse.PageSize"));
		ddosLogResponse.setTotalCount(context.integerValue("DdosLogResponse.TotalCount"));

		List<DdosLog> logList = new ArrayList<DdosLog>();
		for (int i = 0; i < context.lengthValue("DdosLogResponse.LogList.Length"); i++) {
			DdosLog  ddosLog = new DdosLog();
			ddosLog.setStartTime(context.stringValue("DdosLogResponse.LogList["+ i +"].StartTime"));
			ddosLog.setEndTime(context.stringValue("DdosLogResponse.LogList["+ i +"].EndTime"));
			ddosLog.setReason(context.stringValue("DdosLogResponse.LogList["+ i +"].Reason"));
			ddosLog.setStatus(context.integerValue("DdosLogResponse.LogList["+ i +"].Status"));
			ddosLog.setBps(context.longValue("DdosLogResponse.LogList["+ i +"].Bps"));
			ddosLog.setPps(context.longValue("DdosLogResponse.LogList["+ i +"].Pps"));
			ddosLog.setQps(context.longValue("DdosLogResponse.LogList["+ i +"].Qps"));
			ddosLog.setAttackType(context.stringValue("DdosLogResponse.LogList["+ i +"].AttackType"));
			ddosLog.setAttackIpList(context.stringValue("DdosLogResponse.LogList["+ i +"].AttackIpList"));
			ddosLog.setType(context.integerValue("DdosLogResponse.LogList["+ i +"].Type"));

			logList.add(ddosLog);
		}
		ddosLogResponse.setLogList(logList);
	 
	 	return ddosLogResponse;
	}
}