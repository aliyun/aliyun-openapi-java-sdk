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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.JoinChannelResponse;
import com.aliyuncs.baas.model.v20180731.JoinChannelResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinChannelResponseUnmarshaller {

	public static JoinChannelResponse unmarshall(JoinChannelResponse joinChannelResponse, UnmarshallerContext context) {
		
		joinChannelResponse.setRequestId(context.stringValue("JoinChannelResponse.RequestId"));
		joinChannelResponse.setSuccess(context.booleanValue("JoinChannelResponse.Success"));
		joinChannelResponse.setErrorCode(context.integerValue("JoinChannelResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("JoinChannelResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setChannelId(context.stringValue("JoinChannelResponse.Result["+ i +"].ChannelId"));
			resultItem.setOrganizationId(context.stringValue("JoinChannelResponse.Result["+ i +"].OrganizationId"));
			resultItem.setWithPeer(context.booleanValue("JoinChannelResponse.Result["+ i +"].WithPeer"));
			resultItem.setState(context.stringValue("JoinChannelResponse.Result["+ i +"].State"));
			resultItem.setInviteTime(context.stringValue("JoinChannelResponse.Result["+ i +"].InviteTime"));
			resultItem.setAcceptTime(context.stringValue("JoinChannelResponse.Result["+ i +"].AcceptTime"));
			resultItem.setApproveTime(context.stringValue("JoinChannelResponse.Result["+ i +"].ApproveTime"));
			resultItem.setConfirmTime(context.stringValue("JoinChannelResponse.Result["+ i +"].ConfirmTime"));
			resultItem.setDestroyTime(context.stringValue("JoinChannelResponse.Result["+ i +"].DestroyTime"));

			result.add(resultItem);
		}
		joinChannelResponse.setResult(result);
	 
	 	return joinChannelResponse;
	}
}