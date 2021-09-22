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

import com.aliyuncs.alidns.model.v20150109.DescribePdnsThreatStatisticsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsThreatStatisticsResponse.StatisticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsThreatStatisticsResponseUnmarshaller {

	public static DescribePdnsThreatStatisticsResponse unmarshall(DescribePdnsThreatStatisticsResponse describePdnsThreatStatisticsResponse, UnmarshallerContext _ctx) {
		
		describePdnsThreatStatisticsResponse.setRequestId(_ctx.stringValue("DescribePdnsThreatStatisticsResponse.RequestId"));
		describePdnsThreatStatisticsResponse.setTotalCount(_ctx.longValue("DescribePdnsThreatStatisticsResponse.TotalCount"));
		describePdnsThreatStatisticsResponse.setPageSize(_ctx.longValue("DescribePdnsThreatStatisticsResponse.PageSize"));
		describePdnsThreatStatisticsResponse.setPageNumber(_ctx.longValue("DescribePdnsThreatStatisticsResponse.PageNumber"));

		List<StatisticItem> data = new ArrayList<StatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsThreatStatisticsResponse.Data.Length"); i++) {
			StatisticItem statisticItem = new StatisticItem();
			statisticItem.setSubDomain(_ctx.stringValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].SubDomain"));
			statisticItem.setUdpTotalCount(_ctx.longValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].UdpTotalCount"));
			statisticItem.setTotalCount(_ctx.longValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].TotalCount"));
			statisticItem.setSourceIp(_ctx.stringValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].SourceIp"));
			statisticItem.setThreatLevel(_ctx.stringValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].ThreatLevel"));
			statisticItem.setDomainName(_ctx.stringValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].DomainName"));
			statisticItem.setThreatType(_ctx.stringValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].ThreatType"));
			statisticItem.setMaxThreatLevel(_ctx.stringValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].MaxThreatLevel"));
			statisticItem.setLatestThreatTime(_ctx.longValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].LatestThreatTime"));
			statisticItem.setDohTotalCount(_ctx.longValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].DohTotalCount"));
			statisticItem.setDomainCount(_ctx.longValue("DescribePdnsThreatStatisticsResponse.Data["+ i +"].DomainCount"));

			data.add(statisticItem);
		}
		describePdnsThreatStatisticsResponse.setData(data);
	 
	 	return describePdnsThreatStatisticsResponse;
	}
}