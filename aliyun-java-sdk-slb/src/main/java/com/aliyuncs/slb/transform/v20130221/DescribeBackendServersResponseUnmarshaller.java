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

package com.aliyuncs.slb.transform.v20130221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20130221.DescribeBackendServersResponse;
import com.aliyuncs.slb.model.v20130221.DescribeBackendServersResponse.Listener;
import com.aliyuncs.slb.model.v20130221.DescribeBackendServersResponse.Listener.BackendServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackendServersResponseUnmarshaller {

	public static DescribeBackendServersResponse unmarshall(DescribeBackendServersResponse describeBackendServersResponse, UnmarshallerContext _ctx) {
		
		describeBackendServersResponse.setRequestId(_ctx.stringValue("DescribeBackendServersResponse.RequestId"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackendServersResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setListenerPort(_ctx.integerValue("DescribeBackendServersResponse.Listeners["+ i +"].ListenerPort"));

			List<BackendServer> backendServers = new ArrayList<BackendServer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackendServersResponse.Listeners["+ i +"].BackendServers.Length"); j++) {
				BackendServer backendServer = new BackendServer();
				backendServer.setServerHealthStatus(_ctx.stringValue("DescribeBackendServersResponse.Listeners["+ i +"].BackendServers["+ j +"].ServerHealthStatus"));
				backendServer.setServerId(_ctx.stringValue("DescribeBackendServersResponse.Listeners["+ i +"].BackendServers["+ j +"].ServerId"));

				backendServers.add(backendServer);
			}
			listener.setBackendServers(backendServers);

			listeners.add(listener);
		}
		describeBackendServersResponse.setListeners(listeners);
	 
	 	return describeBackendServersResponse;
	}
}