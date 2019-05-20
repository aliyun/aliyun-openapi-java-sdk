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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventCountsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventCountsResponse.EventCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventCountsResponse.EventCount.LastDay;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventCountsResponse.EventCount.LastMonth;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventCountsResponse.EventCount.LastWeek;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventCountsResponse.EventCount.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventCountsResponseUnmarshaller {

	public static DescribeEventCountsResponse unmarshall(DescribeEventCountsResponse describeEventCountsResponse, UnmarshallerContext context) {
		
		describeEventCountsResponse.setRequestId(context.stringValue("DescribeEventCountsResponse.RequestId"));

		List<EventCount> eventCountList = new ArrayList<EventCount>();
		for (int i = 0; i < context.lengthValue("DescribeEventCountsResponse.EventCountList.Length"); i++) {
			EventCount eventCount = new EventCount();
			eventCount.setTypeCode(context.stringValue("DescribeEventCountsResponse.EventCountList["+ i +"].TypeCode"));
			eventCount.setTypeName(context.stringValue("DescribeEventCountsResponse.EventCountList["+ i +"].TypeName"));
			eventCount.setDate(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].Date"));

			Total total = new Total();
			total.setTotalCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].Total.TotalCount"));
			total.setUndealCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].Total.UndealCount"));
			total.setConfirmCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].Total.ConfirmCount"));
			total.setExcludeCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].Total.ExcludeCount"));
			eventCount.setTotal(total);

			LastDay lastDay = new LastDay();
			lastDay.setTotalCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastDay.TotalCount"));
			lastDay.setUndealCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastDay.UndealCount"));
			lastDay.setConfirmCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastDay.ConfirmCount"));
			lastDay.setExcludeCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastDay.ExcludeCount"));
			eventCount.setLastDay(lastDay);

			LastWeek lastWeek = new LastWeek();
			lastWeek.setTotalCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastWeek.TotalCount"));
			lastWeek.setUndealCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastWeek.UndealCount"));
			lastWeek.setConfirmCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastWeek.ConfirmCount"));
			lastWeek.setExcludeCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastWeek.ExcludeCount"));
			eventCount.setLastWeek(lastWeek);

			LastMonth lastMonth = new LastMonth();
			lastMonth.setTotalCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastMonth.TotalCount"));
			lastMonth.setUndealCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastMonth.UndealCount"));
			lastMonth.setConfirmCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastMonth.ConfirmCount"));
			lastMonth.setExcludeCount(context.longValue("DescribeEventCountsResponse.EventCountList["+ i +"].LastMonth.ExcludeCount"));
			eventCount.setLastMonth(lastMonth);

			eventCountList.add(eventCount);
		}
		describeEventCountsResponse.setEventCountList(eventCountList);
	 
	 	return describeEventCountsResponse;
	}
}