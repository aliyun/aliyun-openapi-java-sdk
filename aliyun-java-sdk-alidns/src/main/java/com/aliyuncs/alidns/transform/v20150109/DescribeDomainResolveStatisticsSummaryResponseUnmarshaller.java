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

import com.aliyuncs.alidns.model.v20150109.DescribeDomainResolveStatisticsSummaryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainResolveStatisticsSummaryResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainResolveStatisticsSummaryResponseUnmarshaller {

	public static DescribeDomainResolveStatisticsSummaryResponse unmarshall(DescribeDomainResolveStatisticsSummaryResponse describeDomainResolveStatisticsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeDomainResolveStatisticsSummaryResponse.setRequestId(_ctx.stringValue("DescribeDomainResolveStatisticsSummaryResponse.RequestId"));
		describeDomainResolveStatisticsSummaryResponse.setPageSize(_ctx.integerValue("DescribeDomainResolveStatisticsSummaryResponse.PageSize"));
		describeDomainResolveStatisticsSummaryResponse.setPageNumber(_ctx.integerValue("DescribeDomainResolveStatisticsSummaryResponse.PageNumber"));
		describeDomainResolveStatisticsSummaryResponse.setTotalPages(_ctx.integerValue("DescribeDomainResolveStatisticsSummaryResponse.TotalPages"));
		describeDomainResolveStatisticsSummaryResponse.setTotalItems(_ctx.integerValue("DescribeDomainResolveStatisticsSummaryResponse.TotalItems"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainResolveStatisticsSummaryResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setDomainName(_ctx.stringValue("DescribeDomainResolveStatisticsSummaryResponse.Statistics["+ i +"].DomainName"));
			statistic.setCount(_ctx.stringValue("DescribeDomainResolveStatisticsSummaryResponse.Statistics["+ i +"].Count"));
			statistic.setDomainType(_ctx.stringValue("DescribeDomainResolveStatisticsSummaryResponse.Statistics["+ i +"].DomainType"));

			statistics.add(statistic);
		}
		describeDomainResolveStatisticsSummaryResponse.setStatistics(statistics);
	 
	 	return describeDomainResolveStatisticsSummaryResponse;
	}
}