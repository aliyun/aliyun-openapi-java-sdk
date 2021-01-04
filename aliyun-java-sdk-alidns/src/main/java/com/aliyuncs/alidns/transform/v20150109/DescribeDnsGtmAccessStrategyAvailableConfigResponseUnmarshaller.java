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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyAvailableConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyAvailableConfigResponse.DomainAddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv4AddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv6AddrPool;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsGtmAccessStrategyAvailableConfigResponse.Line;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsGtmAccessStrategyAvailableConfigResponseUnmarshaller {

	public static DescribeDnsGtmAccessStrategyAvailableConfigResponse unmarshall(DescribeDnsGtmAccessStrategyAvailableConfigResponse describeDnsGtmAccessStrategyAvailableConfigResponse, UnmarshallerContext _ctx) {
		
		describeDnsGtmAccessStrategyAvailableConfigResponse.setRequestId(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.RequestId"));
		describeDnsGtmAccessStrategyAvailableConfigResponse.setSuggestSetDefaultLine(_ctx.booleanValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.SuggestSetDefaultLine"));

		List<Ipv4AddrPool> ipv4AddrPools = new ArrayList<Ipv4AddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv4AddrPools.Length"); i++) {
			Ipv4AddrPool ipv4AddrPool = new Ipv4AddrPool();
			ipv4AddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv4AddrPools["+ i +"].Id"));
			ipv4AddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv4AddrPools["+ i +"].Name"));
			ipv4AddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv4AddrPools["+ i +"].AddrCount"));

			ipv4AddrPools.add(ipv4AddrPool);
		}
		describeDnsGtmAccessStrategyAvailableConfigResponse.setIpv4AddrPools(ipv4AddrPools);

		List<Line> lines = new ArrayList<Line>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Lines.Length"); i++) {
			Line line = new Line();
			line.setLineCode(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].LineCode"));
			line.setLineName(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].LineName"));
			line.setGroupCode(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].GroupCode"));
			line.setGroupName(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].GroupName"));
			line.setFatherCode(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Lines["+ i +"].FatherCode"));

			lines.add(line);
		}
		describeDnsGtmAccessStrategyAvailableConfigResponse.setLines(lines);

		List<Ipv6AddrPool> ipv6AddrPools = new ArrayList<Ipv6AddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv6AddrPools.Length"); i++) {
			Ipv6AddrPool ipv6AddrPool = new Ipv6AddrPool();
			ipv6AddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv6AddrPools["+ i +"].Id"));
			ipv6AddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv6AddrPools["+ i +"].Name"));
			ipv6AddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.Ipv6AddrPools["+ i +"].AddrCount"));

			ipv6AddrPools.add(ipv6AddrPool);
		}
		describeDnsGtmAccessStrategyAvailableConfigResponse.setIpv6AddrPools(ipv6AddrPools);

		List<DomainAddrPool> domainAddrPools = new ArrayList<DomainAddrPool>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.DomainAddrPools.Length"); i++) {
			DomainAddrPool domainAddrPool = new DomainAddrPool();
			domainAddrPool.setId(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.DomainAddrPools["+ i +"].Id"));
			domainAddrPool.setName(_ctx.stringValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.DomainAddrPools["+ i +"].Name"));
			domainAddrPool.setAddrCount(_ctx.integerValue("DescribeDnsGtmAccessStrategyAvailableConfigResponse.DomainAddrPools["+ i +"].AddrCount"));

			domainAddrPools.add(domainAddrPool);
		}
		describeDnsGtmAccessStrategyAvailableConfigResponse.setDomainAddrPools(domainAddrPools);
	 
	 	return describeDnsGtmAccessStrategyAvailableConfigResponse;
	}
}