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

import com.aliyuncs.websitebuild.model.v20250429.RefreshAppInstanceTicketResponse;
import com.aliyuncs.websitebuild.model.v20250429.RefreshAppInstanceTicketResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshAppInstanceTicketResponseUnmarshaller {

	public static RefreshAppInstanceTicketResponse unmarshall(RefreshAppInstanceTicketResponse refreshAppInstanceTicketResponse, UnmarshallerContext _ctx) {
		
		refreshAppInstanceTicketResponse.setRequestId(_ctx.stringValue("RefreshAppInstanceTicketResponse.RequestId"));
		refreshAppInstanceTicketResponse.setDynamicCode(_ctx.stringValue("RefreshAppInstanceTicketResponse.DynamicCode"));
		refreshAppInstanceTicketResponse.setDynamicMessage(_ctx.stringValue("RefreshAppInstanceTicketResponse.DynamicMessage"));
		refreshAppInstanceTicketResponse.setSynchro(_ctx.booleanValue("RefreshAppInstanceTicketResponse.Synchro"));
		refreshAppInstanceTicketResponse.setAccessDeniedDetail(_ctx.stringValue("RefreshAppInstanceTicketResponse.AccessDeniedDetail"));
		refreshAppInstanceTicketResponse.setRootErrorMsg(_ctx.stringValue("RefreshAppInstanceTicketResponse.RootErrorMsg"));
		refreshAppInstanceTicketResponse.setRootErrorCode(_ctx.stringValue("RefreshAppInstanceTicketResponse.RootErrorCode"));
		refreshAppInstanceTicketResponse.setAllowRetry(_ctx.booleanValue("RefreshAppInstanceTicketResponse.AllowRetry"));
		refreshAppInstanceTicketResponse.setAppName(_ctx.stringValue("RefreshAppInstanceTicketResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RefreshAppInstanceTicketResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RefreshAppInstanceTicketResponse.ErrorArgs["+ i +"]"));
		}
		refreshAppInstanceTicketResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setUuid(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.Uuid"));
		module.setBid(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.Bid"));
		module.setParentPk(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.ParentPk"));
		module.setAliyunPk(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.AliyunPk"));
		module.setAttributes(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.Attributes"));
		module.setAuthorizationGrantType(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.AuthorizationGrantType"));
		module.setAccessTokenValue(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.AccessTokenValue"));
		module.setAccessTokenIssuedAt(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.AccessTokenIssuedAt"));
		module.setAccessTokenExpiresAt(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.AccessTokenExpiresAt"));
		module.setRefreshTokenValue(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.RefreshTokenValue"));
		module.setRefreshTokenIssuedAt(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.RefreshTokenIssuedAt"));
		module.setRefreshTokenExpiresAt(_ctx.stringValue("RefreshAppInstanceTicketResponse.Module.RefreshTokenExpiresAt"));
		refreshAppInstanceTicketResponse.setModule(module);
	 
	 	return refreshAppInstanceTicketResponse;
	}
}