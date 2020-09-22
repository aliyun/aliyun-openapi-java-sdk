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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListLibrariesResponse;
import com.aliyuncs.emr.model.v20160408.ListLibrariesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLibrariesResponseUnmarshaller {

	public static ListLibrariesResponse unmarshall(ListLibrariesResponse listLibrariesResponse, UnmarshallerContext _ctx) {
		
		listLibrariesResponse.setRequestId(_ctx.stringValue("ListLibrariesResponse.RequestId"));
		listLibrariesResponse.setPageNumber(_ctx.integerValue("ListLibrariesResponse.PageNumber"));
		listLibrariesResponse.setPageSize(_ctx.integerValue("ListLibrariesResponse.PageSize"));
		listLibrariesResponse.setTotalCount(_ctx.integerValue("ListLibrariesResponse.TotalCount"));
		listLibrariesResponse.setNextToken(_ctx.stringValue("ListLibrariesResponse.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListLibrariesResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setBizId(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].BizId"));
			item.setCreateTime(_ctx.longValue("ListLibrariesResponse.Items["+ i +"].CreateTime"));
			item.setType(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].Type"));
			item.setName(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].Name"));
			item.setLibraryVersion(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].LibraryVersion"));
			item.setSourceType(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].SourceType"));
			item.setSourceLocation(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].SourceLocation"));
			item.setScope(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].Scope"));
			item.setProperties(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].Properties"));
			item.setUserId(_ctx.stringValue("ListLibrariesResponse.Items["+ i +"].UserId"));

			items.add(item);
		}
		listLibrariesResponse.setItems(items);
	 
	 	return listLibrariesResponse;
	}
}