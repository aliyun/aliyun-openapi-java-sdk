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
		describeDnsGtmAccessStrategyResponse.setStrategyId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.StrategyId"));
		describeDnsGtmAccessStrategyResponse.setStrategyName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.StrategyName"));
		describeDnsGtmAccessStrategyResponse.setStrategyMode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.StrategyMode"));
		describeDnsGtmAccessStrategyResponse.setInstanceId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.InstanceId"));
		describeDnsGtmAccessStrategyResponse.setDefaultAddrPoolType(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPoolType"));
		describeDnsGtmAccessStrategyResponse.setDefaultLbaStrategy(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultLbaStrategy"));
		describeDnsGtmAccessStrategyResponse.setDefaultMinAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultMinAvailableAddrNum"));
		describeDnsGtmAccessStrategyResponse.setDefaultMaxReturnAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultMaxReturnAddrNum"));
		describeDnsGtmAccessStrategyResponse.setDefaultLatencyOptimization(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultLatencyOptimization"));
		describeDnsGtmAccessStrategyResponse.setDefaultAddrPoolGroupStatus(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPoolGroupStatus"));
		describeDnsGtmAccessStrategyResponse.setFailoverAddrPoolType(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPoolType"));
		describeDnsGtmAccessStrategyResponse.setFailoverLbaStrategy(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverLbaStrategy"));
		describeDnsGtmAccessStrategyResponse.setFailoverMinAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverMinAvailableAddrNum"));
		describeDnsGtmAccessStrategyResponse.setFailoverMaxReturnAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverMaxReturnAddrNum"));
		describeDnsGtmAccessStrategyResponse.setFailoverLatencyOptimization(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverLatencyOptimization"));
		describeDnsGtmAccessStrategyResponse.setFailoverAddrPoolGroupStatus(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPoolGroupStatus"));
		describeDnsGtmAccessStrategyResponse.setAccessMode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.AccessMode"));
		describeDnsGtmAccessStrategyResponse.setEffectiveAddrPoolGroupType(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.EffectiveAddrPoolGroupType"));
		describeDnsGtmAccessStrategyResponse.setCreateTime(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.CreateTime"));
		describeDnsGtmAccessStrategyResponse.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmAccessStrategyResponse.CreateTimestamp"));
		describeDnsGtmAccessStrategyResponse.setDefaultAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultAvailableAddrNum"));
		describeDnsGtmAccessStrategyResponse.setFailoverAvailableAddrNum(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverAvailableAddrNum"));

		List<Line> lines = new ArrayList<Line>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyResponse.Lines.Length"); i++) {
			Line line = new Line();
			line.setLineCode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].LineCode"));
			line.setLineName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].LineName"));
			line.setGroupCode(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].GroupCode"));
			line.setGroupName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.Lines["+ i +"].GroupName"));

			lines.add(line);
		}
		describeDnsGtmAccessStrategyResponse.setLines(lines);

		List<DefaultAddrPool> defaultAddrPools = new ArrayList<DefaultAddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools.Length"); i++) {
			DefaultAddrPool defaultAddrPool = new DefaultAddrPool();
			defaultAddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].Id"));
			defaultAddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].Name"));
			defaultAddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].AddrCount"));
			defaultAddrPool.setLbaWeight(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.DefaultAddrPools["+ i +"].LbaWeight"));

			defaultAddrPools.add(defaultAddrPool);
		}
		describeDnsGtmAccessStrategyResponse.setDefaultAddrPools(defaultAddrPools);

		List<FailoverAddrPool> failoverAddrPools = new ArrayList<FailoverAddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools.Length"); i++) {
			FailoverAddrPool failoverAddrPool = new FailoverAddrPool();
			failoverAddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].Id"));
			failoverAddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].Name"));
			failoverAddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].AddrCount"));
			failoverAddrPool.setLbaWeight(_ctx.integerValue("DescribeDnsGtmAccessStrategyResponse.FailoverAddrPools["+ i +"].LbaWeight"));

			failoverAddrPools.add(failoverAddrPool);
		}
		describeDnsGtmAccessStrategyResponse.setFailoverAddrPools(failoverAddrPools);
	 
	 	return describeDnsGtmAccessStrategyResponse;
	}
}