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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllpubownerResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllpubownerResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAllpubownerResponseUnmarshaller {

	public static GetLinkeBahamutAllpubownerResponse unmarshall(GetLinkeBahamutAllpubownerResponse getLinkeBahamutAllpubownerResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAllpubownerResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.RequestId"));
		getLinkeBahamutAllpubownerResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.ResultCode"));
		getLinkeBahamutAllpubownerResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.ResultMessage"));
		getLinkeBahamutAllpubownerResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.ErrorMessage"));
		getLinkeBahamutAllpubownerResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAllpubownerResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Message"));
		getLinkeBahamutAllpubownerResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAllpubownerResponse.ResponseStatusCode"));
		getLinkeBahamutAllpubownerResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAllpubownerResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAllpubownerResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("GetLinkeBahamutAllpubownerResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		getLinkeBahamutAllpubownerResponse.setResult(result);
	 
	 	return getLinkeBahamutAllpubownerResponse;
	}
}