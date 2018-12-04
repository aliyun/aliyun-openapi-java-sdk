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

import com.aliyuncs.baas.model.v20180731.DescribeOrganizationChaincodesResponse;
import com.aliyuncs.baas.model.v20180731.DescribeOrganizationChaincodesResponse.OrganizationChaincode;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrganizationChaincodesResponseUnmarshaller {

	public static DescribeOrganizationChaincodesResponse unmarshall(DescribeOrganizationChaincodesResponse describeOrganizationChaincodesResponse, UnmarshallerContext context) {
		
		describeOrganizationChaincodesResponse.setRequestId(context.stringValue("DescribeOrganizationChaincodesResponse.RequestId"));
		describeOrganizationChaincodesResponse.setSuccess(context.booleanValue("DescribeOrganizationChaincodesResponse.Success"));
		describeOrganizationChaincodesResponse.setErrorCode(context.integerValue("DescribeOrganizationChaincodesResponse.ErrorCode"));

		List<OrganizationChaincode> result = new ArrayList<OrganizationChaincode>();
		for (int i = 0; i < context.lengthValue("DescribeOrganizationChaincodesResponse.Result.Length"); i++) {
			OrganizationChaincode organizationChaincode = new OrganizationChaincode();
			organizationChaincode.setName(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].Name"));
			organizationChaincode.setVersion(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].Version"));
			organizationChaincode.setCreator(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].Creator"));
			organizationChaincode.setChannelId(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].ChannelId"));
			organizationChaincode.setChannelName(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].ChannelName"));
			organizationChaincode.setCreateTime(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].CreateTime"));
			organizationChaincode.setDeployTime(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].DeployTime"));
			organizationChaincode.setChaincodeId(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].ChaincodeId"));
			organizationChaincode.setEndorsePolicy(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].EndorsePolicy"));
			organizationChaincode.setState(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].State"));
			organizationChaincode.setInstalled(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].Installed"));
			organizationChaincode.setMessage(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].Message"));
			organizationChaincode.setConsortiumId(context.stringValue("DescribeOrganizationChaincodesResponse.Result["+ i +"].ConsortiumId"));

			result.add(organizationChaincode);
		}
		describeOrganizationChaincodesResponse.setResult(result);
	 
	 	return describeOrganizationChaincodesResponse;
	}
}