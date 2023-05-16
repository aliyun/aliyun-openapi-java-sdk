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

package com.aliyuncs.agency.transform.v20180701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180701.GetInviteStatusResponse;
import com.aliyuncs.agency.model.v20180701.GetInviteStatusResponse.InviteStatus;
import com.aliyuncs.agency.model.v20180701.GetInviteStatusResponse.InviteStatus.InviteStatusList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInviteStatusResponseUnmarshaller {

	public static GetInviteStatusResponse unmarshall(GetInviteStatusResponse getInviteStatusResponse, UnmarshallerContext _ctx) {
		
		getInviteStatusResponse.setCode(_ctx.stringValue("GetInviteStatusResponse.Code"));
		getInviteStatusResponse.setMessage(_ctx.stringValue("GetInviteStatusResponse.Message"));
		getInviteStatusResponse.setSuccess(_ctx.booleanValue("GetInviteStatusResponse.Success"));

		List<InviteStatus> data = new ArrayList<InviteStatus>();
		for (int i = 0; i < _ctx.lengthValue("GetInviteStatusResponse.Data.Length"); i++) {
			InviteStatus inviteStatus = new InviteStatus();
			inviteStatus.setCode(_ctx.stringValue("GetInviteStatusResponse.Data["+ i +"].Code"));
			inviteStatus.setMessage(_ctx.stringValue("GetInviteStatusResponse.Data["+ i +"].Message"));
			inviteStatus.setSuccess(_ctx.booleanValue("GetInviteStatusResponse.Data["+ i +"].Success"));

			InviteStatusList inviteStatusList = new InviteStatusList();
			inviteStatusList.setStatus(_ctx.integerValue("GetInviteStatusResponse.Data["+ i +"].InviteStatusList.Status"));
			inviteStatusList.setParentId(_ctx.stringValue("GetInviteStatusResponse.Data["+ i +"].InviteStatusList.ParentId"));
			inviteStatusList.setSubAccountType(_ctx.stringValue("GetInviteStatusResponse.Data["+ i +"].InviteStatusList.SubAccountType"));
			inviteStatusList.setAssociationSuccessTime(_ctx.stringValue("GetInviteStatusResponse.Data["+ i +"].InviteStatusList.AssociationSuccessTime"));
			inviteStatusList.setGmtCreate(_ctx.stringValue("GetInviteStatusResponse.Data["+ i +"].InviteStatusList.GmtCreate"));
			inviteStatusList.setAliyunId(_ctx.stringValue("GetInviteStatusResponse.Data["+ i +"].InviteStatusList.AliyunId"));
			inviteStatus.setInviteStatusList(inviteStatusList);

			data.add(inviteStatus);
		}
		getInviteStatusResponse.setData(data);
	 
	 	return getInviteStatusResponse;
	}
}