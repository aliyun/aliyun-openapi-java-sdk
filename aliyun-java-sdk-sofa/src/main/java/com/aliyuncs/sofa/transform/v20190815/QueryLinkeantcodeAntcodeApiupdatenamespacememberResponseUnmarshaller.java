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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeApiupdatenamespacememberResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse unmarshall(QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse queryLinkeantcodeAntcodeApiupdatenamespacememberResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.RequestId"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.ResultCode"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.ResultMessage"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setAccessLevel(_ctx.longValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.AccessLevel"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setAvatarUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.AvatarUrl"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.CreatedAt"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setEmail(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.Email"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setExpiresAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.ExpiresAt"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setExternUid(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.ExternUid"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.Id"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.Name"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setNotificationLevel(_ctx.longValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.NotificationLevel"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setState(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.State"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.UpdatedAt"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setUsername(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.Username"));
		queryLinkeantcodeAntcodeApiupdatenamespacememberResponse.setWebUrl(_ctx.stringValue("QueryLinkeantcodeAntcodeApiupdatenamespacememberResponse.WebUrl"));
	 
	 	return queryLinkeantcodeAntcodeApiupdatenamespacememberResponse;
	}
}