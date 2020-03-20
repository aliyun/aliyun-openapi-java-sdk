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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListStackInstancesResponse;
import com.aliyuncs.ros.model.v20190910.ListStackInstancesResponse.StackInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStackInstancesResponseUnmarshaller {

	public static ListStackInstancesResponse unmarshall(ListStackInstancesResponse listStackInstancesResponse, UnmarshallerContext _ctx) {
		
		listStackInstancesResponse.setRequestId(_ctx.stringValue("ListStackInstancesResponse.RequestId"));
		listStackInstancesResponse.setPageNumber(_ctx.integerValue("ListStackInstancesResponse.PageNumber"));
		listStackInstancesResponse.setPageSize(_ctx.integerValue("ListStackInstancesResponse.PageSize"));
		listStackInstancesResponse.setTotalCount(_ctx.integerValue("ListStackInstancesResponse.TotalCount"));

		List<StackInstance> stackInstances = new ArrayList<StackInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListStackInstancesResponse.StackInstances.Length"); i++) {
			StackInstance stackInstance = new StackInstance();
			stackInstance.setStackGroupName(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].StackGroupName"));
			stackInstance.setStackGroupId(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].StackGroupId"));
			stackInstance.setStackId(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].StackId"));
			stackInstance.setAccountId(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].AccountId"));
			stackInstance.setRegionId(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].RegionId"));
			stackInstance.setStatus(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].Status"));
			stackInstance.setStatusReason(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].StatusReason"));
			stackInstance.setStackDriftStatus(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].StackDriftStatus"));
			stackInstance.setDriftDetectionTime(_ctx.stringValue("ListStackInstancesResponse.StackInstances["+ i +"].DriftDetectionTime"));

			stackInstances.add(stackInstance);
		}
		listStackInstancesResponse.setStackInstances(stackInstances);
	 
	 	return listStackInstancesResponse;
	}
}