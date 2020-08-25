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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponseUnmarshaller {

	public static GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse unmarshall(GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.RequestId"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.ResultCode"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.ResultMessage"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.ErrorMessage"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.ErrorMsgParamsMap"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setMessage(_ctx.stringValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.Message"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.ResponseStatusCode"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setResult(_ctx.stringValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.Result"));
		getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse.Success"));
	 
	 	return getLinkeBahamutGroupsgetpipelinegroupsanddelealwithlastpipelineResponse;
	}
}