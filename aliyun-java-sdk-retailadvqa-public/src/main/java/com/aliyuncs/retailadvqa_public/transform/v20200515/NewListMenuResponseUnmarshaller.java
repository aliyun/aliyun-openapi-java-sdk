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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailadvqa_public.model.v20200515.NewListMenuResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.NewListMenuResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class NewListMenuResponseUnmarshaller {

	public static NewListMenuResponse unmarshall(NewListMenuResponse newListMenuResponse, UnmarshallerContext _ctx) {
		
		newListMenuResponse.setRequestId(_ctx.stringValue("NewListMenuResponse.RequestId"));
		newListMenuResponse.setErrorDesc(_ctx.stringValue("NewListMenuResponse.ErrorDesc"));
		newListMenuResponse.setTraceId(_ctx.stringValue("NewListMenuResponse.TraceId"));
		newListMenuResponse.setErrorCode(_ctx.stringValue("NewListMenuResponse.ErrorCode"));
		newListMenuResponse.setSuccess(_ctx.booleanValue("NewListMenuResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("NewListMenuResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("NewListMenuResponse.Data["+ i +"].Key"));
			dataItem.setUrl(_ctx.stringValue("NewListMenuResponse.Data["+ i +"].Url"));
			dataItem.setName(_ctx.stringValue("NewListMenuResponse.Data["+ i +"].Name"));
			dataItem.setOrder(_ctx.stringValue("NewListMenuResponse.Data["+ i +"].Order"));
			dataItem.setParentKey(_ctx.stringValue("NewListMenuResponse.Data["+ i +"].ParentKey"));
			dataItem.setChildren(_ctx.mapValue("NewListMenuResponse.Data["+ i +"].Children"));

			data.add(dataItem);
		}
		newListMenuResponse.setData(data);
	 
	 	return newListMenuResponse;
	}
}