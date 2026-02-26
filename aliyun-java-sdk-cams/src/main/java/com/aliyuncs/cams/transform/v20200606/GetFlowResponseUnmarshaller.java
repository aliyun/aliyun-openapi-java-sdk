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

import com.aliyuncs.cams.model.v20200606.GetFlowResponse;
import com.aliyuncs.cams.model.v20200606.GetFlowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowResponseUnmarshaller {

	public static GetFlowResponse unmarshall(GetFlowResponse getFlowResponse, UnmarshallerContext _ctx) {
		
		getFlowResponse.setRequestId(_ctx.stringValue("GetFlowResponse.RequestId"));
		getFlowResponse.setCode(_ctx.stringValue("GetFlowResponse.Code"));
		getFlowResponse.setMessage(_ctx.stringValue("GetFlowResponse.Message"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetFlowResponse.Data.Status"));
		data.setFlowId(_ctx.stringValue("GetFlowResponse.Data.FlowId"));
		data.setFlowName(_ctx.stringValue("GetFlowResponse.Data.FlowName"));
		data.setJSONVersion(_ctx.stringValue("GetFlowResponse.Data.JSONVersion"));
		data.setDataApiVersion(_ctx.stringValue("GetFlowResponse.Data.DataApiVersion"));
		data.setPreviewUrl(_ctx.stringValue("GetFlowResponse.Data.PreviewUrl"));
		data.setPreviewUrlExpires(_ctx.longValue("GetFlowResponse.Data.PreviewUrlExpires"));

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFlowResponse.Data.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("GetFlowResponse.Data.Categories["+ i +"]"));
		}
		data.setCategories(categories);
		getFlowResponse.setData(data);
	 
	 	return getFlowResponse;
	}
}