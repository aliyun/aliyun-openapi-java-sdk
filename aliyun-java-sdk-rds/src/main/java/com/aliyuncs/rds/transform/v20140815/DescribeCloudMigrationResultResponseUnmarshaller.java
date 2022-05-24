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

import com.aliyuncs.rds.model.v20140815.DescribeCloudMigrationResultResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCloudMigrationResultResponse.Tasks;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudMigrationResultResponseUnmarshaller {

	public static DescribeCloudMigrationResultResponse unmarshall(DescribeCloudMigrationResultResponse describeCloudMigrationResultResponse, UnmarshallerContext _ctx) {
		
		describeCloudMigrationResultResponse.setRequestId(_ctx.stringValue("DescribeCloudMigrationResultResponse.RequestId"));
		describeCloudMigrationResultResponse.setTotalSize(_ctx.integerValue("DescribeCloudMigrationResultResponse.TotalSize"));
		describeCloudMigrationResultResponse.setPageNumber(_ctx.longValue("DescribeCloudMigrationResultResponse.PageNumber"));
		describeCloudMigrationResultResponse.setPageSize(_ctx.longValue("DescribeCloudMigrationResultResponse.PageSize"));

		List<Tasks> items = new ArrayList<Tasks>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudMigrationResultResponse.Items.Length"); i++) {
			Tasks tasks = new Tasks();
			tasks.setGmtCreated(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].GmtCreated"));
			tasks.setGmtModified(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].GmtModified"));
			tasks.setTaskId(_ctx.longValue("DescribeCloudMigrationResultResponse.Items["+ i +"].TaskId"));
			tasks.setTaskName(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].TaskName"));
			tasks.setStatus(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].Status"));
			tasks.setMigrateStage(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].MigrateStage"));
			tasks.setSourceCategory(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].SourceCategory"));
			tasks.setSourceIpAddress(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].SourceIpAddress"));
			tasks.setSourcePort(_ctx.longValue("DescribeCloudMigrationResultResponse.Items["+ i +"].SourcePort"));
			tasks.setSourceAccount(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].SourceAccount"));
			tasks.setSourcePassword(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].SourcePassword"));
			tasks.setTargetEip(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].TargetEip"));
			tasks.setTargetInstanceName(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].TargetInstanceName"));
			tasks.setReplicationState(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].ReplicationState"));
			tasks.setReplicationInfo(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].ReplicationInfo"));
			tasks.setDetail(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].Detail"));
			tasks.setSwitchTime(_ctx.stringValue("DescribeCloudMigrationResultResponse.Items["+ i +"].SwitchTime"));

			items.add(tasks);
		}
		describeCloudMigrationResultResponse.setItems(items);
	 
	 	return describeCloudMigrationResultResponse;
	}
}