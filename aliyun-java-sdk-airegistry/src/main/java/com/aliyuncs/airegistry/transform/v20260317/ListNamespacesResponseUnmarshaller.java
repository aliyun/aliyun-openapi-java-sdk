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

package com.aliyuncs.airegistry.transform.v20260317;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airegistry.model.v20260317.ListNamespacesResponse;
import com.aliyuncs.airegistry.model.v20260317.ListNamespacesResponse.Data;
import com.aliyuncs.airegistry.model.v20260317.ListNamespacesResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamespacesResponseUnmarshaller {

	public static ListNamespacesResponse unmarshall(ListNamespacesResponse listNamespacesResponse, UnmarshallerContext _ctx) {
		
		listNamespacesResponse.setRequestId(_ctx.stringValue("ListNamespacesResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListNamespacesResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListNamespacesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListNamespacesResponse.Data.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListNamespacesResponse.Data.Items.Length"); i++) {
			Item item = new Item();
			item.setNamespaceId(_ctx.stringValue("ListNamespacesResponse.Data.Items["+ i +"].NamespaceId"));
			item.setName(_ctx.stringValue("ListNamespacesResponse.Data.Items["+ i +"].Name"));
			item.setDescription(_ctx.stringValue("ListNamespacesResponse.Data.Items["+ i +"].Description"));
			item.setTags(_ctx.stringValue("ListNamespacesResponse.Data.Items["+ i +"].Tags"));
			item.setSource(_ctx.stringValue("ListNamespacesResponse.Data.Items["+ i +"].Source"));
			item.setSourceIndex(_ctx.integerValue("ListNamespacesResponse.Data.Items["+ i +"].SourceIndex"));
			item.setPromptCount(_ctx.integerValue("ListNamespacesResponse.Data.Items["+ i +"].PromptCount"));
			item.setCreatedTime(_ctx.stringValue("ListNamespacesResponse.Data.Items["+ i +"].CreatedTime"));
			item.setSkillCount(_ctx.integerValue("ListNamespacesResponse.Data.Items["+ i +"].SkillCount"));

			items.add(item);
		}
		data.setItems(items);
		listNamespacesResponse.setData(data);
	 
	 	return listNamespacesResponse;
	}
}