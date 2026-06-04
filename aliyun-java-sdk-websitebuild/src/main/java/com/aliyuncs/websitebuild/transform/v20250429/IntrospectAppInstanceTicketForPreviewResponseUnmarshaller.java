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

import com.aliyuncs.websitebuild.model.v20250429.IntrospectAppInstanceTicketForPreviewResponse;
import com.aliyuncs.websitebuild.model.v20250429.IntrospectAppInstanceTicketForPreviewResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class IntrospectAppInstanceTicketForPreviewResponseUnmarshaller {

	public static IntrospectAppInstanceTicketForPreviewResponse unmarshall(IntrospectAppInstanceTicketForPreviewResponse introspectAppInstanceTicketForPreviewResponse, UnmarshallerContext _ctx) {
		
		introspectAppInstanceTicketForPreviewResponse.setRequestId(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.RequestId"));
		introspectAppInstanceTicketForPreviewResponse.setDynamicCode(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.DynamicCode"));
		introspectAppInstanceTicketForPreviewResponse.setDynamicMessage(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.DynamicMessage"));
		introspectAppInstanceTicketForPreviewResponse.setSynchro(_ctx.booleanValue("IntrospectAppInstanceTicketForPreviewResponse.Synchro"));
		introspectAppInstanceTicketForPreviewResponse.setAccessDeniedDetail(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.AccessDeniedDetail"));
		introspectAppInstanceTicketForPreviewResponse.setRootErrorMsg(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.RootErrorMsg"));
		introspectAppInstanceTicketForPreviewResponse.setRootErrorCode(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.RootErrorCode"));
		introspectAppInstanceTicketForPreviewResponse.setAllowRetry(_ctx.booleanValue("IntrospectAppInstanceTicketForPreviewResponse.AllowRetry"));
		introspectAppInstanceTicketForPreviewResponse.setAppName(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("IntrospectAppInstanceTicketForPreviewResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.ErrorArgs["+ i +"]"));
		}
		introspectAppInstanceTicketForPreviewResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setUuid(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.Uuid"));
		module.setBid(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.Bid"));
		module.setParentPk(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.ParentPk"));
		module.setAliyunPk(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.AliyunPk"));
		module.setAttributes(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.Attributes"));
		module.setAuthorizationGrantType(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.AuthorizationGrantType"));
		module.setAccessTokenValue(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.AccessTokenValue"));
		module.setAccessTokenIssuedAt(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.AccessTokenIssuedAt"));
		module.setAccessTokenExpiresAt(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.AccessTokenExpiresAt"));
		module.setRefreshTokenValue(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.RefreshTokenValue"));
		module.setRefreshTokenIssuedAt(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.RefreshTokenIssuedAt"));
		module.setRefreshTokenExpiresAt(_ctx.stringValue("IntrospectAppInstanceTicketForPreviewResponse.Module.RefreshTokenExpiresAt"));
		introspectAppInstanceTicketForPreviewResponse.setModule(module);
	 
	 	return introspectAppInstanceTicketForPreviewResponse;
	}
}