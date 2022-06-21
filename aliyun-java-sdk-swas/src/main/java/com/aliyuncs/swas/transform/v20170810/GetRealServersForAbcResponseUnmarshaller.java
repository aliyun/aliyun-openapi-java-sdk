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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetRealServersForAbcResponse;
import com.aliyuncs.swas.model.v20170810.GetRealServersForAbcResponse.RealServersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRealServersForAbcResponseUnmarshaller {

	public static GetRealServersForAbcResponse unmarshall(GetRealServersForAbcResponse getRealServersForAbcResponse, UnmarshallerContext _ctx) {
		
		getRealServersForAbcResponse.setRequestId(_ctx.stringValue("GetRealServersForAbcResponse.RequestId"));
		getRealServersForAbcResponse.setCode(_ctx.stringValue("GetRealServersForAbcResponse.Code"));
		getRealServersForAbcResponse.setMessage(_ctx.stringValue("GetRealServersForAbcResponse.Message"));
		getRealServersForAbcResponse.setSuccess(_ctx.booleanValue("GetRealServersForAbcResponse.Success"));

		List<RealServersItem> realServers = new ArrayList<RealServersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRealServersForAbcResponse.RealServers.Length"); i++) {
			RealServersItem realServersItem = new RealServersItem();
			realServersItem.setStatus(_ctx.stringValue("GetRealServersForAbcResponse.RealServers["+ i +"].Status"));
			realServersItem.setInstanceId(_ctx.stringValue("GetRealServersForAbcResponse.RealServers["+ i +"].InstanceId"));
			realServersItem.setInstanceName(_ctx.stringValue("GetRealServersForAbcResponse.RealServers["+ i +"].InstanceName"));
			realServersItem.setHealthStatus(_ctx.stringValue("GetRealServersForAbcResponse.RealServers["+ i +"].HealthStatus"));
			realServersItem.setLoadBalancerId(_ctx.stringValue("GetRealServersForAbcResponse.RealServers["+ i +"].LoadBalancerId"));

			realServers.add(realServersItem);
		}
		getRealServersForAbcResponse.setRealServers(realServers);
	 
	 	return getRealServersForAbcResponse;
	}
}