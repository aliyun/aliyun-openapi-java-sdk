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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainsUsageByDayResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainsUsageByDayResponse.UsageByDay;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainsUsageByDayResponse.UsageTotal;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainsUsageByDayResponseUnmarshaller {

	public static DescribeVodDomainsUsageByDayResponse unmarshall(DescribeVodDomainsUsageByDayResponse describeVodDomainsUsageByDayResponse, UnmarshallerContext context) {
		
		describeVodDomainsUsageByDayResponse.setRequestId(context.stringValue("DescribeVodDomainsUsageByDayResponse.RequestId"));
		describeVodDomainsUsageByDayResponse.setDomainName(context.stringValue("DescribeVodDomainsUsageByDayResponse.DomainName"));
		describeVodDomainsUsageByDayResponse.setDataInterval(context.stringValue("DescribeVodDomainsUsageByDayResponse.DataInterval"));
		describeVodDomainsUsageByDayResponse.setStartTime(context.stringValue("DescribeVodDomainsUsageByDayResponse.StartTime"));
		describeVodDomainsUsageByDayResponse.setEndTime(context.stringValue("DescribeVodDomainsUsageByDayResponse.EndTime"));

		UsageTotal usageTotal = new UsageTotal();
		usageTotal.setBytesHitRate(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.BytesHitRate"));
		usageTotal.setRequestHitRate(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.RequestHitRate"));
		usageTotal.setMaxBps(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.MaxBps"));
		usageTotal.setMaxBpsTime(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.MaxBpsTime"));
		usageTotal.setMaxSrcBps(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.MaxSrcBps"));
		usageTotal.setMaxSrcBpsTime(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.MaxSrcBpsTime"));
		usageTotal.setTotalAccess(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.TotalAccess"));
		usageTotal.setTotalTraffic(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageTotal.TotalTraffic"));
		describeVodDomainsUsageByDayResponse.setUsageTotal(usageTotal);

		List<UsageByDay> usageByDays = new ArrayList<UsageByDay>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainsUsageByDayResponse.UsageByDays.Length"); i++) {
			UsageByDay usageByDay = new UsageByDay();
			usageByDay.setTimeStamp(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].TimeStamp"));
			usageByDay.setQps(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].Qps"));
			usageByDay.setBytesHitRate(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].BytesHitRate"));
			usageByDay.setRequestHitRate(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].RequestHitRate"));
			usageByDay.setMaxBps(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxBps"));
			usageByDay.setMaxBpsTime(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxBpsTime"));
			usageByDay.setMaxSrcBps(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxSrcBps"));
			usageByDay.setMaxSrcBpsTime(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].MaxSrcBpsTime"));
			usageByDay.setTotalAccess(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].TotalAccess"));
			usageByDay.setTotalTraffic(context.stringValue("DescribeVodDomainsUsageByDayResponse.UsageByDays["+ i +"].TotalTraffic"));

			usageByDays.add(usageByDay);
		}
		describeVodDomainsUsageByDayResponse.setUsageByDays(usageByDays);
	 
	 	return describeVodDomainsUsageByDayResponse;
	}
}