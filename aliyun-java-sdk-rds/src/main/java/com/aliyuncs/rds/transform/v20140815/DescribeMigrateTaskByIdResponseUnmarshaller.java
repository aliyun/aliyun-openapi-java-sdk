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

import com.aliyuncs.rds.model.v20140815.DescribeMigrateTaskByIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMigrateTaskByIdResponseUnmarshaller {

	public static DescribeMigrateTaskByIdResponse unmarshall(DescribeMigrateTaskByIdResponse describeMigrateTaskByIdResponse, UnmarshallerContext _ctx) {
		
		describeMigrateTaskByIdResponse.setRequestId(_ctx.stringValue("DescribeMigrateTaskByIdResponse.RequestId"));
		describeMigrateTaskByIdResponse.setDBInstanceName(_ctx.stringValue("DescribeMigrateTaskByIdResponse.DBInstanceName"));
		describeMigrateTaskByIdResponse.setDBName(_ctx.stringValue("DescribeMigrateTaskByIdResponse.DBName"));
		describeMigrateTaskByIdResponse.setMigrateTaskId(_ctx.stringValue("DescribeMigrateTaskByIdResponse.MigrateTaskId"));
		describeMigrateTaskByIdResponse.setCreateTime(_ctx.stringValue("DescribeMigrateTaskByIdResponse.CreateTime"));
		describeMigrateTaskByIdResponse.setEndTime(_ctx.stringValue("DescribeMigrateTaskByIdResponse.EndTime"));
		describeMigrateTaskByIdResponse.setBackupMode(_ctx.stringValue("DescribeMigrateTaskByIdResponse.BackupMode"));
		describeMigrateTaskByIdResponse.setStatus(_ctx.stringValue("DescribeMigrateTaskByIdResponse.Status"));
		describeMigrateTaskByIdResponse.setIsDBReplaced(_ctx.stringValue("DescribeMigrateTaskByIdResponse.IsDBReplaced"));
		describeMigrateTaskByIdResponse.setDescription(_ctx.stringValue("DescribeMigrateTaskByIdResponse.Description"));
	 
	 	return describeMigrateTaskByIdResponse;
	}
}