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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryCheckItemCategoryStatResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryCheckItemCategoryStatResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCheckItemCategoryStatResponseUnmarshaller {

	public static QueryCheckItemCategoryStatResponse unmarshall(QueryCheckItemCategoryStatResponse queryCheckItemCategoryStatResponse, UnmarshallerContext _ctx) {
		
		queryCheckItemCategoryStatResponse.setRequestId(_ctx.stringValue("QueryCheckItemCategoryStatResponse.RequestId"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("QueryCheckItemCategoryStatResponse.Data.Length"); i++) {
			Item item = new Item();
			item.setValue(_ctx.longValue("QueryCheckItemCategoryStatResponse.Data["+ i +"].Value"));
			item.setPercent(_ctx.floatValue("QueryCheckItemCategoryStatResponse.Data["+ i +"].Percent"));
			item.setName(_ctx.stringValue("QueryCheckItemCategoryStatResponse.Data["+ i +"].Name"));

			data.add(item);
		}
		queryCheckItemCategoryStatResponse.setData(data);
	 
	 	return queryCheckItemCategoryStatResponse;
	}
}