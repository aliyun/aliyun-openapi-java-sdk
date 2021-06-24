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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCommandsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCommandsResponse.CommandSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCommandsResponseUnmarshaller {

	public static OpsDescribeCommandsResponse unmarshall(OpsDescribeCommandsResponse opsDescribeCommandsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCommandsResponse.setRequestId(_ctx.stringValue("OpsDescribeCommandsResponse.RequestId"));

		List<CommandSet> commandSets = new ArrayList<CommandSet>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCommandsResponse.CommandSets.Length"); i++) {
			CommandSet commandSet = new CommandSet();
			commandSet.setCommandResult(_ctx.stringValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].CommandResult"));
			commandSet.setRetryTimes(_ctx.integerValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].RetryTimes"));
			commandSet.setCommandDetail(_ctx.stringValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].CommandDetail"));
			commandSet.setAliUid(_ctx.longValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].AliUid"));
			commandSet.setInstanceId(_ctx.stringValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].InstanceId"));
			commandSet.setCommandStatus(_ctx.stringValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].CommandStatus"));
			commandSet.setOrderId(_ctx.longValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].OrderId"));
			commandSet.setCommandType(_ctx.stringValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].CommandType"));
			commandSet.setId(_ctx.longValue("OpsDescribeCommandsResponse.CommandSets["+ i +"].Id"));

			commandSets.add(commandSet);
		}
		opsDescribeCommandsResponse.setCommandSets(commandSets);
	 
	 	return opsDescribeCommandsResponse;
	}
}