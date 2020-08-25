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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetrelatelterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetrelatelterationResponseUnmarshaller {

	public static GetLinkeBahamutOpengetrelatelterationResponse unmarshall(GetLinkeBahamutOpengetrelatelterationResponse getLinkeBahamutOpengetrelatelterationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetrelatelterationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetrelatelterationResponse.RequestId"));
		getLinkeBahamutOpengetrelatelterationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetrelatelterationResponse.ResultCode"));
		getLinkeBahamutOpengetrelatelterationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatelterationResponse.ResultMessage"));
		getLinkeBahamutOpengetrelatelterationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatelterationResponse.ErrorMessage"));
		getLinkeBahamutOpengetrelatelterationResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetrelatelterationResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetrelatelterationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetrelatelterationResponse.Message"));
		getLinkeBahamutOpengetrelatelterationResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetrelatelterationResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetrelatelterationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetrelatelterationResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutOpengetrelatelterationResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutOpengetrelatelterationResponse.Result["+ i +"]"));
		}
		getLinkeBahamutOpengetrelatelterationResponse.setResult(result);
	 
	 	return getLinkeBahamutOpengetrelatelterationResponse;
	}
}