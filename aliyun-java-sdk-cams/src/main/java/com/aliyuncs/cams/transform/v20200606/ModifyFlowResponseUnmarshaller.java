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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.ModifyFlowResponse;
import com.aliyuncs.cams.model.v20200606.ModifyFlowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyFlowResponseUnmarshaller {

	public static ModifyFlowResponse unmarshall(ModifyFlowResponse modifyFlowResponse, UnmarshallerContext _ctx) {
		
		modifyFlowResponse.setRequestId(_ctx.stringValue("ModifyFlowResponse.RequestId"));
		modifyFlowResponse.setCode(_ctx.stringValue("ModifyFlowResponse.Code"));
		modifyFlowResponse.setMessage(_ctx.stringValue("ModifyFlowResponse.Message"));

		Data data = new Data();
		data.setFlowId(_ctx.stringValue("ModifyFlowResponse.Data.FlowId"));
		data.setFlowName(_ctx.stringValue("ModifyFlowResponse.Data.FlowName"));

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyFlowResponse.Data.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("ModifyFlowResponse.Data.Categories["+ i +"]"));
		}
		data.setCategories(categories);
		modifyFlowResponse.setData(data);
	 
	 	return modifyFlowResponse;
	}
}