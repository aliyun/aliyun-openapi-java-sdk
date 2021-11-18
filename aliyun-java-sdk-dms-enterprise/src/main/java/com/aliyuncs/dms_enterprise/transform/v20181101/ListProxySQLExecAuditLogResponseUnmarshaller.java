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

import com.aliyuncs.dms_enterprise.model.v20181101.ListProxySQLExecAuditLogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProxySQLExecAuditLogResponseUnmarshaller {

	public static ListProxySQLExecAuditLogResponse unmarshall(ListProxySQLExecAuditLogResponse listProxySQLExecAuditLogResponse, UnmarshallerContext _ctx) {
		
		listProxySQLExecAuditLogResponse.setRequestId(_ctx.stringValue("ListProxySQLExecAuditLogResponse.RequestId"));
		listProxySQLExecAuditLogResponse.setTotalCount(_ctx.longValue("ListProxySQLExecAuditLogResponse.TotalCount"));
		listProxySQLExecAuditLogResponse.setErrorCode(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ErrorCode"));
		listProxySQLExecAuditLogResponse.setErrorMessage(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ErrorMessage"));
		listProxySQLExecAuditLogResponse.setSuccess(_ctx.booleanValue("ListProxySQLExecAuditLogResponse.Success"));

		List<ProxySQLExecAuditLog> proxySQLExecAuditLogList = new ArrayList<ProxySQLExecAuditLog>();
		for (int i = 0; i < _ctx.lengthValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList.Length"); i++) {
			ProxySQLExecAuditLog proxySQLExecAuditLog = new ProxySQLExecAuditLog();
			proxySQLExecAuditLog.setOpTime(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].OpTime"));
			proxySQLExecAuditLog.setUserName(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].UserName"));
			proxySQLExecAuditLog.setUserId(_ctx.longValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].UserId"));
			proxySQLExecAuditLog.setInstanceName(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].InstanceName"));
			proxySQLExecAuditLog.setInstanceId(_ctx.longValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].InstanceId"));
			proxySQLExecAuditLog.setSchemaName(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].SchemaName"));
			proxySQLExecAuditLog.setSQLType(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].SQLType"));
			proxySQLExecAuditLog.setSQL(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].SQL"));
			proxySQLExecAuditLog.setExecState(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].ExecState"));
			proxySQLExecAuditLog.setAffectRows(_ctx.longValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].AffectRows"));
			proxySQLExecAuditLog.setElapsedTime(_ctx.longValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].ElapsedTime"));
			proxySQLExecAuditLog.setRemark(_ctx.stringValue("ListProxySQLExecAuditLogResponse.ProxySQLExecAuditLogList["+ i +"].Remark"));

			proxySQLExecAuditLogList.add(proxySQLExecAuditLog);
		}
		listProxySQLExecAuditLogResponse.setProxySQLExecAuditLogList(proxySQLExecAuditLogList);
	 
	 	return listProxySQLExecAuditLogResponse;
	}
}