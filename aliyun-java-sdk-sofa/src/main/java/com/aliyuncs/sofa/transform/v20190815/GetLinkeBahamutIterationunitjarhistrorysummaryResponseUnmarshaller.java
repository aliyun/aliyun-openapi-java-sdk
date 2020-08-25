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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationunitjarhistrorysummaryResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationunitjarhistrorysummaryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationunitjarhistrorysummaryResponseUnmarshaller {

	public static GetLinkeBahamutIterationunitjarhistrorysummaryResponse unmarshall(GetLinkeBahamutIterationunitjarhistrorysummaryResponse getLinkeBahamutIterationunitjarhistrorysummaryResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.RequestId"));
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.ResultCode"));
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.ResultMessage"));
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.ErrorMessage"));
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.Message"));
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.ResponseStatusCode"));
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.Success"));

		Result result = new Result();
		result.setPassedCount(_ctx.longValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.Result.PassedCount"));
		result.setTotal(_ctx.longValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.Result.Total"));

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("GetLinkeBahamutIterationunitjarhistrorysummaryResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);
		getLinkeBahamutIterationunitjarhistrorysummaryResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationunitjarhistrorysummaryResponse;
	}
}