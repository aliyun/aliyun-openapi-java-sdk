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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListSQLExecAuditLogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSQLExecAuditLogResponse.SQLExecAuditLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSQLExecAuditLogResponseUnmarshaller {

	public static ListSQLExecAuditLogResponse unmarshall(ListSQLExecAuditLogResponse listSQLExecAuditLogResponse, UnmarshallerContext _ctx) {
		
		listSQLExecAuditLogResponse.setRequestId(_ctx.stringValue("ListSQLExecAuditLogResponse.RequestId"));
		listSQLExecAuditLogResponse.setTotalCount(_ctx.longValue("ListSQLExecAuditLogResponse.TotalCount"));
		listSQLExecAuditLogResponse.setErrorCode(_ctx.stringValue("ListSQLExecAuditLogResponse.ErrorCode"));
		listSQLExecAuditLogResponse.setErrorMessage(_ctx.stringValue("ListSQLExecAuditLogResponse.ErrorMessage"));
		listSQLExecAuditLogResponse.setSuccess(_ctx.booleanValue("ListSQLExecAuditLogResponse.Success"));

		List<SQLExecAuditLog> sQLExecAuditLogList = new ArrayList<SQLExecAuditLog>();
		for (int i = 0; i < _ctx.lengthValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList.Length"); i++) {
			SQLExecAuditLog sQLExecAuditLog = new SQLExecAuditLog();
			sQLExecAuditLog.setOpTime(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].OpTime"));
			sQLExecAuditLog.setUserName(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].UserName"));
			sQLExecAuditLog.setUserId(_ctx.longValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].UserId"));
			sQLExecAuditLog.setInstanceName(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].InstanceName"));
			sQLExecAuditLog.setInstanceId(_ctx.longValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].InstanceId"));
			sQLExecAuditLog.setSchemaName(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].SchemaName"));
			sQLExecAuditLog.setDbId(_ctx.longValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].DbId"));
			sQLExecAuditLog.setLogic(_ctx.booleanValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].Logic"));
			sQLExecAuditLog.setSQLType(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].SQLType"));
			sQLExecAuditLog.setSQL(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].SQL"));
			sQLExecAuditLog.setExecState(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].ExecState"));
			sQLExecAuditLog.setAffectRows(_ctx.longValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].AffectRows"));
			sQLExecAuditLog.setElapsedTime(_ctx.longValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].ElapsedTime"));
			sQLExecAuditLog.setRemark(_ctx.stringValue("ListSQLExecAuditLogResponse.SQLExecAuditLogList["+ i +"].Remark"));

			sQLExecAuditLogList.add(sQLExecAuditLog);
		}
		listSQLExecAuditLogResponse.setSQLExecAuditLogList(sQLExecAuditLogList);
	 
	 	return listSQLExecAuditLogResponse;
	}
}