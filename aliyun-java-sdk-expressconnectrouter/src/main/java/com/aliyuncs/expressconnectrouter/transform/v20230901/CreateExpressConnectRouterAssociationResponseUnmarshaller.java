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

package com.aliyuncs.expressconnectrouter.transform.v20230901;

import com.aliyuncs.expressconnectrouter.model.v20230901.CreateExpressConnectRouterAssociationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateExpressConnectRouterAssociationResponseUnmarshaller {

	public static CreateExpressConnectRouterAssociationResponse unmarshall(CreateExpressConnectRouterAssociationResponse createExpressConnectRouterAssociationResponse, UnmarshallerContext _ctx) {
		
		createExpressConnectRouterAssociationResponse.setRequestId(_ctx.stringValue("CreateExpressConnectRouterAssociationResponse.RequestId"));
		createExpressConnectRouterAssociationResponse.setSuccess(_ctx.booleanValue("CreateExpressConnectRouterAssociationResponse.Success"));
		createExpressConnectRouterAssociationResponse.setCode(_ctx.stringValue("CreateExpressConnectRouterAssociationResponse.Code"));
		createExpressConnectRouterAssociationResponse.setMessage(_ctx.stringValue("CreateExpressConnectRouterAssociationResponse.Message"));
		createExpressConnectRouterAssociationResponse.setHttpStatusCode(_ctx.integerValue("CreateExpressConnectRouterAssociationResponse.HttpStatusCode"));
		createExpressConnectRouterAssociationResponse.setDynamicCode(_ctx.stringValue("CreateExpressConnectRouterAssociationResponse.DynamicCode"));
		createExpressConnectRouterAssociationResponse.setDynamicMessage(_ctx.stringValue("CreateExpressConnectRouterAssociationResponse.DynamicMessage"));
		createExpressConnectRouterAssociationResponse.setAccessDeniedDetail(_ctx.stringValue("CreateExpressConnectRouterAssociationResponse.AccessDeniedDetail"));
		createExpressConnectRouterAssociationResponse.setAssociationId(_ctx.stringValue("CreateExpressConnectRouterAssociationResponse.AssociationId"));
	 
	 	return createExpressConnectRouterAssociationResponse;
	}
}