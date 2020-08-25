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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsermenucommonResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutUsermenucommonResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutUsermenucommonResponseUnmarshaller {

	public static GetLinkeBahamutUsermenucommonResponse unmarshall(GetLinkeBahamutUsermenucommonResponse getLinkeBahamutUsermenucommonResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutUsermenucommonResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.RequestId"));
		getLinkeBahamutUsermenucommonResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.ResultCode"));
		getLinkeBahamutUsermenucommonResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.ResultMessage"));
		getLinkeBahamutUsermenucommonResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.ErrorMessage"));
		getLinkeBahamutUsermenucommonResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.ErrorMsgParamsMap"));
		getLinkeBahamutUsermenucommonResponse.setMessage(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.Message"));
		getLinkeBahamutUsermenucommonResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutUsermenucommonResponse.ResponseStatusCode"));
		getLinkeBahamutUsermenucommonResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutUsermenucommonResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutUsermenucommonResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDisplayName(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.Result["+ i +"].DisplayName"));
			resultItem.setHref(_ctx.stringValue("GetLinkeBahamutUsermenucommonResponse.Result["+ i +"].Href"));
			resultItem.setVisitCount(_ctx.longValue("GetLinkeBahamutUsermenucommonResponse.Result["+ i +"].VisitCount"));

			result.add(resultItem);
		}
		getLinkeBahamutUsermenucommonResponse.setResult(result);
	 
	 	return getLinkeBahamutUsermenucommonResponse;
	}
}