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

package com.aliyuncs.privatelink.transform.v20200415;

import com.aliyuncs.privatelink.model.v20200415.EnableVpcEndpointConnectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableVpcEndpointConnectionResponseUnmarshaller {

	public static EnableVpcEndpointConnectionResponse unmarshall(EnableVpcEndpointConnectionResponse enableVpcEndpointConnectionResponse, UnmarshallerContext _ctx) {
		
		enableVpcEndpointConnectionResponse.setRequestId(_ctx.stringValue("EnableVpcEndpointConnectionResponse.RequestId"));
	 
	 	return enableVpcEndpointConnectionResponse;
	}
}