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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.QueryAccountListResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.QueryAccountListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountListResponseUnmarshaller {

	public static QueryAccountListResponse unmarshall(QueryAccountListResponse queryAccountListResponse, UnmarshallerContext _ctx) {
		
		queryAccountListResponse.setRequestId(_ctx.stringValue("QueryAccountListResponse.RequestId"));
		queryAccountListResponse.setRegionId(_ctx.stringValue("QueryAccountListResponse.RegionId"));
		queryAccountListResponse.setPageSize(_ctx.integerValue("QueryAccountListResponse.PageSize"));
		queryAccountListResponse.setPageNumber(_ctx.integerValue("QueryAccountListResponse.PageNumber"));
		queryAccountListResponse.setTotalCount(_ctx.integerValue("QueryAccountListResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccountListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUserName(_ctx.stringValue("QueryAccountListResponse.Data["+ i +"].UserName"));
			dataItem.setRole(_ctx.stringValue("QueryAccountListResponse.Data["+ i +"].Role"));
			dataItem.setShortName(_ctx.stringValue("QueryAccountListResponse.Data["+ i +"].ShortName"));
			dataItem.setRemark(_ctx.stringValue("QueryAccountListResponse.Data["+ i +"].Remark"));

			data.add(dataItem);
		}
		queryAccountListResponse.setData(data);
	 
	 	return queryAccountListResponse;
	}
}