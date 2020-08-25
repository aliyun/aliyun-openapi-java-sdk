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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsprojectissueResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsprojectissueResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsprojectissueResponseUnmarshaller {

	public static GetLinkeBahamutVcsprojectissueResponse unmarshall(GetLinkeBahamutVcsprojectissueResponse getLinkeBahamutVcsprojectissueResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsprojectissueResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.RequestId"));
		getLinkeBahamutVcsprojectissueResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.ResultCode"));
		getLinkeBahamutVcsprojectissueResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.ResultMessage"));
		getLinkeBahamutVcsprojectissueResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.ErrorMessage"));
		getLinkeBahamutVcsprojectissueResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsprojectissueResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Message"));
		getLinkeBahamutVcsprojectissueResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsprojectissueResponse.ResponseStatusCode"));
		getLinkeBahamutVcsprojectissueResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsprojectissueResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsprojectissueResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAssignee(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].Assignee"));
			resultItem.setCreatedAt(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].CreatedAt"));
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].Id"));
			resultItem.setIid(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].Iid"));
			resultItem.setState(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].State"));
			resultItem.setTitle(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].Title"));
			resultItem.setUpdatedAt(_ctx.stringValue("GetLinkeBahamutVcsprojectissueResponse.Result["+ i +"].UpdatedAt"));

			result.add(resultItem);
		}
		getLinkeBahamutVcsprojectissueResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsprojectissueResponse;
	}
}