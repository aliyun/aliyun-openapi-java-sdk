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

import com.aliyuncs.linkwan.model.v20181230.ListBoundLabGatewaysResponse;
import com.aliyuncs.linkwan.model.v20181230.ListBoundLabGatewaysResponse.LabGateway;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBoundLabGatewaysResponseUnmarshaller {

	public static ListBoundLabGatewaysResponse unmarshall(ListBoundLabGatewaysResponse listBoundLabGatewaysResponse, UnmarshallerContext context) {
		
		listBoundLabGatewaysResponse.setRequestId(context.stringValue("ListBoundLabGatewaysResponse.RequestId"));
		listBoundLabGatewaysResponse.setSuccess(context.booleanValue("ListBoundLabGatewaysResponse.Success"));

		List<LabGateway> data = new ArrayList<LabGateway>();
		for (int i = 0; i < context.lengthValue("ListBoundLabGatewaysResponse.Data.Length"); i++) {
			LabGateway labGateway = new LabGateway();
			labGateway.setGwEui(context.stringValue("ListBoundLabGatewaysResponse.Data["+ i +"].GwEui"));
			labGateway.setName(context.stringValue("ListBoundLabGatewaysResponse.Data["+ i +"].Name"));
			labGateway.setIotHubProductKey(context.stringValue("ListBoundLabGatewaysResponse.Data["+ i +"].IotHubProductKey"));
			labGateway.setIotHubDeviceName(context.stringValue("ListBoundLabGatewaysResponse.Data["+ i +"].IotHubDeviceName"));
			labGateway.setIotHubDeviceSecret(context.stringValue("ListBoundLabGatewaysResponse.Data["+ i +"].IotHubDeviceSecret"));
			labGateway.setOnlineState(context.stringValue("ListBoundLabGatewaysResponse.Data["+ i +"].OnlineState"));
			labGateway.setBoundNodesCount(context.longValue("ListBoundLabGatewaysResponse.Data["+ i +"].BoundNodesCount"));
			labGateway.setFreqBandPlanGroupId(context.longValue("ListBoundLabGatewaysResponse.Data["+ i +"].FreqBandPlanGroupId"));
			labGateway.setCreateMillis(context.longValue("ListBoundLabGatewaysResponse.Data["+ i +"].CreateMillis"));

			data.add(labGateway);
		}
		listBoundLabGatewaysResponse.setData(data);
	 
	 	return listBoundLabGatewaysResponse;
	}
}