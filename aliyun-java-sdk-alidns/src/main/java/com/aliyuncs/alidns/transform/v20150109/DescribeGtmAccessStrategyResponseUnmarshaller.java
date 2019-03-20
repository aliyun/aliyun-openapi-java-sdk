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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategyResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategyResponse.Line;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmAccessStrategyResponseUnmarshaller {

	public static DescribeGtmAccessStrategyResponse unmarshall(DescribeGtmAccessStrategyResponse describeGtmAccessStrategyResponse, UnmarshallerContext context) {
		
		describeGtmAccessStrategyResponse.setRequestId(context.stringValue("DescribeGtmAccessStrategyResponse.RequestId"));
		describeGtmAccessStrategyResponse.setStrategyId(context.stringValue("DescribeGtmAccessStrategyResponse.StrategyId"));
		describeGtmAccessStrategyResponse.setStrategyName(context.stringValue("DescribeGtmAccessStrategyResponse.StrategyName"));
		describeGtmAccessStrategyResponse.setDefultAddrPoolId(context.stringValue("DescribeGtmAccessStrategyResponse.DefultAddrPoolId"));
		describeGtmAccessStrategyResponse.setDefaultAddrPoolName(context.stringValue("DescribeGtmAccessStrategyResponse.DefaultAddrPoolName"));
		describeGtmAccessStrategyResponse.setFailoverAddrPoolId(context.stringValue("DescribeGtmAccessStrategyResponse.FailoverAddrPoolId"));
		describeGtmAccessStrategyResponse.setFailoverAddrPoolName(context.stringValue("DescribeGtmAccessStrategyResponse.FailoverAddrPoolName"));
		describeGtmAccessStrategyResponse.setStrategyMode(context.stringValue("DescribeGtmAccessStrategyResponse.StrategyMode"));
		describeGtmAccessStrategyResponse.setAccessMode(context.stringValue("DescribeGtmAccessStrategyResponse.AccessMode"));
		describeGtmAccessStrategyResponse.setAccessStatus(context.stringValue("DescribeGtmAccessStrategyResponse.AccessStatus"));
		describeGtmAccessStrategyResponse.setInstanceId(context.stringValue("DescribeGtmAccessStrategyResponse.InstanceId"));

		List<Line> lines = new ArrayList<Line>();
		for (int i = 0; i < context.lengthValue("DescribeGtmAccessStrategyResponse.Lines.Length"); i++) {
			Line line = new Line();
			line.setLineCode(context.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].LineCode"));
			line.setLineName(context.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].LineName"));
			line.setGroupCode(context.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].GroupCode"));
			line.setGroupName(context.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].GroupName"));

			lines.add(line);
		}
		describeGtmAccessStrategyResponse.setLines(lines);
	 
	 	return describeGtmAccessStrategyResponse;
	}
}