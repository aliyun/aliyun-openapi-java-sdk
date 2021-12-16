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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListNatGatewayEcsMetricResponse;
import com.aliyuncs.vpc.model.v20160428.ListNatGatewayEcsMetricResponse.MetricData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNatGatewayEcsMetricResponseUnmarshaller {

	public static ListNatGatewayEcsMetricResponse unmarshall(ListNatGatewayEcsMetricResponse listNatGatewayEcsMetricResponse, UnmarshallerContext _ctx) {
		
		listNatGatewayEcsMetricResponse.setRequestId(_ctx.stringValue("ListNatGatewayEcsMetricResponse.RequestId"));
		listNatGatewayEcsMetricResponse.setNextToken(_ctx.stringValue("ListNatGatewayEcsMetricResponse.NextToken"));
		listNatGatewayEcsMetricResponse.setMaxResults(_ctx.integerValue("ListNatGatewayEcsMetricResponse.MaxResults"));

		List<MetricData> metricDataList = new ArrayList<MetricData>();
		for (int i = 0; i < _ctx.lengthValue("ListNatGatewayEcsMetricResponse.MetricDataList.Length"); i++) {
			MetricData metricData = new MetricData();
			metricData.setRxBps(_ctx.longValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].RxBps"));
			metricData.setActiveSessionNum(_ctx.longValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].ActiveSessionNum"));
			metricData.setTxBps(_ctx.longValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].TxBps"));
			metricData.setNewSessionRate(_ctx.longValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].NewSessionRate"));
			metricData.setTxPps(_ctx.longValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].TxPps"));
			metricData.setNatGatewayId(_ctx.stringValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].NatGatewayId"));
			metricData.setTimestamp(_ctx.longValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].Timestamp"));
			metricData.setRxPps(_ctx.longValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].RxPps"));
			metricData.setPrivateIpAddress(_ctx.stringValue("ListNatGatewayEcsMetricResponse.MetricDataList["+ i +"].PrivateIpAddress"));

			metricDataList.add(metricData);
		}
		listNatGatewayEcsMetricResponse.setMetricDataList(metricDataList);
	 
	 	return listNatGatewayEcsMetricResponse;
	}
}