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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListScheduledTasksResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScheduledTasksResponseUnmarshaller {

	public static ListScheduledTasksResponse unmarshall(ListScheduledTasksResponse listScheduledTasksResponse, UnmarshallerContext _ctx) {
		
		listScheduledTasksResponse.setRequestId(_ctx.stringValue("ListScheduledTasksResponse.requestId"));
		listScheduledTasksResponse.setTotalCount(_ctx.longValue("ListScheduledTasksResponse.totalCount"));

		List<Map<Object, Object>> result = _ctx.listMapValue("ListScheduledTasksResponse.result");
		listScheduledTasksResponse.setResult(result);
	 
	 	return listScheduledTasksResponse;
	}
}