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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.CreateAppInstanceTicketResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppInstanceTicketResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppInstanceTicketResponseUnmarshaller {

	public static CreateAppInstanceTicketResponse unmarshall(CreateAppInstanceTicketResponse createAppInstanceTicketResponse, UnmarshallerContext _ctx) {
		
		createAppInstanceTicketResponse.setRequestId(_ctx.stringValue("CreateAppInstanceTicketResponse.RequestId"));
		createAppInstanceTicketResponse.setDynamicCode(_ctx.stringValue("CreateAppInstanceTicketResponse.DynamicCode"));
		createAppInstanceTicketResponse.setDynamicMessage(_ctx.stringValue("CreateAppInstanceTicketResponse.DynamicMessage"));
		createAppInstanceTicketResponse.setSynchro(_ctx.booleanValue("CreateAppInstanceTicketResponse.Synchro"));
		createAppInstanceTicketResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAppInstanceTicketResponse.AccessDeniedDetail"));
		createAppInstanceTicketResponse.setRootErrorMsg(_ctx.stringValue("CreateAppInstanceTicketResponse.RootErrorMsg"));
		createAppInstanceTicketResponse.setRootErrorCode(_ctx.stringValue("CreateAppInstanceTicketResponse.RootErrorCode"));
		createAppInstanceTicketResponse.setAllowRetry(_ctx.booleanValue("CreateAppInstanceTicketResponse.AllowRetry"));
		createAppInstanceTicketResponse.setAppName(_ctx.stringValue("CreateAppInstanceTicketResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAppInstanceTicketResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAppInstanceTicketResponse.ErrorArgs["+ i +"]"));
		}
		createAppInstanceTicketResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setUuid(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.Uuid"));
		module.setBid(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.Bid"));
		module.setParentPk(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.ParentPk"));
		module.setAliyunPk(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.AliyunPk"));
		module.setAttributes(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.Attributes"));
		module.setAuthorizationGrantType(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.AuthorizationGrantType"));
		module.setAccessTokenValue(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.AccessTokenValue"));
		module.setAccessTokenIssuedAt(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.AccessTokenIssuedAt"));
		module.setAccessTokenExpiresAt(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.AccessTokenExpiresAt"));
		module.setRefreshTokenValue(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.RefreshTokenValue"));
		module.setRefreshTokenIssuedAt(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.RefreshTokenIssuedAt"));
		module.setRefreshTokenExpiresAt(_ctx.stringValue("CreateAppInstanceTicketResponse.Module.RefreshTokenExpiresAt"));
		createAppInstanceTicketResponse.setModule(module);
	 
	 	return createAppInstanceTicketResponse;
	}
}