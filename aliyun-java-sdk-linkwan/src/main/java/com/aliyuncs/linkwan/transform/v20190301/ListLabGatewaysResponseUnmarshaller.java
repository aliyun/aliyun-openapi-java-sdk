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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListLabGatewaysResponse;
import com.aliyuncs.linkwan.model.v20190301.ListLabGatewaysResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListLabGatewaysResponse.Data.LabGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabGatewaysResponseUnmarshaller {

	public static ListLabGatewaysResponse unmarshall(ListLabGatewaysResponse listLabGatewaysResponse, UnmarshallerContext _ctx) {
		
		listLabGatewaysResponse.setRequestId(_ctx.stringValue("ListLabGatewaysResponse.RequestId"));
		listLabGatewaysResponse.setSuccess(_ctx.booleanValue("ListLabGatewaysResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListLabGatewaysResponse.Data.TotalCount"));

		List<LabGateway> list = new ArrayList<LabGateway>();
		for (int i = 0; i < _ctx.lengthValue("ListLabGatewaysResponse.Data.List.Length"); i++) {
			LabGateway labGateway = new LabGateway();
			labGateway.setGwEui(_ctx.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].GwEui"));
			labGateway.setName(_ctx.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].Name"));
			labGateway.setIotHubProductKey(_ctx.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].IotHubProductKey"));
			labGateway.setIotHubDeviceName(_ctx.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].IotHubDeviceName"));
			labGateway.setIotHubDeviceSecret(_ctx.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].IotHubDeviceSecret"));
			labGateway.setOnlineState(_ctx.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].OnlineState"));
			labGateway.setBoundNodesCount(_ctx.stringValue("ListLabGatewaysResponse.Data.List["+ i +"].BoundNodesCount"));
			labGateway.setFreqBandPlanGroupId(_ctx.longValue("ListLabGatewaysResponse.Data.List["+ i +"].FreqBandPlanGroupId"));
			labGateway.setCreateMillis(_ctx.longValue("ListLabGatewaysResponse.Data.List["+ i +"].CreateMillis"));
			labGateway.setExpirationMillis(_ctx.longValue("ListLabGatewaysResponse.Data.List["+ i +"].ExpirationMillis"));

			list.add(labGateway);
		}
		data.setList(list);
		listLabGatewaysResponse.setData(data);
	 
	 	return listLabGatewaysResponse;
	}
}