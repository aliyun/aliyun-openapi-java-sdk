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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudgameapi.model.v20200728.QueryProjectResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryProjectResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProjectResponseUnmarshaller {

	public static QueryProjectResponse unmarshall(QueryProjectResponse queryProjectResponse, UnmarshallerContext _ctx) {
		
		queryProjectResponse.setRequestId(_ctx.stringValue("QueryProjectResponse.RequestId"));
		queryProjectResponse.setPageNumber(_ctx.integerValue("QueryProjectResponse.PageNumber"));
		queryProjectResponse.setPageSize(_ctx.integerValue("QueryProjectResponse.PageSize"));
		queryProjectResponse.setTotalCount(_ctx.integerValue("QueryProjectResponse.TotalCount"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QueryProjectResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setTenantId(_ctx.longValue("QueryProjectResponse.Data["+ i +"].TenantId"));
			items.setName(_ctx.stringValue("QueryProjectResponse.Data["+ i +"].Name"));
			items.setId(_ctx.longValue("QueryProjectResponse.Data["+ i +"].Id"));

			data.add(items);
		}
		queryProjectResponse.setData(data);
	 
	 	return queryProjectResponse;
	}
}