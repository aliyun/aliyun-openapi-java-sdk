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

import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategyAvailableConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategyAvailableConfigResponse.AddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmAccessStrategyAvailableConfigResponse.Line;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmAccessStrategyAvailableConfigResponseUnmarshaller {

	public static DescribeGtmAccessStrategyAvailableConfigResponse unmarshall(DescribeGtmAccessStrategyAvailableConfigResponse describeGtmAccessStrategyAvailableConfigResponse, UnmarshallerContext _ctx) {
		
		describeGtmAccessStrategyAvailableConfigResponse.setRequestId(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.RequestId"));

		List<AddrPool> addrPools = new ArrayList<AddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmAccessStrategyAvailableConfigResponse.AddrPools.Length"); i++) {
			AddrPool addrPool = new AddrPool();
			addrPool.setAddrPoolId(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.AddrPools["+ i +"].AddrPoolId"));
			addrPool.setAddrPoolName(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.AddrPools["+ i +"].AddrPoolName"));

			addrPools.add(addrPool);
		}
		describeGtmAccessStrategyAvailableConfigResponse.setAddrPools(addrPools);

		List<Line> lines = new ArrayList<Line>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmAccessStrategyAvailableConfigResponse.Lines.Length"); i++) {
			Line line = new Line();
			line.setLineCode(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].LineCode"));
			line.setLineName(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].LineName"));
			line.setGroupCode(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].GroupCode"));
			line.setGroupName(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].GroupName"));
			line.setStatus(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].Status"));
			line.setFatherCode(_ctx.stringValue("DescribeGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].FatherCode"));

			lines.add(line);
		}
		describeGtmAccessStrategyAvailableConfigResponse.setLines(lines);
	 
	 	return describeGtmAccessStrategyAvailableConfigResponse;
	}
}