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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcstagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcstagResponseUnmarshaller {

	public static GetLinkeBahamutVcstagResponse unmarshall(GetLinkeBahamutVcstagResponse getLinkeBahamutVcstagResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcstagResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcstagResponse.RequestId"));
		getLinkeBahamutVcstagResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcstagResponse.ResultCode"));
		getLinkeBahamutVcstagResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcstagResponse.ResultMessage"));
		getLinkeBahamutVcstagResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcstagResponse.ErrorMessage"));
		getLinkeBahamutVcstagResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcstagResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcstagResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcstagResponse.Message"));
		getLinkeBahamutVcstagResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcstagResponse.ResponseStatusCode"));
		getLinkeBahamutVcstagResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcstagResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcstagResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutVcstagResponse.Result["+ i +"]"));
		}
		getLinkeBahamutVcstagResponse.setResult(result);
	 
	 	return getLinkeBahamutVcstagResponse;
	}
}