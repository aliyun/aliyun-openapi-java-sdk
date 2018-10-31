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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainsUsageByDayResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainsUsageByDayResponse.UsageByDay;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainsUsageByDayResponse.UsageTotal;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainsUsageByDayResponseUnmarshaller {

	public static DescribeDomainsUsageByDayResponse unmarshall(DescribeDomainsUsageByDayResponse describeDomainsUsageByDayResponse, UnmarshallerContext context) {
		
		describeDomainsUsageByDayResponse.setRequestId(context.stringValue("DescribeDomainsUsageByDayResponse.RequestId"));
		describeDomainsUsageByDayResponse.setDomainName(context.stringValue("DescribeDomainsUsageByDayResponse.DomainName"));
		describeDomainsUsageByDayResponse.setDataInterval(context.stringValue("DescribeDomainsUsageByDayResponse.DataInterval"));
		describeDomainsUsageByDayResponse.setStartTime(context.stringValue("DescribeDomainsUsageByDayResponse.StartTime"));
		describeDomainsUsageByDayResponse.setEndTime(context.stringValue("DescribeDomainsUsageByDayResponse.EndTime"));

		UsageTotal usageTotal = new UsageTotal();
		usageTotal.setBytesHitRate(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.BytesHitRate"));
		usageTotal.setRequestHitRate(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.RequestHitRate"));
		usageTotal.setMaxBps(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxBps"));
		usageTotal.setMaxBpsTime(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxBpsTime"));
		usageTotal.setMaxSrcBps(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxSrcBps"));
		usageTotal.setMaxSrcBpsTime(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxSrcBpsTime"));
		usageTotal.setTotalAccess(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.TotalAccess"));
		usageTotal.setTotalTraffic(context.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.TotalTraffic"));
		describeDomainsUsageByDayResponse.setUsageTotal(usageTotal);

		List<UsageByDay> usageByDays = new ArrayList<UsageByDay>();
		for (int i = 0; i < context.lengthValue("DescribeDomainsUsageByDayResponse.UsageByDays.Length"); i++) {
			UsageByDay usageByDay = new UsageByDay();
			usageByDay.setTimeStamp(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].TimeStamp"));
			usageByDay.setQps(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].Qps"));
			usageByDay.setBytesHitRate(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].BytesHitRate"));
			usageByDay.setRequestHitRate(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].RequestHitRate"));
			usageByDay.setMaxBps(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxBps"));
			usageByDay.setMaxBpsTime(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxBpsTime"));
			usageByDay.setMaxSrcBps(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxSrcBps"));
			usageByDay.setMaxSrcBpsTime(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxSrcBpsTime"));
			usageByDay.setTotalAccess(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].TotalAccess"));
			usageByDay.setTotalTraffic(context.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].TotalTraffic"));

			usageByDays.add(usageByDay);
		}
		describeDomainsUsageByDayResponse.setUsageByDays(usageByDays);
	 
	 	return describeDomainsUsageByDayResponse;
	}
}