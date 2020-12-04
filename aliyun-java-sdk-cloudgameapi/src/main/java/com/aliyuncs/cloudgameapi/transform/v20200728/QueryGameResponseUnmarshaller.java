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

import com.aliyuncs.cloudgameapi.model.v20200728.QueryGameResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryGameResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGameResponseUnmarshaller {

	public static QueryGameResponse unmarshall(QueryGameResponse queryGameResponse, UnmarshallerContext _ctx) {
		
		queryGameResponse.setRequestId(_ctx.stringValue("QueryGameResponse.RequestId"));
		queryGameResponse.setPageNumber(_ctx.integerValue("QueryGameResponse.PageNumber"));
		queryGameResponse.setPageSize(_ctx.integerValue("QueryGameResponse.PageSize"));
		queryGameResponse.setTotalCount(_ctx.integerValue("QueryGameResponse.TotalCount"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QueryGameResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setTenantId(_ctx.longValue("QueryGameResponse.Data["+ i +"].TenantId"));
			items.setName(_ctx.stringValue("QueryGameResponse.Data["+ i +"].Name"));
			items.setGmtCreate(_ctx.stringValue("QueryGameResponse.Data["+ i +"].GmtCreate"));
			items.setProjectId(_ctx.longValue("QueryGameResponse.Data["+ i +"].ProjectId"));
			items.setGameId(_ctx.longValue("QueryGameResponse.Data["+ i +"].GameId"));
			items.setVersion(_ctx.stringValue("QueryGameResponse.Data["+ i +"].Version"));

			data.add(items);
		}
		queryGameResponse.setData(data);
	 
	 	return queryGameResponse;
	}
}