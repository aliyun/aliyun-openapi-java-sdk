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

import com.aliyuncs.baas.model.v20180731.DescribeInvitationListResponse;
import com.aliyuncs.baas.model.v20180731.DescribeInvitationListResponse.InvitationList;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvitationListResponseUnmarshaller {

	public static DescribeInvitationListResponse unmarshall(DescribeInvitationListResponse describeInvitationListResponse, UnmarshallerContext context) {
		
		describeInvitationListResponse.setRequestId(context.stringValue("DescribeInvitationListResponse.RequestId"));
		describeInvitationListResponse.setSuccess(context.booleanValue("DescribeInvitationListResponse.Success"));
		describeInvitationListResponse.setErrorCode(context.integerValue("DescribeInvitationListResponse.ErrorCode"));

		List<InvitationList> result = new ArrayList<InvitationList>();
		for (int i = 0; i < context.lengthValue("DescribeInvitationListResponse.Result.Length"); i++) {
			InvitationList invitationList = new InvitationList();
			invitationList.setCode(context.stringValue("DescribeInvitationListResponse.Result["+ i +"].Code"));
			invitationList.setSendTime(context.stringValue("DescribeInvitationListResponse.Result["+ i +"].SendTime"));
			invitationList.setConsortiumId(context.stringValue("DescribeInvitationListResponse.Result["+ i +"].ConsortiumId"));
			invitationList.setExpireTime(context.stringValue("DescribeInvitationListResponse.Result["+ i +"].ExpireTime"));
			invitationList.setEmail(context.stringValue("DescribeInvitationListResponse.Result["+ i +"].Email"));

			result.add(invitationList);
		}
		describeInvitationListResponse.setResult(result);
	 
	 	return describeInvitationListResponse;
	}
}