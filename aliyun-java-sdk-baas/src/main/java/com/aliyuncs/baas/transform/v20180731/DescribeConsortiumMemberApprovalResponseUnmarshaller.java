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

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumMemberApprovalResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumMemberApprovalResponse.ConsortiumMemberApproval;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumMemberApprovalResponseUnmarshaller {

	public static DescribeConsortiumMemberApprovalResponse unmarshall(DescribeConsortiumMemberApprovalResponse describeConsortiumMemberApprovalResponse, UnmarshallerContext context) {
		
		describeConsortiumMemberApprovalResponse.setRequestId(context.stringValue("DescribeConsortiumMemberApprovalResponse.RequestId"));
		describeConsortiumMemberApprovalResponse.setSuccess(context.booleanValue("DescribeConsortiumMemberApprovalResponse.Success"));
		describeConsortiumMemberApprovalResponse.setErrorCode(context.integerValue("DescribeConsortiumMemberApprovalResponse.ErrorCode"));

		List<ConsortiumMemberApproval> result = new ArrayList<ConsortiumMemberApproval>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumMemberApprovalResponse.Result.Length"); i++) {
			ConsortiumMemberApproval consortiumMemberApproval = new ConsortiumMemberApproval();
			consortiumMemberApproval.setConsortiumId(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].ConsortiumId"));
			consortiumMemberApproval.setConsortiumName(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].ConsortiumName"));
			consortiumMemberApproval.setChannelCreatePolicy(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].ChannelCreatePolicy"));
			consortiumMemberApproval.setOrganizationId(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].OrganizationId"));
			consortiumMemberApproval.setOrganizationName(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].OrganizationName"));
			consortiumMemberApproval.setDomainName(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].DomainName"));
			consortiumMemberApproval.setState(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].State"));
			consortiumMemberApproval.setConfirmTime(context.stringValue("DescribeConsortiumMemberApprovalResponse.Result["+ i +"].ConfirmTime"));

			result.add(consortiumMemberApproval);
		}
		describeConsortiumMemberApprovalResponse.setResult(result);
	 
	 	return describeConsortiumMemberApprovalResponse;
	}
}