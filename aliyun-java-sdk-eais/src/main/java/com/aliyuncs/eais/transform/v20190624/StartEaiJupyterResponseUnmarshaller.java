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

package com.aliyuncs.eais.transform.v20190624;

import com.aliyuncs.eais.model.v20190624.StartEaiJupyterResponse;
import com.aliyuncs.eais.model.v20190624.StartEaiJupyterResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartEaiJupyterResponseUnmarshaller {

	public static StartEaiJupyterResponse unmarshall(StartEaiJupyterResponse startEaiJupyterResponse, UnmarshallerContext _ctx) {
		
		startEaiJupyterResponse.setRequestId(_ctx.stringValue("StartEaiJupyterResponse.RequestId"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setAuthAction(_ctx.stringValue("StartEaiJupyterResponse.AccessDeniedDetail.AuthAction"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("StartEaiJupyterResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("StartEaiJupyterResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("StartEaiJupyterResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("StartEaiJupyterResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("StartEaiJupyterResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setPolicyType(_ctx.stringValue("StartEaiJupyterResponse.AccessDeniedDetail.PolicyType"));
		startEaiJupyterResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return startEaiJupyterResponse;
	}
}