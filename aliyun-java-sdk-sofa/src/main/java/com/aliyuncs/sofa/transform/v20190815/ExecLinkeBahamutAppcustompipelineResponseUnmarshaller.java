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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutAppcustompipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeBahamutAppcustompipelineResponseUnmarshaller {

	public static ExecLinkeBahamutAppcustompipelineResponse unmarshall(ExecLinkeBahamutAppcustompipelineResponse execLinkeBahamutAppcustompipelineResponse, UnmarshallerContext _ctx) {
		
		execLinkeBahamutAppcustompipelineResponse.setRequestId(_ctx.stringValue("ExecLinkeBahamutAppcustompipelineResponse.RequestId"));
		execLinkeBahamutAppcustompipelineResponse.setResultCode(_ctx.stringValue("ExecLinkeBahamutAppcustompipelineResponse.ResultCode"));
		execLinkeBahamutAppcustompipelineResponse.setResultMessage(_ctx.stringValue("ExecLinkeBahamutAppcustompipelineResponse.ResultMessage"));
		execLinkeBahamutAppcustompipelineResponse.setErrorMessage(_ctx.stringValue("ExecLinkeBahamutAppcustompipelineResponse.ErrorMessage"));
		execLinkeBahamutAppcustompipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("ExecLinkeBahamutAppcustompipelineResponse.ErrorMsgParamsMap"));
		execLinkeBahamutAppcustompipelineResponse.setMessage(_ctx.stringValue("ExecLinkeBahamutAppcustompipelineResponse.Message"));
		execLinkeBahamutAppcustompipelineResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeBahamutAppcustompipelineResponse.ResponseStatusCode"));
		execLinkeBahamutAppcustompipelineResponse.setResult(_ctx.booleanValue("ExecLinkeBahamutAppcustompipelineResponse.Result"));
		execLinkeBahamutAppcustompipelineResponse.setSuccess(_ctx.booleanValue("ExecLinkeBahamutAppcustompipelineResponse.Success"));
	 
	 	return execLinkeBahamutAppcustompipelineResponse;
	}
}