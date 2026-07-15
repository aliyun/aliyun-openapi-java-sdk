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

import com.aliyuncs.schedulerx2.model.v20190430.ManageSchedulerxCalendarResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ManageSchedulerxCalendarResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ManageSchedulerxCalendarResponseUnmarshaller {

	public static ManageSchedulerxCalendarResponse unmarshall(ManageSchedulerxCalendarResponse manageSchedulerxCalendarResponse, UnmarshallerContext _ctx) {
		
		manageSchedulerxCalendarResponse.setRequestId(_ctx.stringValue("ManageSchedulerxCalendarResponse.RequestId"));
		manageSchedulerxCalendarResponse.setMessage(_ctx.stringValue("ManageSchedulerxCalendarResponse.Message"));
		manageSchedulerxCalendarResponse.setCode(_ctx.integerValue("ManageSchedulerxCalendarResponse.Code"));
		manageSchedulerxCalendarResponse.setSuccess(_ctx.booleanValue("ManageSchedulerxCalendarResponse.Success"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setPolicyType(_ctx.stringValue("ManageSchedulerxCalendarResponse.AccessDeniedDetail.PolicyType"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("ManageSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("ManageSchedulerxCalendarResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("ManageSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("ManageSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("ManageSchedulerxCalendarResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setAuthAction(_ctx.stringValue("ManageSchedulerxCalendarResponse.AccessDeniedDetail.AuthAction"));
		manageSchedulerxCalendarResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return manageSchedulerxCalendarResponse;
	}
}