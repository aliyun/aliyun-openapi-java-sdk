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

	public static DescribeClusterOpLogResponse unmarshall(DescribeClusterOpLogResponse describeClusterOpLogResponse, UnmarshallerContext _ctx) {
		
		describeClusterOpLogResponse.setRequestId(_ctx.stringValue("DescribeClusterOpLogResponse.RequestId"));
		describeClusterOpLogResponse.setPageNumber(_ctx.stringValue("DescribeClusterOpLogResponse.PageNumber"));
		describeClusterOpLogResponse.setPageSize(_ctx.stringValue("DescribeClusterOpLogResponse.PageSize"));
		describeClusterOpLogResponse.setTotal(_ctx.stringValue("DescribeClusterOpLogResponse.Total"));

		List<ChangeLog> changeLogList = new ArrayList<ChangeLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterOpLogResponse.ChangeLogList.Length"); i++) {
			ChangeLog changeLog = new ChangeLog();
			changeLog.setId(_ctx.longValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].Id"));
			changeLog.setGmtCreate(_ctx.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].GmtCreate"));
			changeLog.setGmtModified(_ctx.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].GmtModified"));
			changeLog.setTargetKey(_ctx.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].TargetKey"));
			changeLog.setStatus(_ctx.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].Status"));
			changeLog.setChangeType(_ctx.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].ChangeType"));
			changeLog.setMessage(_ctx.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].Message"));
			changeLog.setTargetType(_ctx.stringValue("DescribeClusterOpLogResponse.ChangeLogList["+ i +"].TargetType"));

			changeLogList.add(changeLog);
		}
		describeClusterOpLogResponse.setChangeLogList(changeLogList);
	 
	 	return describeClusterOpLogResponse;
	}
}