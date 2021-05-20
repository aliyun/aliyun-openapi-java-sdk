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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.TestNetworkConnectionResponse;
import com.aliyuncs.dataworks_public.model.v20200518.TestNetworkConnectionResponse.TaskList;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestNetworkConnectionResponseUnmarshaller {

	public static TestNetworkConnectionResponse unmarshall(TestNetworkConnectionResponse testNetworkConnectionResponse, UnmarshallerContext _ctx) {
		
		testNetworkConnectionResponse.setRequestId(_ctx.stringValue("TestNetworkConnectionResponse.RequestId"));
		testNetworkConnectionResponse.setSuccess(_ctx.booleanValue("TestNetworkConnectionResponse.Success"));

		TaskList taskList = new TaskList();
		taskList.setConnectStatus(_ctx.booleanValue("TestNetworkConnectionResponse.TaskList.ConnectStatus"));
		taskList.setConnectMessage(_ctx.stringValue("TestNetworkConnectionResponse.TaskList.ConnectMessage"));
		testNetworkConnectionResponse.setTaskList(taskList);
	 
	 	return testNetworkConnectionResponse;
	}
}