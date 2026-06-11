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

import com.aliyuncs.airegistry.model.v20260317.ListPromptVersionsResponse;
import com.aliyuncs.airegistry.model.v20260317.ListPromptVersionsResponse.Data;
import com.aliyuncs.airegistry.model.v20260317.ListPromptVersionsResponse.Data.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPromptVersionsResponseUnmarshaller {

	public static ListPromptVersionsResponse unmarshall(ListPromptVersionsResponse listPromptVersionsResponse, UnmarshallerContext _ctx) {
		
		listPromptVersionsResponse.setRequestId(_ctx.stringValue("ListPromptVersionsResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListPromptVersionsResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListPromptVersionsResponse.Data.PageNumber"));
		data.setPagesAvailable(_ctx.integerValue("ListPromptVersionsResponse.Data.PagesAvailable"));

		List<Item> pageItems = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListPromptVersionsResponse.Data.PageItems.Length"); i++) {
			Item item = new Item();
			item.setPromptKey(_ctx.stringValue("ListPromptVersionsResponse.Data.PageItems["+ i +"].PromptKey"));
			item.setVersion(_ctx.stringValue("ListPromptVersionsResponse.Data.PageItems["+ i +"].Version"));
			item.setStatus(_ctx.stringValue("ListPromptVersionsResponse.Data.PageItems["+ i +"].Status"));
			item.setCommitMsg(_ctx.stringValue("ListPromptVersionsResponse.Data.PageItems["+ i +"].CommitMsg"));
			item.setSrcUser(_ctx.stringValue("ListPromptVersionsResponse.Data.PageItems["+ i +"].SrcUser"));
			item.setGmtModified(_ctx.longValue("ListPromptVersionsResponse.Data.PageItems["+ i +"].GmtModified"));

			pageItems.add(item);
		}
		data.setPageItems(pageItems);
		listPromptVersionsResponse.setData(data);
	 
	 	return listPromptVersionsResponse;
	}
}