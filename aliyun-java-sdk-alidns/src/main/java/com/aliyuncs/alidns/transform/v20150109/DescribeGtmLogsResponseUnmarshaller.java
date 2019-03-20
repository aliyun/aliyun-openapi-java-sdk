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

	public static DescribeGtmLogsResponse unmarshall(DescribeGtmLogsResponse describeGtmLogsResponse, UnmarshallerContext context) {
		
		describeGtmLogsResponse.setRequestId(context.stringValue("DescribeGtmLogsResponse.RequestId"));
		describeGtmLogsResponse.setTotalItems(context.integerValue("DescribeGtmLogsResponse.TotalItems"));
		describeGtmLogsResponse.setTotalPages(context.integerValue("DescribeGtmLogsResponse.TotalPages"));
		describeGtmLogsResponse.setPageSize(context.integerValue("DescribeGtmLogsResponse.PageSize"));
		describeGtmLogsResponse.setPageNumber(context.integerValue("DescribeGtmLogsResponse.PageNumber"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < context.lengthValue("DescribeGtmLogsResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setOperTime(context.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].OperTime"));
			log.setOperAction(context.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].OperAction"));
			log.setEntityType(context.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].EntityType"));
			log.setEntityId(context.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].EntityId"));
			log.setEntityName(context.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].EntityName"));
			log.setOperIp(context.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].OperIp"));
			log.setOperTimestamp(context.longValue("DescribeGtmLogsResponse.Logs["+ i +"].OperTimestamp"));
			log.setId(context.longValue("DescribeGtmLogsResponse.Logs["+ i +"].Id"));
			log.setContent(context.stringValue("DescribeGtmLogsResponse.Logs["+ i +"].Content"));

			logs.add(log);
		}
		describeGtmLogsResponse.setLogs(logs);
	 
	 	return describeGtmLogsResponse;
	}
}