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
import com.aliyuncs.yundun.model.v20150416.WafLogResponse;
import com.aliyuncs.yundun.model.v20150416.WafLogResponse.WafLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class WafLogResponseUnmarshaller {

	public static WafLogResponse unmarshall(WafLogResponse wafLogResponse, UnmarshallerContext context) {
		
		wafLogResponse.setRequestId(context.stringValue("WafLogResponse.RequestId"));
		wafLogResponse.setWebAttack(context.integerValue("WafLogResponse.WebAttack"));
		wafLogResponse.setNewWafUser(context.booleanValue("WafLogResponse.NewWafUser"));
		wafLogResponse.setWafOpened(context.booleanValue("WafLogResponse.WafOpened"));
		wafLogResponse.setInWhiteList(context.booleanValue("WafLogResponse.InWhiteList"));
		wafLogResponse.setDomainCount(context.integerValue("WafLogResponse.DomainCount"));
		wafLogResponse.setStartTime(context.stringValue("WafLogResponse.StartTime"));
		wafLogResponse.setEndTime(context.stringValue("WafLogResponse.EndTime"));
		wafLogResponse.setPageNumber(context.integerValue("WafLogResponse.PageNumber"));
		wafLogResponse.setPageSize(context.integerValue("WafLogResponse.PageSize"));
		wafLogResponse.setTotalCount(context.integerValue("WafLogResponse.TotalCount"));

		List<WafLog> logList = new ArrayList<WafLog>();
		for (int i = 0; i < context.lengthValue("WafLogResponse.LogList.Length"); i++) {
			WafLog  wafLog = new WafLog();
			wafLog.setSourceIp(context.stringValue("WafLogResponse.LogList["+ i +"].SourceIp"));
			wafLog.setTime(context.stringValue("WafLogResponse.LogList["+ i +"].Time"));
			wafLog.setUrl(context.stringValue("WafLogResponse.LogList["+ i +"].Url"));
			wafLog.setType(context.stringValue("WafLogResponse.LogList["+ i +"].Type"));
			wafLog.setStatus(context.integerValue("WafLogResponse.LogList["+ i +"].Status"));

			logList.add(wafLog);
		}
		wafLogResponse.setLogList(logList);
	 
	 	return wafLogResponse;
	}
}