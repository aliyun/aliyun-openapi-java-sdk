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

import com.aliyuncs.unimkt.model.v20181212.QueryTenantUserResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryTenantUserResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTenantUserResponseUnmarshaller {

	public static QueryTenantUserResponse unmarshall(QueryTenantUserResponse queryTenantUserResponse, UnmarshallerContext _ctx) {
		
		queryTenantUserResponse.setRequestId(_ctx.stringValue("QueryTenantUserResponse.RequestId"));
		queryTenantUserResponse.setCode(_ctx.stringValue("QueryTenantUserResponse.Code"));
		queryTenantUserResponse.setSuccess(_ctx.booleanValue("QueryTenantUserResponse.Success"));
		queryTenantUserResponse.setMessage(_ctx.stringValue("QueryTenantUserResponse.Message"));

		Model model = new Model();
		model.setCreateTime(_ctx.longValue("QueryTenantUserResponse.Model.CreateTime"));
		model.setModifyTime(_ctx.longValue("QueryTenantUserResponse.Model.ModifyTime"));
		model.setTenantId(_ctx.stringValue("QueryTenantUserResponse.Model.TenantId"));
		model.setTenantName(_ctx.stringValue("QueryTenantUserResponse.Model.TenantName"));
		model.setBusiness(_ctx.stringValue("QueryTenantUserResponse.Model.Business"));
		model.setUserId(_ctx.stringValue("QueryTenantUserResponse.Model.UserId"));
		model.setUserName(_ctx.stringValue("QueryTenantUserResponse.Model.UserName"));
		model.setOriginSite(_ctx.stringValue("QueryTenantUserResponse.Model.OriginSite"));
		model.setOriginSiteUserId(_ctx.stringValue("QueryTenantUserResponse.Model.OriginSiteUserId"));
		model.setOriginSiteUserName(_ctx.stringValue("QueryTenantUserResponse.Model.OriginSiteUserName"));
		model.setStatus(_ctx.stringValue("QueryTenantUserResponse.Model.Status"));
		model.setVersion(_ctx.longValue("QueryTenantUserResponse.Model.Version"));
		model.setExtInfo(_ctx.stringValue("QueryTenantUserResponse.Model.ExtInfo"));
		queryTenantUserResponse.setModel(model);
	 
	 	return queryTenantUserResponse;
	}
}