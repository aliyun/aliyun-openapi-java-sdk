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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCommandResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCommandResponse.Command;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCommandResponseUnmarshaller {

	public static OpsDescribeCommandResponse unmarshall(OpsDescribeCommandResponse opsDescribeCommandResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCommandResponse.setRequestId(_ctx.stringValue("OpsDescribeCommandResponse.RequestId"));
		opsDescribeCommandResponse.setPageSize(_ctx.integerValue("OpsDescribeCommandResponse.PageSize"));
		opsDescribeCommandResponse.setTotal(_ctx.integerValue("OpsDescribeCommandResponse.Total"));
		opsDescribeCommandResponse.setPageNo(_ctx.integerValue("OpsDescribeCommandResponse.PageNo"));

		List<Command> commandList = new ArrayList<Command>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCommandResponse.CommandList.Length"); i++) {
			Command command = new Command();
			command.setCreationTime(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].CreationTime"));
			command.setType(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].Type"));
			command.setInvokeTimes(_ctx.integerValue("OpsDescribeCommandResponse.CommandList["+ i +"].InvokeTimes"));
			command.setCommandId(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].CommandId"));
			command.setPublishTime(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].PublishTime"));
			command.setTimeOut(_ctx.longValue("OpsDescribeCommandResponse.CommandList["+ i +"].TimeOut"));
			command.setWorkingDir(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].WorkingDir"));
			command.setShareStatus(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].ShareStatus"));
			command.setDescription(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].Description"));
			command.setVersion(_ctx.integerValue("OpsDescribeCommandResponse.CommandList["+ i +"].Version"));
			command.setCommandContent(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].CommandContent"));
			command.setLatest(_ctx.booleanValue("OpsDescribeCommandResponse.CommandList["+ i +"].Latest"));
			command.setName(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].Name"));
			command.setEnableParameter(_ctx.booleanValue("OpsDescribeCommandResponse.CommandList["+ i +"].EnableParameter"));

			List<String> modifiers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeCommandResponse.CommandList["+ i +"].Modifiers.Length"); j++) {
				modifiers.add(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].Modifiers["+ j +"]"));
			}
			command.setModifiers(modifiers);

			List<String> parameterNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeCommandResponse.CommandList["+ i +"].ParameterNames.Length"); j++) {
				parameterNames.add(_ctx.stringValue("OpsDescribeCommandResponse.CommandList["+ i +"].ParameterNames["+ j +"]"));
			}
			command.setParameterNames(parameterNames);

			commandList.add(command);
		}
		opsDescribeCommandResponse.setCommandList(commandList);
	 
	 	return opsDescribeCommandResponse;
	}
}