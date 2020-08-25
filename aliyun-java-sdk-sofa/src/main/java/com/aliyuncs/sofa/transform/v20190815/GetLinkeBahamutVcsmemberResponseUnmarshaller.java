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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmemberResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmemberResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsmemberResponseUnmarshaller {

	public static GetLinkeBahamutVcsmemberResponse unmarshall(GetLinkeBahamutVcsmemberResponse getLinkeBahamutVcsmemberResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsmemberResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.RequestId"));
		getLinkeBahamutVcsmemberResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.ResultCode"));
		getLinkeBahamutVcsmemberResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.ResultMessage"));
		getLinkeBahamutVcsmemberResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.ErrorMessage"));
		getLinkeBahamutVcsmemberResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsmemberResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Message"));
		getLinkeBahamutVcsmemberResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsmemberResponse.ResponseStatusCode"));
		getLinkeBahamutVcsmemberResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsmemberResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsmemberResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccount(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Account"));
			resultItem.setConfirmedTime(_ctx.longValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].ConfirmedTime"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Created"));
			resultItem.setCustomer(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Customer"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Deleted"));
			resultItem.setDepartment(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Department"));
			resultItem.setEmail(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Email"));
			resultItem.setEmpId(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].EmpId"));
			resultItem.setHasConfirmed(_ctx.booleanValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].HasConfirmed"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Id"));
			resultItem.setLastLogin(_ctx.longValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].LastLogin"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].LastModified"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Name"));
			resultItem.setNick(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Nick"));
			resultItem.setUid(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Uid"));
			resultItem.setUniqueId(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].UniqueId"));
			resultItem.setWw(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Ww"));

			List<String> tenants = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Tenants.Length"); j++) {
				tenants.add(_ctx.stringValue("GetLinkeBahamutVcsmemberResponse.Result["+ i +"].Tenants["+ j +"]"));
			}
			resultItem.setTenants(tenants);

			result.add(resultItem);
		}
		getLinkeBahamutVcsmemberResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsmemberResponse;
	}
}