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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsauthorizedprojectResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsauthorizedprojectResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsauthorizedprojectResponseUnmarshaller {

	public static GetLinkeBahamutVcsauthorizedprojectResponse unmarshall(GetLinkeBahamutVcsauthorizedprojectResponse getLinkeBahamutVcsauthorizedprojectResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsauthorizedprojectResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.RequestId"));
		getLinkeBahamutVcsauthorizedprojectResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.ResultCode"));
		getLinkeBahamutVcsauthorizedprojectResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.ResultMessage"));
		getLinkeBahamutVcsauthorizedprojectResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.ErrorMessage"));
		getLinkeBahamutVcsauthorizedprojectResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsauthorizedprojectResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Message"));
		getLinkeBahamutVcsauthorizedprojectResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsauthorizedprojectResponse.ResponseStatusCode"));
		getLinkeBahamutVcsauthorizedprojectResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsauthorizedprojectResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].Description"));
			resultItem.setEncoding(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].Encoding"));
			resultItem.setHttpUrlToRepo(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].HttpUrlToRepo"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].Name"));
			resultItem.setNamespace(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].Namespace"));
			resultItem.setPublicStatus(_ctx.booleanValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].PublicStatus"));
			resultItem.setSshUrlToRepo(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].SshUrlToRepo"));
			resultItem.setVisibility(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].Visibility"));
			resultItem.setVisibilityLevel(_ctx.longValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].VisibilityLevel"));
			resultItem.setWebUrl(_ctx.stringValue("GetLinkeBahamutVcsauthorizedprojectResponse.Result["+ i +"].WebUrl"));

			result.add(resultItem);
		}
		getLinkeBahamutVcsauthorizedprojectResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsauthorizedprojectResponse;
	}
}