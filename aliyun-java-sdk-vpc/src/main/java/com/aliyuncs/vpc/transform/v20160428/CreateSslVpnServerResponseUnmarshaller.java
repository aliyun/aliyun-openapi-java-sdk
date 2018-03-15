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

import com.aliyuncs.vpc.model.v20160428.CreateSslVpnServerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSslVpnServerResponseUnmarshaller {

	public static CreateSslVpnServerResponse unmarshall(CreateSslVpnServerResponse createSslVpnServerResponse, UnmarshallerContext context) {
		
		createSslVpnServerResponse.setRequestId(context.stringValue("CreateSslVpnServerResponse.RequestId"));
		createSslVpnServerResponse.setSslVpnServerId(context.stringValue("CreateSslVpnServerResponse.SslVpnServerId"));
		createSslVpnServerResponse.setName(context.stringValue("CreateSslVpnServerResponse.Name"));
	 
	 	return createSslVpnServerResponse;
	}
}