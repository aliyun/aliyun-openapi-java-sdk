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

import com.aliyuncs.cloudgameapi.model.v20200728.QueryTenantResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryTenantResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTenantResponseUnmarshaller {

	public static QueryTenantResponse unmarshall(QueryTenantResponse queryTenantResponse, UnmarshallerContext _ctx) {
		
		queryTenantResponse.setRequestId(_ctx.stringValue("QueryTenantResponse.RequestId"));
		queryTenantResponse.setPageNumber(_ctx.integerValue("QueryTenantResponse.PageNumber"));
		queryTenantResponse.setPageSize(_ctx.integerValue("QueryTenantResponse.PageSize"));
		queryTenantResponse.setTotalCount(_ctx.integerValue("QueryTenantResponse.TotalCount"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QueryTenantResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setTenantId(_ctx.longValue("QueryTenantResponse.Data["+ i +"].TenantId"));
			items.setName(_ctx.stringValue("QueryTenantResponse.Data["+ i +"].Name"));
			items.setGmtCreate(_ctx.stringValue("QueryTenantResponse.Data["+ i +"].GmtCreate"));

			data.add(items);
		}
		queryTenantResponse.setData(data);
	 
	 	return queryTenantResponse;
	}
}