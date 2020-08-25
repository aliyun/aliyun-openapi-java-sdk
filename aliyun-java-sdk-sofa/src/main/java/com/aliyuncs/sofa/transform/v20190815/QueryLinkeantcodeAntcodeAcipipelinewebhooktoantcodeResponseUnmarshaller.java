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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse unmarshall(QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.RequestId"));
		queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.ResultCode"));
		queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.ResultMessage"));
		queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.setData(_ctx.booleanValue("QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.Data"));
		queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.setMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.Message"));
		queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.setStatus(_ctx.booleanValue("QueryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse.Status"));
	 
	 	return queryLinkeantcodeAntcodeAcipipelinewebhooktoantcodeResponse;
	}
}