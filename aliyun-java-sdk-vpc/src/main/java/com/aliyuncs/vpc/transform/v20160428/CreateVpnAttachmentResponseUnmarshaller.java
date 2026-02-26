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

import com.aliyuncs.vpc.model.v20160428.CreateVpnAttachmentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVpnAttachmentResponseUnmarshaller {

	public static CreateVpnAttachmentResponse unmarshall(CreateVpnAttachmentResponse createVpnAttachmentResponse, UnmarshallerContext _ctx) {
		
		createVpnAttachmentResponse.setRequestId(_ctx.stringValue("CreateVpnAttachmentResponse.RequestId"));
		createVpnAttachmentResponse.setVpnConnectionId(_ctx.stringValue("CreateVpnAttachmentResponse.VpnConnectionId"));
		createVpnAttachmentResponse.setName(_ctx.stringValue("CreateVpnAttachmentResponse.Name"));
		createVpnAttachmentResponse.setCreateTime(_ctx.longValue("CreateVpnAttachmentResponse.CreateTime"));
		createVpnAttachmentResponse.setCode(_ctx.stringValue("CreateVpnAttachmentResponse.Code"));
		createVpnAttachmentResponse.setMessage(_ctx.stringValue("CreateVpnAttachmentResponse.Message"));
		createVpnAttachmentResponse.setSuccess(_ctx.booleanValue("CreateVpnAttachmentResponse.Success"));
	 
	 	return createVpnAttachmentResponse;
	}
}