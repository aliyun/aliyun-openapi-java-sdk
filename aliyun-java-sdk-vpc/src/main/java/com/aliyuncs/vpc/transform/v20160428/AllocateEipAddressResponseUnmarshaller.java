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

package com.aliyuncs.vpc.transform.v20160428;

import com.aliyuncs.vpc.model.v20160428.AllocateEipAddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllocateEipAddressResponseUnmarshaller {

	public static AllocateEipAddressResponse unmarshall(AllocateEipAddressResponse allocateEipAddressResponse, UnmarshallerContext _ctx) {
		
		allocateEipAddressResponse.setRequestId(_ctx.stringValue("AllocateEipAddressResponse.RequestId"));
		allocateEipAddressResponse.setOrderId(_ctx.longValue("AllocateEipAddressResponse.OrderId"));
		allocateEipAddressResponse.setResourceGroupId(_ctx.stringValue("AllocateEipAddressResponse.ResourceGroupId"));
		allocateEipAddressResponse.setEipAddress(_ctx.stringValue("AllocateEipAddressResponse.EipAddress"));
		allocateEipAddressResponse.setAllocationId(_ctx.stringValue("AllocateEipAddressResponse.AllocationId"));
	 
	 	return allocateEipAddressResponse;
	}
}