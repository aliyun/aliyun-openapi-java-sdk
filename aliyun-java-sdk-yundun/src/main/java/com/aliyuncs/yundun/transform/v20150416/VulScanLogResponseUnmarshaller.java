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
import com.aliyuncs.yundun.model.v20150416.VulScanLogResponse;
import com.aliyuncs.yundun.model.v20150416.VulScanLogResponse.VulScanLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class VulScanLogResponseUnmarshaller {

	public static VulScanLogResponse unmarshall(VulScanLogResponse vulScanLogResponse, UnmarshallerContext context) {
		
		vulScanLogResponse.setRequestId(context.stringValue("VulScanLogResponse.RequestId"));
		vulScanLogResponse.setStartTime(context.stringValue("VulScanLogResponse.StartTime"));
		vulScanLogResponse.setEndTime(context.stringValue("VulScanLogResponse.EndTime"));
		vulScanLogResponse.setPageNumber(context.integerValue("VulScanLogResponse.PageNumber"));
		vulScanLogResponse.setPageSize(context.integerValue("VulScanLogResponse.PageSize"));
		vulScanLogResponse.setTotalCount(context.integerValue("VulScanLogResponse.TotalCount"));

		List<VulScanLog> logList = new ArrayList<VulScanLog>();
		for (int i = 0; i < context.lengthValue("VulScanLogResponse.LogList.Length"); i++) {
			VulScanLog  vulScanLog = new VulScanLog();
			vulScanLog.setId(context.integerValue("VulScanLogResponse.LogList["+ i +"].Id"));
			vulScanLog.setType(context.stringValue("VulScanLogResponse.LogList["+ i +"].Type"));
			vulScanLog.setUrl(context.stringValue("VulScanLogResponse.LogList["+ i +"].Url"));
			vulScanLog.setHelpAddress(context.stringValue("VulScanLogResponse.LogList["+ i +"].HelpAddress"));
			vulScanLog.setVulParameter(context.stringValue("VulScanLogResponse.LogList["+ i +"].VulParameter"));
			vulScanLog.setStatus(context.integerValue("VulScanLogResponse.LogList["+ i +"].Status"));

			logList.add(vulScanLog);
		}
		vulScanLogResponse.setLogList(logList);
	 
	 	return vulScanLogResponse;
	}
}