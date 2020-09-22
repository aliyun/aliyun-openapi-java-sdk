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

import com.aliyuncs.emr.model.v20160408.QueryEntityResponse;
import com.aliyuncs.emr.model.v20160408.QueryEntityResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEntityResponseUnmarshaller {

	public static QueryEntityResponse unmarshall(QueryEntityResponse queryEntityResponse, UnmarshallerContext _ctx) {
		
		queryEntityResponse.setRequestId(_ctx.stringValue("QueryEntityResponse.RequestId"));
		queryEntityResponse.setPageNumber(_ctx.integerValue("QueryEntityResponse.PageNumber"));
		queryEntityResponse.setPageSize(_ctx.integerValue("QueryEntityResponse.PageSize"));
		queryEntityResponse.setTotalCount(_ctx.integerValue("QueryEntityResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryEntityResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setTagId(_ctx.longValue("QueryEntityResponse.Items["+ i +"].TagId"));
			item.setEntityType(_ctx.stringValue("QueryEntityResponse.Items["+ i +"].EntityType"));
			item.setEntityId(_ctx.stringValue("QueryEntityResponse.Items["+ i +"].EntityId"));

			items.add(item);
		}
		queryEntityResponse.setItems(items);
	 
	 	return queryEntityResponse;
	}
}