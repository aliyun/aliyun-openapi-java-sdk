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

	public static DescribeChangeLogsResponse unmarshall(DescribeChangeLogsResponse describeChangeLogsResponse, UnmarshallerContext _ctx) {
		
		describeChangeLogsResponse.setRequestId(_ctx.stringValue("DescribeChangeLogsResponse.RequestId"));
		describeChangeLogsResponse.setTotalItems(_ctx.integerValue("DescribeChangeLogsResponse.TotalItems"));
		describeChangeLogsResponse.setTotalPages(_ctx.integerValue("DescribeChangeLogsResponse.TotalPages"));
		describeChangeLogsResponse.setPageSize(_ctx.integerValue("DescribeChangeLogsResponse.PageSize"));
		describeChangeLogsResponse.setPageNumber(_ctx.integerValue("DescribeChangeLogsResponse.PageNumber"));

		List<ChangeLog> changeLogs = new ArrayList<ChangeLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChangeLogsResponse.ChangeLogs.Length"); i++) {
			ChangeLog changeLog = new ChangeLog();
			changeLog.setOperTime(_ctx.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperTime"));
			changeLog.setOperAction(_ctx.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperAction"));
			changeLog.setOperObject(_ctx.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperObject"));
			changeLog.setEntityId(_ctx.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].EntityId"));
			changeLog.setEntityName(_ctx.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].EntityName"));
			changeLog.setOperIp(_ctx.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperIp"));
			changeLog.setOperTimestamp(_ctx.longValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].OperTimestamp"));
			changeLog.setId(_ctx.longValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].Id"));
			changeLog.setContent(_ctx.stringValue("DescribeChangeLogsResponse.ChangeLogs["+ i +"].Content"));

			changeLogs.add(changeLog);
		}
		describeChangeLogsResponse.setChangeLogs(changeLogs);
	 
	 	return describeChangeLogsResponse;
	}
}