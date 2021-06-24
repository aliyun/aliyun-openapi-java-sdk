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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceMigrateLogResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceMigrateLogResponse.MigrateLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryInstanceMigrateLogResponseUnmarshaller {

	public static OpsQueryInstanceMigrateLogResponse unmarshall(OpsQueryInstanceMigrateLogResponse opsQueryInstanceMigrateLogResponse, UnmarshallerContext _ctx) {
		
		opsQueryInstanceMigrateLogResponse.setRequestId(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.RequestId"));
		opsQueryInstanceMigrateLogResponse.setPageSize(_ctx.integerValue("OpsQueryInstanceMigrateLogResponse.PageSize"));
		opsQueryInstanceMigrateLogResponse.setTotal(_ctx.integerValue("OpsQueryInstanceMigrateLogResponse.Total"));
		opsQueryInstanceMigrateLogResponse.setPageNo(_ctx.integerValue("OpsQueryInstanceMigrateLogResponse.PageNo"));

		List<MigrateLog> migrateLogs = new ArrayList<MigrateLog>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs.Length"); i++) {
			MigrateLog migrateLog = new MigrateLog();
			migrateLog.setStatus(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].Status"));
			migrateLog.setSrcNcIp(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].SrcNcIp"));
			migrateLog.setInstanceId(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].InstanceId"));
			migrateLog.setDestNcId(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].DestNcId"));
			migrateLog.setSrcNcId(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].SrcNcId"));
			migrateLog.setModifiedTime(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].ModifiedTime"));
			migrateLog.setDestNcIp(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].DestNcIp"));
			migrateLog.setRetCode(_ctx.longValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].RetCode"));
			migrateLog.setCreatedTime(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].CreatedTime"));
			migrateLog.setReason(_ctx.stringValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].Reason"));
			migrateLog.setId(_ctx.longValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].Id"));
			migrateLog.setRate(_ctx.longValue("OpsQueryInstanceMigrateLogResponse.MigrateLogs["+ i +"].Rate"));

			migrateLogs.add(migrateLog);
		}
		opsQueryInstanceMigrateLogResponse.setMigrateLogs(migrateLogs);
	 
	 	return opsQueryInstanceMigrateLogResponse;
	}
}