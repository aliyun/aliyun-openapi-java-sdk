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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.RemoveInstancesResponse;
import com.aliyuncs.ess.model.v20140828.RemoveInstancesResponse.IgnoredInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveInstancesResponseUnmarshaller {

	public static RemoveInstancesResponse unmarshall(RemoveInstancesResponse removeInstancesResponse, UnmarshallerContext _ctx) {
		
		removeInstancesResponse.setRequestId(_ctx.stringValue("RemoveInstancesResponse.RequestId"));
		removeInstancesResponse.setScalingActivityId(_ctx.stringValue("RemoveInstancesResponse.ScalingActivityId"));

		List<IgnoredInstance> ignoredInstances = new ArrayList<IgnoredInstance>();
		for (int i = 0; i < _ctx.lengthValue("RemoveInstancesResponse.IgnoredInstances.Length"); i++) {
			IgnoredInstance ignoredInstance = new IgnoredInstance();
			ignoredInstance.setInstanceId(_ctx.stringValue("RemoveInstancesResponse.IgnoredInstances["+ i +"].InstanceId"));
			ignoredInstance.setCode(_ctx.stringValue("RemoveInstancesResponse.IgnoredInstances["+ i +"].Code"));
			ignoredInstance.setMessage(_ctx.stringValue("RemoveInstancesResponse.IgnoredInstances["+ i +"].Message"));

			ignoredInstances.add(ignoredInstance);
		}
		removeInstancesResponse.setIgnoredInstances(ignoredInstances);
	 
	 	return removeInstancesResponse;
	}
}