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

import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupTransferFlowStatsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNodeGroupTransferFlowStatsResponse.FlowStat;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeGroupTransferFlowStatsResponseUnmarshaller {

	public static ListNodeGroupTransferFlowStatsResponse unmarshall(ListNodeGroupTransferFlowStatsResponse listNodeGroupTransferFlowStatsResponse, UnmarshallerContext context) {
		
		listNodeGroupTransferFlowStatsResponse.setRequestId(context.stringValue("ListNodeGroupTransferFlowStatsResponse.RequestId"));
		listNodeGroupTransferFlowStatsResponse.setSuccess(context.booleanValue("ListNodeGroupTransferFlowStatsResponse.Success"));

		List<FlowStat> data = new ArrayList<FlowStat>();
		for (int i = 0; i < context.lengthValue("ListNodeGroupTransferFlowStatsResponse.Data.Length"); i++) {
			FlowStat flowStat = new FlowStat();
			flowStat.setStatMillis(context.longValue("ListNodeGroupTransferFlowStatsResponse.Data["+ i +"].StatMillis"));
			flowStat.setUplinkCount(context.longValue("ListNodeGroupTransferFlowStatsResponse.Data["+ i +"].UplinkCount"));
			flowStat.setDownlinkCount(context.longValue("ListNodeGroupTransferFlowStatsResponse.Data["+ i +"].DownlinkCount"));

			data.add(flowStat);
		}
		listNodeGroupTransferFlowStatsResponse.setData(data);
	 
	 	return listNodeGroupTransferFlowStatsResponse;
	}
}