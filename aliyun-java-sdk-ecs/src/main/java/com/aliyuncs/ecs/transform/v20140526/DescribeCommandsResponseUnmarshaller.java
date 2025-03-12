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
import com.aliyuncs.ecs.model.v20140526.DescribeCommandsResponse.Command.ParameterDefinition;
import com.aliyuncs.ecs.model.v20140526.DescribeCommandsResponse.Command.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommandsResponseUnmarshaller {

	public static DescribeCommandsResponse unmarshall(DescribeCommandsResponse describeCommandsResponse, UnmarshallerContext _ctx) {
		
		describeCommandsResponse.setRequestId(_ctx.stringValue("DescribeCommandsResponse.RequestId"));
		describeCommandsResponse.setPageSize(_ctx.longValue("DescribeCommandsResponse.PageSize"));
		describeCommandsResponse.setPageNumber(_ctx.longValue("DescribeCommandsResponse.PageNumber"));
		describeCommandsResponse.setTotalCount(_ctx.longValue("DescribeCommandsResponse.TotalCount"));
		describeCommandsResponse.setNextToken(_ctx.stringValue("DescribeCommandsResponse.NextToken"));

		List<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommandsResponse.Commands.Length"); i++) {
			Command command = new Command();
			command.setCreationTime(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CreationTime"));
			command.setType(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Type"));
			command.setTimeout(_ctx.longValue("DescribeCommandsResponse.Commands["+ i +"].Timeout"));
			command.setInvokeTimes(_ctx.integerValue("DescribeCommandsResponse.Commands["+ i +"].InvokeTimes"));
			command.setCommandId(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandId"));
			command.setWorkingDir(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].WorkingDir"));
			command.setDescription(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Description"));
			command.setVersion(_ctx.integerValue("DescribeCommandsResponse.Commands["+ i +"].Version"));
			command.setProvider(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Provider"));
			command.setCommandContent(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].CommandContent"));
			command.setCategory(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Category"));
			command.setLatest(_ctx.booleanValue("DescribeCommandsResponse.Commands["+ i +"].Latest"));
			command.setName(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Name"));
			command.setEnableParameter(_ctx.booleanValue("DescribeCommandsResponse.Commands["+ i +"].EnableParameter"));
			command.setResourceGroupId(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ResourceGroupId"));
			command.setLauncher(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Launcher"));

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
				parameterDefinition.setPatternRegex(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].PatternRegex"));

				List<String> possibleValues = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].PossibleValues.Length"); k++) {
					possibleValues.add(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].ParameterDefinitions["+ j +"].PossibleValues["+ k +"]"));
				}
				parameterDefinition.setPossibleValues(possibleValues);

				parameterDefinitions.add(parameterDefinition);
			}
			command.setParameterDefinitions(parameterDefinitions);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCommandsResponse.Commands["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeCommandsResponse.Commands["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			command.setTags(tags);

			commands.add(command);
		}
		describeCommandsResponse.setCommands(commands);
	 
	 	return describeCommandsResponse;
	}
}