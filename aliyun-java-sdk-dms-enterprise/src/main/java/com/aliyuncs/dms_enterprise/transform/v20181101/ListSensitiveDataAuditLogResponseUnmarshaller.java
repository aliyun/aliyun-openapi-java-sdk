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

import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveDataAuditLogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogListItem;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogListItem.SensitiveDataLogItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSensitiveDataAuditLogResponseUnmarshaller {

	public static ListSensitiveDataAuditLogResponse unmarshall(ListSensitiveDataAuditLogResponse listSensitiveDataAuditLogResponse, UnmarshallerContext _ctx) {
		
		listSensitiveDataAuditLogResponse.setRequestId(_ctx.stringValue("ListSensitiveDataAuditLogResponse.RequestId"));
		listSensitiveDataAuditLogResponse.setTotalCount(_ctx.longValue("ListSensitiveDataAuditLogResponse.TotalCount"));
		listSensitiveDataAuditLogResponse.setErrorCode(_ctx.stringValue("ListSensitiveDataAuditLogResponse.ErrorCode"));
		listSensitiveDataAuditLogResponse.setErrorMessage(_ctx.stringValue("ListSensitiveDataAuditLogResponse.ErrorMessage"));
		listSensitiveDataAuditLogResponse.setSuccess(_ctx.booleanValue("ListSensitiveDataAuditLogResponse.Success"));

		List<SensitiveDataAuditLogListItem> sensitiveDataAuditLogList = new ArrayList<SensitiveDataAuditLogListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList.Length"); i++) {
			SensitiveDataAuditLogListItem sensitiveDataAuditLogListItem = new SensitiveDataAuditLogListItem();
			sensitiveDataAuditLogListItem.setUserName(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].UserName"));
			sensitiveDataAuditLogListItem.setUserId(_ctx.longValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].UserId"));
			sensitiveDataAuditLogListItem.setModuleName(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].ModuleName"));
			sensitiveDataAuditLogListItem.setDbDisplayName(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].DbDisplayName"));
			sensitiveDataAuditLogListItem.setOpTime(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].OpTime"));
			sensitiveDataAuditLogListItem.setInstanceId(_ctx.longValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].InstanceId"));
			sensitiveDataAuditLogListItem.setTargetName(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].TargetName"));

			List<SensitiveDataLogItem> sensitiveDataLog = new ArrayList<SensitiveDataLogItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].SensitiveDataLog.Length"); j++) {
				SensitiveDataLogItem sensitiveDataLogItem = new SensitiveDataLogItem();
				sensitiveDataLogItem.setTableName(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].SensitiveDataLog["+ j +"].TableName"));
				sensitiveDataLogItem.setColumnName(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].SensitiveDataLog["+ j +"].ColumnName"));
				sensitiveDataLogItem.setSecurityLevel(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].SensitiveDataLog["+ j +"].SecurityLevel"));
				sensitiveDataLogItem.setColumnPermissionType(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].SensitiveDataLog["+ j +"].ColumnPermissionType"));
				sensitiveDataLogItem.setDesensitizationRule(_ctx.stringValue("ListSensitiveDataAuditLogResponse.SensitiveDataAuditLogList["+ i +"].SensitiveDataLog["+ j +"].DesensitizationRule"));

				sensitiveDataLog.add(sensitiveDataLogItem);
			}
			sensitiveDataAuditLogListItem.setSensitiveDataLog(sensitiveDataLog);

			sensitiveDataAuditLogList.add(sensitiveDataAuditLogListItem);
		}
		listSensitiveDataAuditLogResponse.setSensitiveDataAuditLogList(sensitiveDataAuditLogList);
	 
	 	return listSensitiveDataAuditLogResponse;
	}
}