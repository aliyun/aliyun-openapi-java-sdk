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

	public static DescribeGtmAccessStrategyResponse unmarshall(DescribeGtmAccessStrategyResponse describeGtmAccessStrategyResponse, UnmarshallerContext _ctx) {
		
		describeGtmAccessStrategyResponse.setRequestId(_ctx.stringValue("DescribeGtmAccessStrategyResponse.RequestId"));
		describeGtmAccessStrategyResponse.setStrategyId(_ctx.stringValue("DescribeGtmAccessStrategyResponse.StrategyId"));
		describeGtmAccessStrategyResponse.setStrategyName(_ctx.stringValue("DescribeGtmAccessStrategyResponse.StrategyName"));
		describeGtmAccessStrategyResponse.setDefultAddrPoolId(_ctx.stringValue("DescribeGtmAccessStrategyResponse.DefultAddrPoolId"));
		describeGtmAccessStrategyResponse.setDefaultAddrPoolName(_ctx.stringValue("DescribeGtmAccessStrategyResponse.DefaultAddrPoolName"));
		describeGtmAccessStrategyResponse.setFailoverAddrPoolId(_ctx.stringValue("DescribeGtmAccessStrategyResponse.FailoverAddrPoolId"));
		describeGtmAccessStrategyResponse.setFailoverAddrPoolName(_ctx.stringValue("DescribeGtmAccessStrategyResponse.FailoverAddrPoolName"));
		describeGtmAccessStrategyResponse.setStrategyMode(_ctx.stringValue("DescribeGtmAccessStrategyResponse.StrategyMode"));
		describeGtmAccessStrategyResponse.setAccessMode(_ctx.stringValue("DescribeGtmAccessStrategyResponse.AccessMode"));
		describeGtmAccessStrategyResponse.setAccessStatus(_ctx.stringValue("DescribeGtmAccessStrategyResponse.AccessStatus"));
		describeGtmAccessStrategyResponse.setInstanceId(_ctx.stringValue("DescribeGtmAccessStrategyResponse.InstanceId"));

		List<Line> lines = new ArrayList<Line>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmAccessStrategyResponse.Lines.Length"); i++) {
			Line line = new Line();
			line.setLineCode(_ctx.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].LineCode"));
			line.setLineName(_ctx.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].LineName"));
			line.setGroupCode(_ctx.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].GroupCode"));
			line.setGroupName(_ctx.stringValue("DescribeGtmAccessStrategyResponse.Lines["+ i +"].GroupName"));

			lines.add(line);
		}
		describeGtmAccessStrategyResponse.setLines(lines);
	 
	 	return describeGtmAccessStrategyResponse;
	}
}