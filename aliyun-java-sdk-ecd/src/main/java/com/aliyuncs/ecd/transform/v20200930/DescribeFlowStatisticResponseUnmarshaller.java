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

import com.aliyuncs.ecd.model.v20200930.DescribeFlowStatisticResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeFlowStatisticResponse.FlowStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowStatisticResponseUnmarshaller {

	public static DescribeFlowStatisticResponse unmarshall(DescribeFlowStatisticResponse describeFlowStatisticResponse, UnmarshallerContext _ctx) {
		
		describeFlowStatisticResponse.setRequestId(_ctx.stringValue("DescribeFlowStatisticResponse.RequestId"));
		describeFlowStatisticResponse.setDesktopCount(_ctx.integerValue("DescribeFlowStatisticResponse.DesktopCount"));

		List<FlowStatistic> desktopFlowStatistic = new ArrayList<FlowStatistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowStatisticResponse.DesktopFlowStatistic.Length"); i++) {
			FlowStatistic flowStatistic = new FlowStatistic();
			flowStatistic.setDesktopName(_ctx.stringValue("DescribeFlowStatisticResponse.DesktopFlowStatistic["+ i +"].DesktopName"));
			flowStatistic.setDesktopId(_ctx.stringValue("DescribeFlowStatisticResponse.DesktopFlowStatistic["+ i +"].DesktopId"));
			flowStatistic.setFlowRank(_ctx.integerValue("DescribeFlowStatisticResponse.DesktopFlowStatistic["+ i +"].FlowRank"));
			flowStatistic.setFlowIn(_ctx.stringValue("DescribeFlowStatisticResponse.DesktopFlowStatistic["+ i +"].FlowIn"));

			desktopFlowStatistic.add(flowStatistic);
		}
		describeFlowStatisticResponse.setDesktopFlowStatistic(desktopFlowStatistic);
	 
	 	return describeFlowStatisticResponse;
	}
}