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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.RunServiceScheduleResponse;
import com.aliyuncs.ens.model.v20171110.RunServiceScheduleResponse.CommandResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunServiceScheduleResponseUnmarshaller {

	public static RunServiceScheduleResponse unmarshall(RunServiceScheduleResponse runServiceScheduleResponse, UnmarshallerContext _ctx) {
		
		runServiceScheduleResponse.setRequestId(_ctx.stringValue("RunServiceScheduleResponse.RequestId"));
		runServiceScheduleResponse.setIndex(_ctx.integerValue("RunServiceScheduleResponse.Index"));
		runServiceScheduleResponse.setInstanceId(_ctx.stringValue("RunServiceScheduleResponse.InstanceId"));
		runServiceScheduleResponse.setInstanceIp(_ctx.stringValue("RunServiceScheduleResponse.InstanceIp"));
		runServiceScheduleResponse.setInstancePort(_ctx.integerValue("RunServiceScheduleResponse.InstancePort"));
		runServiceScheduleResponse.setRequestRepeated(_ctx.stringValue("RunServiceScheduleResponse.RequestRepeated"));
		runServiceScheduleResponse.setTcpPorts(_ctx.booleanValue("RunServiceScheduleResponse.TcpPorts"));

		List<CommandResult> commandResults = new ArrayList<CommandResult>();
		for (int i = 0; i < _ctx.lengthValue("RunServiceScheduleResponse.CommandResults.Length"); i++) {
			CommandResult commandResult = new CommandResult();
			commandResult.setCommand(_ctx.stringValue("RunServiceScheduleResponse.CommandResults["+ i +"].Command"));
			commandResult.setContainerName(_ctx.stringValue("RunServiceScheduleResponse.CommandResults["+ i +"].ContainerName"));
			commandResult.setResultMsg(_ctx.stringValue("RunServiceScheduleResponse.CommandResults["+ i +"].ResultMsg"));

			commandResults.add(commandResult);
		}
		runServiceScheduleResponse.setCommandResults(commandResults);
	 
	 	return runServiceScheduleResponse;
	}
}