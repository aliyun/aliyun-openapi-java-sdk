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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeRegionBandwidthQuotaResponse;
import com.aliyuncs.ens.model.v20171110.DescribeRegionBandwidthQuotaResponse.带宽配额;
import com.aliyuncs.ens.model.v20171110.DescribeRegionBandwidthQuotaResponse.带宽配额.实例信息;
import com.aliyuncs.ens.model.v20171110.DescribeRegionBandwidthQuotaResponse.带宽配额.带宽信息;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRegionBandwidthQuotaResponseUnmarshaller {

	public static DescribeRegionBandwidthQuotaResponse unmarshall(DescribeRegionBandwidthQuotaResponse describeRegionBandwidthQuotaResponse, UnmarshallerContext _ctx) {
		
		describeRegionBandwidthQuotaResponse.setRequestId(_ctx.stringValue("DescribeRegionBandwidthQuotaResponse.RequestId"));

		List<带宽配额> bandwidthQuota = new ArrayList<带宽配额>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota.Length"); i++) {
			带宽配额 带宽配额 = new 带宽配额();
			带宽配额.setRegionId(_ctx.stringValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].RegionId"));
			带宽配额.setDate(_ctx.stringValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].Date"));

			List<实例信息> instanceInfo = new ArrayList<实例信息>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].InstanceInfo.Length"); j++) {
				实例信息 实例信息 = new 实例信息();
				实例信息.setInstanceSpec(_ctx.stringValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].InstanceInfo["+ j +"].InstanceSpec"));
				实例信息.setInstanceNumber(_ctx.longValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].InstanceInfo["+ j +"].InstanceNumber"));

				instanceInfo.add(实例信息);
			}
			带宽配额.setInstanceInfo(instanceInfo);

			List<带宽信息> bandwidthInfo = new ArrayList<带宽信息>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].BandwidthInfo.Length"); j++) {
				带宽信息 带宽信息 = new 带宽信息();
				带宽信息.setMonthMax(_ctx.longValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].BandwidthInfo["+ j +"].MonthMax"));
				带宽信息.setWeekMax(_ctx.longValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].BandwidthInfo["+ j +"].WeekMax"));
				带宽信息.setMonthAverageQuota(_ctx.longValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].BandwidthInfo["+ j +"].MonthAverageQuota"));
				带宽信息.setWeekAverageQuota(_ctx.longValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].BandwidthInfo["+ j +"].WeekAverageQuota"));
				带宽信息.setIsp(_ctx.stringValue("DescribeRegionBandwidthQuotaResponse.BandwidthQuota["+ i +"].BandwidthInfo["+ j +"].Isp"));

				bandwidthInfo.add(带宽信息);
			}
			带宽配额.setBandwidthInfo(bandwidthInfo);

			bandwidthQuota.add(带宽配额);
		}
		describeRegionBandwidthQuotaResponse.setBandwidthQuota(bandwidthQuota);
	 
	 	return describeRegionBandwidthQuotaResponse;
	}
}