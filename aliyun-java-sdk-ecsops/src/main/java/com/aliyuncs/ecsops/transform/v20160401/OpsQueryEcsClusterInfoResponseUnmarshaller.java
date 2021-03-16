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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryEcsClusterInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryEcsClusterInfoResponseUnmarshaller {

	public static OpsQueryEcsClusterInfoResponse unmarshall(OpsQueryEcsClusterInfoResponse opsQueryEcsClusterInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryEcsClusterInfoResponse.setRequestId(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.RequestId"));
		opsQueryEcsClusterInfoResponse.setNetworkArch(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.NetworkArch"));
		opsQueryEcsClusterInfoResponse.setZoneId(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.ZoneId"));
		opsQueryEcsClusterInfoResponse.setInstanceFamily(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.InstanceFamily"));
		opsQueryEcsClusterInfoResponse.setClusterName(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.ClusterName"));
		opsQueryEcsClusterInfoResponse.setClusterConfig(_ctx.integerValue("OpsQueryEcsClusterInfoResponse.ClusterConfig"));
		opsQueryEcsClusterInfoResponse.setNcCount(_ctx.integerValue("OpsQueryEcsClusterInfoResponse.NcCount"));
		opsQueryEcsClusterInfoResponse.setAgIp(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.AgIp"));
		opsQueryEcsClusterInfoResponse.setSupportStorageType(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.SupportStorageType"));
		opsQueryEcsClusterInfoResponse.setDeployType(_ctx.stringValue("OpsQueryEcsClusterInfoResponse.DeployType"));
	 
	 	return opsQueryEcsClusterInfoResponse;
	}
}