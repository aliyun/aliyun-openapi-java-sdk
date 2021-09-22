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

import com.aliyuncs.alidns.model.v20150109.DescribePdnsRequestStatisticResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsRequestStatisticResponse.StatisticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsRequestStatisticResponseUnmarshaller {

	public static DescribePdnsRequestStatisticResponse unmarshall(DescribePdnsRequestStatisticResponse describePdnsRequestStatisticResponse, UnmarshallerContext _ctx) {
		
		describePdnsRequestStatisticResponse.setRequestId(_ctx.stringValue("DescribePdnsRequestStatisticResponse.RequestId"));

		List<StatisticItem> data = new ArrayList<StatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsRequestStatisticResponse.Data.Length"); i++) {
			StatisticItem statisticItem = new StatisticItem();
			statisticItem.setUdpTotalCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].UdpTotalCount"));
			statisticItem.setIpCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].IpCount"));
			statisticItem.setTotalCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].TotalCount"));
			statisticItem.setV4HttpCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].V4HttpCount"));
			statisticItem.setV6HttpCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].V6HttpCount"));
			statisticItem.setV4Count(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].V4Count"));
			statisticItem.setHttpsCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].HttpsCount"));
			statisticItem.setHttpCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].HttpCount"));
			statisticItem.setV4HttpsCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].V4HttpsCount"));
			statisticItem.setTimestamp(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].Timestamp"));
			statisticItem.setV6HttpsCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].V6HttpsCount"));
			statisticItem.setDohTotalCount(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].DohTotalCount"));
			statisticItem.setV6Count(_ctx.longValue("DescribePdnsRequestStatisticResponse.Data["+ i +"].V6Count"));

			data.add(statisticItem);
		}
		describePdnsRequestStatisticResponse.setData(data);
	 
	 	return describePdnsRequestStatisticResponse;
	}
}