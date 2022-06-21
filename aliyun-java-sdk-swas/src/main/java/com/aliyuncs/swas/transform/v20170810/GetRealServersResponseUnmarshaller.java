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

import com.aliyuncs.swas.model.v20170810.GetRealServersResponse;
import com.aliyuncs.swas.model.v20170810.GetRealServersResponse.RealServersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRealServersResponseUnmarshaller {

	public static GetRealServersResponse unmarshall(GetRealServersResponse getRealServersResponse, UnmarshallerContext _ctx) {
		
		getRealServersResponse.setRequestId(_ctx.stringValue("GetRealServersResponse.RequestId"));
		getRealServersResponse.setSuccess(_ctx.booleanValue("GetRealServersResponse.Success"));
		getRealServersResponse.setCode(_ctx.stringValue("GetRealServersResponse.Code"));
		getRealServersResponse.setPageNumber(_ctx.integerValue("GetRealServersResponse.PageNumber"));
		getRealServersResponse.setMessage(_ctx.stringValue("GetRealServersResponse.Message"));
		getRealServersResponse.setPageSize(_ctx.integerValue("GetRealServersResponse.PageSize"));
		getRealServersResponse.setTotalCount(_ctx.integerValue("GetRealServersResponse.TotalCount"));

		List<RealServersItem> realServers = new ArrayList<RealServersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRealServersResponse.RealServers.Length"); i++) {
			RealServersItem realServersItem = new RealServersItem();
			realServersItem.setStatus(_ctx.stringValue("GetRealServersResponse.RealServers["+ i +"].Status"));
			realServersItem.setInstanceId(_ctx.stringValue("GetRealServersResponse.RealServers["+ i +"].InstanceId"));
			realServersItem.setInstanceName(_ctx.stringValue("GetRealServersResponse.RealServers["+ i +"].InstanceName"));
			realServersItem.setHealthStatus(_ctx.stringValue("GetRealServersResponse.RealServers["+ i +"].HealthStatus"));
			realServersItem.setLoadBalancerId(_ctx.stringValue("GetRealServersResponse.RealServers["+ i +"].LoadBalancerId"));

			realServers.add(realServersItem);
		}
		getRealServersResponse.setRealServers(realServers);
	 
	 	return getRealServersResponse;
	}
}