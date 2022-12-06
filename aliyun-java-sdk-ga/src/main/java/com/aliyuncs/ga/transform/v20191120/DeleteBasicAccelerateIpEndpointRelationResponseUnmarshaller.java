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

package com.aliyuncs.ga.transform.v20191120;

import com.aliyuncs.ga.model.v20191120.DeleteBasicAccelerateIpEndpointRelationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteBasicAccelerateIpEndpointRelationResponseUnmarshaller {

	public static DeleteBasicAccelerateIpEndpointRelationResponse unmarshall(DeleteBasicAccelerateIpEndpointRelationResponse deleteBasicAccelerateIpEndpointRelationResponse, UnmarshallerContext _ctx) {
		
		deleteBasicAccelerateIpEndpointRelationResponse.setRequestId(_ctx.stringValue("DeleteBasicAccelerateIpEndpointRelationResponse.RequestId"));
		deleteBasicAccelerateIpEndpointRelationResponse.setAcceleratorId(_ctx.stringValue("DeleteBasicAccelerateIpEndpointRelationResponse.AcceleratorId"));
		deleteBasicAccelerateIpEndpointRelationResponse.setEndpointId(_ctx.stringValue("DeleteBasicAccelerateIpEndpointRelationResponse.EndpointId"));
		deleteBasicAccelerateIpEndpointRelationResponse.setAccelerateIpId(_ctx.stringValue("DeleteBasicAccelerateIpEndpointRelationResponse.AccelerateIpId"));
		deleteBasicAccelerateIpEndpointRelationResponse.setState(_ctx.stringValue("DeleteBasicAccelerateIpEndpointRelationResponse.State"));
	 
	 	return deleteBasicAccelerateIpEndpointRelationResponse;
	}
}