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

import com.aliyuncs.dms_enterprise.model.v20181101.ListInstanceLoginAuditLogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListInstanceLoginAuditLogResponse.InstanceLoginAuditLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceLoginAuditLogResponseUnmarshaller {

	public static ListInstanceLoginAuditLogResponse unmarshall(ListInstanceLoginAuditLogResponse listInstanceLoginAuditLogResponse, UnmarshallerContext _ctx) {
		
		listInstanceLoginAuditLogResponse.setRequestId(_ctx.stringValue("ListInstanceLoginAuditLogResponse.RequestId"));
		listInstanceLoginAuditLogResponse.setTotalCount(_ctx.longValue("ListInstanceLoginAuditLogResponse.TotalCount"));
		listInstanceLoginAuditLogResponse.setErrorCode(_ctx.stringValue("ListInstanceLoginAuditLogResponse.ErrorCode"));
		listInstanceLoginAuditLogResponse.setErrorMessage(_ctx.stringValue("ListInstanceLoginAuditLogResponse.ErrorMessage"));
		listInstanceLoginAuditLogResponse.setSuccess(_ctx.booleanValue("ListInstanceLoginAuditLogResponse.Success"));

		List<InstanceLoginAuditLog> instanceLoginAuditLogList = new ArrayList<InstanceLoginAuditLog>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList.Length"); i++) {
			InstanceLoginAuditLog instanceLoginAuditLog = new InstanceLoginAuditLog();
			instanceLoginAuditLog.setOpTime(_ctx.stringValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList["+ i +"].OpTime"));
			instanceLoginAuditLog.setUserName(_ctx.stringValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList["+ i +"].UserName"));
			instanceLoginAuditLog.setUserId(_ctx.longValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList["+ i +"].UserId"));
			instanceLoginAuditLog.setInstanceName(_ctx.stringValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList["+ i +"].InstanceName"));
			instanceLoginAuditLog.setInstanceId(_ctx.longValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList["+ i +"].InstanceId"));
			instanceLoginAuditLog.setDbUser(_ctx.stringValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList["+ i +"].DbUser"));
			instanceLoginAuditLog.setRequestIp(_ctx.stringValue("ListInstanceLoginAuditLogResponse.InstanceLoginAuditLogList["+ i +"].RequestIp"));

			instanceLoginAuditLogList.add(instanceLoginAuditLog);
		}
		listInstanceLoginAuditLogResponse.setInstanceLoginAuditLogList(instanceLoginAuditLogList);
	 
	 	return listInstanceLoginAuditLogResponse;
	}
}