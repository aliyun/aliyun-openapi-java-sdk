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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAppstackstenantidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAppstackstenantidResponseUnmarshaller {

	public static GetLinkeBahamutAppstackstenantidResponse unmarshall(GetLinkeBahamutAppstackstenantidResponse getLinkeBahamutAppstackstenantidResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAppstackstenantidResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAppstackstenantidResponse.RequestId"));
		getLinkeBahamutAppstackstenantidResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAppstackstenantidResponse.ResultCode"));
		getLinkeBahamutAppstackstenantidResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAppstackstenantidResponse.ResultMessage"));
		getLinkeBahamutAppstackstenantidResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAppstackstenantidResponse.ErrorMessage"));
		getLinkeBahamutAppstackstenantidResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAppstackstenantidResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAppstackstenantidResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAppstackstenantidResponse.Message"));
		getLinkeBahamutAppstackstenantidResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAppstackstenantidResponse.ResponseStatusCode"));
		getLinkeBahamutAppstackstenantidResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAppstackstenantidResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAppstackstenantidResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutAppstackstenantidResponse.Result["+ i +"]"));
		}
		getLinkeBahamutAppstackstenantidResponse.setResult(result);
	 
	 	return getLinkeBahamutAppstackstenantidResponse;
	}
}