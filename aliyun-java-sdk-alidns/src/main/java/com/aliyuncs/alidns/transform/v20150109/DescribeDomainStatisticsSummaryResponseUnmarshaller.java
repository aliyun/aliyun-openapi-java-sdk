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

import com.aliyuncs.alidns.model.v20150109.DescribeDomainStatisticsSummaryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainStatisticsSummaryResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainStatisticsSummaryResponseUnmarshaller {

	public static DescribeDomainStatisticsSummaryResponse unmarshall(DescribeDomainStatisticsSummaryResponse describeDomainStatisticsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeDomainStatisticsSummaryResponse.setRequestId(_ctx.stringValue("DescribeDomainStatisticsSummaryResponse.RequestId"));
		describeDomainStatisticsSummaryResponse.setTotalItems(_ctx.integerValue("DescribeDomainStatisticsSummaryResponse.TotalItems"));
		describeDomainStatisticsSummaryResponse.setTotalPages(_ctx.integerValue("DescribeDomainStatisticsSummaryResponse.TotalPages"));
		describeDomainStatisticsSummaryResponse.setPageSize(_ctx.integerValue("DescribeDomainStatisticsSummaryResponse.PageSize"));
		describeDomainStatisticsSummaryResponse.setPageNumber(_ctx.integerValue("DescribeDomainStatisticsSummaryResponse.PageNumber"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainStatisticsSummaryResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setDomainName(_ctx.stringValue("DescribeDomainStatisticsSummaryResponse.Statistics["+ i +"].DomainName"));
			statistic.setCount(_ctx.longValue("DescribeDomainStatisticsSummaryResponse.Statistics["+ i +"].Count"));
			statistic.setDomainType(_ctx.stringValue("DescribeDomainStatisticsSummaryResponse.Statistics["+ i +"].DomainType"));

			statistics.add(statistic);
		}
		describeDomainStatisticsSummaryResponse.setStatistics(statistics);
	 
	 	return describeDomainStatisticsSummaryResponse;
	}
}