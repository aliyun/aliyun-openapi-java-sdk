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

import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTotalCountResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTotalCountResponse.EventCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTotalCountResponse.EventCount.LastDay;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTotalCountResponse.EventCount.LastMonth;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTotalCountResponse.EventCount.LastWeek;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTotalCountResponse.EventCount.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventTotalCountResponseUnmarshaller {

	public static DescribeEventTotalCountResponse unmarshall(DescribeEventTotalCountResponse describeEventTotalCountResponse, UnmarshallerContext context) {
		
		describeEventTotalCountResponse.setRequestId(context.stringValue("DescribeEventTotalCountResponse.RequestId"));

		EventCount eventCount = new EventCount();
		eventCount.setTypeCode(context.stringValue("DescribeEventTotalCountResponse.EventCount.TypeCode"));
		eventCount.setTypeName(context.stringValue("DescribeEventTotalCountResponse.EventCount.TypeName"));
		eventCount.setDate(context.longValue("DescribeEventTotalCountResponse.EventCount.Date"));

		Total total = new Total();
		total.setTotalCount(context.longValue("DescribeEventTotalCountResponse.EventCount.Total.TotalCount"));
		total.setUndealCount(context.longValue("DescribeEventTotalCountResponse.EventCount.Total.UndealCount"));
		total.setConfirmCount(context.longValue("DescribeEventTotalCountResponse.EventCount.Total.ConfirmCount"));
		total.setExcludeCount(context.longValue("DescribeEventTotalCountResponse.EventCount.Total.ExcludeCount"));
		eventCount.setTotal(total);

		LastDay lastDay = new LastDay();
		lastDay.setTotalCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastDay.TotalCount"));
		lastDay.setUndealCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastDay.UndealCount"));
		lastDay.setConfirmCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastDay.ConfirmCount"));
		lastDay.setExcludeCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastDay.ExcludeCount"));
		eventCount.setLastDay(lastDay);

		LastWeek lastWeek = new LastWeek();
		lastWeek.setTotalCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastWeek.TotalCount"));
		lastWeek.setUndealCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastWeek.UndealCount"));
		lastWeek.setConfirmCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastWeek.ConfirmCount"));
		lastWeek.setExcludeCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastWeek.ExcludeCount"));
		eventCount.setLastWeek(lastWeek);

		LastMonth lastMonth = new LastMonth();
		lastMonth.setTotalCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastMonth.TotalCount"));
		lastMonth.setUndealCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastMonth.UndealCount"));
		lastMonth.setConfirmCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastMonth.ConfirmCount"));
		lastMonth.setExcludeCount(context.longValue("DescribeEventTotalCountResponse.EventCount.LastMonth.ExcludeCount"));
		eventCount.setLastMonth(lastMonth);
		describeEventTotalCountResponse.setEventCount(eventCount);
	 
	 	return describeEventTotalCountResponse;
	}
}