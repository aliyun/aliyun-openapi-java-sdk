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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.CreateQosPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQosPolicyResponseUnmarshaller {

	public static CreateQosPolicyResponse unmarshall(CreateQosPolicyResponse createQosPolicyResponse, UnmarshallerContext _ctx) {
		
		createQosPolicyResponse.setRequestId(_ctx.stringValue("CreateQosPolicyResponse.RequestId"));
		createQosPolicyResponse.setQosId(_ctx.stringValue("CreateQosPolicyResponse.QosId"));
		createQosPolicyResponse.setQosPolicyId(_ctx.stringValue("CreateQosPolicyResponse.QosPolicyId"));
		createQosPolicyResponse.setDescription(_ctx.stringValue("CreateQosPolicyResponse.Description"));
		createQosPolicyResponse.setPriority(_ctx.integerValue("CreateQosPolicyResponse.Priority"));
		createQosPolicyResponse.setSourceCidr(_ctx.stringValue("CreateQosPolicyResponse.SourceCidr"));
		createQosPolicyResponse.setDestCidr(_ctx.stringValue("CreateQosPolicyResponse.DestCidr"));
		createQosPolicyResponse.setIpProtocol(_ctx.stringValue("CreateQosPolicyResponse.IpProtocol"));
		createQosPolicyResponse.setSourcePortRange(_ctx.stringValue("CreateQosPolicyResponse.SourcePortRange"));
		createQosPolicyResponse.setDestPortRange(_ctx.stringValue("CreateQosPolicyResponse.DestPortRange"));
		createQosPolicyResponse.setStartTime(_ctx.stringValue("CreateQosPolicyResponse.StartTime"));
		createQosPolicyResponse.setEndTime(_ctx.stringValue("CreateQosPolicyResponse.EndTime"));
		createQosPolicyResponse.setName(_ctx.stringValue("CreateQosPolicyResponse.Name"));
	 
	 	return createQosPolicyResponse;
	}
}