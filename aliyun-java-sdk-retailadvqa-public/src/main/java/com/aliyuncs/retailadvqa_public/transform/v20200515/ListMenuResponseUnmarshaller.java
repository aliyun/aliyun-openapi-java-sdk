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

import com.aliyuncs.retailadvqa_public.model.v20200515.ListMenuResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.ListMenuResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMenuResponseUnmarshaller {

	public static ListMenuResponse unmarshall(ListMenuResponse listMenuResponse, UnmarshallerContext _ctx) {
		
		listMenuResponse.setRequestId(_ctx.stringValue("ListMenuResponse.RequestId"));
		listMenuResponse.setErrorCode(_ctx.stringValue("ListMenuResponse.ErrorCode"));
		listMenuResponse.setErrorDesc(_ctx.stringValue("ListMenuResponse.ErrorDesc"));
		listMenuResponse.setSuccess(_ctx.booleanValue("ListMenuResponse.Success"));
		listMenuResponse.setTraceId(_ctx.stringValue("ListMenuResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMenuResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("ListMenuResponse.Data["+ i +"].Name"));
			dataItem.setUrl(_ctx.stringValue("ListMenuResponse.Data["+ i +"].Url"));
			dataItem.setKey(_ctx.stringValue("ListMenuResponse.Data["+ i +"].Key"));

			data.add(dataItem);
		}
		listMenuResponse.setData(data);
	 
	 	return listMenuResponse;
	}
}