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

import com.aliyuncs.cams.model.v20200606.ListFlowResponse;
import com.aliyuncs.cams.model.v20200606.ListFlowResponse.返回结果;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowResponseUnmarshaller {

	public static ListFlowResponse unmarshall(ListFlowResponse listFlowResponse, UnmarshallerContext _ctx) {
		
		listFlowResponse.setRequestId(_ctx.stringValue("ListFlowResponse.RequestId"));
		listFlowResponse.setCode(_ctx.stringValue("ListFlowResponse.Code"));
		listFlowResponse.setMessage(_ctx.stringValue("ListFlowResponse.Message"));

		List<返回结果> data = new ArrayList<返回结果>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowResponse.Data.Length"); i++) {
			返回结果 返回结果 = new 返回结果();
			返回结果.setFlowId(_ctx.stringValue("ListFlowResponse.Data["+ i +"].FlowId"));
			返回结果.setFlowName(_ctx.stringValue("ListFlowResponse.Data["+ i +"].FlowName"));

			List<String> categories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFlowResponse.Data["+ i +"].Categories.Length"); j++) {
				categories.add(_ctx.stringValue("ListFlowResponse.Data["+ i +"].Categories["+ j +"]"));
			}
			返回结果.setCategories(categories);

			data.add(返回结果);
		}
		listFlowResponse.setData(data);
	 
	 	return listFlowResponse;
	}
}