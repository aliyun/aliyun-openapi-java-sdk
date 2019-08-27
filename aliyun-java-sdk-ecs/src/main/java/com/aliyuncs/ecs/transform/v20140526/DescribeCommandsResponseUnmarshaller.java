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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeCommandsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeCommandsResponse.Command;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommandsResponseUnmarshaller {

	public static DescribeCommandsResponse unmarshall(DescribeCommandsResponse describeCommandsResponse, UnmarshallerContext _ctx) {
		
		describeCommandsResponse.setRequestId(_ctx.stringValue("DescribeCommandsResponse.RequestId"));
		describeCommandsResponse.setTotalCount(_ctx.longValue("DescribeCommandsResponse.TotalCount"));
		describeCommandsResponse.setPageNumber(_ctx.longValue("DescribeCommandsResponse.PageNumber"));
		describeCommandsResponse.setPageSize(_ctx.longValue("DescribeCommandsResponse.PageSize"));

		List<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommandsResponse.Commands.Length"); i++) {
			Command command = new Command();
			command.setCommandId(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandId"));
			command.setName(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Name"));
			command.setType(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Type"));
			command.setDescription(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Description"));
			command.setCommandContent(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandContent"));
			command.setWorkingDir(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].WorkingDir"));
			command.setTimeout(_ctx.longValue("DescribeCommandsResponse.Commands["+ i +"].Timeout"));
			command.setCreationTime(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CreationTime"));
			command.setEnableParameter(_ctx.booleanValue("DescribeCommandsResponse.Commands["+ i +"].EnableParameter"));

			List<String> parameterNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommandsResponse.Commands["+ i +"].ParameterNames.Length"); j++) {
				parameterNames.add(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterNames["+ j +"]"));
			}
			command.setParameterNames(parameterNames);

			commands.add(command);
		}
		describeCommandsResponse.setCommands(commands);
	 
	 	return describeCommandsResponse;
	}
}