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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidgcResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProjectsidgcResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProjectsidgcResponse unmarshall(QueryLinkeantcodeAntcodeProjectsidgcResponse queryLinkeantcodeAntcodeProjectsidgcResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProjectsidgcResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidgcResponse.RequestId"));
		queryLinkeantcodeAntcodeProjectsidgcResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidgcResponse.ResultCode"));
		queryLinkeantcodeAntcodeProjectsidgcResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidgcResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProjectsidgcResponse.setData(_ctx.booleanValue("QueryLinkeantcodeAntcodeProjectsidgcResponse.Data"));
		queryLinkeantcodeAntcodeProjectsidgcResponse.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidgcResponse.Message"));
		queryLinkeantcodeAntcodeProjectsidgcResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidgcResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeProjectsidgcResponse.setStatus(_ctx.booleanValue("QueryLinkeantcodeAntcodeProjectsidgcResponse.Status"));
	 
	 	return queryLinkeantcodeAntcodeProjectsidgcResponse;
	}
}