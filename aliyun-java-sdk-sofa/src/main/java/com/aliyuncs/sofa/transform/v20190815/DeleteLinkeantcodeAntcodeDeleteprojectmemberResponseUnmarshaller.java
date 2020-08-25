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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeDeleteprojectmemberResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse unmarshall(DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse deleteLinkeantcodeAntcodeDeleteprojectmemberResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.RequestId"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.ResultCode"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setAccessLevel(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.AccessLevel"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setCreatedById(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.CreatedById"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setExpiresAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.ExpiresAt"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.Id"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setInviteAcceptedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.InviteAcceptedAt"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setInviteEmail(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.InviteEmail"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setInviteToken(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.InviteToken"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.Message"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setNotificationLevel(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.NotificationLevel"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setSourceId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.SourceId"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.SourceType"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.TenantId"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setType(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.Type"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.UpdatedAt"));
		deleteLinkeantcodeAntcodeDeleteprojectmemberResponse.setUserId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteprojectmemberResponse.UserId"));
	 
	 	return deleteLinkeantcodeAntcodeDeleteprojectmemberResponse;
	}
}