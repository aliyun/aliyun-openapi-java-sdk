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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidstarResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProjectsidstarResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProjectsidstarResponse unmarshall(QueryLinkeantcodeAntcodeProjectsidstarResponse queryLinkeantcodeAntcodeProjectsidstarResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProjectsidstarResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidstarResponse.RequestId"));
		queryLinkeantcodeAntcodeProjectsidstarResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidstarResponse.ResultCode"));
		queryLinkeantcodeAntcodeProjectsidstarResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidstarResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProjectsidstarResponse.setData(_ctx.booleanValue("QueryLinkeantcodeAntcodeProjectsidstarResponse.Data"));
		queryLinkeantcodeAntcodeProjectsidstarResponse.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidstarResponse.Message"));
		queryLinkeantcodeAntcodeProjectsidstarResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidstarResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeProjectsidstarResponse.setStatus(_ctx.booleanValue("QueryLinkeantcodeAntcodeProjectsidstarResponse.Status"));
	 
	 	return queryLinkeantcodeAntcodeProjectsidstarResponse;
	}
}