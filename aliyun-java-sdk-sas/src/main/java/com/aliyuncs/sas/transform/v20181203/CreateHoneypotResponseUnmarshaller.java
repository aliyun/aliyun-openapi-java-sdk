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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.CreateHoneypotResponse;
import com.aliyuncs.sas.model.v20181203.CreateHoneypotResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHoneypotResponseUnmarshaller {

	public static CreateHoneypotResponse unmarshall(CreateHoneypotResponse createHoneypotResponse, UnmarshallerContext _ctx) {
		
		createHoneypotResponse.setRequestId(_ctx.stringValue("CreateHoneypotResponse.RequestId"));
		createHoneypotResponse.setSuccess(_ctx.booleanValue("CreateHoneypotResponse.Success"));
		createHoneypotResponse.setCode(_ctx.stringValue("CreateHoneypotResponse.Code"));
		createHoneypotResponse.setMessage(_ctx.stringValue("CreateHoneypotResponse.Message"));
		createHoneypotResponse.setHttpStatusCode(_ctx.integerValue("CreateHoneypotResponse.HttpStatusCode"));

		Data data = new Data();
		data.setHoneypotId(_ctx.stringValue("CreateHoneypotResponse.Data.HoneypotId"));
		data.setHoneypotName(_ctx.stringValue("CreateHoneypotResponse.Data.HoneypotName"));
		data.setControlNodeName(_ctx.stringValue("CreateHoneypotResponse.Data.ControlNodeName"));
		data.setHoneypotImageName(_ctx.stringValue("CreateHoneypotResponse.Data.HoneypotImageName"));
		data.setPresetId(_ctx.stringValue("CreateHoneypotResponse.Data.PresetId"));
		data.setHoneypotImageDisplayName(_ctx.stringValue("CreateHoneypotResponse.Data.HoneypotImageDisplayName"));
		data.setNodeId(_ctx.stringValue("CreateHoneypotResponse.Data.NodeId"));

		List<String> state = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateHoneypotResponse.Data.State.Length"); i++) {
			state.add(_ctx.stringValue("CreateHoneypotResponse.Data.State["+ i +"]"));
		}
		data.setState(state);
		createHoneypotResponse.setData(data);
	 
	 	return createHoneypotResponse;
	}
}