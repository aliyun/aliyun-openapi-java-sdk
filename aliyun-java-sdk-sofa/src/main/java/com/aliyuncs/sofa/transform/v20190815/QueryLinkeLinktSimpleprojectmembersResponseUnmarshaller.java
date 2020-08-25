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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktSimpleprojectmembersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinktSimpleprojectmembersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinktSimpleprojectmembersResponseUnmarshaller {

	public static QueryLinkeLinktSimpleprojectmembersResponse unmarshall(QueryLinkeLinktSimpleprojectmembersResponse queryLinkeLinktSimpleprojectmembersResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinktSimpleprojectmembersResponse.setRequestId(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.RequestId"));
		queryLinkeLinktSimpleprojectmembersResponse.setResultCode(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.ResultCode"));
		queryLinkeLinktSimpleprojectmembersResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.ResultMessage"));
		queryLinkeLinktSimpleprojectmembersResponse.setErrorCode(_ctx.longValue("QueryLinkeLinktSimpleprojectmembersResponse.ErrorCode"));
		queryLinkeLinktSimpleprojectmembersResponse.setErrorMessage(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.ErrorMessage"));
		queryLinkeLinktSimpleprojectmembersResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinktSimpleprojectmembersResponse.ResponseStatusCode"));
		queryLinkeLinktSimpleprojectmembersResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinktSimpleprojectmembersResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinktSimpleprojectmembersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccount(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Account"));
			dataItem.setAdDomain(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].AdDomain"));
			dataItem.setAliFullName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].AliFullName"));
			dataItem.setAuthToken(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].AuthToken"));
			dataItem.setBuName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].BuName"));
			dataItem.setBuNo(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].BuNo"));
			dataItem.setCustomer(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Customer"));
			dataItem.setDeleted(_ctx.booleanValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Deleted"));
			dataItem.setDeptName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].DeptName"));
			dataItem.setDeptNo(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].DeptNo"));
			dataItem.setEmail(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Email"));
			dataItem.setEmpId(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].EmpId"));
			dataItem.setEmpType(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].EmpType"));
			dataItem.setEmpTypeExt(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].EmpTypeExt"));
			dataItem.setFullPartTime(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].FullPartTime"));
			dataItem.setGitModified(_ctx.longValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].GitModified"));
			dataItem.setGitPassword(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].GitPassword"));
			dataItem.setGmtCreate(_ctx.longValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtEntry(_ctx.longValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].GmtEntry"));
			dataItem.setGmtLeave(_ctx.longValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].GmtLeave"));
			dataItem.setGmtModified(_ctx.longValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].GmtModified"));
			dataItem.setLevel(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Level"));
			dataItem.setLoginAccount(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].LoginAccount"));
			dataItem.setLoginName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].LoginName"));
			dataItem.setManager(_ctx.booleanValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Manager"));
			dataItem.setMobile(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Mobile"));
			dataItem.setName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Name"));
			dataItem.setNickName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].NickName"));
			dataItem.setRealName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].RealName"));
			dataItem.setSite(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Site"));
			dataItem.setSuperName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].SuperName"));
			dataItem.setSuperNickName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].SuperNickName"));
			dataItem.setSuperWorkNo(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].SuperWorkNo"));
			dataItem.setTenant(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Tenant"));
			dataItem.setTenantAdmin(_ctx.booleanValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].TenantAdmin"));
			dataItem.setUid(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Uid"));
			dataItem.setUniqueId(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].UniqueId"));
			dataItem.setUserToken(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].UserToken"));
			dataItem.setVirtName(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].VirtName"));
			dataItem.setVirtWorkNo(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].VirtWorkNo"));
			dataItem.setWorkspace(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Workspace"));
			dataItem.setWorkNo(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].WorkNo"));
			dataItem.setWorkStatus(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].WorkStatus"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("QueryLinkeLinktSimpleprojectmembersResponse.Data["+ i +"].Tenants["+ j +"]"));
			}
			dataItem.setTenants(tenants);

			data.add(dataItem);
		}
		queryLinkeLinktSimpleprojectmembersResponse.setData(data);
	 
	 	return queryLinkeLinktSimpleprojectmembersResponse;
	}
}