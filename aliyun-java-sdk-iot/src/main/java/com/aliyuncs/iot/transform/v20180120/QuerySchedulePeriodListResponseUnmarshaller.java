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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySchedulePeriodListResponse;
import com.aliyuncs.iot.model.v20180120.QuerySchedulePeriodListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySchedulePeriodListResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySchedulePeriodListResponseUnmarshaller {

	public static QuerySchedulePeriodListResponse unmarshall(QuerySchedulePeriodListResponse querySchedulePeriodListResponse, UnmarshallerContext _ctx) {
		
		querySchedulePeriodListResponse.setRequestId(_ctx.stringValue("QuerySchedulePeriodListResponse.RequestId"));
		querySchedulePeriodListResponse.setSuccess(_ctx.booleanValue("QuerySchedulePeriodListResponse.Success"));
		querySchedulePeriodListResponse.setCode(_ctx.stringValue("QuerySchedulePeriodListResponse.Code"));
		querySchedulePeriodListResponse.setErrorMessage(_ctx.stringValue("QuerySchedulePeriodListResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySchedulePeriodListResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySchedulePeriodListResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySchedulePeriodListResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySchedulePeriodListResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setPeriodCode(_ctx.stringValue("QuerySchedulePeriodListResponse.Data.List["+ i +"].PeriodCode"));
			items.setSoundCodeContent(_ctx.stringValue("QuerySchedulePeriodListResponse.Data.List["+ i +"].SoundCodeContent"));
			items.setDescription(_ctx.stringValue("QuerySchedulePeriodListResponse.Data.List["+ i +"].Description"));
			items.setStartTime(_ctx.stringValue("QuerySchedulePeriodListResponse.Data.List["+ i +"].StartTime"));
			items.setEndTime(_ctx.stringValue("QuerySchedulePeriodListResponse.Data.List["+ i +"].EndTime"));

			list.add(items);
		}
		data.setList(list);
		querySchedulePeriodListResponse.setData(data);
	 
	 	return querySchedulePeriodListResponse;
	}
}