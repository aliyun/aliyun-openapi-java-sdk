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

import com.aliyuncs.alidns.model.v20150109.DescribeDohDomainStatisticsSummaryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDohDomainStatisticsSummaryResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDohDomainStatisticsSummaryResponseUnmarshaller {

	public static DescribeDohDomainStatisticsSummaryResponse unmarshall(DescribeDohDomainStatisticsSummaryResponse describeDohDomainStatisticsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeDohDomainStatisticsSummaryResponse.setRequestId(_ctx.stringValue("DescribeDohDomainStatisticsSummaryResponse.RequestId"));
		describeDohDomainStatisticsSummaryResponse.setTotalItems(_ctx.integerValue("DescribeDohDomainStatisticsSummaryResponse.TotalItems"));
		describeDohDomainStatisticsSummaryResponse.setTotalPages(_ctx.integerValue("DescribeDohDomainStatisticsSummaryResponse.TotalPages"));
		describeDohDomainStatisticsSummaryResponse.setPageSize(_ctx.integerValue("DescribeDohDomainStatisticsSummaryResponse.PageSize"));
		describeDohDomainStatisticsSummaryResponse.setPageNumber(_ctx.integerValue("DescribeDohDomainStatisticsSummaryResponse.PageNumber"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDohDomainStatisticsSummaryResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setDomainName(_ctx.stringValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].DomainName"));
			statistic.setV4HttpCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].V4HttpCount"));
			statistic.setV6HttpCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].V6HttpCount"));
			statistic.setV4HttpsCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].V4HttpsCount"));
			statistic.setV6HttpsCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].V6HttpsCount"));
			statistic.setTotalCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].TotalCount"));
			statistic.setIpCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].IpCount"));
			statistic.setHttpCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].HttpCount"));
			statistic.setHttpsCount(_ctx.longValue("DescribeDohDomainStatisticsSummaryResponse.Statistics["+ i +"].HttpsCount"));

			statistics.add(statistic);
		}
		describeDohDomainStatisticsSummaryResponse.setStatistics(statistics);
	 
	 	return describeDohDomainStatisticsSummaryResponse;
	}
}