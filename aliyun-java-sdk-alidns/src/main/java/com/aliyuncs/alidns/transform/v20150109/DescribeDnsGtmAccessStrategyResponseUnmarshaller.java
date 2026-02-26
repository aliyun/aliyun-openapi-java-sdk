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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyResponse.DefaultAddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyResponse.FailoverAddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyResponse.Line;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmAccessStrategyResponseUnmarshaller {

	public static DescribeDnsGtmAccessStrategyResponse unmarshall(DescribeDnsGtmAccessStrategyResponse describeDnsGtmAccessStrategyResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmAccessStrategyResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.RequestId"));
		describeDnsGtmAccessStrategyResponse.setFailoverMinAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverMinAvailableAddrNum"));
		describeDnsGtmAccessStrategyResponse.setDefaultAddrPoolType(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPoolType"));
		describeDnsGtmAccessStrategyResponse.setDefaultAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultAvailableAddrNum"));
		describeDnsGtmAccessStrategyResponse.setStrategyId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.StrategyId"));
		describeDnsGtmAccessStrategyResponse.setFailoverAddrPoolGroupStatus(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPoolGroupStatus"));
		describeDnsGtmAccessStrategyResponse.setFailoverAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverAvailableAddrNum"));
		describeDnsGtmAccessStrategyResponse.setFailoverLbaStrategy(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverLbaStrategy"));
		describeDnsGtmAccessStrategyResponse.setDefaultMaxReturnAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultMaxReturnAddrNum"));
		describeDnsGtmAccessStrategyResponse.setStrategyMode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.StrategyMode"));
		describeDnsGtmAccessStrategyResponse.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmAccessStrategyResponse.CreateTimestamp"));
		describeDnsGtmAccessStrategyResponse.setDefaultLbaStrategy(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultLbaStrategy"));
		describeDnsGtmAccessStrategyResponse.setDefaultAddrPoolGroupStatus(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPoolGroupStatus"));
		describeDnsGtmAccessStrategyResponse.setFailoverAddrPoolType(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPoolType"));
		describeDnsGtmAccessStrategyResponse.setInstanceId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.InstanceId"));
		describeDnsGtmAccessStrategyResponse.setDefaultLatencyOptimization(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultLatencyOptimization"));
		describeDnsGtmAccessStrategyResponse.setEffectiveAddrPoolGroupType(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.EffectiveAddrPoolGroupType"));
		describeDnsGtmAccessStrategyResponse.setCreateTime(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.CreateTime"));
		describeDnsGtmAccessStrategyResponse.setDefaultMinAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultMinAvailableAddrNum"));
		describeDnsGtmAccessStrategyResponse.setFailoverLatencyOptimization(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverLatencyOptimization"));
		describeDnsGtmAccessStrategyResponse.setStrategyName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.StrategyName"));
		describeDnsGtmAccessStrategyResponse.setFailoverMaxReturnAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverMaxReturnAddrNum"));
		describeDnsGtmAccessStrategyResponse.setAccessMode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.AccessMode"));

		List<FailoverAddrPool> failoverAddrPools = new ArrayList<FailoverAddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools.Length"); i++) {
			FailoverAddrPool failoverAddrPool = new FailoverAddrPool();
			failoverAddrPool.setLbaWeight(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].LbaWeight"));
			failoverAddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].Name"));
			failoverAddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].AddrCount"));
			failoverAddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].Id"));

			failoverAddrPools.add(failoverAddrPool);
		}
		describeDnsGtmAccessStrategyResponse.setFailoverAddrPools(failoverAddrPools);

		List<DefaultAddrPool> defaultAddrPools = new ArrayList<DefaultAddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools.Length"); i++) {
			DefaultAddrPool defaultAddrPool = new DefaultAddrPool();
			defaultAddrPool.setLbaWeight(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].LbaWeight"));
			defaultAddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].Name"));
			defaultAddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].AddrCount"));
			defaultAddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].Id"));

			defaultAddrPools.add(defaultAddrPool);
		}
		describeDnsGtmAccessStrategyResponse.setDefaultAddrPools(defaultAddrPools);

		List<Line> lines = new ArrayList<Line>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyResponse.Lines.Length"); i++) {
			Line line = new Line();
			line.setGroupName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].GroupName"));
			line.setLineCode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].LineCode"));
			line.setLineName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].LineName"));
			line.setGroupCode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].GroupCode"));

			lines.add(line);
		}
		describeDnsGtmAccessStrategyResponse.setLines(lines);
	 
	 	return describeDnsGtmAccessStrategyResponse;
	}
}