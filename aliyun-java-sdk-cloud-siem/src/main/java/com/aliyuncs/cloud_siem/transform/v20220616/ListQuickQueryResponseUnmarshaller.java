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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.ListQuickQueryResponse;
import com.aliyuncs.cloud_siem.model.v20220616.ListQuickQueryResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.ListQuickQueryResponse.Data.QuickQueryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuickQueryResponseUnmarshaller {

	public static ListQuickQueryResponse unmarshall(ListQuickQueryResponse listQuickQueryResponse, UnmarshallerContext _ctx) {
		
		listQuickQueryResponse.setRequestId(_ctx.stringValue("ListQuickQueryResponse.RequestId"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListQuickQueryResponse.Data.Total"));
		data.setCount(_ctx.integerValue("ListQuickQueryResponse.Data.Count"));

		List<QuickQueryListItem> quickQueryList = new ArrayList<QuickQueryListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQuickQueryResponse.Data.QuickQueryList.Length"); i++) {
			QuickQueryListItem quickQueryListItem = new QuickQueryListItem();
			quickQueryListItem.setQuery(_ctx.stringValue("ListQuickQueryResponse.Data.QuickQueryList["+ i +"].Query"));
			quickQueryListItem.setSearchName(_ctx.stringValue("ListQuickQueryResponse.Data.QuickQueryList["+ i +"].SearchName"));
			quickQueryListItem.setDisplayName(_ctx.stringValue("ListQuickQueryResponse.Data.QuickQueryList["+ i +"].DisplayName"));

			quickQueryList.add(quickQueryListItem);
		}
		data.setQuickQueryList(quickQueryList);
		listQuickQueryResponse.setData(data);
	 
	 	return listQuickQueryResponse;
	}
}