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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.EnableInstanceIpv6AddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableInstanceIpv6AddressResponseUnmarshaller {

	public static EnableInstanceIpv6AddressResponse unmarshall(EnableInstanceIpv6AddressResponse enableInstanceIpv6AddressResponse, UnmarshallerContext _ctx) {
		
		enableInstanceIpv6AddressResponse.setRequestId(_ctx.stringValue("EnableInstanceIpv6AddressResponse.RequestId"));
		enableInstanceIpv6AddressResponse.setData(_ctx.booleanValue("EnableInstanceIpv6AddressResponse.Data"));
	 
	 	return enableInstanceIpv6AddressResponse;
	}
}