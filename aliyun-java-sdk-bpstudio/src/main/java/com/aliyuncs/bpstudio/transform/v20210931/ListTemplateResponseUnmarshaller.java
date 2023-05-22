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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.ListTemplateResponse;
import com.aliyuncs.bpstudio.model.v20210931.ListTemplateResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTemplateResponseUnmarshaller {

	public static ListTemplateResponse unmarshall(ListTemplateResponse listTemplateResponse, UnmarshallerContext _ctx) {
		
		listTemplateResponse.setRequestId(_ctx.stringValue("ListTemplateResponse.RequestId"));
		listTemplateResponse.setTotalCount(_ctx.integerValue("ListTemplateResponse.TotalCount"));
		listTemplateResponse.setMessage(_ctx.stringValue("ListTemplateResponse.Message"));
		listTemplateResponse.setNextToken(_ctx.integerValue("ListTemplateResponse.NextToken"));
		listTemplateResponse.setCode(_ctx.integerValue("ListTemplateResponse.Code"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListTemplateResponse.Data.Length"); i++) {
			Item item = new Item();
			item.setImageURL(_ctx.stringValue("ListTemplateResponse.Data["+ i +"].ImageURL"));
			item.setTagId(_ctx.integerValue("ListTemplateResponse.Data["+ i +"].TagId"));
			item.setTagName(_ctx.stringValue("ListTemplateResponse.Data["+ i +"].TagName"));
			item.setName(_ctx.stringValue("ListTemplateResponse.Data["+ i +"].Name"));
			item.setTopoURL(_ctx.stringValue("ListTemplateResponse.Data["+ i +"].TopoURL"));
			item.setTemplateId(_ctx.stringValue("ListTemplateResponse.Data["+ i +"].TemplateId"));
			item.setCreateTime(_ctx.stringValue("ListTemplateResponse.Data["+ i +"].CreateTime"));
			item.setResourceGroupId(_ctx.stringValue("ListTemplateResponse.Data["+ i +"].ResourceGroupId"));

			data.add(item);
		}
		listTemplateResponse.setData(data);
	 
	 	return listTemplateResponse;
	}
}