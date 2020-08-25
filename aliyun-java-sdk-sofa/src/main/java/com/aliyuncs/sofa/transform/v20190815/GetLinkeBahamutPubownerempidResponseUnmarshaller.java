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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPubownerempidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPubownerempidResponseUnmarshaller {

	public static GetLinkeBahamutPubownerempidResponse unmarshall(GetLinkeBahamutPubownerempidResponse getLinkeBahamutPubownerempidResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPubownerempidResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPubownerempidResponse.RequestId"));
		getLinkeBahamutPubownerempidResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPubownerempidResponse.ResultCode"));
		getLinkeBahamutPubownerempidResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPubownerempidResponse.ResultMessage"));
		getLinkeBahamutPubownerempidResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPubownerempidResponse.ErrorMessage"));
		getLinkeBahamutPubownerempidResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPubownerempidResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPubownerempidResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPubownerempidResponse.Message"));
		getLinkeBahamutPubownerempidResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPubownerempidResponse.ResponseStatusCode"));
		getLinkeBahamutPubownerempidResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPubownerempidResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPubownerempidResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutPubownerempidResponse.Result["+ i +"]"));
		}
		getLinkeBahamutPubownerempidResponse.setResult(result);
	 
	 	return getLinkeBahamutPubownerempidResponse;
	}
}