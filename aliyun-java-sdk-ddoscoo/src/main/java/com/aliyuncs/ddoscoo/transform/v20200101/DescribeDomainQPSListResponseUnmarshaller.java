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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainQPSListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainQPSListResponse.DomainQPS;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainQPSListResponseUnmarshaller {

	public static DescribeDomainQPSListResponse unmarshall(DescribeDomainQPSListResponse describeDomainQPSListResponse, UnmarshallerContext _ctx) {
		
		describeDomainQPSListResponse.setRequestId(_ctx.stringValue("DescribeDomainQPSListResponse.RequestId"));

		List<DomainQPS> domainQPSList = new ArrayList<DomainQPS>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQPSListResponse.DomainQPSList.Length"); i++) {
			DomainQPS domainQPS = new DomainQPS();
			domainQPS.setMaxQps(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].MaxQps"));
			domainQPS.setMaxAttackQps(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].MaxAttackQps"));
			domainQPS.setMaxNormalQps(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].MaxNormalQps"));
			domainQPS.setAttackQps(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].AttackQps"));
			domainQPS.setTotalQps(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].TotalQps"));
			domainQPS.setCacheHits(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].CacheHits"));
			domainQPS.setTotalCount(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].TotalCount"));
			domainQPS.setIndex(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].Index"));
			domainQPS.setTime(_ctx.longValue("DescribeDomainQPSListResponse.DomainQPSList["+ i +"].Time"));

			domainQPSList.add(domainQPS);
		}
		describeDomainQPSListResponse.setDomainQPSList(domainQPSList);
	 
	 	return describeDomainQPSListResponse;
	}
}