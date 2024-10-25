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

import com.aliyuncs.vpc.model.v20160428.AllocateIpv6AddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllocateIpv6AddressResponseUnmarshaller {

	public static AllocateIpv6AddressResponse unmarshall(AllocateIpv6AddressResponse allocateIpv6AddressResponse, UnmarshallerContext _ctx) {
		
		allocateIpv6AddressResponse.setRequestId(_ctx.stringValue("AllocateIpv6AddressResponse.RequestId"));
		allocateIpv6AddressResponse.setIpv6AddressId(_ctx.stringValue("AllocateIpv6AddressResponse.Ipv6AddressId"));
		allocateIpv6AddressResponse.setIpv6Address(_ctx.stringValue("AllocateIpv6AddressResponse.Ipv6Address"));
		allocateIpv6AddressResponse.setResourceGroupId(_ctx.stringValue("AllocateIpv6AddressResponse.ResourceGroupId"));
	 
	 	return allocateIpv6AddressResponse;
	}
}