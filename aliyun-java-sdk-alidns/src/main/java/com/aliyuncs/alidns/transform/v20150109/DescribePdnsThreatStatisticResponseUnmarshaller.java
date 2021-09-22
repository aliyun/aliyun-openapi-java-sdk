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

import com.aliyuncs.alidns.model.v20150109.DescribePdnsThreatStatisticResponse;
import com.aliyuncs.alidns.model.v20150109.DescribePdnsThreatStatisticResponse.StatisticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePdnsThreatStatisticResponseUnmarshaller {

	public static DescribePdnsThreatStatisticResponse unmarshall(DescribePdnsThreatStatisticResponse describePdnsThreatStatisticResponse, UnmarshallerContext _ctx) {
		
		describePdnsThreatStatisticResponse.setRequestId(_ctx.stringValue("DescribePdnsThreatStatisticResponse.RequestId"));

		List<StatisticItem> data = new ArrayList<StatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePdnsThreatStatisticResponse.Data.Length"); i++) {
			StatisticItem statisticItem = new StatisticItem();
			statisticItem.setUdpTotalCount(_ctx.longValue("DescribePdnsThreatStatisticResponse.Data["+ i +"].UdpTotalCount"));
			statisticItem.setTotalCount(_ctx.longValue("DescribePdnsThreatStatisticResponse.Data["+ i +"].TotalCount"));
			statisticItem.setThreatLevel(_ctx.stringValue("DescribePdnsThreatStatisticResponse.Data["+ i +"].ThreatLevel"));
			statisticItem.setThreatType(_ctx.stringValue("DescribePdnsThreatStatisticResponse.Data["+ i +"].ThreatType"));
			statisticItem.setTimestamp(_ctx.longValue("DescribePdnsThreatStatisticResponse.Data["+ i +"].Timestamp"));
			statisticItem.setDohTotalCount(_ctx.longValue("DescribePdnsThreatStatisticResponse.Data["+ i +"].DohTotalCount"));

			data.add(statisticItem);
		}
		describePdnsThreatStatisticResponse.setData(data);
	 
	 	return describePdnsThreatStatisticResponse;
	}
}