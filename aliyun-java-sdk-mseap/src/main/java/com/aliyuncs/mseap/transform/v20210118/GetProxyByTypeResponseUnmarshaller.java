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

import com.aliyuncs.mseap.model.v20210118.GetProxyByTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProxyByTypeResponseUnmarshaller {

	public static GetProxyByTypeResponse unmarshall(GetProxyByTypeResponse getProxyByTypeResponse, UnmarshallerContext _ctx) {
		
		getProxyByTypeResponse.setRequestId(_ctx.stringValue("GetProxyByTypeResponse.RequestId"));
		getProxyByTypeResponse.setAllowRetry(_ctx.booleanValue("GetProxyByTypeResponse.AllowRetry"));
		getProxyByTypeResponse.setErrorMsg(_ctx.stringValue("GetProxyByTypeResponse.ErrorMsg"));
		getProxyByTypeResponse.setHttpStatusCode(_ctx.integerValue("GetProxyByTypeResponse.HttpStatusCode"));
		getProxyByTypeResponse.setDynamicCode(_ctx.stringValue("GetProxyByTypeResponse.DynamicCode"));
		getProxyByTypeResponse.setErrorCode(_ctx.stringValue("GetProxyByTypeResponse.ErrorCode"));
		getProxyByTypeResponse.setDynamicMessage(_ctx.stringValue("GetProxyByTypeResponse.DynamicMessage"));
		getProxyByTypeResponse.setModule(_ctx.stringValue("GetProxyByTypeResponse.Module"));
		getProxyByTypeResponse.setSuccess(_ctx.booleanValue("GetProxyByTypeResponse.Success"));
		getProxyByTypeResponse.setAppName(_ctx.stringValue("GetProxyByTypeResponse.AppName"));
	 
	 	return getProxyByTypeResponse;
	}
}