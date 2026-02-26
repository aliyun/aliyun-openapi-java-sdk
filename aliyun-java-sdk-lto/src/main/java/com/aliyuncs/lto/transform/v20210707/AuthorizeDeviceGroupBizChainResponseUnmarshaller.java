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

package com.aliyuncs.lto.transform.v20210707;

import com.aliyuncs.lto.model.v20210707.AuthorizeDeviceGroupBizChainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthorizeDeviceGroupBizChainResponseUnmarshaller {

	public static AuthorizeDeviceGroupBizChainResponse unmarshall(AuthorizeDeviceGroupBizChainResponse authorizeDeviceGroupBizChainResponse, UnmarshallerContext _ctx) {
		
		authorizeDeviceGroupBizChainResponse.setRequestId(_ctx.stringValue("AuthorizeDeviceGroupBizChainResponse.RequestId"));
		authorizeDeviceGroupBizChainResponse.setCode(_ctx.stringValue("AuthorizeDeviceGroupBizChainResponse.Code"));
		authorizeDeviceGroupBizChainResponse.setHttpStatusCode(_ctx.integerValue("AuthorizeDeviceGroupBizChainResponse.HttpStatusCode"));
		authorizeDeviceGroupBizChainResponse.setMessage(_ctx.stringValue("AuthorizeDeviceGroupBizChainResponse.Message"));
		authorizeDeviceGroupBizChainResponse.setSuccess(_ctx.booleanValue("AuthorizeDeviceGroupBizChainResponse.Success"));
	 
	 	return authorizeDeviceGroupBizChainResponse;
	}
}