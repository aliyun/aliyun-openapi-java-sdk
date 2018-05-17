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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeChangeLogsResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeChangeLogsResponse.ChangeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChangeLogsResponseUnmarshaller {

	public static DescribeChangeLogsResponse unmarshall(DescribeChangeLogsResponse describeChangeLogsResponse, UnmarshallerContext context) {
		
		describeChangeLogsResponse.setRequestId(context.stringValue("DescribeChangeLogsResponse.RequestId"));
		describeChangeLogsResponse.setTotalItems(context.integerValue("DescribeChangeLogsResponse.TotalItems"));
		describeChangeLogsResponse.setTotalPages(context.integerValue("DescribeChangeLogsResponse.TotalPages"));
		describeChangeLogsResponse.setPageSize(context.integerValue("DescribeChangeLogsResponse.PageSize"));
		describeChangeLogsResponse.setPageNumber(context.integerValue("DescribeChangeLogsResponse.PageNumber"));

		List<ChangeLog> changeLogs = new ArrayList<ChangeLog>();
		for (int i = 0; i < context.lengthValue("DescribeChangeLogsResponse.ChangeLogs.Length"); i++) {
			ChangeLog changeLog = new ChangeLog();
			changeLog.setOperTime(context.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperTime"));
			changeLog.setOperAction(context.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperAction"));
			changeLog.setOperObject(context.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperObject"));
			changeLog.setEntityId(context.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].EntityId"));
			changeLog.setEntityName(context.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].EntityName"));
			changeLog.setOperIp(context.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperIp"));
			changeLog.setOperTimestamp(context.longValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperTimestamp"));
			changeLog.setId(context.longValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].Id"));
			changeLog.setContent(context.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].Content"));

			changeLogs.add(changeLog);
		}
		describeChangeLogsResponse.setChangeLogs(changeLogs);
	 
	 	return describeChangeLogsResponse;
	}
}