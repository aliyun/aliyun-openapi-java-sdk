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

package com.aliyuncs.resourcecenter.transform.v20221201;

import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelStatisticsResponse;
import com.aliyuncs.resourcecenter.model.v20221201.GetDeliveryChannelStatisticsResponse.DeliveryChannelStatistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeliveryChannelStatisticsResponseUnmarshaller {

	public static GetDeliveryChannelStatisticsResponse unmarshall(GetDeliveryChannelStatisticsResponse getDeliveryChannelStatisticsResponse, UnmarshallerContext _ctx) {
		
		getDeliveryChannelStatisticsResponse.setRequestId(_ctx.stringValue("GetDeliveryChannelStatisticsResponse.RequestId"));

		DeliveryChannelStatistics deliveryChannelStatistics = new DeliveryChannelStatistics();
		deliveryChannelStatistics.setDeliveryChannelId(_ctx.stringValue("GetDeliveryChannelStatisticsResponse.DeliveryChannelStatistics.DeliveryChannelId"));
		deliveryChannelStatistics.setDeliveryChannelName(_ctx.stringValue("GetDeliveryChannelStatisticsResponse.DeliveryChannelStatistics.DeliveryChannelName"));
		deliveryChannelStatistics.setLatestChangeDeliveryTime(_ctx.stringValue("GetDeliveryChannelStatisticsResponse.DeliveryChannelStatistics.LatestChangeDeliveryTime"));
		deliveryChannelStatistics.setLatestSnapshotDeliveryTime(_ctx.stringValue("GetDeliveryChannelStatisticsResponse.DeliveryChannelStatistics.LatestSnapshotDeliveryTime"));
		getDeliveryChannelStatisticsResponse.setDeliveryChannelStatistics(deliveryChannelStatistics);
	 
	 	return getDeliveryChannelStatisticsResponse;
	}
}