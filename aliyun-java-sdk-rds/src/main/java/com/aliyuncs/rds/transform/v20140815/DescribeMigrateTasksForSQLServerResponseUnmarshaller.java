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

import com.aliyuncs.rds.model.v20140815.DescribeMigrateTasksForSQLServerResponse;
import com.aliyuncs.rds.model.v20140815.DescribeMigrateTasksForSQLServerResponse.MigrateTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrateTasksForSQLServerResponseUnmarshaller {

	public static DescribeMigrateTasksForSQLServerResponse unmarshall(DescribeMigrateTasksForSQLServerResponse describeMigrateTasksForSQLServerResponse, UnmarshallerContext context) {
		
		describeMigrateTasksForSQLServerResponse.setRequestId(context.stringValue("DescribeMigrateTasksForSQLServerResponse.RequestId"));
		describeMigrateTasksForSQLServerResponse.setDBInstanceID(context.stringValue("DescribeMigrateTasksForSQLServerResponse.DBInstanceID"));
		describeMigrateTasksForSQLServerResponse.setDBInstanceName(context.stringValue("DescribeMigrateTasksForSQLServerResponse.DBInstanceName"));
		describeMigrateTasksForSQLServerResponse.setStartTime(context.stringValue("DescribeMigrateTasksForSQLServerResponse.StartTime"));
		describeMigrateTasksForSQLServerResponse.setEndTime(context.stringValue("DescribeMigrateTasksForSQLServerResponse.EndTime"));
		describeMigrateTasksForSQLServerResponse.setTotalRecordCount(context.integerValue("DescribeMigrateTasksForSQLServerResponse.TotalRecordCount"));
		describeMigrateTasksForSQLServerResponse.setPageNumber(context.integerValue("DescribeMigrateTasksForSQLServerResponse.PageNumber"));
		describeMigrateTasksForSQLServerResponse.setPageRecordCount(context.integerValue("DescribeMigrateTasksForSQLServerResponse.PageRecordCount"));

		List<MigrateTask> items = new ArrayList<MigrateTask>();
		for (int i = 0; i < context.lengthValue("DescribeMigrateTasksForSQLServerResponse.Items.Length"); i++) {
			MigrateTask migrateTask = new MigrateTask();
			migrateTask.setDBName(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].DBName"));
			migrateTask.setMigrateIaskId(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].MigrateIaskId"));
			migrateTask.setCreateTime(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].CreateTime"));
			migrateTask.setEndTime(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].EndTime"));
			migrateTask.setTaskType(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].TaskType"));
			migrateTask.setStatus(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].Status"));
			migrateTask.setIsDBReplaced(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].IsDBReplaced"));
			migrateTask.setDesc(context.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].Desc"));

			items.add(migrateTask);
		}
		describeMigrateTasksForSQLServerResponse.setItems(items);
	 
	 	return describeMigrateTasksForSQLServerResponse;
	}
}