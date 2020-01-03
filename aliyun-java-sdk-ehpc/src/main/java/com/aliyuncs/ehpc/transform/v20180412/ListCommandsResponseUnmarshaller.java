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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListCommandsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListCommandsResponse.Command;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommandsResponseUnmarshaller {

	public static ListCommandsResponse unmarshall(ListCommandsResponse listCommandsResponse, UnmarshallerContext _ctx) {
		
		listCommandsResponse.setRequestId(_ctx.stringValue("ListCommandsResponse.RequestId"));
		listCommandsResponse.setTotalCount(_ctx.integerValue("ListCommandsResponse.TotalCount"));
		listCommandsResponse.setPageNumber(_ctx.integerValue("ListCommandsResponse.PageNumber"));
		listCommandsResponse.setPageSize(_ctx.integerValue("ListCommandsResponse.PageSize"));

		List<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < _ctx.lengthValue("ListCommandsResponse.Commands.Length"); i++) {
			Command command = new Command();
			command.setCommandId(_ctx.stringValue("ListCommandsResponse.Commands["+ i +"].CommandId"));
			command.setCommandContent(_ctx.stringValue("ListCommandsResponse.Commands["+ i +"].CommandContent"));
			command.setWorkingDir(_ctx.stringValue("ListCommandsResponse.Commands["+ i +"].WorkingDir"));
			command.setTimeout(_ctx.stringValue("ListCommandsResponse.Commands["+ i +"].Timeout"));

			commands.add(command);
		}
		listCommandsResponse.setCommands(commands);
	 
	 	return listCommandsResponse;
	}
}