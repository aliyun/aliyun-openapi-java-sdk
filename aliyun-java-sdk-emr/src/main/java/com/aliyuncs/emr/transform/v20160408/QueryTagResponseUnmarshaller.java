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

import com.aliyuncs.emr.model.v20160408.QueryTagResponse;
import com.aliyuncs.emr.model.v20160408.QueryTagResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTagResponseUnmarshaller {

	public static QueryTagResponse unmarshall(QueryTagResponse queryTagResponse, UnmarshallerContext _ctx) {
		
		queryTagResponse.setRequestId(_ctx.stringValue("QueryTagResponse.RequestId"));
		queryTagResponse.setPageNumber(_ctx.integerValue("QueryTagResponse.PageNumber"));
		queryTagResponse.setPageSize(_ctx.integerValue("QueryTagResponse.PageSize"));
		queryTagResponse.setTotalCount(_ctx.integerValue("QueryTagResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryTagResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setName(_ctx.stringValue("QueryTagResponse.Items["+ i +"].Name"));
			item.setCategory(_ctx.stringValue("QueryTagResponse.Items["+ i +"].Category"));
			item.setDescription(_ctx.stringValue("QueryTagResponse.Items["+ i +"].Description"));

			items.add(item);
		}
		queryTagResponse.setItems(items);
	 
	 	return queryTagResponse;
	}
}