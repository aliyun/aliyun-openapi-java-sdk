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

package com.aliyuncs.nis.transform.v20211216;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nis.model.v20211216.GetNatTopNResponse;
import com.aliyuncs.nis.model.v20211216.GetNatTopNResponse.NatGatewayTopNItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNatTopNResponseUnmarshaller {

	public static GetNatTopNResponse unmarshall(GetNatTopNResponse getNatTopNResponse, UnmarshallerContext _ctx) {
		
		getNatTopNResponse.setRequestId(_ctx.stringValue("GetNatTopNResponse.RequestId"));
		getNatTopNResponse.setIsTopNOpen(_ctx.booleanValue("GetNatTopNResponse.IsTopNOpen"));

		List<NatGatewayTopNItem> natGatewayTopN = new ArrayList<NatGatewayTopNItem>();
		for (int i = 0; i < _ctx.lengthValue("GetNatTopNResponse.NatGatewayTopN.Length"); i++) {
			NatGatewayTopNItem natGatewayTopNItem = new NatGatewayTopNItem();
			natGatewayTopNItem.setIp(_ctx.stringValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].Ip"));
			natGatewayTopNItem.setInBps(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].InBps"));
			natGatewayTopNItem.setOutBps(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].OutBps"));
			natGatewayTopNItem.setInPps(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].InPps"));
			natGatewayTopNItem.setOutPps(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].OutPps"));
			natGatewayTopNItem.setInFlowPerMinute(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].InFlowPerMinute"));
			natGatewayTopNItem.setOutFlowPerMinute(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].OutFlowPerMinute"));
			natGatewayTopNItem.setNewSessionPerSecond(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].NewSessionPerSecond"));
			natGatewayTopNItem.setActiveSessionCount(_ctx.floatValue("GetNatTopNResponse.NatGatewayTopN["+ i +"].ActiveSessionCount"));

			natGatewayTopN.add(natGatewayTopNItem);
		}
		getNatTopNResponse.setNatGatewayTopN(natGatewayTopN);
	 
	 	return getNatTopNResponse;
	}
}