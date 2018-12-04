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

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationMembersResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationMembersResponse.DescribeOrganizationMembers;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationMembersResponseUnmarshaller {

	public static DescribeOrganizationMembersResponse unmarshall(DescribeOrganizationMembersResponse describeOrganizationMembersResponse, UnmarshallerContext context) {
		
		describeOrganizationMembersResponse.setRequestId(context.stringValue("DescribeOrganizationMembersResponse.RequestId"));
		describeOrganizationMembersResponse.setSuccess(context.booleanValue("DescribeOrganizationMembersResponse.Success"));
		describeOrganizationMembersResponse.setErrorCode(context.integerValue("DescribeOrganizationMembersResponse.ErrorCode"));

		List<DescribeOrganizationMembers> result = new ArrayList<DescribeOrganizationMembers>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationMembersResponse.Result.Length"); i++) {
			DescribeOrganizationMembers describeOrganizationMembers = new DescribeOrganizationMembers();
			describeOrganizationMembers.setId(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].Id"));
			describeOrganizationMembers.setName(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].Name"));
			describeOrganizationMembers.setConsortiumId(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].ConsortiumId"));
			describeOrganizationMembers.setConsortiumName(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].ConsortiumName"));
			describeOrganizationMembers.setDomain(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].Domain"));
			describeOrganizationMembers.setDescription(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].Description"));
			describeOrganizationMembers.setJoinedTime(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].JoinedTime"));
			describeOrganizationMembers.setState(context.stringValue("DescribeOrganizationMembersResponse.Result["+ i +"].State"));

			result.add(describeOrganizationMembers);
		}
		describeOrganizationMembersResponse.setResult(result);
	 
	 	return describeOrganizationMembersResponse;
	}
}