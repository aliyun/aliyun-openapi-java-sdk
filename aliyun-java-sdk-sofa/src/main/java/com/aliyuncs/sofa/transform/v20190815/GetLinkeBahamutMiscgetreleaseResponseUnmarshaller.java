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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetreleaseResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutMiscgetreleaseResponseUnmarshaller {

	public static GetLinkeBahamutMiscgetreleaseResponse unmarshall(GetLinkeBahamutMiscgetreleaseResponse getLinkeBahamutMiscgetreleaseResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutMiscgetreleaseResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.RequestId"));
		getLinkeBahamutMiscgetreleaseResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.ResultCode"));
		getLinkeBahamutMiscgetreleaseResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.ResultMessage"));
		getLinkeBahamutMiscgetreleaseResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.ErrorMessage"));
		getLinkeBahamutMiscgetreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.ErrorMsgParamsMap"));
		getLinkeBahamutMiscgetreleaseResponse.setMessage(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.Message"));
		getLinkeBahamutMiscgetreleaseResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutMiscgetreleaseResponse.ResponseStatusCode"));
		getLinkeBahamutMiscgetreleaseResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutMiscgetreleaseResponse.Success"));

		Result result = new Result();
		result.setReleaseLink(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.Result.ReleaseLink"));
		result.setTicketLink(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.Result.TicketLink"));

		List<String> appNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutMiscgetreleaseResponse.Result.AppNames.Length"); i++) {
			appNames.add(_ctx.stringValue("GetLinkeBahamutMiscgetreleaseResponse.Result.AppNames["+ i +"]"));
		}
		result.setAppNames(appNames);
		getLinkeBahamutMiscgetreleaseResponse.setResult(result);
	 
	 	return getLinkeBahamutMiscgetreleaseResponse;
	}
}