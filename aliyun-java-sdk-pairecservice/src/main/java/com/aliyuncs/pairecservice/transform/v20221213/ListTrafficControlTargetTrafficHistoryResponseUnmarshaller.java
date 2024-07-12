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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListTrafficControlTargetTrafficHistoryResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrafficControlTargetTrafficHistoryResponseUnmarshaller {

	public static ListTrafficControlTargetTrafficHistoryResponse unmarshall(ListTrafficControlTargetTrafficHistoryResponse listTrafficControlTargetTrafficHistoryResponse, UnmarshallerContext _ctx) {
		
		listTrafficControlTargetTrafficHistoryResponse.setRequestId(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.RequestId"));
		listTrafficControlTargetTrafficHistoryResponse.setTotalCount(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.TotalCount"));

		List<TrafficControlTaskTrafficHistoriesItem> trafficControlTaskTrafficHistories = new ArrayList<TrafficControlTaskTrafficHistoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistories.Length"); i++) {
			TrafficControlTaskTrafficHistoriesItem trafficControlTaskTrafficHistoriesItem = new TrafficControlTaskTrafficHistoriesItem();
			trafficControlTaskTrafficHistoriesItem.setRecordTime(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistories["+ i +"].RecordTime"));
			trafficControlTaskTrafficHistoriesItem.setItemId(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistories["+ i +"].ItemId"));
			trafficControlTaskTrafficHistoriesItem.setExperimentId(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistories["+ i +"].ExperimentId"));
			trafficControlTaskTrafficHistoriesItem.setTrafficControlTargetTraffic(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistories["+ i +"].TrafficControlTargetTraffic"));
			trafficControlTaskTrafficHistoriesItem.setTrafficControlTargetAimTraffic(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistories["+ i +"].TrafficControlTargetAimTraffic"));
			trafficControlTaskTrafficHistoriesItem.setTrafficControlTaskTraffic(_ctx.stringValue("ListTrafficControlTargetTrafficHistoryResponse.TrafficControlTaskTrafficHistories["+ i +"].TrafficControlTaskTraffic"));

			trafficControlTaskTrafficHistories.add(trafficControlTaskTrafficHistoriesItem);
		}
		listTrafficControlTargetTrafficHistoryResponse.setTrafficControlTaskTrafficHistories(trafficControlTaskTrafficHistories);
	 
	 	return listTrafficControlTargetTrafficHistoryResponse;
	}
}