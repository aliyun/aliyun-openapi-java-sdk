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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeVulFixStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVulFixStatisticsResponse.Fix;
import com.aliyuncs.sas.model.v20181203.DescribeVulFixStatisticsResponse.FixTotal;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVulFixStatisticsResponseUnmarshaller {

	public static DescribeVulFixStatisticsResponse unmarshall(DescribeVulFixStatisticsResponse describeVulFixStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeVulFixStatisticsResponse.setRequestId(_ctx.stringValue("DescribeVulFixStatisticsResponse.RequestId"));

		FixTotal fixTotal = new FixTotal();
		fixTotal.setFixingNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixTotal.FixingNum"));
		fixTotal.setFixedTodayNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixTotal.FixedTodayNum"));
		fixTotal.setFixedTotalNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixTotal.FixedTotalNum"));
		fixTotal.setNeedFixNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixTotal.NeedFixNum"));
		describeVulFixStatisticsResponse.setFixTotal(fixTotal);

		List<Fix> fixStat = new ArrayList<Fix>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVulFixStatisticsResponse.FixStat.Length"); i++) {
			Fix fix = new Fix();
			fix.setFixingNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixStat["+ i +"].FixingNum"));
			fix.setType(_ctx.stringValue("DescribeVulFixStatisticsResponse.FixStat["+ i +"].Type"));
			fix.setFixedTodayNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixStat["+ i +"].FixedTodayNum"));
			fix.setFixedTotalNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixStat["+ i +"].FixedTotalNum"));
			fix.setNeedFixNum(_ctx.integerValue("DescribeVulFixStatisticsResponse.FixStat["+ i +"].NeedFixNum"));

			fixStat.add(fix);
		}
		describeVulFixStatisticsResponse.setFixStat(fixStat);
	 
	 	return describeVulFixStatisticsResponse;
	}
}