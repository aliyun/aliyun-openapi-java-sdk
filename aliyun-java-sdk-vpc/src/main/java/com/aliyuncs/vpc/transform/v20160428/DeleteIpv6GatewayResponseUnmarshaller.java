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

import com.aliyuncs.vpc.model.v20160428.DeleteIpv6GatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteIpv6GatewayResponseUnmarshaller {

	public static DeleteIpv6GatewayResponse unmarshall(DeleteIpv6GatewayResponse deleteIpv6GatewayResponse, UnmarshallerContext _ctx) {
		
		deleteIpv6GatewayResponse.setRequestId(_ctx.stringValue("DeleteIpv6GatewayResponse.RequestId"));
	 
	 	return deleteIpv6GatewayResponse;
	}
}