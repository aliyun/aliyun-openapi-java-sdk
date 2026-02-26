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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategiesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategiesResponse.Strategy;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategiesResponse.Strategy.EffectiveAddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategiesResponse.Strategy.Line;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmAccessStrategiesResponseUnmarshaller {

	public static DescribeDnsGtmAccessStrategiesResponse unmarshall(DescribeDnsGtmAccessStrategiesResponse describeDnsGtmAccessStrategiesResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmAccessStrategiesResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.RequestId"));
		describeDnsGtmAccessStrategiesResponse.setPageSize(_ctx.integerValue("DescribeDnsGtmAccessStrategiesResponse.PageSize"));
		describeDnsGtmAccessStrategiesResponse.setPageNumber(_ctx.integerValue("DescribeDnsGtmAccessStrategiesResponse.PageNumber"));
		describeDnsGtmAccessStrategiesResponse.setTotalPages(_ctx.integerValue("DescribeDnsGtmAccessStrategiesResponse.TotalPages"));
		describeDnsGtmAccessStrategiesResponse.setTotalItems(_ctx.integerValue("DescribeDnsGtmAccessStrategiesResponse.TotalItems"));

		List<Strategy> strategies = new ArrayList<Strategy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategiesResponse.Strategies.Length"); i++) {
			Strategy strategy = new Strategy();
			strategy.setEffectiveLbaStrategy(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveLbaStrategy"));
			strategy.setStrategyId(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyId"));
			strategy.setStrategyName(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].StrategyName"));
			strategy.setEffectiveAddrPoolGroupType(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveAddrPoolGroupType"));
			strategy.setCreateTime(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].CreateTime"));
			strategy.setCreateTimestamp(_ctx.longValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].CreateTimestamp"));
			strategy.setEffectiveAddrPoolType(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveAddrPoolType"));

			List<EffectiveAddrPool> effectiveAddrPools = new ArrayList<EffectiveAddrPool>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveAddrPools.Length"); j++) {
				EffectiveAddrPool effectiveAddrPool = new EffectiveAddrPool();
				effectiveAddrPool.setLbaWeight(_ctx.integerValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveAddrPools["+ j +"].LbaWeight"));
				effectiveAddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveAddrPools["+ j +"].Name"));
				effectiveAddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveAddrPools["+ j +"].AddrCount"));
				effectiveAddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].EffectiveAddrPools["+ j +"].Id"));

				effectiveAddrPools.add(effectiveAddrPool);
			}
			strategy.setEffectiveAddrPools(effectiveAddrPools);

			List<Line> lines = new ArrayList<Line>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].Lines.Length"); j++) {
				Line line = new Line();
				line.setGroupName(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].GroupName"));
				line.setLineCode(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].LineCode"));
				line.setLineName(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].LineName"));
				line.setGroupCode(_ctx.stringValue("DescribeDnsGtmAccessStrategiesResponse.Strategies["+ i +"].Lines["+ j +"].GroupCode"));

				lines.add(line);
			}
			strategy.setLines(lines);

			strategies.add(strategy);
		}
		describeDnsGtmAccessStrategiesResponse.setStrategies(strategies);
	 
	 	return describeDnsGtmAccessStrategiesResponse;
	}
}