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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ListSmartAGByAccessPointResponse;
import com.aliyuncs.smartag.model.v20180313.ListSmartAGByAccessPointResponse.SmartAccessGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSmartAGByAccessPointResponseUnmarshaller {

	public static ListSmartAGByAccessPointResponse unmarshall(ListSmartAGByAccessPointResponse listSmartAGByAccessPointResponse, UnmarshallerContext _ctx) {
		
		listSmartAGByAccessPointResponse.setRequestId(_ctx.stringValue("ListSmartAGByAccessPointResponse.RequestId"));
		listSmartAGByAccessPointResponse.setTotalCount(_ctx.integerValue("ListSmartAGByAccessPointResponse.TotalCount"));

		List<SmartAccessGateway> smartAccessGateways = new ArrayList<SmartAccessGateway>();
		for (int i = 0; i < _ctx.lengthValue("ListSmartAGByAccessPointResponse.SmartAccessGateways.Length"); i++) {
			SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
			smartAccessGateway.setRoutingStrategy(_ctx.stringValue("ListSmartAGByAccessPointResponse.SmartAccessGateways["+ i +"].RoutingStrategy"));
			smartAccessGateway.setSmartAGName(_ctx.stringValue("ListSmartAGByAccessPointResponse.SmartAccessGateways["+ i +"].SmartAGName"));
			smartAccessGateway.setSmartAGId(_ctx.stringValue("ListSmartAGByAccessPointResponse.SmartAccessGateways["+ i +"].SmartAGId"));
			smartAccessGateway.setSmartAGStatus(_ctx.stringValue("ListSmartAGByAccessPointResponse.SmartAccessGateways["+ i +"].SmartAGStatus"));
			smartAccessGateway.setSmartAGDescription(_ctx.stringValue("ListSmartAGByAccessPointResponse.SmartAccessGateways["+ i +"].SmartAGDescription"));
			smartAccessGateway.setAssociatedCcnId(_ctx.stringValue("ListSmartAGByAccessPointResponse.SmartAccessGateways["+ i +"].AssociatedCcnId"));
			smartAccessGateway.setHardwareVersion(_ctx.stringValue("ListSmartAGByAccessPointResponse.SmartAccessGateways["+ i +"].HardwareVersion"));

			smartAccessGateways.add(smartAccessGateway);
		}
		listSmartAGByAccessPointResponse.setSmartAccessGateways(smartAccessGateways);
	 
	 	return listSmartAGByAccessPointResponse;
	}
}