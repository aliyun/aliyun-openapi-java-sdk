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

package com.aliyuncs.iotsoc.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotsoc.model.v20190815.GetTopComponentsResponse;
import com.aliyuncs.iotsoc.model.v20190815.GetTopComponentsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTopComponentsResponseUnmarshaller {

	public static GetTopComponentsResponse unmarshall(GetTopComponentsResponse getTopComponentsResponse, UnmarshallerContext _ctx) {
		
		getTopComponentsResponse.setRequestId(_ctx.stringValue("GetTopComponentsResponse.RequestId"));
		getTopComponentsResponse.setSuccess(_ctx.booleanValue("GetTopComponentsResponse.Success"));
		getTopComponentsResponse.setCode(_ctx.stringValue("GetTopComponentsResponse.Code"));
		getTopComponentsResponse.setMessage(_ctx.stringValue("GetTopComponentsResponse.Message"));

		Data data = new Data();

		List<String> components = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTopComponentsResponse.Data.Components.Length"); i++) {
			components.add(_ctx.stringValue("GetTopComponentsResponse.Data.Components["+ i +"]"));
		}
		data.setComponents(components);

		List<String> affectedDevices = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTopComponentsResponse.Data.AffectedDevices.Length"); i++) {
			affectedDevices.add(_ctx.stringValue("GetTopComponentsResponse.Data.AffectedDevices["+ i +"]"));
		}
		data.setAffectedDevices(affectedDevices);
		getTopComponentsResponse.setData(data);
	 
	 	return getTopComponentsResponse;
	}
}