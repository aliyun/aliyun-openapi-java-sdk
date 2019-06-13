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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateInstanceResponse.Result.NodeSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateInstanceResponseUnmarshaller {

	public static UpdateInstanceResponse unmarshall(UpdateInstanceResponse updateInstanceResponse, UnmarshallerContext context) {
		
		updateInstanceResponse.setRequestId(context.stringValue("UpdateInstanceResponse.RequestId"));

		Result result = new Result();
		result.setInstanceId(context.stringValue("UpdateInstanceResponse.Result.instanceId"));
		result.setDomain(context.stringValue("UpdateInstanceResponse.Result.domain"));
		result.setDescription(context.stringValue("UpdateInstanceResponse.Result.description"));
		result.setNodeAmount(context.integerValue("UpdateInstanceResponse.Result.nodeAmount"));
		result.setPaymentType(context.stringValue("UpdateInstanceResponse.Result.paymentType"));
		result.setStatus(context.stringValue("UpdateInstanceResponse.Result.status"));
		result.setEsVersion(context.stringValue("UpdateInstanceResponse.Result.esVersion"));
		result.setCreatedAt(context.stringValue("UpdateInstanceResponse.Result.createdAt"));
		result.setUpdatedAt(context.stringValue("UpdateInstanceResponse.Result.updatedAt"));

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(context.stringValue("UpdateInstanceResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(context.integerValue("UpdateInstanceResponse.Result.nodeSpec.disk"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(context.stringValue("UpdateInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(context.stringValue("UpdateInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVswitchId(context.stringValue("UpdateInstanceResponse.Result.networkConfig.vswitchId"));
		networkConfig.setVsArea(context.stringValue("UpdateInstanceResponse.Result.networkConfig.vsArea"));
		result.setNetworkConfig(networkConfig);
		updateInstanceResponse.setResult(result);
	 
	 	return updateInstanceResponse;
	}
}