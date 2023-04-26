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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeInstancePerformanceRestrictHistoryResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeInstancePerformanceRestrictHistoryResponse.PerformanceRestrictHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancePerformanceRestrictHistoryResponseUnmarshaller {

	public static DescribeInstancePerformanceRestrictHistoryResponse unmarshall(DescribeInstancePerformanceRestrictHistoryResponse describeInstancePerformanceRestrictHistoryResponse, UnmarshallerContext _ctx) {
		
		describeInstancePerformanceRestrictHistoryResponse.setRequestId(_ctx.stringValue("DescribeInstancePerformanceRestrictHistoryResponse.RequestId"));
		describeInstancePerformanceRestrictHistoryResponse.setPageSize(_ctx.integerValue("DescribeInstancePerformanceRestrictHistoryResponse.PageSize"));
		describeInstancePerformanceRestrictHistoryResponse.setPageNumber(_ctx.integerValue("DescribeInstancePerformanceRestrictHistoryResponse.PageNumber"));
		describeInstancePerformanceRestrictHistoryResponse.setTotalCount(_ctx.integerValue("DescribeInstancePerformanceRestrictHistoryResponse.TotalCount"));

		List<PerformanceRestrictHistory> performanceRestrictHistories = new ArrayList<PerformanceRestrictHistory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancePerformanceRestrictHistoryResponse.PerformanceRestrictHistories.Length"); i++) {
			PerformanceRestrictHistory performanceRestrictHistory = new PerformanceRestrictHistory();
			performanceRestrictHistory.setInstanceId(_ctx.stringValue("DescribeInstancePerformanceRestrictHistoryResponse.PerformanceRestrictHistories["+ i +"].InstanceId"));

			List<String> intervals = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancePerformanceRestrictHistoryResponse.PerformanceRestrictHistories["+ i +"].Intervals.Length"); j++) {
				intervals.add(_ctx.stringValue("DescribeInstancePerformanceRestrictHistoryResponse.PerformanceRestrictHistories["+ i +"].Intervals["+ j +"]"));
			}
			performanceRestrictHistory.setIntervals(intervals);

			performanceRestrictHistories.add(performanceRestrictHistory);
		}
		describeInstancePerformanceRestrictHistoryResponse.setPerformanceRestrictHistories(performanceRestrictHistories);
	 
	 	return describeInstancePerformanceRestrictHistoryResponse;
	}
}