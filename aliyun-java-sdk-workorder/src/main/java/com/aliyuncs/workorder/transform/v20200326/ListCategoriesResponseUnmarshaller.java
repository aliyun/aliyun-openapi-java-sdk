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

package com.aliyuncs.workorder.transform.v20200326;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20200326.ListCategoriesResponse;
import com.aliyuncs.workorder.model.v20200326.ListCategoriesResponse.Data;
import com.aliyuncs.workorder.model.v20200326.ListCategoriesResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCategoriesResponseUnmarshaller {

	public static ListCategoriesResponse unmarshall(ListCategoriesResponse listCategoriesResponse, UnmarshallerContext _ctx) {
		
		listCategoriesResponse.setRequestId(_ctx.stringValue("ListCategoriesResponse.RequestId"));
		listCategoriesResponse.setCode(_ctx.integerValue("ListCategoriesResponse.Code"));
		listCategoriesResponse.setMessage(_ctx.stringValue("ListCategoriesResponse.Message"));
		listCategoriesResponse.setSuccess(_ctx.booleanValue("ListCategoriesResponse.Success"));

		Data data = new Data();

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCategoriesResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.integerValue("ListCategoriesResponse.Data.List["+ i +"].Id"));
			listItem.setName(_ctx.stringValue("ListCategoriesResponse.Data.List["+ i +"].Name"));

			list.add(listItem);
		}
		data.setList(list);
		listCategoriesResponse.setData(data);
	 
	 	return listCategoriesResponse;
	}
}