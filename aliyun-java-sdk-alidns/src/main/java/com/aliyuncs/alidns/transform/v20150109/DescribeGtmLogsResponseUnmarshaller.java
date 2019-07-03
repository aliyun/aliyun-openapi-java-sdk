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

import com.aliyuncs.alidns.model.v20150109.DescribeGtmLogsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmLogsResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmLogsResponseUnmarshaller {

	public static DescribeGtmLogsResponse unmarshall(DescribeGtmLogsResponse describeGtmLogsResponse, UnmarshallerContext _ctx) {
		
		describeGtmLogsResponse.setRequestId(_ctx.stringValue("DescribeGtmLogsResponse.RequestId"));
		describeGtmLogsResponse.setTotalItems(_ctx.integerValue("DescribeGtmLogsResponse.TotalItems"));
		describeGtmLogsResponse.setTotalPages(_ctx.integerValue("DescribeGtmLogsResponse.TotalPages"));
		describeGtmLogsResponse.setPageSize(_ctx.integerValue("DescribeGtmLogsResponse.PageSize"));
		describeGtmLogsResponse.setPageNumber(_ctx.integerValue("DescribeGtmLogsResponse.PageNumber"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmLogsResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setOperTime(_ctx.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].OperTime"));
			log.setOperAction(_ctx.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].OperAction"));
			log.setEntityType(_ctx.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].EntityType"));
			log.setEntityId(_ctx.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].EntityId"));
			log.setEntityName(_ctx.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].EntityName"));
			log.setOperIp(_ctx.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].OperIp"));
			log.setOperTimestamp(_ctx.longValue("DescribeGtmLogsResponse.Logs["+ i +"].OperTimestamp"));
			log.setId(_ctx.longValue("DescribeGtmLogsResponse.Logs["+ i +"].Id"));
			log.setContent(_ctx.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].Content"));

			logs.add(log);
		}
		describeGtmLogsResponse.setLogs(logs);
	 
	 	return describeGtmLogsResponse;
	}
}