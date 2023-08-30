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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeCommandsResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeCommandsResponse.Command;
import com.aliyuncs.swas_open.model.v20200601.DescribeCommandsResponse.Command.ParameterDefinition;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommandsResponseUnmarshaller {

	public static DescribeCommandsResponse unmarshall(DescribeCommandsResponse describeCommandsResponse, UnmarshallerContext _ctx) {
		
		describeCommandsResponse.setRequestId(_ctx.stringValue("DescribeCommandsResponse.RequestId"));
		describeCommandsResponse.setTotalCount(_ctx.integerValue("DescribeCommandsResponse.TotalCount"));
		describeCommandsResponse.setPageNumber(_ctx.integerValue("DescribeCommandsResponse.PageNumber"));
		describeCommandsResponse.setPageSize(_ctx.integerValue("DescribeCommandsResponse.PageSize"));

		List<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommandsResponse.Commands.Length"); i++) {
			Command command = new Command();
			command.setCommandId(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandId"));
			command.setCreationTime(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CreationTime"));
			command.setName(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Name"));
			command.setProvider(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Provider"));
			command.setType(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Type"));
			command.setTimeout(_ctx.longValue("DescribeCommandsResponse.Commands["+ i +"].Timeout"));
			command.setDescription(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Description"));
			command.setWorkingDir(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].WorkingDir"));
			command.setCommandContent(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandContent"));
			command.setEnableParameter(_ctx.booleanValue("DescribeCommandsResponse.Commands["+ i +"].EnableParameter"));

			List<String> parameterNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommandsResponse.Commands["+ i +"].ParameterNames.Length"); j++) {
				parameterNames.add(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterNames["+ j +"]"));
			}
			command.setParameterNames(parameterNames);

			List<ParameterDefinition> parameterDefinitions = new ArrayList<ParameterDefinition>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions.Length"); j++) {
				ParameterDefinition parameterDefinition = new ParameterDefinition();
				parameterDefinition.setRequired(_ctx.booleanValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].Required"));
				parameterDefinition.setDescription(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].Description"));
				parameterDefinition.setDefaultValue(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].DefaultValue"));
				parameterDefinition.setParameterName(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].ParameterName"));

				List<String> possibleValues = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].PossibleValues.Length"); k++) {
					possibleValues.add(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].PossibleValues["+ k +"]"));
				}
				parameterDefinition.setPossibleValues(possibleValues);

				parameterDefinitions.add(parameterDefinition);
			}
			command.setParameterDefinitions(parameterDefinitions);

			commands.add(command);
		}
		describeCommandsResponse.setCommands(commands);
	 
	 	return describeCommandsResponse;
	}
}