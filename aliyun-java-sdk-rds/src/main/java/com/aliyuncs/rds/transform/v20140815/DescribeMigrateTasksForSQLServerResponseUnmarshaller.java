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

	public static DescribeMigrateTasksForSQLServerResponse unmarshall(DescribeMigrateTasksForSQLServerResponse describeMigrateTasksForSQLServerResponse, UnmarshallerContext _ctx) {
		
		describeMigrateTasksForSQLServerResponse.setRequestId(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.RequestId"));
		describeMigrateTasksForSQLServerResponse.setDBInstanceID(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.DBInstanceID"));
		describeMigrateTasksForSQLServerResponse.setDBInstanceName(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.DBInstanceName"));
		describeMigrateTasksForSQLServerResponse.setStartTime(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.StartTime"));
		describeMigrateTasksForSQLServerResponse.setEndTime(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.EndTime"));
		describeMigrateTasksForSQLServerResponse.setTotalRecordCount(_ctx.integerValue("DescribeMigrateTasksForSQLServerResponse.TotalRecordCount"));
		describeMigrateTasksForSQLServerResponse.setPageNumber(_ctx.integerValue("DescribeMigrateTasksForSQLServerResponse.PageNumber"));
		describeMigrateTasksForSQLServerResponse.setPageRecordCount(_ctx.integerValue("DescribeMigrateTasksForSQLServerResponse.PageRecordCount"));

		List<MigrateTask> items = new ArrayList<MigrateTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrateTasksForSQLServerResponse.Items.Length"); i++) {
			MigrateTask migrateTask = new MigrateTask();
			migrateTask.setDBName(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].DBName"));
			migrateTask.setMigrateIaskId(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].MigrateIaskId"));
			migrateTask.setCreateTime(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].CreateTime"));
			migrateTask.setEndTime(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].EndTime"));
			migrateTask.setTaskType(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].TaskType"));
			migrateTask.setStatus(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].Status"));
			migrateTask.setIsDBReplaced(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].IsDBReplaced"));
			migrateTask.setDesc(_ctx.stringValue("DescribeMigrateTasksForSQLServerResponse.Items["+ i +"].Desc"));

			items.add(migrateTask);
		}
		describeMigrateTasksForSQLServerResponse.setItems(items);
	 
	 	return describeMigrateTasksForSQLServerResponse;
	}
}