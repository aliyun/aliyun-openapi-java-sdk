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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeSessionStatisticResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeSessionStatisticResponse.StatisticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSessionStatisticResponseUnmarshaller {

	public static DescribeSessionStatisticResponse unmarshall(DescribeSessionStatisticResponse describeSessionStatisticResponse, UnmarshallerContext _ctx) {
		
		describeSessionStatisticResponse.setRequestId(_ctx.stringValue("DescribeSessionStatisticResponse.RequestId"));
		describeSessionStatisticResponse.setTotalCount(_ctx.stringValue("DescribeSessionStatisticResponse.TotalCount"));

		List<StatisticItem> statistic = new ArrayList<StatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSessionStatisticResponse.Statistic.Length"); i++) {
			StatisticItem statisticItem = new StatisticItem();
			statisticItem.setTimePoint(_ctx.longValue("DescribeSessionStatisticResponse.Statistic["+ i +"].TimePoint"));
			statisticItem.setCount(_ctx.longValue("DescribeSessionStatisticResponse.Statistic["+ i +"].Count"));

			statistic.add(statisticItem);
		}
		describeSessionStatisticResponse.setStatistic(statistic);
	 
	 	return describeSessionStatisticResponse;
	}
}