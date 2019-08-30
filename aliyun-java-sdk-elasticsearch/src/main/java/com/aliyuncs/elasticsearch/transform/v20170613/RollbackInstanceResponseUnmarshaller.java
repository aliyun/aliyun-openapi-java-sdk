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

import com.aliyuncs.elasticsearch.model.v20170613.RollbackInstanceResponse;
import com.aliyuncs.elasticsearch.model.v20170613.RollbackInstanceResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.RollbackInstanceResponse.Result.NetworkConfig;
import com.aliyuncs.elasticsearch.model.v20170613.RollbackInstanceResponse.Result.NodeSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackInstanceResponseUnmarshaller {

	public static RollbackInstanceResponse unmarshall(RollbackInstanceResponse rollbackInstanceResponse, UnmarshallerContext _ctx) {
		
		rollbackInstanceResponse.setRequestId(_ctx.stringValue("RollbackInstanceResponse.RequestId"));

		Result result = new Result();
		result.setInstanceId(_ctx.stringValue("RollbackInstanceResponse.Result.instanceId"));
		result.setDomain(_ctx.stringValue("RollbackInstanceResponse.Result.domain"));
		result.setDescription(_ctx.stringValue("RollbackInstanceResponse.Result.description"));
		result.setNodeAmount(_ctx.integerValue("RollbackInstanceResponse.Result.nodeAmount"));
		result.setPaymentType(_ctx.stringValue("RollbackInstanceResponse.Result.paymentType"));
		result.setStatus(_ctx.stringValue("RollbackInstanceResponse.Result.status"));
		result.setEsVersion(_ctx.stringValue("RollbackInstanceResponse.Result.esVersion"));
		result.setCreatedAt(_ctx.stringValue("RollbackInstanceResponse.Result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("RollbackInstanceResponse.Result.updatedAt"));

		NodeSpec nodeSpec = new NodeSpec();
		nodeSpec.setSpec(_ctx.stringValue("RollbackInstanceResponse.Result.nodeSpec.spec"));
		nodeSpec.setDisk(_ctx.integerValue("RollbackInstanceResponse.Result.nodeSpec.disk"));
		result.setNodeSpec(nodeSpec);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setType(_ctx.stringValue("RollbackInstanceResponse.Result.networkConfig.type"));
		networkConfig.setVpcId(_ctx.stringValue("RollbackInstanceResponse.Result.networkConfig.vpcId"));
		networkConfig.setVswitchId(_ctx.stringValue("RollbackInstanceResponse.Result.networkConfig.vswitchId"));
		networkConfig.setVsArea(_ctx.stringValue("RollbackInstanceResponse.Result.networkConfig.vsArea"));
		result.setNetworkConfig(networkConfig);
		rollbackInstanceResponse.setResult(result);
	 
	 	return rollbackInstanceResponse;
	}
}