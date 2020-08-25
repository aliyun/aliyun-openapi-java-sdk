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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetrelatereleaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetrelatereleaseResponseUnmarshaller {

	public static GetLinkeBahamutOpengetrelatereleaseResponse unmarshall(GetLinkeBahamutOpengetrelatereleaseResponse getLinkeBahamutOpengetrelatereleaseResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetrelatereleaseResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseResponse.RequestId"));
		getLinkeBahamutOpengetrelatereleaseResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseResponse.ResultCode"));
		getLinkeBahamutOpengetrelatereleaseResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseResponse.ResultMessage"));
		getLinkeBahamutOpengetrelatereleaseResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseResponse.ErrorMessage"));
		getLinkeBahamutOpengetrelatereleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetrelatereleaseResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseResponse.Message"));
		getLinkeBahamutOpengetrelatereleaseResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetrelatereleaseResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetrelatereleaseResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetrelatereleaseResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutOpengetrelatereleaseResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseResponse.Result["+ i +"]"));
		}
		getLinkeBahamutOpengetrelatereleaseResponse.setResult(result);
	 
	 	return getLinkeBahamutOpengetrelatereleaseResponse;
	}
}