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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryAuditLogResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryAuditLogResponse.LogApiResultModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAuditLogResponseUnmarshaller {

	public static QueryAuditLogResponse unmarshall(QueryAuditLogResponse queryAuditLogResponse, UnmarshallerContext _ctx) {
		
		queryAuditLogResponse.setRequestId(_ctx.stringValue("QueryAuditLogResponse.RequestId"));
		queryAuditLogResponse.setSuccess(_ctx.booleanValue("QueryAuditLogResponse.Success"));

		List<LogApiResultModel> result = new ArrayList<LogApiResultModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryAuditLogResponse.Result.Length"); i++) {
			LogApiResultModel logApiResultModel = new LogApiResultModel();
			logApiResultModel.setGmtCreate(_ctx.stringValue("QueryAuditLogResponse.Result["+ i +"].GmtCreate"));
			logApiResultModel.setOperatorAccountName(_ctx.stringValue("QueryAuditLogResponse.Result["+ i +"].OperatorAccountName"));
			logApiResultModel.setOperatorName(_ctx.stringValue("QueryAuditLogResponse.Result["+ i +"].OperatorName"));
			logApiResultModel.setOperatorType(_ctx.stringValue("QueryAuditLogResponse.Result["+ i +"].OperatorType"));
			logApiResultModel.setTargetName(_ctx.stringValue("QueryAuditLogResponse.Result["+ i +"].TargetName"));
			logApiResultModel.setTargetType(_ctx.stringValue("QueryAuditLogResponse.Result["+ i +"].TargetType"));
			logApiResultModel.setWorkspaceId(_ctx.stringValue("QueryAuditLogResponse.Result["+ i +"].WorkspaceId"));

			result.add(logApiResultModel);
		}
		queryAuditLogResponse.setResult(result);
	 
	 	return queryAuditLogResponse;
	}
}