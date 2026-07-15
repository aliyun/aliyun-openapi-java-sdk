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

import com.aliyuncs.schedulerx2.model.v20190430.DeleteSchedulerxNotificationPolicyResponse;
import com.aliyuncs.schedulerx2.model.v20190430.DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSchedulerxNotificationPolicyResponseUnmarshaller {

	public static DeleteSchedulerxNotificationPolicyResponse unmarshall(DeleteSchedulerxNotificationPolicyResponse deleteSchedulerxNotificationPolicyResponse, UnmarshallerContext _ctx) {
		
		deleteSchedulerxNotificationPolicyResponse.setRequestId(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.RequestId"));
		deleteSchedulerxNotificationPolicyResponse.setMessage(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.Message"));
		deleteSchedulerxNotificationPolicyResponse.setCode(_ctx.integerValue("DeleteSchedulerxNotificationPolicyResponse.Code"));
		deleteSchedulerxNotificationPolicyResponse.setSuccess(_ctx.booleanValue("DeleteSchedulerxNotificationPolicyResponse.Success"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setPolicyType(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail.PolicyType"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setAuthAction(_ctx.stringValue("DeleteSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthAction"));
		deleteSchedulerxNotificationPolicyResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return deleteSchedulerxNotificationPolicyResponse;
	}
}