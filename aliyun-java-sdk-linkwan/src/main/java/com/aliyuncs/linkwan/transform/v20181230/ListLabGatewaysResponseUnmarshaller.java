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

import com.aliyuncs.linkwan.model.v20181230.ListLabGatewaysResponse;
import com.aliyuncs.linkwan.model.v20181230.ListLabGatewaysResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListLabGatewaysResponse.Data.LabGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabGatewaysResponseUnmarshaller {

	public static ListLabGatewaysResponse unmarshall(ListLabGatewaysResponse listLabGatewaysResponse, UnmarshallerContext context) {
		
		listLabGatewaysResponse.setRequestId(context.stringValue("ListLabGatewaysResponse.RequestId"));
		listLabGatewaysResponse.setSuccess(context.booleanValue("ListLabGatewaysResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListLabGatewaysResponse.Data.TotalCount"));

		List<LabGateway> list = new ArrayList<LabGateway>();
		for (int i = 0; i < context.lengthValue("ListLabGatewaysResponse.Data.List.Length"); i++) {
			LabGateway labGateway = new LabGateway();
			labGateway.setGwEui(context.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].GwEui"));
			labGateway.setName(context.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].Name"));
			labGateway.setIotHubProductKey(context.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].IotHubProductKey"));
			labGateway.setIotHubDeviceName(context.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].IotHubDeviceName"));
			labGateway.setIotHubDeviceSecret(context.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].IotHubDeviceSecret"));
			labGateway.setOnlineState(context.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].OnlineState"));
			labGateway.setBoundNodesCount(context.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].BoundNodesCount"));
			labGateway.setFreqBandPlanGroupId(context.longValue("ListLabGatewaysResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			labGateway.setCreateMillis(context.longValue("ListLabGatewaysResponse.Data.List["+ i +"].CreateMillis"));

			list.add(labGateway);
		}
		data.setList(list);
		listLabGatewaysResponse.setData(data);
	 
	 	return listLabGatewaysResponse;
	}
}