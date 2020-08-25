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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPreviewgetpreviewownersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPreviewgetpreviewownersResponseUnmarshaller {

	public static GetLinkeBahamutPreviewgetpreviewownersResponse unmarshall(GetLinkeBahamutPreviewgetpreviewownersResponse getLinkeBahamutPreviewgetpreviewownersResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPreviewgetpreviewownersResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPreviewgetpreviewownersResponse.RequestId"));
		getLinkeBahamutPreviewgetpreviewownersResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPreviewgetpreviewownersResponse.ResultCode"));
		getLinkeBahamutPreviewgetpreviewownersResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPreviewgetpreviewownersResponse.ResultMessage"));
		getLinkeBahamutPreviewgetpreviewownersResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPreviewgetpreviewownersResponse.ErrorMessage"));
		getLinkeBahamutPreviewgetpreviewownersResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPreviewgetpreviewownersResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPreviewgetpreviewownersResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPreviewgetpreviewownersResponse.Message"));
		getLinkeBahamutPreviewgetpreviewownersResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPreviewgetpreviewownersResponse.ResponseStatusCode"));
		getLinkeBahamutPreviewgetpreviewownersResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPreviewgetpreviewownersResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPreviewgetpreviewownersResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutPreviewgetpreviewownersResponse.Result["+ i +"]"));
		}
		getLinkeBahamutPreviewgetpreviewownersResponse.setResult(result);
	 
	 	return getLinkeBahamutPreviewgetpreviewownersResponse;
	}
}