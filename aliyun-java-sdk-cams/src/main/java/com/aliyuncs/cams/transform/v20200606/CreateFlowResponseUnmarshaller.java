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

import com.aliyuncs.cams.model.v20200606.CreateFlowResponse;
import com.aliyuncs.cams.model.v20200606.CreateFlowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFlowResponseUnmarshaller {

	public static CreateFlowResponse unmarshall(CreateFlowResponse createFlowResponse, UnmarshallerContext _ctx) {
		
		createFlowResponse.setRequestId(_ctx.stringValue("CreateFlowResponse.RequestId"));
		createFlowResponse.setCode(_ctx.stringValue("CreateFlowResponse.Code"));
		createFlowResponse.setMessage(_ctx.stringValue("CreateFlowResponse.Message"));

		Data data = new Data();
		data.setFlowId(_ctx.stringValue("CreateFlowResponse.Data.FlowId"));
		data.setFlowName(_ctx.stringValue("CreateFlowResponse.Data.FlowName"));

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateFlowResponse.Data.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("CreateFlowResponse.Data.Categories["+ i +"]"));
		}
		data.setCategories(categories);
		createFlowResponse.setData(data);
	 
	 	return createFlowResponse;
	}
}