/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainLogsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainLogsResponse.DomainLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainLogsResponseUnmarshaller {

	public static DescribeDomainLogsResponse unmarshall(DescribeDomainLogsResponse describeDomainLogsResponse, UnmarshallerContext _ctx) {
		
		describeDomainLogsResponse.setRequestId(_ctx.stringValue("DescribeDomainLogsResponse.RequestId"));
		describeDomainLogsResponse.setTotalCount(_ctx.longValue("DescribeDomainLogsResponse.TotalCount"));
		describeDomainLogsResponse.setPageNumber(_ctx.longValue("DescribeDomainLogsResponse.PageNumber"));
		describeDomainLogsResponse.setPageSize(_ctx.longValue("DescribeDomainLogsResponse.PageSize"));

		List<DomainLog> domainLogs = new ArrayList<DomainLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainLogsResponse.DomainLogs.Length"); i++) {
			DomainLog domainLog = new DomainLog();
			domainLog.setActionTime(_ctx.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].ActionTime"));
			domainLog.setActionTimestamp(_ctx.longValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].ActionTimestamp"));
			domainLog.setDomainName(_ctx.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].DomainName"));
			domainLog.setAction(_ctx.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].Action"));
			domainLog.setMessage(_ctx.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].Message"));
			domainLog.setClientIp(_ctx.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].ClientIp"));
			domainLog.setZoneId(_ctx.stringValue("DescribeDomainLogsResponse.DomainLogs["+ i +"].ZoneId"));

			domainLogs.add(domainLog);
		}
		describeDomainLogsResponse.setDomainLogs(domainLogs);
	 
	 	return describeDomainLogsResponse;
	}
}