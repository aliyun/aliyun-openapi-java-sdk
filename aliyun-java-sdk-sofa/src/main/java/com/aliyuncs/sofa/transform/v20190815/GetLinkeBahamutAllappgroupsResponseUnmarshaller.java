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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllappgroupsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAllappgroupsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAllappgroupsResponseUnmarshaller {

	public static GetLinkeBahamutAllappgroupsResponse unmarshall(GetLinkeBahamutAllappgroupsResponse getLinkeBahamutAllappgroupsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAllappgroupsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.RequestId"));
		getLinkeBahamutAllappgroupsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.ResultCode"));
		getLinkeBahamutAllappgroupsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.ResultMessage"));
		getLinkeBahamutAllappgroupsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.ErrorMessage"));
		getLinkeBahamutAllappgroupsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAllappgroupsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Message"));
		getLinkeBahamutAllappgroupsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAllappgroupsResponse.ResponseStatusCode"));
		getLinkeBahamutAllappgroupsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAllappgroupsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAllappgroupsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Created"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Creator"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Deleted"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Id"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].LastModified"));
			resultItem.setModifiyUser(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].ModifiyUser"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Name"));
			resultItem.setRemark(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Remark"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Tenant"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Type"));

			List<String> admins = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Admins.Length"); j++) {
				admins.add(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].Admins["+ j +"]"));
			}
			resultItem.setAdmins(admins);

			List<String> appList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].AppList.Length"); j++) {
				appList.add(_ctx.stringValue("GetLinkeBahamutAllappgroupsResponse.Result["+ i +"].AppList["+ j +"]"));
			}
			resultItem.setAppList(appList);

			result.add(resultItem);
		}
		getLinkeBahamutAllappgroupsResponse.setResult(result);
	 
	 	return getLinkeBahamutAllappgroupsResponse;
	}
}