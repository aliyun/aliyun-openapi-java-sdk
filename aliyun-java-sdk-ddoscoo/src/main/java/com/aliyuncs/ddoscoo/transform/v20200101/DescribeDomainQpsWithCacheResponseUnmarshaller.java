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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainQpsWithCacheResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainQpsWithCacheResponseUnmarshaller {

	public static DescribeDomainQpsWithCacheResponse unmarshall(DescribeDomainQpsWithCacheResponse describeDomainQpsWithCacheResponse, UnmarshallerContext _ctx) {
		
		describeDomainQpsWithCacheResponse.setRequestId(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.RequestId"));
		describeDomainQpsWithCacheResponse.setInterval(_ctx.integerValue("DescribeDomainQpsWithCacheResponse.Interval"));
		describeDomainQpsWithCacheResponse.setStartTime(_ctx.longValue("DescribeDomainQpsWithCacheResponse.StartTime"));

		List<String> totals = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.Totals.Length"); i++) {
			totals.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.Totals["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setTotals(totals);

		List<String> blocks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.Blocks.Length"); i++) {
			blocks.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.Blocks["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setBlocks(blocks);

		List<String> cacheHits = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.CacheHits.Length"); i++) {
			cacheHits.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.CacheHits["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setCacheHits(cacheHits);

		List<String> preciseBlocks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.PreciseBlocks.Length"); i++) {
			preciseBlocks.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.PreciseBlocks["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setPreciseBlocks(preciseBlocks);

		List<String> regionBlocks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.RegionBlocks.Length"); i++) {
			regionBlocks.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.RegionBlocks["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setRegionBlocks(regionBlocks);

		List<String> ipBlockQps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.IpBlockQps.Length"); i++) {
			ipBlockQps.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.IpBlockQps["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setIpBlockQps(ipBlockQps);

		List<String> ccJsQps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.CcJsQps.Length"); i++) {
			ccJsQps.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.CcJsQps["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setCcJsQps(ccJsQps);

		List<String> preciseJsQps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.PreciseJsQps.Length"); i++) {
			preciseJsQps.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.PreciseJsQps["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setPreciseJsQps(preciseJsQps);

		List<String> ccBlockQps = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsWithCacheResponse.CcBlockQps.Length"); i++) {
			ccBlockQps.add(_ctx.stringValue("DescribeDomainQpsWithCacheResponse.CcBlockQps["+ i +"]"));
		}
		describeDomainQpsWithCacheResponse.setCcBlockQps(ccBlockQps);
	 
	 	return describeDomainQpsWithCacheResponse;
	}
}