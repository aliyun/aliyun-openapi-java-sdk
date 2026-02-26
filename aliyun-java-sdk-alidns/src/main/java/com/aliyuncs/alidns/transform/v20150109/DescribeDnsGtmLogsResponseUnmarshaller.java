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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmLogsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmLogsResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmLogsResponseUnmarshaller {

	public static DescribeDnsGtmLogsResponse unmarshall(DescribeDnsGtmLogsResponse describeDnsGtmLogsResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmLogsResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmLogsResponse.RequestId"));
		describeDnsGtmLogsResponse.setPageSize(_ctx.integerValue("DescribeDnsGtmLogsResponse.PageSize"));
		describeDnsGtmLogsResponse.setPageNumber(_ctx.integerValue("DescribeDnsGtmLogsResponse.PageNumber"));
		describeDnsGtmLogsResponse.setTotalPages(_ctx.integerValue("DescribeDnsGtmLogsResponse.TotalPages"));
		describeDnsGtmLogsResponse.setTotalItems(_ctx.integerValue("DescribeDnsGtmLogsResponse.TotalItems"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmLogsResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setOperTimestamp(_ctx.longValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].OperTimestamp"));
			log.setEntityId(_ctx.stringValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].EntityId"));
			log.setEntityType(_ctx.stringValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].EntityType"));
			log.setOperTime(_ctx.stringValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].OperTime"));
			log.setOperAction(_ctx.stringValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].OperAction"));
			log.setContent(_ctx.stringValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].Content"));
			log.setEntityName(_ctx.stringValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].EntityName"));
			log.setId(_ctx.longValue("DescribeDnsGtmLogsResponse.Logs["+ i +"].Id"));

			logs.add(log);
		}
		describeDnsGtmLogsResponse.setLogs(logs);
	 
	 	return describeDnsGtmLogsResponse;
	}
}