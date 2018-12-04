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

import com.aliyuncs.baas.model.v20180731.DescribeChannelMembersResponse;
import com.aliyuncs.baas.model.v20180731.DescribeChannelMembersResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChannelMembersResponseUnmarshaller {

	public static DescribeChannelMembersResponse unmarshall(DescribeChannelMembersResponse describeChannelMembersResponse, UnmarshallerContext context) {
		
		describeChannelMembersResponse.setRequestId(context.stringValue("DescribeChannelMembersResponse.RequestId"));
		describeChannelMembersResponse.setSuccess(context.booleanValue("DescribeChannelMembersResponse.Success"));
		describeChannelMembersResponse.setErrorCode(context.integerValue("DescribeChannelMembersResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeChannelMembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setChannelId(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].ChannelId"));
			resultItem.setOrganizationId(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].OrganizationId"));
			resultItem.setWithPeer(context.booleanValue("DescribeChannelMembersResponse.Result["+ i +"].WithPeer"));
			resultItem.setState(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].State"));
			resultItem.setInviteTime(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].InviteTime"));
			resultItem.setAcceptTime(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].AcceptTime"));
			resultItem.setName(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].Name"));
			resultItem.setDomain(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].Domain"));
			resultItem.setDescription(context.stringValue("DescribeChannelMembersResponse.Result["+ i +"].Description"));

			result.add(resultItem);
		}
		describeChannelMembersResponse.setResult(result);
	 
	 	return describeChannelMembersResponse;
	}
}