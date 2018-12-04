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

import com.aliyuncs.baas.model.v20180731.DescribeOrgnaizationChaincodesResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrgnaizationChaincodesResponse.OrganizationChaincode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrgnaizationChaincodesResponseUnmarshaller {

	public static DescribeOrgnaizationChaincodesResponse unmarshall(DescribeOrgnaizationChaincodesResponse describeOrgnaizationChaincodesResponse, UnmarshallerContext context) {
		
		describeOrgnaizationChaincodesResponse.setRequestId(context.stringValue("DescribeOrgnaizationChaincodesResponse.RequestId"));
		describeOrgnaizationChaincodesResponse.setSuccess(context.booleanValue("DescribeOrgnaizationChaincodesResponse.Success"));
		describeOrgnaizationChaincodesResponse.setErrorCode(context.integerValue("DescribeOrgnaizationChaincodesResponse.ErrorCode"));

		List<OrganizationChaincode> result = new ArrayList<OrganizationChaincode>();
		for (int i = 0; i < context.lengthValue("DescribeOrgnaizationChaincodesResponse.Result.Length"); i++) {
			OrganizationChaincode organizationChaincode = new OrganizationChaincode();
			organizationChaincode.setName(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].Name"));
			organizationChaincode.setVersion(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].Version"));
			organizationChaincode.setCreator(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].Creator"));
			organizationChaincode.setChannelId(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].ChannelId"));
			organizationChaincode.setChannelName(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].ChannelName"));
			organizationChaincode.setCreateTime(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].CreateTime"));
			organizationChaincode.setDeployTime(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].DeployTime"));
			organizationChaincode.setChaincodeId(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].ChaincodeId"));
			organizationChaincode.setEndorsePolicy(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].EndorsePolicy"));
			organizationChaincode.setState(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].State"));
			organizationChaincode.setInstalled(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].Installed"));
			organizationChaincode.setMessage(context.stringValue("DescribeOrgnaizationChaincodesResponse.Result["+ i +"].Message"));

			result.add(organizationChaincode);
		}
		describeOrgnaizationChaincodesResponse.setResult(result);
	 
	 	return describeOrgnaizationChaincodesResponse;
	}
}