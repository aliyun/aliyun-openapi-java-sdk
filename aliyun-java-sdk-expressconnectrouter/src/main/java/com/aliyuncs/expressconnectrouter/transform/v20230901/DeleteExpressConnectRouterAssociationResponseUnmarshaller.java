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

import com.aliyuncs.expressconnectrouter.model.v20230901.DeleteExpressConnectRouterAssociationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteExpressConnectRouterAssociationResponseUnmarshaller {

	public static DeleteExpressConnectRouterAssociationResponse unmarshall(DeleteExpressConnectRouterAssociationResponse deleteExpressConnectRouterAssociationResponse, UnmarshallerContext _ctx) {
		
		deleteExpressConnectRouterAssociationResponse.setRequestId(_ctx.stringValue("DeleteExpressConnectRouterAssociationResponse.RequestId"));
		deleteExpressConnectRouterAssociationResponse.setSuccess(_ctx.booleanValue("DeleteExpressConnectRouterAssociationResponse.Success"));
		deleteExpressConnectRouterAssociationResponse.setCode(_ctx.stringValue("DeleteExpressConnectRouterAssociationResponse.Code"));
		deleteExpressConnectRouterAssociationResponse.setMessage(_ctx.stringValue("DeleteExpressConnectRouterAssociationResponse.Message"));
		deleteExpressConnectRouterAssociationResponse.setHttpStatusCode(_ctx.integerValue("DeleteExpressConnectRouterAssociationResponse.HttpStatusCode"));
		deleteExpressConnectRouterAssociationResponse.setDynamicCode(_ctx.stringValue("DeleteExpressConnectRouterAssociationResponse.DynamicCode"));
		deleteExpressConnectRouterAssociationResponse.setDynamicMessage(_ctx.stringValue("DeleteExpressConnectRouterAssociationResponse.DynamicMessage"));
		deleteExpressConnectRouterAssociationResponse.setAccessDeniedDetail(_ctx.stringValue("DeleteExpressConnectRouterAssociationResponse.AccessDeniedDetail"));
	 
	 	return deleteExpressConnectRouterAssociationResponse;
	}
}