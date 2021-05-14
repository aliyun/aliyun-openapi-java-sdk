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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.QueryFaceImageTemplateResponse;
import com.aliyuncs.facebody.model.v20191230.QueryFaceImageTemplateResponse.Data;
import com.aliyuncs.facebody.model.v20191230.QueryFaceImageTemplateResponse.Data.ElementsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceImageTemplateResponseUnmarshaller {

	public static QueryFaceImageTemplateResponse unmarshall(QueryFaceImageTemplateResponse queryFaceImageTemplateResponse, UnmarshallerContext _ctx) {
		
		queryFaceImageTemplateResponse.setRequestId(_ctx.stringValue("QueryFaceImageTemplateResponse.RequestId"));
		queryFaceImageTemplateResponse.setCode(_ctx.stringValue("QueryFaceImageTemplateResponse.Code"));
		queryFaceImageTemplateResponse.setMessage(_ctx.stringValue("QueryFaceImageTemplateResponse.Message"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceImageTemplateResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setCreateTime(_ctx.stringValue("QueryFaceImageTemplateResponse.Data.Elements["+ i +"].CreateTime"));
			elementsItem.setUpdateTime(_ctx.stringValue("QueryFaceImageTemplateResponse.Data.Elements["+ i +"].UpdateTime"));
			elementsItem.setUserId(_ctx.stringValue("QueryFaceImageTemplateResponse.Data.Elements["+ i +"].UserId"));
			elementsItem.setTemplateId(_ctx.stringValue("QueryFaceImageTemplateResponse.Data.Elements["+ i +"].TemplateId"));
			elementsItem.setTemplateURL(_ctx.stringValue("QueryFaceImageTemplateResponse.Data.Elements["+ i +"].TemplateURL"));

			elements.add(elementsItem);
		}
		data.setElements(elements);
		queryFaceImageTemplateResponse.setData(data);
	 
	 	return queryFaceImageTemplateResponse;
	}
}