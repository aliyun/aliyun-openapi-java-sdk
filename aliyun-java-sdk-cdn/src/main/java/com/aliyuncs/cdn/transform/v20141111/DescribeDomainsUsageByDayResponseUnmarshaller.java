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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainsUsageByDayResponseUnmarshaller {

	public static DescribeDomainsUsageByDayResponse unmarshall(DescribeDomainsUsageByDayResponse describeDomainsUsageByDayResponse, UnmarshallerContext _ctx) {
		
		describeDomainsUsageByDayResponse.setRequestId(_ctx.stringValue("DescribeDomainsUsageByDayResponse.RequestId"));
		describeDomainsUsageByDayResponse.setEndTime(_ctx.stringValue("DescribeDomainsUsageByDayResponse.EndTime"));
		describeDomainsUsageByDayResponse.setStartTime(_ctx.stringValue("DescribeDomainsUsageByDayResponse.StartTime"));
		describeDomainsUsageByDayResponse.setDomainName(_ctx.stringValue("DescribeDomainsUsageByDayResponse.DomainName"));
		describeDomainsUsageByDayResponse.setDataInterval(_ctx.stringValue("DescribeDomainsUsageByDayResponse.DataInterval"));

		UsageTotal usageTotal = new UsageTotal();
		usageTotal.setMaxSrcBpsTime(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxSrcBpsTime"));
		usageTotal.setRequestHitRate(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.RequestHitRate"));
		usageTotal.setMaxBps(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxBps"));
		usageTotal.setTotalAccess(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.TotalAccess"));
		usageTotal.setBytesHitRate(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.BytesHitRate"));
		usageTotal.setTotalTraffic(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.TotalTraffic"));
		usageTotal.setMaxBpsTime(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxBpsTime"));
		usageTotal.setMaxSrcBps(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageTotal.MaxSrcBps"));
		describeDomainsUsageByDayResponse.setUsageTotal(usageTotal);

		List<UsageByDay> usageByDays = new ArrayList<UsageByDay>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainsUsageByDayResponse.UsageByDays.Length"); i++) {
			UsageByDay usageByDay = new UsageByDay();
			usageByDay.setMaxSrcBpsTime(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxSrcBpsTime"));
			usageByDay.setQps(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].Qps"));
			usageByDay.setRequestHitRate(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].RequestHitRate"));
			usageByDay.setMaxBps(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxBps"));
			usageByDay.setTotalAccess(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].TotalAccess"));
			usageByDay.setTimeStamp(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].TimeStamp"));
			usageByDay.setBytesHitRate(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].BytesHitRate"));
			usageByDay.setTotalTraffic(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].TotalTraffic"));
			usageByDay.setMaxSrcBps(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxSrcBps"));
			usageByDay.setMaxBpsTime(_ctx.stringValue("DescribeDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxBpsTime"));

			usageByDays.add(usageByDay);
		}
		describeDomainsUsageByDayResponse.setUsageByDays(usageByDays);
	 
	 	return describeDomainsUsageByDayResponse;
	}
}