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

package com.aliyuncs.marketplaceintl.transform.v20221230;

import com.aliyuncs.marketplaceintl.model.v20221230.NoticeInstanceUserResponse;
import com.aliyuncs.marketplaceintl.model.v20221230.NoticeInstanceUserResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class NoticeInstanceUserResponseUnmarshaller {

	public static NoticeInstanceUserResponse unmarshall(NoticeInstanceUserResponse noticeInstanceUserResponse, UnmarshallerContext _ctx) {
		
		noticeInstanceUserResponse.setRequestId(_ctx.stringValue("NoticeInstanceUserResponse.RequestId"));
		noticeInstanceUserResponse.setResult(_ctx.booleanValue("NoticeInstanceUserResponse.Result"));
		noticeInstanceUserResponse.setSuccess(_ctx.booleanValue("NoticeInstanceUserResponse.Success"));
		noticeInstanceUserResponse.setCode(_ctx.stringValue("NoticeInstanceUserResponse.Code"));
		noticeInstanceUserResponse.setMessage(_ctx.stringValue("NoticeInstanceUserResponse.Message"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setAuthAction(_ctx.stringValue("NoticeInstanceUserResponse.AccessDeniedDetail.AuthAction"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("NoticeInstanceUserResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("NoticeInstanceUserResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("NoticeInstanceUserResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("NoticeInstanceUserResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("NoticeInstanceUserResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setPolicyType(_ctx.stringValue("NoticeInstanceUserResponse.AccessDeniedDetail.PolicyType"));
		noticeInstanceUserResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return noticeInstanceUserResponse;
	}
}