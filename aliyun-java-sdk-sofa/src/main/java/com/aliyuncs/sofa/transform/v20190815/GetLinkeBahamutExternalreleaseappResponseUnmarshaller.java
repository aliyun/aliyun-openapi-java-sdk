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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutExternalreleaseappResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutExternalreleaseappResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutExternalreleaseappResponseUnmarshaller {

	public static GetLinkeBahamutExternalreleaseappResponse unmarshall(GetLinkeBahamutExternalreleaseappResponse getLinkeBahamutExternalreleaseappResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutExternalreleaseappResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.RequestId"));
		getLinkeBahamutExternalreleaseappResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.ResultCode"));
		getLinkeBahamutExternalreleaseappResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.ResultMessage"));
		getLinkeBahamutExternalreleaseappResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.ErrorMessage"));
		getLinkeBahamutExternalreleaseappResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.ErrorMsgParamsMap"));
		getLinkeBahamutExternalreleaseappResponse.setMessage(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.Message"));
		getLinkeBahamutExternalreleaseappResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutExternalreleaseappResponse.ResponseStatusCode"));
		getLinkeBahamutExternalreleaseappResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutExternalreleaseappResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutExternalreleaseappResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setReleaseId(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.Result["+ i +"].ReleaseId"));

			List<String> releaseRepos = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutExternalreleaseappResponse.Result["+ i +"].ReleaseRepos.Length"); j++) {
				releaseRepos.add(_ctx.stringValue("GetLinkeBahamutExternalreleaseappResponse.Result["+ i +"].ReleaseRepos["+ j +"]"));
			}
			resultItem.setReleaseRepos(releaseRepos);

			result.add(resultItem);
		}
		getLinkeBahamutExternalreleaseappResponse.setResult(result);
	 
	 	return getLinkeBahamutExternalreleaseappResponse;
	}
}