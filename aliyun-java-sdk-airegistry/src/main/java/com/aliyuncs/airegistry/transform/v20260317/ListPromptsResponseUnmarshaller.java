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

import com.aliyuncs.airegistry.model.v20260317.ListPromptsResponse;
import com.aliyuncs.airegistry.model.v20260317.ListPromptsResponse.Data;
import com.aliyuncs.airegistry.model.v20260317.ListPromptsResponse.Data.Item;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPromptsResponseUnmarshaller {

	public static ListPromptsResponse unmarshall(ListPromptsResponse listPromptsResponse, UnmarshallerContext _ctx) {
		
		listPromptsResponse.setRequestId(_ctx.stringValue("ListPromptsResponse.RequestId"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListPromptsResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListPromptsResponse.Data.PageNumber"));
		data.setPagesAvailable(_ctx.integerValue("ListPromptsResponse.Data.PagesAvailable"));

		List<Item> pageItems = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListPromptsResponse.Data.PageItems.Length"); i++) {
			Item item = new Item();
			item.setSchemaVersion(_ctx.integerValue("ListPromptsResponse.Data.PageItems["+ i +"].SchemaVersion"));
			item.setPromptKey(_ctx.stringValue("ListPromptsResponse.Data.PageItems["+ i +"].PromptKey"));
			item.setDescription(_ctx.stringValue("ListPromptsResponse.Data.PageItems["+ i +"].Description"));
			item.setLatestVersion(_ctx.stringValue("ListPromptsResponse.Data.PageItems["+ i +"].LatestVersion"));
			item.setGmtModified(_ctx.longValue("ListPromptsResponse.Data.PageItems["+ i +"].GmtModified"));
			item.setEditingVersion(_ctx.stringValue("ListPromptsResponse.Data.PageItems["+ i +"].EditingVersion"));
			item.setReviewingVersion(_ctx.stringValue("ListPromptsResponse.Data.PageItems["+ i +"].ReviewingVersion"));
			item.setOnlineCnt(_ctx.integerValue("ListPromptsResponse.Data.PageItems["+ i +"].OnlineCnt"));
			item.setLabels(_ctx.mapValue("ListPromptsResponse.Data.PageItems["+ i +"].Labels"));

			List<String> bizTags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPromptsResponse.Data.PageItems["+ i +"].BizTags.Length"); j++) {
				bizTags.add(_ctx.stringValue("ListPromptsResponse.Data.PageItems["+ i +"].BizTags["+ j +"]"));
			}
			item.setBizTags(bizTags);

			pageItems.add(item);
		}
		data.setPageItems(pageItems);
		listPromptsResponse.setData(data);
	 
	 	return listPromptsResponse;
	}
}