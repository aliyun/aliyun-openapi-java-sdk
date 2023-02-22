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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.QueryPreCheckDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPreCheckDatabaseResponseUnmarshaller {

	public static QueryPreCheckDatabaseResponse unmarshall(QueryPreCheckDatabaseResponse queryPreCheckDatabaseResponse, UnmarshallerContext _ctx) {
		
		queryPreCheckDatabaseResponse.setRequestId(_ctx.stringValue("QueryPreCheckDatabaseResponse.RequestId"));
		queryPreCheckDatabaseResponse.setProgress(_ctx.integerValue("QueryPreCheckDatabaseResponse.Progress"));
		queryPreCheckDatabaseResponse.setResult(_ctx.stringValue("QueryPreCheckDatabaseResponse.Result"));
		queryPreCheckDatabaseResponse.setCompletedTime(_ctx.longValue("QueryPreCheckDatabaseResponse.CompletedTime"));
		queryPreCheckDatabaseResponse.setDescription(_ctx.stringValue("QueryPreCheckDatabaseResponse.Description"));
		queryPreCheckDatabaseResponse.setUpdatedTime(_ctx.longValue("QueryPreCheckDatabaseResponse.UpdatedTime"));
		queryPreCheckDatabaseResponse.setCreatedTime(_ctx.longValue("QueryPreCheckDatabaseResponse.CreatedTime"));
	 
	 	return queryPreCheckDatabaseResponse;
	}
}