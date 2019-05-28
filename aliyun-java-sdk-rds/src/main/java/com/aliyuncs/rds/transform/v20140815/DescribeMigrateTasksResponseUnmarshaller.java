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

import com.aliyuncs.rds.model.v20140815.DescribeMigrateTasksResponse;
import com.aliyuncs.rds.model.v20140815.DescribeMigrateTasksResponse.MigrateTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrateTasksResponseUnmarshaller {

	public static DescribeMigrateTasksResponse unmarshall(DescribeMigrateTasksResponse describeMigrateTasksResponse, UnmarshallerContext context) {
		
		describeMigrateTasksResponse.setRequestId(context.stringValue("DescribeMigrateTasksResponse.RequestId"));
		describeMigrateTasksResponse.setDBInstanceId(context.stringValue("DescribeMigrateTasksResponse.DBInstanceId"));
		describeMigrateTasksResponse.setTotalRecordCount(context.integerValue("DescribeMigrateTasksResponse.TotalRecordCount"));
		describeMigrateTasksResponse.setPageNumber(context.integerValue("DescribeMigrateTasksResponse.PageNumber"));
		describeMigrateTasksResponse.setPageRecordCount(context.integerValue("DescribeMigrateTasksResponse.PageRecordCount"));

		List<MigrateTask> items = new ArrayList<MigrateTask>();
		for (int i = 0; i < context.lengthValue("DescribeMigrateTasksResponse.Items.Length"); i++) {
			MigrateTask migrateTask = new MigrateTask();
			migrateTask.setDBName(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].DBName"));
			migrateTask.setMigrateTaskId(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].MigrateTaskId"));
			migrateTask.setCreateTime(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].CreateTime"));
			migrateTask.setEndTime(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].EndTime"));
			migrateTask.setBackupMode(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].BackupMode"));
			migrateTask.setStatus(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].Status"));
			migrateTask.setIsDBReplaced(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].IsDBReplaced"));
			migrateTask.setDescription(context.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].Description"));

			items.add(migrateTask);
		}
		describeMigrateTasksResponse.setItems(items);
	 
	 	return describeMigrateTasksResponse;
	}
}