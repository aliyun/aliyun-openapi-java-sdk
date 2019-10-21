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

import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationMembersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricOrganizationMembersResponse.DescribeOrganizationMembers;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricOrganizationMembersResponseUnmarshaller {

	public static DescribeFabricOrganizationMembersResponse unmarshall(DescribeFabricOrganizationMembersResponse describeFabricOrganizationMembersResponse, UnmarshallerContext _ctx) {
		
		describeFabricOrganizationMembersResponse.setRequestId(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.RequestId"));
		describeFabricOrganizationMembersResponse.setSuccess(_ctx.booleanValue("DescribeFabricOrganizationMembersResponse.Success"));
		describeFabricOrganizationMembersResponse.setErrorCode(_ctx.integerValue("DescribeFabricOrganizationMembersResponse.ErrorCode"));

		List<DescribeOrganizationMembers> result = new ArrayList<DescribeOrganizationMembers>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricOrganizationMembersResponse.Result.Length"); i++) {
			DescribeOrganizationMembers describeOrganizationMembers = new DescribeOrganizationMembers();
			describeOrganizationMembers.setOrganizationId(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].OrganizationId"));
			describeOrganizationMembers.setOrganizationName(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].OrganizationName"));
			describeOrganizationMembers.setConsortiumId(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].ConsortiumId"));
			describeOrganizationMembers.setConsortiumName(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].ConsortiumName"));
			describeOrganizationMembers.setDomain(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].Domain"));
			describeOrganizationMembers.setDescription(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].Description"));
			describeOrganizationMembers.setJoinedTime(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].JoinedTime"));
			describeOrganizationMembers.setState(_ctx.stringValue("DescribeFabricOrganizationMembersResponse.Result["+ i +"].State"));

			result.add(describeOrganizationMembers);
		}
		describeFabricOrganizationMembersResponse.setResult(result);
	 
	 	return describeFabricOrganizationMembersResponse;
	}
}