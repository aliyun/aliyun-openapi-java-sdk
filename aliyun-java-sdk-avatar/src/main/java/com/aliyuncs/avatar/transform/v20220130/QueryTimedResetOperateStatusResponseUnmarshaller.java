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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.QueryTimedResetOperateStatusResponse;
import com.aliyuncs.avatar.model.v20220130.QueryTimedResetOperateStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTimedResetOperateStatusResponseUnmarshaller {

	public static QueryTimedResetOperateStatusResponse unmarshall(QueryTimedResetOperateStatusResponse queryTimedResetOperateStatusResponse, UnmarshallerContext _ctx) {
		
		queryTimedResetOperateStatusResponse.setRequestId(_ctx.stringValue("QueryTimedResetOperateStatusResponse.RequestId"));
		queryTimedResetOperateStatusResponse.setCode(_ctx.stringValue("QueryTimedResetOperateStatusResponse.Code"));
		queryTimedResetOperateStatusResponse.setMessage(_ctx.stringValue("QueryTimedResetOperateStatusResponse.Message"));
		queryTimedResetOperateStatusResponse.setSuccess(_ctx.booleanValue("QueryTimedResetOperateStatusResponse.Success"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("QueryTimedResetOperateStatusResponse.Data.InstanceId"));
		data.setStatusStr(_ctx.stringValue("QueryTimedResetOperateStatusResponse.Data.StatusStr"));
		data.setTenantId(_ctx.stringValue("QueryTimedResetOperateStatusResponse.Data.TenantId"));
		data.setStatus(_ctx.longValue("QueryTimedResetOperateStatusResponse.Data.Status"));
		queryTimedResetOperateStatusResponse.setData(data);
	 
	 	return queryTimedResetOperateStatusResponse;
	}
}