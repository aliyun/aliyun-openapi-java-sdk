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

import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumMembersResponse;
import com.aliyuncs.baas.model.v20181221.DescribeFabricConsortiumMembersResponse.DescribeConsortiumMember;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricConsortiumMembersResponseUnmarshaller {

	public static DescribeFabricConsortiumMembersResponse unmarshall(DescribeFabricConsortiumMembersResponse describeFabricConsortiumMembersResponse, UnmarshallerContext _ctx) {
		
		describeFabricConsortiumMembersResponse.setRequestId(_ctx.stringValue("DescribeFabricConsortiumMembersResponse.RequestId"));
		describeFabricConsortiumMembersResponse.setSuccess(_ctx.booleanValue("DescribeFabricConsortiumMembersResponse.Success"));
		describeFabricConsortiumMembersResponse.setErrorCode(_ctx.integerValue("DescribeFabricConsortiumMembersResponse.ErrorCode"));

		List<DescribeConsortiumMember> result = new ArrayList<DescribeConsortiumMember>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFabricConsortiumMembersResponse.Result.Length"); i++) {
			DescribeConsortiumMember describeConsortiumMember = new DescribeConsortiumMember();
			describeConsortiumMember.setOrganizationName(_ctx.stringValue("DescribeFabricConsortiumMembersResponse.Result["+ i +"].OrganizationName"));
			describeConsortiumMember.setDomain(_ctx.stringValue("DescribeFabricConsortiumMembersResponse.Result["+ i +"].Domain"));
			describeConsortiumMember.setDescription(_ctx.stringValue("DescribeFabricConsortiumMembersResponse.Result["+ i +"].Description"));
			describeConsortiumMember.setJoinedTime(_ctx.stringValue("DescribeFabricConsortiumMembersResponse.Result["+ i +"].JoinedTime"));
			describeConsortiumMember.setConsortiumId(_ctx.stringValue("DescribeFabricConsortiumMembersResponse.Result["+ i +"].ConsortiumId"));
			describeConsortiumMember.setOrganizationId(_ctx.stringValue("DescribeFabricConsortiumMembersResponse.Result["+ i +"].OrganizationId"));

			result.add(describeConsortiumMember);
		}
		describeFabricConsortiumMembersResponse.setResult(result);
	 
	 	return describeFabricConsortiumMembersResponse;
	}
}