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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.CreateQosPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQosPolicyResponseUnmarshaller {

	public static CreateQosPolicyResponse unmarshall(CreateQosPolicyResponse createQosPolicyResponse, UnmarshallerContext _ctx) {
		
		createQosPolicyResponse.setRequestId(_ctx.stringValue("CreateQosPolicyResponse.RequestId"));
		createQosPolicyResponse.setDescription(_ctx.stringValue("CreateQosPolicyResponse.Description"));
		createQosPolicyResponse.setEndTime(_ctx.stringValue("CreateQosPolicyResponse.EndTime"));
		createQosPolicyResponse.setQosPolicyId(_ctx.stringValue("CreateQosPolicyResponse.QosPolicyId"));
		createQosPolicyResponse.setSourcePortRange(_ctx.stringValue("CreateQosPolicyResponse.SourcePortRange"));
		createQosPolicyResponse.setSourceCidr(_ctx.stringValue("CreateQosPolicyResponse.SourceCidr"));
		createQosPolicyResponse.setPriority(_ctx.integerValue("CreateQosPolicyResponse.Priority"));
		createQosPolicyResponse.setStartTime(_ctx.stringValue("CreateQosPolicyResponse.StartTime"));
		createQosPolicyResponse.setDestPortRange(_ctx.stringValue("CreateQosPolicyResponse.DestPortRange"));
		createQosPolicyResponse.setName(_ctx.stringValue("CreateQosPolicyResponse.Name"));
		createQosPolicyResponse.setDestCidr(_ctx.stringValue("CreateQosPolicyResponse.DestCidr"));
		createQosPolicyResponse.setQosId(_ctx.stringValue("CreateQosPolicyResponse.QosId"));
		createQosPolicyResponse.setIpProtocol(_ctx.stringValue("CreateQosPolicyResponse.IpProtocol"));

		List<String> dpiGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateQosPolicyResponse.DpiGroupIds.Length"); i++) {
			dpiGroupIds.add(_ctx.stringValue("CreateQosPolicyResponse.DpiGroupIds["+ i +"]"));
		}
		createQosPolicyResponse.setDpiGroupIds(dpiGroupIds);

		List<String> dpiSignatureIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateQosPolicyResponse.DpiSignatureIds.Length"); i++) {
			dpiSignatureIds.add(_ctx.stringValue("CreateQosPolicyResponse.DpiSignatureIds["+ i +"]"));
		}
		createQosPolicyResponse.setDpiSignatureIds(dpiSignatureIds);
	 
	 	return createQosPolicyResponse;
	}
}