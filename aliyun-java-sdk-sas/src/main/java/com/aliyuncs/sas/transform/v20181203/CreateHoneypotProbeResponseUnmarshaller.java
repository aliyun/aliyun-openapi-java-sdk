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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.CreateHoneypotProbeResponse;
import com.aliyuncs.sas.model.v20181203.CreateHoneypotProbeResponse.HoneypotProbe;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHoneypotProbeResponseUnmarshaller {

	public static CreateHoneypotProbeResponse unmarshall(CreateHoneypotProbeResponse createHoneypotProbeResponse, UnmarshallerContext _ctx) {
		
		createHoneypotProbeResponse.setRequestId(_ctx.stringValue("CreateHoneypotProbeResponse.RequestId"));
		createHoneypotProbeResponse.setSuccess(_ctx.booleanValue("CreateHoneypotProbeResponse.Success"));
		createHoneypotProbeResponse.setCode(_ctx.stringValue("CreateHoneypotProbeResponse.Code"));
		createHoneypotProbeResponse.setMessage(_ctx.stringValue("CreateHoneypotProbeResponse.Message"));
		createHoneypotProbeResponse.setHttpStatusCode(_ctx.integerValue("CreateHoneypotProbeResponse.HttpStatusCode"));

		HoneypotProbe honeypotProbe = new HoneypotProbe();
		honeypotProbe.setProbeId(_ctx.stringValue("CreateHoneypotProbeResponse.HoneypotProbe.ProbeId"));
		createHoneypotProbeResponse.setHoneypotProbe(honeypotProbe);
	 
	 	return createHoneypotProbeResponse;
	}
}