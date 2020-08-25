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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutOpengetsamerepoapplnlterationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutOpengetsamerepoapplnlterationResponseUnmarshaller {

	public static GetLinkeBahamutOpengetsamerepoapplnlterationResponse unmarshall(GetLinkeBahamutOpengetsamerepoapplnlterationResponse getLinkeBahamutOpengetsamerepoapplnlterationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.RequestId"));
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.ResultCode"));
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.ResultMessage"));
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.ErrorMessage"));
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.ErrorMsgParamsMap"));
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.Message"));
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.ResponseStatusCode"));
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("GetLinkeBahamutOpengetsamerepoapplnlterationResponse.Result["+ i +"]"));
		}
		getLinkeBahamutOpengetsamerepoapplnlterationResponse.setResult(result);
	 
	 	return getLinkeBahamutOpengetsamerepoapplnlterationResponse;
	}
}