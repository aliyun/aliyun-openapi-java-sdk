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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeReplicationLinkLogsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeReplicationLinkLogsResponse.Tasks;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicationLinkLogsResponseUnmarshaller {

	public static DescribeReplicationLinkLogsResponse unmarshall(DescribeReplicationLinkLogsResponse describeReplicationLinkLogsResponse, UnmarshallerContext _ctx) {
		
		describeReplicationLinkLogsResponse.setRequestId(_ctx.stringValue("DescribeReplicationLinkLogsResponse.RequestId"));
		describeReplicationLinkLogsResponse.setDBInstanceId(_ctx.stringValue("DescribeReplicationLinkLogsResponse.DBInstanceId"));
		describeReplicationLinkLogsResponse.setTotalSize(_ctx.integerValue("DescribeReplicationLinkLogsResponse.TotalSize"));

		List<Tasks> items = new ArrayList<Tasks>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicationLinkLogsResponse.Items.Length"); i++) {
			Tasks tasks = new Tasks();
			tasks.setDetail(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].Detail"));
			tasks.setGmtCreated(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].GmtCreated"));
			tasks.setGmtModified(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].GmtModified"));
			tasks.setReplicationInfo(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].ReplicationInfo"));
			tasks.setReplicationState(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].ReplicationState"));
			tasks.setReplicatorAccount(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].ReplicatorAccount"));
			tasks.setReplicatorPassword(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].ReplicatorPassword"));
			tasks.setSourceAddress(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].SourceAddress"));
			tasks.setSourceCategory(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].SourceCategory"));
			tasks.setSourcePort(_ctx.longValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].SourcePort"));
			tasks.setTargetInstanceId(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].TargetInstanceId"));
			tasks.setTaskId(_ctx.longValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].TaskId"));
			tasks.setTaskName(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].TaskName"));
			tasks.setTaskStage(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].TaskStage"));
			tasks.setTaskStatus(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].TaskStatus"));
			tasks.setTaskType(_ctx.stringValue("DescribeReplicationLinkLogsResponse.Items["+ i +"].TaskType"));

			items.add(tasks);
		}
		describeReplicationLinkLogsResponse.setItems(items);
	 
	 	return describeReplicationLinkLogsResponse;
	}
}