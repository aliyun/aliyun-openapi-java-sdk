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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsgroupsownedResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsgroupsownedResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsgroupsownedResponseUnmarshaller {

	public static GetLinkeBahamutVcsgroupsownedResponse unmarshall(GetLinkeBahamutVcsgroupsownedResponse getLinkeBahamutVcsgroupsownedResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsgroupsownedResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.RequestId"));
		getLinkeBahamutVcsgroupsownedResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.ResultCode"));
		getLinkeBahamutVcsgroupsownedResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.ResultMessage"));
		getLinkeBahamutVcsgroupsownedResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.ErrorMessage"));
		getLinkeBahamutVcsgroupsownedResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsgroupsownedResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.Message"));
		getLinkeBahamutVcsgroupsownedResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsgroupsownedResponse.ResponseStatusCode"));
		getLinkeBahamutVcsgroupsownedResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsgroupsownedResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsgroupsownedResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.Result["+ i +"].Name"));
			resultItem.setPath(_ctx.stringValue("GetLinkeBahamutVcsgroupsownedResponse.Result["+ i +"].Path"));

			result.add(resultItem);
		}
		getLinkeBahamutVcsgroupsownedResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsgroupsownedResponse;
	}
}