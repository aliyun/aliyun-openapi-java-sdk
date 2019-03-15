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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeClusterOpLogResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterOpLogResponse.ChangeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterOpLogResponseUnmarshaller {

	public static DescribeClusterOpLogResponse unmarshall(DescribeClusterOpLogResponse describeClusterOpLogResponse, UnmarshallerContext context) {
		
		describeClusterOpLogResponse.setRequestId(context.stringValue("DescribeClusterOpLogResponse.RequestId"));
		describeClusterOpLogResponse.setPageNumber(context.stringValue("DescribeClusterOpLogResponse.PageNumber"));
		describeClusterOpLogResponse.setPageSize(context.stringValue("DescribeClusterOpLogResponse.PageSize"));
		describeClusterOpLogResponse.setTotal(context.stringValue("DescribeClusterOpLogResponse.Total"));

		List<ChangeLog> changeLogList = new ArrayList<ChangeLog>();
		for (int i = 0; i < context.lengthValue("DescribeClusterOpLogResponse.ChangeLogList.Length"); i++) {
			ChangeLog changeLog = new ChangeLog();
			changeLog.setId(context.longValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].Id"));
			changeLog.setGmtCreate(context.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].GmtCreate"));
			changeLog.setGmtModified(context.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].GmtModified"));
			changeLog.setTargetKey(context.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].TargetKey"));
			changeLog.setStatus(context.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].Status"));
			changeLog.setChangeType(context.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].ChangeType"));
			changeLog.setMessage(context.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].Message"));
			changeLog.setTargetType(context.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].TargetType"));

			changeLogList.add(changeLog);
		}
		describeClusterOpLogResponse.setChangeLogList(changeLogList);
	 
	 	return describeClusterOpLogResponse;
	}
}