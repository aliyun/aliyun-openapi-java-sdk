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

import com.aliyuncs.alidns.model.v20150109.DescribeDohSubDomainStatisticsSummaryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDohSubDomainStatisticsSummaryResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDohSubDomainStatisticsSummaryResponseUnmarshaller {

	public static DescribeDohSubDomainStatisticsSummaryResponse unmarshall(DescribeDohSubDomainStatisticsSummaryResponse describeDohSubDomainStatisticsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeDohSubDomainStatisticsSummaryResponse.setRequestId(_ctx.stringValue("DescribeDohSubDomainStatisticsSummaryResponse.RequestId"));
		describeDohSubDomainStatisticsSummaryResponse.setTotalItems(_ctx.integerValue("DescribeDohSubDomainStatisticsSummaryResponse.TotalItems"));
		describeDohSubDomainStatisticsSummaryResponse.setTotalPages(_ctx.integerValue("DescribeDohSubDomainStatisticsSummaryResponse.TotalPages"));
		describeDohSubDomainStatisticsSummaryResponse.setPageSize(_ctx.integerValue("DescribeDohSubDomainStatisticsSummaryResponse.PageSize"));
		describeDohSubDomainStatisticsSummaryResponse.setPageNumber(_ctx.integerValue("DescribeDohSubDomainStatisticsSummaryResponse.PageNumber"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setSubDomain(_ctx.stringValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].SubDomain"));
			statistic.setV4HttpCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].V4HttpCount"));
			statistic.setV6HttpCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].V6HttpCount"));
			statistic.setV4HttpsCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].V4HttpsCount"));
			statistic.setV6HttpsCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].V6HttpsCount"));
			statistic.setTotalCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].TotalCount"));
			statistic.setIpCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].IpCount"));
			statistic.setHttpCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].HttpCount"));
			statistic.setHttpsCount(_ctx.longValue("DescribeDohSubDomainStatisticsSummaryResponse.Statistics["+ i +"].HttpsCount"));

			statistics.add(statistic);
		}
		describeDohSubDomainStatisticsSummaryResponse.setStatistics(statistics);
	 
	 	return describeDohSubDomainStatisticsSummaryResponse;
	}
}