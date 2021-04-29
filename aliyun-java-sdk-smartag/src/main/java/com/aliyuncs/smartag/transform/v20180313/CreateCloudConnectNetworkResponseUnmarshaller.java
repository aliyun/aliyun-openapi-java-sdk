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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.CreateCloudConnectNetworkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCloudConnectNetworkResponseUnmarshaller {

	public static CreateCloudConnectNetworkResponse unmarshall(CreateCloudConnectNetworkResponse createCloudConnectNetworkResponse, UnmarshallerContext _ctx) {
		
		createCloudConnectNetworkResponse.setRequestId(_ctx.stringValue("CreateCloudConnectNetworkResponse.RequestId"));
		createCloudConnectNetworkResponse.setStatus(_ctx.stringValue("CreateCloudConnectNetworkResponse.Status"));
		createCloudConnectNetworkResponse.setDescription(_ctx.stringValue("CreateCloudConnectNetworkResponse.Description"));
		createCloudConnectNetworkResponse.setCcnId(_ctx.stringValue("CreateCloudConnectNetworkResponse.CcnId"));
		createCloudConnectNetworkResponse.setCidrBlock(_ctx.stringValue("CreateCloudConnectNetworkResponse.CidrBlock"));
		createCloudConnectNetworkResponse.setSnatCidrBlock(_ctx.stringValue("CreateCloudConnectNetworkResponse.SnatCidrBlock"));
		createCloudConnectNetworkResponse.setName(_ctx.stringValue("CreateCloudConnectNetworkResponse.Name"));
	 
	 	return createCloudConnectNetworkResponse;
	}
}