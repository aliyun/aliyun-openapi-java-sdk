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

import com.aliyuncs.retailadvqa_public.model.v20200515.OemListMenuResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.OemListMenuResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class OemListMenuResponseUnmarshaller {

	public static OemListMenuResponse unmarshall(OemListMenuResponse oemListMenuResponse, UnmarshallerContext _ctx) {
		
		oemListMenuResponse.setRequestId(_ctx.stringValue("OemListMenuResponse.RequestId"));
		oemListMenuResponse.setErrorDesc(_ctx.stringValue("OemListMenuResponse.ErrorDesc"));
		oemListMenuResponse.setTraceId(_ctx.stringValue("OemListMenuResponse.TraceId"));
		oemListMenuResponse.setErrorCode(_ctx.stringValue("OemListMenuResponse.ErrorCode"));
		oemListMenuResponse.setSuccess(_ctx.booleanValue("OemListMenuResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("OemListMenuResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("OemListMenuResponse.Data["+ i +"].Key"));
			dataItem.setUrl(_ctx.stringValue("OemListMenuResponse.Data["+ i +"].Url"));
			dataItem.setName(_ctx.stringValue("OemListMenuResponse.Data["+ i +"].Name"));
			dataItem.setOrder(_ctx.stringValue("OemListMenuResponse.Data["+ i +"].Order"));
			dataItem.setParentKey(_ctx.stringValue("OemListMenuResponse.Data["+ i +"].ParentKey"));
			dataItem.setSourceType(_ctx.stringValue("OemListMenuResponse.Data["+ i +"].SourceType"));
			dataItem.setPermission(_ctx.booleanValue("OemListMenuResponse.Data["+ i +"].Permission"));
			dataItem.setPurchasePackage(_ctx.booleanValue("OemListMenuResponse.Data["+ i +"].PurchasePackage"));

			List<Map<Object, Object>> children = _ctx.listMapValue("OemListMenuResponse.Data["+ i +"].Children");
			dataItem.setChildren(children);

			data.add(dataItem);
		}
		oemListMenuResponse.setData(data);
	 
	 	return oemListMenuResponse;
	}
}