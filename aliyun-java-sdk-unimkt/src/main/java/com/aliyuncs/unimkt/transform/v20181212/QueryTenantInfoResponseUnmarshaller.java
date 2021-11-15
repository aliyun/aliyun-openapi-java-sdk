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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryTenantInfoResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryTenantInfoResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTenantInfoResponseUnmarshaller {

	public static QueryTenantInfoResponse unmarshall(QueryTenantInfoResponse queryTenantInfoResponse, UnmarshallerContext _ctx) {
		
		queryTenantInfoResponse.setRequestId(_ctx.stringValue("QueryTenantInfoResponse.RequestId"));
		queryTenantInfoResponse.setCode(_ctx.stringValue("QueryTenantInfoResponse.Code"));
		queryTenantInfoResponse.setSuccess(_ctx.booleanValue("QueryTenantInfoResponse.Success"));
		queryTenantInfoResponse.setMessage(_ctx.stringValue("QueryTenantInfoResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("QueryTenantInfoResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("QueryTenantInfoResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QueryTenantInfoResponse.Model.TenantId"));
		model.setBusiness(_ctx.stringValue("QueryTenantInfoResponse.Model.Business"));
		model.setTenantName(_ctx.stringValue("QueryTenantInfoResponse.Model.TenantName"));
		model.setTenantDescription(_ctx.stringValue("QueryTenantInfoResponse.Model.TenantDescription"));
		model.setStatus(_ctx.stringValue("QueryTenantInfoResponse.Model.Status"));
		model.setSettleInfo(_ctx.stringValue("QueryTenantInfoResponse.Model.SettleInfo"));
		model.setExtInfo(_ctx.stringValue("QueryTenantInfoResponse.Model.ExtInfo"));
		model.setVersion(_ctx.longValue("QueryTenantInfoResponse.Model.Version"));
		queryTenantInfoResponse.setModel(model);
	 
	 	return queryTenantInfoResponse;
	}
}