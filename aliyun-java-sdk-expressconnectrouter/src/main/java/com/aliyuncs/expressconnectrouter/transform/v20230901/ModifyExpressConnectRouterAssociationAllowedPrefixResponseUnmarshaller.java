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

import com.aliyuncs.expressconnectrouter.model.v20230901.ModifyExpressConnectRouterAssociationAllowedPrefixResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyExpressConnectRouterAssociationAllowedPrefixResponseUnmarshaller {

	public static ModifyExpressConnectRouterAssociationAllowedPrefixResponse unmarshall(ModifyExpressConnectRouterAssociationAllowedPrefixResponse modifyExpressConnectRouterAssociationAllowedPrefixResponse, UnmarshallerContext _ctx) {
		
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setRequestId(_ctx.stringValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.RequestId"));
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setSuccess(_ctx.booleanValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.Success"));
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setCode(_ctx.stringValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.Code"));
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setMessage(_ctx.stringValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.Message"));
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setHttpStatusCode(_ctx.integerValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.HttpStatusCode"));
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setDynamicCode(_ctx.stringValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.DynamicCode"));
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setDynamicMessage(_ctx.stringValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.DynamicMessage"));
		modifyExpressConnectRouterAssociationAllowedPrefixResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyExpressConnectRouterAssociationAllowedPrefixResponse.AccessDeniedDetail"));
	 
	 	return modifyExpressConnectRouterAssociationAllowedPrefixResponse;
	}
}