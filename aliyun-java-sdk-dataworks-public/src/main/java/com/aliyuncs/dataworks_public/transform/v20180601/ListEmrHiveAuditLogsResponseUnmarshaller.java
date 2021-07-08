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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveAuditLogsResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveAuditLogsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveAuditLogsResponse.Data.AuditLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrHiveAuditLogsResponseUnmarshaller {

	public static ListEmrHiveAuditLogsResponse unmarshall(ListEmrHiveAuditLogsResponse listEmrHiveAuditLogsResponse, UnmarshallerContext _ctx) {
		
		listEmrHiveAuditLogsResponse.setRequestId(_ctx.stringValue("ListEmrHiveAuditLogsResponse.RequestId"));
		listEmrHiveAuditLogsResponse.setErrorCode(_ctx.stringValue("ListEmrHiveAuditLogsResponse.ErrorCode"));
		listEmrHiveAuditLogsResponse.setErrorMessage(_ctx.stringValue("ListEmrHiveAuditLogsResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListEmrHiveAuditLogsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListEmrHiveAuditLogsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListEmrHiveAuditLogsResponse.Data.TotalCount"));

		List<AuditLog> pagedData = new ArrayList<AuditLog>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrHiveAuditLogsResponse.Data.PagedData.Length"); i++) {
			AuditLog auditLog = new AuditLog();
			auditLog.setTable(_ctx.stringValue("ListEmrHiveAuditLogsResponse.Data.PagedData["+ i +"].Table"));
			auditLog.setDatabase(_ctx.stringValue("ListEmrHiveAuditLogsResponse.Data.PagedData["+ i +"].Database"));
			auditLog.setUser(_ctx.stringValue("ListEmrHiveAuditLogsResponse.Data.PagedData["+ i +"].User"));
			auditLog.setOperation(_ctx.stringValue("ListEmrHiveAuditLogsResponse.Data.PagedData["+ i +"].Operation"));
			auditLog.setEventTime(_ctx.longValue("ListEmrHiveAuditLogsResponse.Data.PagedData["+ i +"].EventTime"));

			List<String> groups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListEmrHiveAuditLogsResponse.Data.PagedData["+ i +"].Groups.Length"); j++) {
				groups.add(_ctx.stringValue("ListEmrHiveAuditLogsResponse.Data.PagedData["+ i +"].Groups["+ j +"]"));
			}
			auditLog.setGroups(groups);

			pagedData.add(auditLog);
		}
		data.setPagedData(pagedData);
		listEmrHiveAuditLogsResponse.setData(data);
	 
	 	return listEmrHiveAuditLogsResponse;
	}
}