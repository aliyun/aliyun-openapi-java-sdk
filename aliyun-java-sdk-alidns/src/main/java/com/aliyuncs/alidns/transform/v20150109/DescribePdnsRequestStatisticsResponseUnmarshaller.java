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

import com.aliyuncs.alidns.model.v20150109.DescribePdnsRequestStatisticsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsRequestStatisticsResponse.StatisticItem;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsRequestStatisticsResponse.StatisticItem.ThreatItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsRequestStatisticsResponseUnmarshaller {

	public static DescribePdnsRequestStatisticsResponse unmarshall(DescribePdnsRequestStatisticsResponse describePdnsRequestStatisticsResponse, UnmarshallerContext _ctx) {
		
		describePdnsRequestStatisticsResponse.setRequestId(_ctx.stringValue("DescribePdnsRequestStatisticsResponse.RequestId"));
		describePdnsRequestStatisticsResponse.setTotalCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.TotalCount"));
		describePdnsRequestStatisticsResponse.setPageSize(_ctx.longValue("DescribePdnsRequestStatisticsResponse.PageSize"));
		describePdnsRequestStatisticsResponse.setPageNumber(_ctx.longValue("DescribePdnsRequestStatisticsResponse.PageNumber"));

		List<StatisticItem> data = new ArrayList<StatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsRequestStatisticsResponse.Data.Length"); i++) {
			StatisticItem statisticItem = new StatisticItem();
			statisticItem.setUdpTotalCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].UdpTotalCount"));
			statisticItem.setIpCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].IpCount"));
			statisticItem.setDomainName(_ctx.stringValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].DomainName"));
			statisticItem.setV6HttpCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].V6HttpCount"));
			statisticItem.setV4Count(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].V4Count"));
			statisticItem.setHttpsCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].HttpsCount"));
			statisticItem.setV4HttpsCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].V4HttpsCount"));
			statisticItem.setV6Count(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].V6Count"));
			statisticItem.setSubDomain(_ctx.stringValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].SubDomain"));
			statisticItem.setTotalCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].TotalCount"));
			statisticItem.setV4HttpCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].V4HttpCount"));
			statisticItem.setThreatCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].ThreatCount"));
			statisticItem.setMaxThreatLevel(_ctx.stringValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].MaxThreatLevel"));
			statisticItem.setHttpCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].HttpCount"));
			statisticItem.setV6HttpsCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].V6HttpsCount"));
			statisticItem.setDohTotalCount(_ctx.longValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].DohTotalCount"));

			List<ThreatItem> threatInfo = new ArrayList<ThreatItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].ThreatInfo.Length"); j++) {
				ThreatItem threatItem = new ThreatItem();
				threatItem.setThreatLevel(_ctx.stringValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].ThreatInfo["+ j +"].ThreatLevel"));
				threatItem.setThreatType(_ctx.stringValue("DescribePdnsRequestStatisticsResponse.Data["+ i +"].ThreatInfo["+ j +"].ThreatType"));

				threatInfo.add(threatItem);
			}
			statisticItem.setThreatInfo(threatInfo);

			data.add(statisticItem);
		}
		describePdnsRequestStatisticsResponse.setData(data);
	 
	 	return describePdnsRequestStatisticsResponse;
	}
}