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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListGatewayTransferFlowStatsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListGatewayTransferFlowStatsResponse.FlowStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayTransferFlowStatsResponseUnmarshaller {

	public static ListGatewayTransferFlowStatsResponse unmarshall(ListGatewayTransferFlowStatsResponse listGatewayTransferFlowStatsResponse, UnmarshallerContext context) {
		
		listGatewayTransferFlowStatsResponse.setRequestId(context.stringValue("ListGatewayTransferFlowStatsResponse.RequestId"));
		listGatewayTransferFlowStatsResponse.setSuccess(context.booleanValue("ListGatewayTransferFlowStatsResponse.Success"));

		List<FlowStat> data = new ArrayList<FlowStat>();
		for (int i = 0; i < context.lengthValue("ListGatewayTransferFlowStatsResponse.Data.Length"); i++) {
			FlowStat flowStat = new FlowStat();
			flowStat.setStatMillis(context.stringValue("ListGatewayTransferFlowStatsResponse.Data["+ i +"].StatMillis"));
			flowStat.setUplinkCount(context.longValue("ListGatewayTransferFlowStatsResponse.Data["+ i +"].UplinkCount"));
			flowStat.setDownlinkCount(context.longValue("ListGatewayTransferFlowStatsResponse.Data["+ i +"].DownlinkCount"));

			data.add(flowStat);
		}
		listGatewayTransferFlowStatsResponse.setData(data);
	 
	 	return listGatewayTransferFlowStatsResponse;
	}
}