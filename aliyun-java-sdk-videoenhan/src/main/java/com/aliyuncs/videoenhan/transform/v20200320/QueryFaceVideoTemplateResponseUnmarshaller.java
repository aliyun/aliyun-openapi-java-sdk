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

package com.aliyuncs.videoenhan.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.videoenhan.model.v20200320.QueryFaceVideoTemplateResponse;
import com.aliyuncs.videoenhan.model.v20200320.QueryFaceVideoTemplateResponse.Data;
import com.aliyuncs.videoenhan.model.v20200320.QueryFaceVideoTemplateResponse.Data.ElementsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceVideoTemplateResponseUnmarshaller {

	public static QueryFaceVideoTemplateResponse unmarshall(QueryFaceVideoTemplateResponse queryFaceVideoTemplateResponse, UnmarshallerContext _ctx) {
		
		queryFaceVideoTemplateResponse.setRequestId(_ctx.stringValue("QueryFaceVideoTemplateResponse.RequestId"));
		queryFaceVideoTemplateResponse.setMessage(_ctx.stringValue("QueryFaceVideoTemplateResponse.Message"));
		queryFaceVideoTemplateResponse.setCode(_ctx.stringValue("QueryFaceVideoTemplateResponse.Code"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceVideoTemplateResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setTemplateURL(_ctx.stringValue("QueryFaceVideoTemplateResponse.Data.Elements["+ i +"].TemplateURL"));
			elementsItem.setUserId(_ctx.stringValue("QueryFaceVideoTemplateResponse.Data.Elements["+ i +"].UserId"));
			elementsItem.setCreateTime(_ctx.stringValue("QueryFaceVideoTemplateResponse.Data.Elements["+ i +"].CreateTime"));
			elementsItem.setUpdateTime(_ctx.stringValue("QueryFaceVideoTemplateResponse.Data.Elements["+ i +"].UpdateTime"));
			elementsItem.setTemplateId(_ctx.stringValue("QueryFaceVideoTemplateResponse.Data.Elements["+ i +"].TemplateId"));

			elements.add(elementsItem);
		}
		data.setElements(elements);
		queryFaceVideoTemplateResponse.setData(data);
	 
	 	return queryFaceVideoTemplateResponse;
	}
}