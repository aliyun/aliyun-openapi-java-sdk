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

import com.aliyuncs.vpc.model.v20160428.CreateDhcpOptionsSetResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDhcpOptionsSetResponseUnmarshaller {

	public static CreateDhcpOptionsSetResponse unmarshall(CreateDhcpOptionsSetResponse createDhcpOptionsSetResponse, UnmarshallerContext _ctx) {
		
		createDhcpOptionsSetResponse.setRequestId(_ctx.stringValue("CreateDhcpOptionsSetResponse.RequestId"));
		createDhcpOptionsSetResponse.setDhcpOptionsSetId(_ctx.stringValue("CreateDhcpOptionsSetResponse.DhcpOptionsSetId"));
		createDhcpOptionsSetResponse.setResourceGroupId(_ctx.stringValue("CreateDhcpOptionsSetResponse.ResourceGroupId"));
	 
	 	return createDhcpOptionsSetResponse;
	}
}