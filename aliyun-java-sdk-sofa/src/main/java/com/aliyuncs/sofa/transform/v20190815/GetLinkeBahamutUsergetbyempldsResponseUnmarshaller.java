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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyempldsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsergetbyempldsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUsergetbyempldsResponseUnmarshaller {

	public static GetLinkeBahamutUsergetbyempldsResponse unmarshall(GetLinkeBahamutUsergetbyempldsResponse getLinkeBahamutUsergetbyempldsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUsergetbyempldsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.RequestId"));
		getLinkeBahamutUsergetbyempldsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.ResultCode"));
		getLinkeBahamutUsergetbyempldsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.ResultMessage"));
		getLinkeBahamutUsergetbyempldsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.ErrorMessage"));
		getLinkeBahamutUsergetbyempldsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUsergetbyempldsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Message"));
		getLinkeBahamutUsergetbyempldsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUsergetbyempldsResponse.ResponseStatusCode"));
		getLinkeBahamutUsergetbyempldsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUsergetbyempldsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUsergetbyempldsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("GetLinkeBahamutUsergetbyempldsResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		getLinkeBahamutUsergetbyempldsResponse.setResult(result);
	 
	 	return getLinkeBahamutUsergetbyempldsResponse;
	}
}