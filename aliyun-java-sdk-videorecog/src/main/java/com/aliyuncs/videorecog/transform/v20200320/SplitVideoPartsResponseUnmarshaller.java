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

package com.aliyuncs.videorecog.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.videorecog.model.v20200320.SplitVideoPartsResponse;
import com.aliyuncs.videorecog.model.v20200320.SplitVideoPartsResponse.Data;
import com.aliyuncs.videorecog.model.v20200320.SplitVideoPartsResponse.Data.ElementsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SplitVideoPartsResponseUnmarshaller {

	public static SplitVideoPartsResponse unmarshall(SplitVideoPartsResponse splitVideoPartsResponse, UnmarshallerContext _ctx) {
		
		splitVideoPartsResponse.setRequestId(_ctx.stringValue("SplitVideoPartsResponse.RequestId"));
		splitVideoPartsResponse.setCode(_ctx.stringValue("SplitVideoPartsResponse.Code"));
		splitVideoPartsResponse.setMessage(_ctx.stringValue("SplitVideoPartsResponse.Message"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("SplitVideoPartsResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setBeginTime(_ctx.floatValue("SplitVideoPartsResponse.Data.Elements["+ i +"].BeginTime"));
			elementsItem.setEndTime(_ctx.floatValue("SplitVideoPartsResponse.Data.Elements["+ i +"].EndTime"));
			elementsItem.setIndex(_ctx.longValue("SplitVideoPartsResponse.Data.Elements["+ i +"].Index"));

			elements.add(elementsItem);
		}
		data.setElements(elements);
		splitVideoPartsResponse.setData(data);
	 
	 	return splitVideoPartsResponse;
	}
}