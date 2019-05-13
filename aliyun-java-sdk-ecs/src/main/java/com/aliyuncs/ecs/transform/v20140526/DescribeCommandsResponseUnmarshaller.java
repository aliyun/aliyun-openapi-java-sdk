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

	public static DescribeCommandsResponse unmarshall(DescribeCommandsResponse describeCommandsResponse, UnmarshallerContext context) {
		
		describeCommandsResponse.setRequestId(context.stringValue("DescribeCommandsResponse.RequestId"));
		describeCommandsResponse.setTotalCount(context.longValue("DescribeCommandsResponse.TotalCount"));
		describeCommandsResponse.setPageNumber(context.longValue("DescribeCommandsResponse.PageNumber"));
		describeCommandsResponse.setPageSize(context.longValue("DescribeCommandsResponse.PageSize"));

		List<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < context.lengthValue("DescribeCommandsResponse.Commands.Length"); i++) {
			Command command = new Command();
			command.setCommandId(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandId"));
			command.setName(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].Name"));
			command.setType(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].Type"));
			command.setDescription(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].Description"));
			command.setCommandContent(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandContent"));
			command.setWorkingDir(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].WorkingDir"));
			command.setTimeout(context.longValue("DescribeCommandsResponse.Commands["+ i +"].Timeout"));
			command.setCreationTime(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].CreationTime"));
			command.setEnableParameter(context.booleanValue("DescribeCommandsResponse.Commands["+ i +"].EnableParameter"));

			List<String> parameterNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCommandsResponse.Commands["+ i +"].ParameterNames.Length"); j++) {
				parameterNames.add(context.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterNames["+ j +"]"));
			}
			command.setParameterNames(parameterNames);

			commands.add(command);
		}
		describeCommandsResponse.setCommands(commands);
	 
	 	return describeCommandsResponse;
	}
}