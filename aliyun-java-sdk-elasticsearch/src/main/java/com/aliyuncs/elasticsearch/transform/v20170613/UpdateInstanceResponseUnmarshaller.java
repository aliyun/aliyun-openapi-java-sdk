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

	public static UpdateInstanceResponse unmarshall(UpdateInstanceResponse updateInstanceResponse, UnmarshallerContext _ctx) {
		
		updateInstanceResponse.setRequestId(_ctx.stringValue("UpdateInstanceResponse.RequestId"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("UpdateInstanceResponse.Result.instanceId"));
		result.setDomain(_ctx.stringValue("UpdateInstanceResponse.Result.domain"));
		result.setDescription(_ctx.stringValue("UpdateInstanceResponse.Result.description"));
		result.setNodeAmount(_ctx.integerValue("UpdateInstanceResponse.Result.nodeAmount"));
		result.setPaymentType(_ctx.stringValue("UpdateInstanceResponse.Result.paymentType"));
		result.setStatus(_ctx.stringValue("UpdateInstanceResponse.Result.status"));
		result.setEsVersion(_ctx.stringValue("UpdateInstanceResponse.Result.esVersion"));
		result.setCreatedAt(_ctx.stringValue("UpdateInstanceResponse.Result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("UpdateInstanceResponse.Result.updatedAt"));

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(_ctx.stringValue("UpdateInstanceResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(_ctx.integerValue("UpdateInstanceResponse.Result.nodeSpec.disk"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVswitchId(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.vswitchId"));
		networkConfig.setVsArea(_ctx.stringValue("UpdateInstanceResponse.Result.networkConfig.vsArea"));
		result.setNetworkConfig(networkConfig);
		updateInstanceResponse.setResult(result);
	 
	 	return updateInstanceResponse;
	}
}