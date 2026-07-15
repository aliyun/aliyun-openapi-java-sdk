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

package com.aliyuncs.schedulerx2.transform.v20190430;

import com.aliyuncs.schedulerx2.model.v20190430.ManageSchedulerxNotificationPolicyResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ManageSchedulerxNotificationPolicyResponseUnmarshaller {

	public static ManageSchedulerxNotificationPolicyResponse unmarshall(ManageSchedulerxNotificationPolicyResponse manageSchedulerxNotificationPolicyResponse, UnmarshallerContext _ctx) {
		
		manageSchedulerxNotificationPolicyResponse.setRequestId(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.RequestId"));
		manageSchedulerxNotificationPolicyResponse.setMessage(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.Message"));
		manageSchedulerxNotificationPolicyResponse.setCode(_ctx.integerValue("ManageSchedulerxNotificationPolicyResponse.Code"));
		manageSchedulerxNotificationPolicyResponse.setSuccess(_ctx.booleanValue("ManageSchedulerxNotificationPolicyResponse.Success"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setPolicyType(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail.PolicyType"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setAuthAction(_ctx.stringValue("ManageSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthAction"));
		manageSchedulerxNotificationPolicyResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return manageSchedulerxNotificationPolicyResponse;
	}
}