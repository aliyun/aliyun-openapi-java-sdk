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

import com.aliyuncs.openanalytics_open.model.v20180619.QueryDiscountListResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.QueryDiscountListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDiscountListResponseUnmarshaller {

	public static QueryDiscountListResponse unmarshall(QueryDiscountListResponse queryDiscountListResponse, UnmarshallerContext _ctx) {
		
		queryDiscountListResponse.setRequestId(_ctx.stringValue("QueryDiscountListResponse.RequestId"));
		queryDiscountListResponse.setRegionId(_ctx.stringValue("QueryDiscountListResponse.RegionId"));
		queryDiscountListResponse.setPageSize(_ctx.integerValue("QueryDiscountListResponse.PageSize"));
		queryDiscountListResponse.setPageNumber(_ctx.integerValue("QueryDiscountListResponse.PageNumber"));
		queryDiscountListResponse.setTotalCount(_ctx.integerValue("QueryDiscountListResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDiscountListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPlanID(_ctx.stringValue("QueryDiscountListResponse.Data["+ i +"].PlanID"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryDiscountListResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtCreateValue(_ctx.longValue("QueryDiscountListResponse.Data["+ i +"].GmtCreateValue"));
			dataItem.setDiscountType(_ctx.integerValue("QueryDiscountListResponse.Data["+ i +"].DiscountType"));
			dataItem.setDiscountConfig(_ctx.stringValue("QueryDiscountListResponse.Data["+ i +"].DiscountConfig"));
			dataItem.setPayType(_ctx.integerValue("QueryDiscountListResponse.Data["+ i +"].PayType"));
			dataItem.setPayAmount(_ctx.stringValue("QueryDiscountListResponse.Data["+ i +"].PayAmount"));
			dataItem.setWeight(_ctx.integerValue("QueryDiscountListResponse.Data["+ i +"].Weight"));
			dataItem.setStacked(_ctx.integerValue("QueryDiscountListResponse.Data["+ i +"].Stacked"));
			dataItem.setUsageBytes(_ctx.longValue("QueryDiscountListResponse.Data["+ i +"].UsageBytes"));
			dataItem.setEffectiveStartTime(_ctx.stringValue("QueryDiscountListResponse.Data["+ i +"].EffectiveStartTime"));
			dataItem.setEffectiveStartTimeValue(_ctx.longValue("QueryDiscountListResponse.Data["+ i +"].EffectiveStartTimeValue"));
			dataItem.setEffectiveEndTime(_ctx.stringValue("QueryDiscountListResponse.Data["+ i +"].EffectiveEndTime"));
			dataItem.setEffectiveEndTimeValue(_ctx.longValue("QueryDiscountListResponse.Data["+ i +"].EffectiveEndTimeValue"));
			dataItem.setStatus(_ctx.integerValue("QueryDiscountListResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		queryDiscountListResponse.setData(data);
	 
	 	return queryDiscountListResponse;
	}
}