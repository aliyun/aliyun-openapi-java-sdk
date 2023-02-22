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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeUniBackupPoliciesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeUniBackupPoliciesResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeUniBackupPoliciesResponse.UniBackupPolicyDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUniBackupPoliciesResponseUnmarshaller {

	public static DescribeUniBackupPoliciesResponse unmarshall(DescribeUniBackupPoliciesResponse describeUniBackupPoliciesResponse, UnmarshallerContext _ctx) {
		
		describeUniBackupPoliciesResponse.setRequestId(_ctx.stringValue("DescribeUniBackupPoliciesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeUniBackupPoliciesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeUniBackupPoliciesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeUniBackupPoliciesResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeUniBackupPoliciesResponse.PageInfo.Count"));
		describeUniBackupPoliciesResponse.setPageInfo(pageInfo);

		List<UniBackupPolicyDTO> uniBackupPolicies = new ArrayList<UniBackupPolicyDTO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies.Length"); i++) {
			UniBackupPolicyDTO uniBackupPolicyDTO = new UniBackupPolicyDTO();
			uniBackupPolicyDTO.setPolicyStatus(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].PolicyStatus"));
			uniBackupPolicyDTO.setErrorMessage(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].ErrorMessage"));
			uniBackupPolicyDTO.setLatestBackResult(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].LatestBackResult"));
			uniBackupPolicyDTO.setUniRegionId(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].UniRegionId"));
			uniBackupPolicyDTO.setPlanStatus(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].PlanStatus"));
			uniBackupPolicyDTO.setInstanceUuid(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].InstanceUuid"));
			uniBackupPolicyDTO.setPolicyName(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].PolicyName"));
			uniBackupPolicyDTO.setAgentErrorMessage(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].AgentErrorMessage"));
			uniBackupPolicyDTO.setInstanceId(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].InstanceId"));
			uniBackupPolicyDTO.setAgentStatus(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].AgentStatus"));
			uniBackupPolicyDTO.setDatabaseType(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].DatabaseType"));
			uniBackupPolicyDTO.setUniBackUpCount(_ctx.integerValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].UniBackUpCount"));
			uniBackupPolicyDTO.setErrorCode(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].ErrorCode"));
			uniBackupPolicyDTO.setDatabaseName(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].DatabaseName"));
			uniBackupPolicyDTO.setInstanceName(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].InstanceName"));
			uniBackupPolicyDTO.setLatestBackupTime(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].LatestBackupTime"));
			uniBackupPolicyDTO.setInstanceStatus(_ctx.stringValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].InstanceStatus"));
			uniBackupPolicyDTO.setPolicyId(_ctx.longValue("DescribeUniBackupPoliciesResponse.UniBackupPolicies["+ i +"].PolicyId"));

			uniBackupPolicies.add(uniBackupPolicyDTO);
		}
		describeUniBackupPoliciesResponse.setUniBackupPolicies(uniBackupPolicies);
	 
	 	return describeUniBackupPoliciesResponse;
	}
}