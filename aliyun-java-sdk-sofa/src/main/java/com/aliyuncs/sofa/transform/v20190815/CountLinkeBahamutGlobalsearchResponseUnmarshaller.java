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

import com.aliyuncs.sofa.model.v20190815.CountLinkeBahamutGlobalsearchResponse;
import com.aliyuncs.sofa.model.v20190815.CountLinkeBahamutGlobalsearchResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountLinkeBahamutGlobalsearchResponseUnmarshaller {

	public static CountLinkeBahamutGlobalsearchResponse unmarshall(CountLinkeBahamutGlobalsearchResponse countLinkeBahamutGlobalsearchResponse, UnmarshallerContext _ctx) {
		
		countLinkeBahamutGlobalsearchResponse.setRequestId(_ctx.stringValue("CountLinkeBahamutGlobalsearchResponse.RequestId"));
		countLinkeBahamutGlobalsearchResponse.setResultCode(_ctx.stringValue("CountLinkeBahamutGlobalsearchResponse.ResultCode"));
		countLinkeBahamutGlobalsearchResponse.setResultMessage(_ctx.stringValue("CountLinkeBahamutGlobalsearchResponse.ResultMessage"));
		countLinkeBahamutGlobalsearchResponse.setErrorMessage(_ctx.stringValue("CountLinkeBahamutGlobalsearchResponse.ErrorMessage"));
		countLinkeBahamutGlobalsearchResponse.setMessage(_ctx.stringValue("CountLinkeBahamutGlobalsearchResponse.Message"));
		countLinkeBahamutGlobalsearchResponse.setSuccess(_ctx.booleanValue("CountLinkeBahamutGlobalsearchResponse.Success"));

		Result result = new Result();
		result.setApps(_ctx.longValue("CountLinkeBahamutGlobalsearchResponse.Result.Apps"));
		result.setIterations(_ctx.longValue("CountLinkeBahamutGlobalsearchResponse.Result.Iterations"));
		result.setIterationUnits(_ctx.longValue("CountLinkeBahamutGlobalsearchResponse.Result.IterationUnits"));
		result.setReleases(_ctx.longValue("CountLinkeBahamutGlobalsearchResponse.Result.Releases"));
		countLinkeBahamutGlobalsearchResponse.setResult(result);
	 
	 	return countLinkeBahamutGlobalsearchResponse;
	}
}