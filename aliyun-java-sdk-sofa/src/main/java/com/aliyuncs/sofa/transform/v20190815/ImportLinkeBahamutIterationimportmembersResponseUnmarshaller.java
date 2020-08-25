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

import com.aliyuncs.sofa.model.v20190815.ImportLinkeBahamutIterationimportmembersResponse;
import com.aliyuncs.sofa.model.v20190815.ImportLinkeBahamutIterationimportmembersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportLinkeBahamutIterationimportmembersResponseUnmarshaller {

	public static ImportLinkeBahamutIterationimportmembersResponse unmarshall(ImportLinkeBahamutIterationimportmembersResponse importLinkeBahamutIterationimportmembersResponse, UnmarshallerContext _ctx) {
		
		importLinkeBahamutIterationimportmembersResponse.setRequestId(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.RequestId"));
		importLinkeBahamutIterationimportmembersResponse.setResultCode(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.ResultCode"));
		importLinkeBahamutIterationimportmembersResponse.setResultMessage(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.ResultMessage"));
		importLinkeBahamutIterationimportmembersResponse.setErrorMessage(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.ErrorMessage"));
		importLinkeBahamutIterationimportmembersResponse.setErrorMsgParamsMap(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.ErrorMsgParamsMap"));
		importLinkeBahamutIterationimportmembersResponse.setMessage(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Message"));
		importLinkeBahamutIterationimportmembersResponse.setResponseStatusCode(_ctx.longValue("ImportLinkeBahamutIterationimportmembersResponse.ResponseStatusCode"));
		importLinkeBahamutIterationimportmembersResponse.setSuccess(_ctx.booleanValue("ImportLinkeBahamutIterationimportmembersResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ImportLinkeBahamutIterationimportmembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("ImportLinkeBahamutIterationimportmembersResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		importLinkeBahamutIterationimportmembersResponse.setResult(result);
	 
	 	return importLinkeBahamutIterationimportmembersResponse;
	}
}