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

import com.aliyuncs.alidns.model.v20150109.DescribePdnsThreatLogsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsThreatLogsResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsThreatLogsResponseUnmarshaller {

	public static DescribePdnsThreatLogsResponse unmarshall(DescribePdnsThreatLogsResponse describePdnsThreatLogsResponse, UnmarshallerContext _ctx) {
		
		describePdnsThreatLogsResponse.setRequestId(_ctx.stringValue("DescribePdnsThreatLogsResponse.RequestId"));
		describePdnsThreatLogsResponse.setTotalCount(_ctx.longValue("DescribePdnsThreatLogsResponse.TotalCount"));
		describePdnsThreatLogsResponse.setPageSize(_ctx.longValue("DescribePdnsThreatLogsResponse.PageSize"));
		describePdnsThreatLogsResponse.setPageNumber(_ctx.longValue("DescribePdnsThreatLogsResponse.PageNumber"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsThreatLogsResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setSubDomain(_ctx.stringValue("DescribePdnsThreatLogsResponse.Logs["+ i +"].SubDomain"));
			log.setSourceIp(_ctx.stringValue("DescribePdnsThreatLogsResponse.Logs["+ i +"].SourceIp"));
			log.setThreatLevel(_ctx.stringValue("DescribePdnsThreatLogsResponse.Logs["+ i +"].ThreatLevel"));
			log.setThreatTime(_ctx.stringValue("DescribePdnsThreatLogsResponse.Logs["+ i +"].ThreatTime"));
			log.setThreatType(_ctx.stringValue("DescribePdnsThreatLogsResponse.Logs["+ i +"].ThreatType"));

			logs.add(log);
		}
		describePdnsThreatLogsResponse.setLogs(logs);
	 
	 	return describePdnsThreatLogsResponse;
	}
}