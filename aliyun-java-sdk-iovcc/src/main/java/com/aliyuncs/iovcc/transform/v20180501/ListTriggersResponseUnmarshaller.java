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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListTriggersResponse;
import com.aliyuncs.iovcc.model.v20180501.ListTriggersResponse.TriggerList;
import com.aliyuncs.iovcc.model.v20180501.ListTriggersResponse.TriggerList.Pagination;
import com.aliyuncs.iovcc.model.v20180501.ListTriggersResponse.TriggerList.Trigger;
import com.aliyuncs.iovcc.model.v20180501.ListTriggersResponse.TriggerList.Trigger.Function;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTriggersResponseUnmarshaller {

	public static ListTriggersResponse unmarshall(ListTriggersResponse listTriggersResponse, UnmarshallerContext _ctx) {
		
		listTriggersResponse.setRequestId(_ctx.stringValue("ListTriggersResponse.RequestId"));

		TriggerList triggerList = new TriggerList();

		Pagination pagination = new Pagination();
		pagination.setPageIndex(_ctx.integerValue("ListTriggersResponse.TriggerList.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListTriggersResponse.TriggerList.Pagination.PageSize"));
		pagination.setTotalCount(_ctx.integerValue("ListTriggersResponse.TriggerList.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListTriggersResponse.TriggerList.Pagination.TotalPageCount"));
		triggerList.setPagination(pagination);

		List<Trigger> triggers = new ArrayList<Trigger>();
		for (int i = 0; i < _ctx.lengthValue("ListTriggersResponse.TriggerList.Triggers.Length"); i++) {
			Trigger trigger = new Trigger();
			trigger.setId(_ctx.longValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Id"));
			trigger.setNamespace(_ctx.stringValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Namespace"));
			trigger.setSource(_ctx.stringValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Source"));
			trigger.setGmtCreate(_ctx.longValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].GmtCreate"));
			trigger.setGmtModified(_ctx.longValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].GmtModified"));
			trigger.setChainedFunctionIds(_ctx.stringValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].ChainedFunctionIds"));
			trigger.setType(_ctx.integerValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Type"));
			trigger.setStatus(_ctx.integerValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Status"));
			trigger.setInvocationMode(_ctx.integerValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].InvocationMode"));
			trigger.setSandbox(_ctx.integerValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Sandbox"));
			trigger.setProduction(_ctx.integerValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Production"));

			List<Function> functions = new ArrayList<Function>();
			for (int j = 0; j < _ctx.lengthValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Functions.Length"); j++) {
				Function function = new Function();
				function.setId(_ctx.longValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Functions["+ j +"].Id"));
				function.setName(_ctx.stringValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Functions["+ j +"].Name"));
				function.setFileId(_ctx.longValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Functions["+ j +"].FileId"));
				function.setFileName(_ctx.stringValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Functions["+ j +"].FileName"));
				function.setGmtCreate(_ctx.longValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Functions["+ j +"].GmtCreate"));
				function.setGmtModified(_ctx.longValue("ListTriggersResponse.TriggerList.Triggers["+ i +"].Functions["+ j +"].GmtModified"));

				functions.add(function);
			}
			trigger.setFunctions(functions);

			triggers.add(trigger);
		}
		triggerList.setTriggers(triggers);
		listTriggersResponse.setTriggerList(triggerList);
	 
	 	return listTriggersResponse;
	}
}