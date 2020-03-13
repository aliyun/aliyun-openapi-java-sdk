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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationunitscountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationunitscountResponseUnmarshaller {

	public static GetLinkeBahamutIterationunitscountResponse unmarshall(GetLinkeBahamutIterationunitscountResponse getLinkeBahamutIterationunitscountResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationunitscountResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationunitscountResponse.RequestId"));
		getLinkeBahamutIterationunitscountResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationunitscountResponse.ResultCode"));
		getLinkeBahamutIterationunitscountResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationunitscountResponse.ResultMessage"));
		getLinkeBahamutIterationunitscountResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationunitscountResponse.ErrorMessage"));
		getLinkeBahamutIterationunitscountResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationunitscountResponse.Message"));
		getLinkeBahamutIterationunitscountResponse.setResult(_ctx.longValue("GetLinkeBahamutIterationunitscountResponse.Result"));
		getLinkeBahamutIterationunitscountResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationunitscountResponse.Success"));
	 
	 	return getLinkeBahamutIterationunitscountResponse;
	}
}