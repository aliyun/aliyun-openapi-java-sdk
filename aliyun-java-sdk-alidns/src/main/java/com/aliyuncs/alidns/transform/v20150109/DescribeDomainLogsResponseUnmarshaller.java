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
package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainLogsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainLogsResponse.DomainLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainLogsResponseUnmarshaller {

	public static DescribeDomainLogsResponse unmarshall(DescribeDomainLogsResponse describeDomainLogsResponse, UnmarshallerContext context) {
		
		describeDomainLogsResponse.setRequestId(context.stringValue("DescribeDomainLogsResponse.RequestId"));
		describeDomainLogsResponse.setTotalCount(context.longValue("DescribeDomainLogsResponse.TotalCount"));
		describeDomainLogsResponse.setPageNumber(context.longValue("DescribeDomainLogsResponse.PageNumber"));
		describeDomainLogsResponse.setPageSize(context.longValue("DescribeDomainLogsResponse.PageSize"));

		List<DomainLog> domainLogs = new ArrayList<DomainLog>();
		for (int i = 0; i < context.lengthValue("DescribeDomainLogsResponse.DomainLogs.Length"); i++) {
			DomainLog domainLog = new DomainLog();
			domainLog.setActionTime(context.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].ActionTime"));
			domainLog.setDomainName(context.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].DomainName"));
			domainLog.setAction(context.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].Action"));
			domainLog.setMessage(context.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].Message"));
			domainLog.setClientIp(context.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].ClientIp"));

			domainLogs.add(domainLog);
		}
		describeDomainLogsResponse.setDomainLogs(domainLogs);
	 
	 	return describeDomainLogsResponse;
	}
}