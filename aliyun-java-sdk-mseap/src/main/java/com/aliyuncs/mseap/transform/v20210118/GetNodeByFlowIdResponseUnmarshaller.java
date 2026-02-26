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

package com.aliyuncs.mseap.transform.v20210118;

import com.aliyuncs.mseap.model.v20210118.GetNodeByFlowIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeByFlowIdResponseUnmarshaller {

	public static GetNodeByFlowIdResponse unmarshall(GetNodeByFlowIdResponse getNodeByFlowIdResponse, UnmarshallerContext _ctx) {
		
		getNodeByFlowIdResponse.setRequestId(_ctx.stringValue("GetNodeByFlowIdResponse.RequestId"));
		getNodeByFlowIdResponse.setAllowRetry(_ctx.booleanValue("GetNodeByFlowIdResponse.AllowRetry"));
		getNodeByFlowIdResponse.setErrorMsg(_ctx.stringValue("GetNodeByFlowIdResponse.ErrorMsg"));
		getNodeByFlowIdResponse.setHttpStatusCode(_ctx.integerValue("GetNodeByFlowIdResponse.HttpStatusCode"));
		getNodeByFlowIdResponse.setDynamicCode(_ctx.stringValue("GetNodeByFlowIdResponse.DynamicCode"));
		getNodeByFlowIdResponse.setErrorCode(_ctx.stringValue("GetNodeByFlowIdResponse.ErrorCode"));
		getNodeByFlowIdResponse.setDynamicMessage(_ctx.stringValue("GetNodeByFlowIdResponse.DynamicMessage"));
		getNodeByFlowIdResponse.setModule(_ctx.stringValue("GetNodeByFlowIdResponse.Module"));
		getNodeByFlowIdResponse.setSuccess(_ctx.booleanValue("GetNodeByFlowIdResponse.Success"));
		getNodeByFlowIdResponse.setAppName(_ctx.stringValue("GetNodeByFlowIdResponse.AppName"));
	 
	 	return getNodeByFlowIdResponse;
	}
}