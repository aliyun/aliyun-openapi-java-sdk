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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.GetAssociationStatusResponse;
import com.aliyuncs.agency.model.v20180703.GetAssociationStatusResponse.Result;
import com.aliyuncs.agency.model.v20180703.GetAssociationStatusResponse.Result.InviteStatusList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAssociationStatusResponseUnmarshaller {

	public static GetAssociationStatusResponse unmarshall(GetAssociationStatusResponse getAssociationStatusResponse, UnmarshallerContext _ctx) {
		
		getAssociationStatusResponse.setCode(_ctx.stringValue("GetAssociationStatusResponse.Code"));
		getAssociationStatusResponse.setMessage(_ctx.stringValue("GetAssociationStatusResponse.Message"));
		getAssociationStatusResponse.setSuccess(_ctx.booleanValue("GetAssociationStatusResponse.Success"));

		List<Result> data = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("GetAssociationStatusResponse.Data.Length"); i++) {
			Result result = new Result();
			result.setCode(_ctx.stringValue("GetAssociationStatusResponse.Data["+ i +"].Code"));
			result.setMessage(_ctx.stringValue("GetAssociationStatusResponse.Data["+ i +"].Message"));
			result.setSuccess(_ctx.booleanValue("GetAssociationStatusResponse.Data["+ i +"].Success"));

			InviteStatusList inviteStatusList = new InviteStatusList();
			inviteStatusList.setGmtCreate(_ctx.stringValue("GetAssociationStatusResponse.Data["+ i +"].InviteStatusList.GmtCreate"));
			inviteStatusList.setStatus(_ctx.integerValue("GetAssociationStatusResponse.Data["+ i +"].InviteStatusList.Status"));
			inviteStatusList.setSubAccountType(_ctx.stringValue("GetAssociationStatusResponse.Data["+ i +"].InviteStatusList.SubAccountType"));
			inviteStatusList.setParentId(_ctx.stringValue("GetAssociationStatusResponse.Data["+ i +"].InviteStatusList.ParentId"));
			inviteStatusList.setValidTime(_ctx.stringValue("GetAssociationStatusResponse.Data["+ i +"].InviteStatusList.ValidTime"));
			result.setInviteStatusList(inviteStatusList);

			data.add(result);
		}
		getAssociationStatusResponse.setData(data);
	 
	 	return getAssociationStatusResponse;
	}
}