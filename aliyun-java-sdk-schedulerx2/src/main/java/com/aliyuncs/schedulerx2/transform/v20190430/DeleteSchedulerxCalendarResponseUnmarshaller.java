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

import com.aliyuncs.schedulerx2.model.v20190430.DeleteSchedulerxCalendarResponse;
import com.aliyuncs.schedulerx2.model.v20190430.DeleteSchedulerxCalendarResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSchedulerxCalendarResponseUnmarshaller {

	public static DeleteSchedulerxCalendarResponse unmarshall(DeleteSchedulerxCalendarResponse deleteSchedulerxCalendarResponse, UnmarshallerContext _ctx) {
		
		deleteSchedulerxCalendarResponse.setRequestId(_ctx.stringValue("DeleteSchedulerxCalendarResponse.RequestId"));
		deleteSchedulerxCalendarResponse.setMessage(_ctx.stringValue("DeleteSchedulerxCalendarResponse.Message"));
		deleteSchedulerxCalendarResponse.setCode(_ctx.integerValue("DeleteSchedulerxCalendarResponse.Code"));
		deleteSchedulerxCalendarResponse.setSuccess(_ctx.booleanValue("DeleteSchedulerxCalendarResponse.Success"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setPolicyType(_ctx.stringValue("DeleteSchedulerxCalendarResponse.AccessDeniedDetail.PolicyType"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("DeleteSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("DeleteSchedulerxCalendarResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("DeleteSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("DeleteSchedulerxCalendarResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("DeleteSchedulerxCalendarResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setAuthAction(_ctx.stringValue("DeleteSchedulerxCalendarResponse.AccessDeniedDetail.AuthAction"));
		deleteSchedulerxCalendarResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return deleteSchedulerxCalendarResponse;
	}
}