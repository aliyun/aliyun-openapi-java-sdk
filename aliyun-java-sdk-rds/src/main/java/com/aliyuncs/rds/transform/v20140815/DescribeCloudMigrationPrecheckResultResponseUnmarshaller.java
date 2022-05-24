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

import com.aliyuncs.rds.model.v20140815.DescribeCloudMigrationPrecheckResultResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCloudMigrationPrecheckResultResponse.MigrateCloudTaskList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudMigrationPrecheckResultResponseUnmarshaller {

	public static DescribeCloudMigrationPrecheckResultResponse unmarshall(DescribeCloudMigrationPrecheckResultResponse describeCloudMigrationPrecheckResultResponse, UnmarshallerContext _ctx) {
		
		describeCloudMigrationPrecheckResultResponse.setRequestId(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.RequestId"));
		describeCloudMigrationPrecheckResultResponse.setTotalSize(_ctx.integerValue("DescribeCloudMigrationPrecheckResultResponse.TotalSize"));
		describeCloudMigrationPrecheckResultResponse.setPageNumber(_ctx.longValue("DescribeCloudMigrationPrecheckResultResponse.PageNumber"));
		describeCloudMigrationPrecheckResultResponse.setPageSize(_ctx.longValue("DescribeCloudMigrationPrecheckResultResponse.PageSize"));

		List<MigrateCloudTaskList> items = new ArrayList<MigrateCloudTaskList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudMigrationPrecheckResultResponse.Items.Length"); i++) {
			MigrateCloudTaskList migrateCloudTaskList = new MigrateCloudTaskList();
			migrateCloudTaskList.setGmtCreated(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].GmtCreated"));
			migrateCloudTaskList.setGmtModified(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].GmtModified"));
			migrateCloudTaskList.setTaskId(_ctx.longValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].TaskId"));
			migrateCloudTaskList.setTaskName(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].TaskName"));
			migrateCloudTaskList.setStatus(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].Status"));
			migrateCloudTaskList.setSourceCategory(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].SourceCategory"));
			migrateCloudTaskList.setSourceIpAddress(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].SourceIpAddress"));
			migrateCloudTaskList.setSourcePort(_ctx.longValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].SourcePort"));
			migrateCloudTaskList.setSourceAccount(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].SourceAccount"));
			migrateCloudTaskList.setSourcePassword(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].SourcePassword"));
			migrateCloudTaskList.setTargetEip(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].TargetEip"));
			migrateCloudTaskList.setTargetInstanceName(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].TargetInstanceName"));
			migrateCloudTaskList.setDetail(_ctx.stringValue("DescribeCloudMigrationPrecheckResultResponse.Items["+ i +"].Detail"));

			items.add(migrateCloudTaskList);
		}
		describeCloudMigrationPrecheckResultResponse.setItems(items);
	 
	 	return describeCloudMigrationPrecheckResultResponse;
	}
}