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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.CreateNatGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNatGatewayResponseUnmarshaller {

	public static CreateNatGatewayResponse unmarshall(CreateNatGatewayResponse createNatGatewayResponse, UnmarshallerContext _ctx) {
		
		createNatGatewayResponse.setRequestId(_ctx.stringValue("CreateNatGatewayResponse.RequestId"));
		createNatGatewayResponse.setNatGatewayId(_ctx.stringValue("CreateNatGatewayResponse.NatGatewayId"));

		List<String> forwardTableIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateNatGatewayResponse.ForwardTableIds.Length"); i++) {
			forwardTableIds.add(_ctx.stringValue("CreateNatGatewayResponse.ForwardTableIds["+ i +"]"));
		}
		createNatGatewayResponse.setForwardTableIds(forwardTableIds);

		List<String> bandwidthPackageIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateNatGatewayResponse.BandwidthPackageIds.Length"); i++) {
			bandwidthPackageIds.add(_ctx.stringValue("CreateNatGatewayResponse.BandwidthPackageIds["+ i +"]"));
		}
		createNatGatewayResponse.setBandwidthPackageIds(bandwidthPackageIds);
	 
	 	return createNatGatewayResponse;
	}
}