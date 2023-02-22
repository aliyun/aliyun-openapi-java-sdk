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

import com.aliyuncs.sas.model.v20181203.UpdateHoneypotResponse;
import com.aliyuncs.sas.model.v20181203.UpdateHoneypotResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateHoneypotResponseUnmarshaller {

	public static UpdateHoneypotResponse unmarshall(UpdateHoneypotResponse updateHoneypotResponse, UnmarshallerContext _ctx) {
		
		updateHoneypotResponse.setRequestId(_ctx.stringValue("UpdateHoneypotResponse.RequestId"));
		updateHoneypotResponse.setSuccess(_ctx.booleanValue("UpdateHoneypotResponse.Success"));
		updateHoneypotResponse.setCode(_ctx.stringValue("UpdateHoneypotResponse.Code"));
		updateHoneypotResponse.setMessage(_ctx.stringValue("UpdateHoneypotResponse.Message"));
		updateHoneypotResponse.setHttpStatusCode(_ctx.integerValue("UpdateHoneypotResponse.HttpStatusCode"));

		Data data = new Data();
		data.setHoneypotId(_ctx.stringValue("UpdateHoneypotResponse.Data.HoneypotId"));
		data.setHoneypotName(_ctx.stringValue("UpdateHoneypotResponse.Data.HoneypotName"));
		data.setHoneypotImageName(_ctx.stringValue("UpdateHoneypotResponse.Data.HoneypotImageName"));
		data.setPresetId(_ctx.stringValue("UpdateHoneypotResponse.Data.PresetId"));
		data.setHoneypotImageDisplayName(_ctx.stringValue("UpdateHoneypotResponse.Data.HoneypotImageDisplayName"));
		data.setNodeId(_ctx.stringValue("UpdateHoneypotResponse.Data.NodeId"));

		List<String> state = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateHoneypotResponse.Data.State.Length"); i++) {
			state.add(_ctx.stringValue("UpdateHoneypotResponse.Data.State["+ i +"]"));
		}
		data.setState(state);
		updateHoneypotResponse.setData(data);
	 
	 	return updateHoneypotResponse;
	}
}