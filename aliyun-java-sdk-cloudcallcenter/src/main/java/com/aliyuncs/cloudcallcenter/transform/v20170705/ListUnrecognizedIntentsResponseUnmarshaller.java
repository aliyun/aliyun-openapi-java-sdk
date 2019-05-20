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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListUnrecognizedIntentsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUnrecognizedIntentsResponse.Intents;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListUnrecognizedIntentsResponse.Intents.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUnrecognizedIntentsResponseUnmarshaller {

	public static ListUnrecognizedIntentsResponse unmarshall(ListUnrecognizedIntentsResponse listUnrecognizedIntentsResponse, UnmarshallerContext context) {
		
		listUnrecognizedIntentsResponse.setRequestId(context.stringValue("ListUnrecognizedIntentsResponse.RequestId"));
		listUnrecognizedIntentsResponse.setSuccess(context.booleanValue("ListUnrecognizedIntentsResponse.Success"));
		listUnrecognizedIntentsResponse.setCode(context.stringValue("ListUnrecognizedIntentsResponse.Code"));
		listUnrecognizedIntentsResponse.setMessage(context.stringValue("ListUnrecognizedIntentsResponse.Message"));
		listUnrecognizedIntentsResponse.setHttpStatusCode(context.integerValue("ListUnrecognizedIntentsResponse.HttpStatusCode"));

		Intents intents = new Intents();
		intents.setTotalCount(context.integerValue("ListUnrecognizedIntentsResponse.Intents.TotalCount"));
		intents.setPageNumber(context.integerValue("ListUnrecognizedIntentsResponse.Intents.PageNumber"));
		intents.setPageSize(context.integerValue("ListUnrecognizedIntentsResponse.Intents.PageSize"));

		List<Task> list = new ArrayList<Task>();
		for (int i = 0; i < context.lengthValue("ListUnrecognizedIntentsResponse.Intents.List.Length"); i++) {
			Task task = new Task();
			task.setQuestion(context.stringValue("ListUnrecognizedIntentsResponse.Intents.List["+ i +"].Question"));
			task.setNodeId(context.stringValue("ListUnrecognizedIntentsResponse.Intents.List["+ i +"].NodeId"));
			task.setTotalCount(context.integerValue("ListUnrecognizedIntentsResponse.Intents.List["+ i +"].TotalCount"));
			task.setUnrecognizedCount(context.integerValue("ListUnrecognizedIntentsResponse.Intents.List["+ i +"].UnrecognizedCount"));
			task.setUnrecognizedPercentage(context.integerValue("ListUnrecognizedIntentsResponse.Intents.List["+ i +"].UnrecognizedPercentage"));

			list.add(task);
		}
		intents.setList(list);
		listUnrecognizedIntentsResponse.setIntents(intents);
	 
	 	return listUnrecognizedIntentsResponse;
	}
}