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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.SearchItemsResponse;
import com.aliyuncs.trademark.model.v20190902.SearchItemsResponse.Module;
import com.aliyuncs.trademark.model.v20190902.SearchItemsResponse.Module.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchItemsResponseUnmarshaller {

	public static SearchItemsResponse unmarshall(SearchItemsResponse searchItemsResponse, UnmarshallerContext _ctx) {
		

		Module module = new Module();
		module.setCurrentPageNum(_ctx.integerValue("SearchItemsResponse.Module.CurrentPageNum"));
		module.setPageSize(_ctx.integerValue("SearchItemsResponse.Module.PageSize"));
		module.setTotalItemNum(_ctx.integerValue("SearchItemsResponse.Module.TotalItemNum"));
		module.setTotalPageNum(_ctx.integerValue("SearchItemsResponse.Module.TotalPageNum"));

		List<Item> date = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("SearchItemsResponse.Module.Date.Length"); i++) {
			Item item = new Item();
			item.setDetailViewObjectSourceDatum(_ctx.stringValue("SearchItemsResponse.Module.Date["+ i +"].DetailViewObjectSourceDatum"));
			item.setDetailViewObjectSourceType(_ctx.stringValue("SearchItemsResponse.Module.Date["+ i +"].DetailViewObjectSourceType"));

			date.add(item);
		}
		module.setDate(date);
		searchItemsResponse.setModule(module);
	 
	 	return searchItemsResponse;
	}
}