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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseCountStatisticsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseCountStatisticsResponse.DefenseCountStatistics;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.HkResourcePackageDetail;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.UnlimitedResourcePackageDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDefenseCountStatisticsResponseUnmarshaller {

	public static DescribeDefenseCountStatisticsResponse unmarshall(DescribeDefenseCountStatisticsResponse describeDefenseCountStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeDefenseCountStatisticsResponse.setRequestId(_ctx.stringValue("DescribeDefenseCountStatisticsResponse.RequestId"));

		DefenseCountStatistics defenseCountStatistics = new DefenseCountStatistics();
		defenseCountStatistics.setFlowPackCountRemain(_ctx.integerValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.FlowPackCountRemain"));
		defenseCountStatistics.setMaxUsableDefenseCountCurrentMonth(_ctx.integerValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.MaxUsableDefenseCountCurrentMonth"));
		defenseCountStatistics.setDefenseCountTotalUsageOfCurrentMonth(_ctx.integerValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.DefenseCountTotalUsageOfCurrentMonth"));
		defenseCountStatistics.setSecHighSpeedCountRemain(_ctx.integerValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.SecHighSpeedCountRemain"));

		List<HkResourcePackageDetail> hkPackageDetail = new ArrayList<HkResourcePackageDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.HkPackageDetail.Length"); i++) {
			HkResourcePackageDetail hkResourcePackageDetail = new HkResourcePackageDetail();
			hkResourcePackageDetail.setEndTime(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.HkPackageDetail["+ i +"].EndTime"));
			hkResourcePackageDetail.setStartTime(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.HkPackageDetail["+ i +"].StartTime"));
			hkResourcePackageDetail.setBuyNum(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.HkPackageDetail["+ i +"].BuyNum"));
			hkResourcePackageDetail.setUsedNum(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.HkPackageDetail["+ i +"].UsedNum"));

			hkPackageDetail.add(hkResourcePackageDetail);
		}
		defenseCountStatistics.setHkPackageDetail(hkPackageDetail);

		List<UnlimitedResourcePackageDetail> unlimitedPackageDetail = new ArrayList<UnlimitedResourcePackageDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.UnlimitedPackageDetail.Length"); i++) {
			UnlimitedResourcePackageDetail unlimitedResourcePackageDetail = new UnlimitedResourcePackageDetail();
			unlimitedResourcePackageDetail.setEndTime(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.UnlimitedPackageDetail["+ i +"].EndTime"));
			unlimitedResourcePackageDetail.setStartTime(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.UnlimitedPackageDetail["+ i +"].StartTime"));
			unlimitedResourcePackageDetail.setBuyNum(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.UnlimitedPackageDetail["+ i +"].BuyNum"));
			unlimitedResourcePackageDetail.setUsedNum(_ctx.longValue("DescribeDefenseCountStatisticsResponse.DefenseCountStatistics.UnlimitedPackageDetail["+ i +"].UsedNum"));

			unlimitedPackageDetail.add(unlimitedResourcePackageDetail);
		}
		defenseCountStatistics.setUnlimitedPackageDetail(unlimitedPackageDetail);
		describeDefenseCountStatisticsResponse.setDefenseCountStatistics(defenseCountStatistics);
	 
	 	return describeDefenseCountStatisticsResponse;
	}
}