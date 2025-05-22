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

	public static DescribeMigrateTasksResponse unmarshall(DescribeMigrateTasksResponse describeMigrateTasksResponse, UnmarshallerContext _ctx) {
		
		describeMigrateTasksResponse.setRequestId(_ctx.stringValue("DescribeMigrateTasksResponse.RequestId"));
		describeMigrateTasksResponse.setDBInstanceId(_ctx.stringValue("DescribeMigrateTasksResponse.DBInstanceId"));
		describeMigrateTasksResponse.setPageNumber(_ctx.integerValue("DescribeMigrateTasksResponse.PageNumber"));
		describeMigrateTasksResponse.setPageRecordCount(_ctx.integerValue("DescribeMigrateTasksResponse.PageRecordCount"));
		describeMigrateTasksResponse.setTotalRecordCount(_ctx.integerValue("DescribeMigrateTasksResponse.TotalRecordCount"));

		List<MigrateTask> items = new ArrayList<MigrateTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMigrateTasksResponse.Items.Length"); i++) {
			MigrateTask migrateTask = new MigrateTask();
			migrateTask.setBackupMode(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].BackupMode"));
			migrateTask.setCreateTime(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].CreateTime"));
			migrateTask.setDBName(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].DBName"));
			migrateTask.setDescription(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].Description"));
			migrateTask.setEndTime(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].EndTime"));
			migrateTask.setIsDBReplaced(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].IsDBReplaced"));
			migrateTask.setMigrateTaskId(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].MigrateTaskId"));
			migrateTask.setStatus(_ctx.stringValue("DescribeMigrateTasksResponse.Items["+ i +"].Status"));

			items.add(migrateTask);
		}
		describeMigrateTasksResponse.setItems(items);
	 
	 	return describeMigrateTasksResponse;
	}
}