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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetrelatereleaseappsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetrelatereleaseappsResponseUnmarshaller {

	public static GetLinkeBahamutOpengetrelatereleaseappsResponse unmarshall(GetLinkeBahamutOpengetrelatereleaseappsResponse getLinkeBahamutOpengetrelatereleaseappsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetrelatereleaseappsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.RequestId"));
		getLinkeBahamutOpengetrelatereleaseappsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.ResultCode"));
		getLinkeBahamutOpengetrelatereleaseappsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.ResultMessage"));
		getLinkeBahamutOpengetrelatereleaseappsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.ErrorMessage"));
		getLinkeBahamutOpengetrelatereleaseappsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetrelatereleaseappsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.Message"));
		getLinkeBahamutOpengetrelatereleaseappsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetrelatereleaseappsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutOpengetrelatereleaseappsResponse.Result["+ i +"]"));
		}
		getLinkeBahamutOpengetrelatereleaseappsResponse.setResult(result);
	 
	 	return getLinkeBahamutOpengetrelatereleaseappsResponse;
	}
}