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

package com.aliyuncs.ecs_workbench.transform.v20220220;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs_workbench.model.v20220220.ListTerminalCommandsResponse;
import com.aliyuncs.ecs_workbench.model.v20220220.ListTerminalCommandsResponse.TerminalCommandListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTerminalCommandsResponseUnmarshaller {

	public static ListTerminalCommandsResponse unmarshall(ListTerminalCommandsResponse listTerminalCommandsResponse, UnmarshallerContext _ctx) {
		
		listTerminalCommandsResponse.setRequestId(_ctx.stringValue("ListTerminalCommandsResponse.RequestId"));
		listTerminalCommandsResponse.setTotalCount(_ctx.integerValue("ListTerminalCommandsResponse.TotalCount"));
		listTerminalCommandsResponse.setPageSize(_ctx.integerValue("ListTerminalCommandsResponse.PageSize"));
		listTerminalCommandsResponse.setPageNumber(_ctx.integerValue("ListTerminalCommandsResponse.PageNumber"));

		List<TerminalCommandListItem> terminalCommandList = new ArrayList<TerminalCommandListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTerminalCommandsResponse.TerminalCommandList.Length"); i++) {
			TerminalCommandListItem terminalCommandListItem = new TerminalCommandListItem();
			terminalCommandListItem.setCreateTime(_ctx.stringValue("ListTerminalCommandsResponse.TerminalCommandList["+ i +"].CreateTime"));
			terminalCommandListItem.setCommandLine(_ctx.stringValue("ListTerminalCommandsResponse.TerminalCommandList["+ i +"].CommandLine"));
			terminalCommandListItem.setLoginUser(_ctx.stringValue("ListTerminalCommandsResponse.TerminalCommandList["+ i +"].LoginUser"));
			terminalCommandListItem.setExecutePath(_ctx.stringValue("ListTerminalCommandsResponse.TerminalCommandList["+ i +"].ExecutePath"));

			terminalCommandList.add(terminalCommandListItem);
		}
		listTerminalCommandsResponse.setTerminalCommandList(terminalCommandList);
	 
	 	return listTerminalCommandsResponse;
	}
}