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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.JoinFabricChannelResponse;
import com.aliyuncs.baas.model.v20181221.JoinFabricChannelResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinFabricChannelResponseUnmarshaller {

	public static JoinFabricChannelResponse unmarshall(JoinFabricChannelResponse joinFabricChannelResponse, UnmarshallerContext _ctx) {
		
		joinFabricChannelResponse.setRequestId(_ctx.stringValue("JoinFabricChannelResponse.RequestId"));
		joinFabricChannelResponse.setSuccess(_ctx.booleanValue("JoinFabricChannelResponse.Success"));
		joinFabricChannelResponse.setErrorCode(_ctx.integerValue("JoinFabricChannelResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("JoinFabricChannelResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setChannelId(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].ChannelId"));
			resultItem.setOrganizationId(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].OrganizationId"));
			resultItem.setWithPeer(_ctx.booleanValue("JoinFabricChannelResponse.Result["+ i +"].WithPeer"));
			resultItem.setState(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].State"));
			resultItem.setInviteTime(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].InviteTime"));
			resultItem.setAcceptTime(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].AcceptTime"));
			resultItem.setApproveTime(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].ApproveTime"));
			resultItem.setConfirmTime(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].ConfirmTime"));
			resultItem.setDestroyTime(_ctx.stringValue("JoinFabricChannelResponse.Result["+ i +"].DestroyTime"));

			result.add(resultItem);
		}
		joinFabricChannelResponse.setResult(result);
	 
	 	return joinFabricChannelResponse;
	}
}