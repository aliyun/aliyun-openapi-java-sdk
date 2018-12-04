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

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumMembersResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumMembersResponse.DescribeConsortiumMember;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumMembersResponseUnmarshaller {

	public static DescribeConsortiumMembersResponse unmarshall(DescribeConsortiumMembersResponse describeConsortiumMembersResponse, UnmarshallerContext context) {
		
		describeConsortiumMembersResponse.setRequestId(context.stringValue("DescribeConsortiumMembersResponse.RequestId"));
		describeConsortiumMembersResponse.setSuccess(context.booleanValue("DescribeConsortiumMembersResponse.Success"));
		describeConsortiumMembersResponse.setErrorCode(context.integerValue("DescribeConsortiumMembersResponse.ErrorCode"));

		List<DescribeConsortiumMember> result = new ArrayList<DescribeConsortiumMember>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumMembersResponse.Result.Length"); i++) {
			DescribeConsortiumMember describeConsortiumMember = new DescribeConsortiumMember();
			describeConsortiumMember.setName(context.stringValue("DescribeConsortiumMembersResponse.Result["+ i +"].Name"));
			describeConsortiumMember.setDomain(context.stringValue("DescribeConsortiumMembersResponse.Result["+ i +"].Domain"));
			describeConsortiumMember.setDescription(context.stringValue("DescribeConsortiumMembersResponse.Result["+ i +"].Description"));
			describeConsortiumMember.setJoinedTime(context.stringValue("DescribeConsortiumMembersResponse.Result["+ i +"].JoinedTime"));
			describeConsortiumMember.setConsortiumId(context.stringValue("DescribeConsortiumMembersResponse.Result["+ i +"].ConsortiumId"));
			describeConsortiumMember.setOrganizationId(context.stringValue("DescribeConsortiumMembersResponse.Result["+ i +"].OrganizationId"));

			result.add(describeConsortiumMember);
		}
		describeConsortiumMembersResponse.setResult(result);
	 
	 	return describeConsortiumMembersResponse;
	}
}