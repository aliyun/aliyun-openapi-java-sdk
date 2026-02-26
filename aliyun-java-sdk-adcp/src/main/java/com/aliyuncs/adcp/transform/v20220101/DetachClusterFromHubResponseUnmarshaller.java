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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DetachClusterFromHubResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachClusterFromHubResponseUnmarshaller {

	public static DetachClusterFromHubResponse unmarshall(DetachClusterFromHubResponse detachClusterFromHubResponse, UnmarshallerContext _ctx) {
		
		detachClusterFromHubResponse.setRequestId(_ctx.stringValue("DetachClusterFromHubResponse.RequestId"));
		detachClusterFromHubResponse.setClusterId(_ctx.stringValue("DetachClusterFromHubResponse.ClusterId"));
		detachClusterFromHubResponse.setTaskId(_ctx.stringValue("DetachClusterFromHubResponse.TaskId"));

		List<String> managedClusterIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DetachClusterFromHubResponse.ManagedClusterIds.Length"); i++) {
			managedClusterIds.add(_ctx.stringValue("DetachClusterFromHubResponse.ManagedClusterIds["+ i +"]"));
		}
		detachClusterFromHubResponse.setManagedClusterIds(managedClusterIds);
	 
	 	return detachClusterFromHubResponse;
	}
}