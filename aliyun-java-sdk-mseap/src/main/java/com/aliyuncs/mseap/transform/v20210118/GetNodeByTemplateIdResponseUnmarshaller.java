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

import com.aliyuncs.mseap.model.v20210118.GetNodeByTemplateIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeByTemplateIdResponseUnmarshaller {

	public static GetNodeByTemplateIdResponse unmarshall(GetNodeByTemplateIdResponse getNodeByTemplateIdResponse, UnmarshallerContext _ctx) {
		
		getNodeByTemplateIdResponse.setRequestId(_ctx.stringValue("GetNodeByTemplateIdResponse.RequestId"));
		getNodeByTemplateIdResponse.setAllowRetry(_ctx.booleanValue("GetNodeByTemplateIdResponse.AllowRetry"));
		getNodeByTemplateIdResponse.setErrorMsg(_ctx.stringValue("GetNodeByTemplateIdResponse.ErrorMsg"));
		getNodeByTemplateIdResponse.setHttpStatusCode(_ctx.integerValue("GetNodeByTemplateIdResponse.HttpStatusCode"));
		getNodeByTemplateIdResponse.setDynamicCode(_ctx.stringValue("GetNodeByTemplateIdResponse.DynamicCode"));
		getNodeByTemplateIdResponse.setErrorCode(_ctx.stringValue("GetNodeByTemplateIdResponse.ErrorCode"));
		getNodeByTemplateIdResponse.setDynamicMessage(_ctx.stringValue("GetNodeByTemplateIdResponse.DynamicMessage"));
		getNodeByTemplateIdResponse.setModule(_ctx.stringValue("GetNodeByTemplateIdResponse.Module"));
		getNodeByTemplateIdResponse.setSuccess(_ctx.booleanValue("GetNodeByTemplateIdResponse.Success"));
		getNodeByTemplateIdResponse.setAppName(_ctx.stringValue("GetNodeByTemplateIdResponse.AppName"));
	 
	 	return getNodeByTemplateIdResponse;
	}
}