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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.SetSniConfigResponse;
import com.aliyuncs.onsmqtt.model.v20200420.SetSniConfigResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetSniConfigResponseUnmarshaller {

	public static SetSniConfigResponse unmarshall(SetSniConfigResponse setSniConfigResponse, UnmarshallerContext _ctx) {
		
		setSniConfigResponse.setRequestId(_ctx.stringValue("SetSniConfigResponse.RequestId"));
		setSniConfigResponse.setSuccess(_ctx.stringValue("SetSniConfigResponse.Success"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setAuthAction(_ctx.stringValue("SetSniConfigResponse.AccessDeniedDetail.AuthAction"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("SetSniConfigResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("SetSniConfigResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("SetSniConfigResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("SetSniConfigResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("SetSniConfigResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setPolicyType(_ctx.stringValue("SetSniConfigResponse.AccessDeniedDetail.PolicyType"));
		setSniConfigResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return setSniConfigResponse;
	}
}