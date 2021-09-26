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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListRefDISyncTasksResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListRefDISyncTasksResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListRefDISyncTasksResponse.Data.DISyncTasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRefDISyncTasksResponseUnmarshaller {

	public static ListRefDISyncTasksResponse unmarshall(ListRefDISyncTasksResponse listRefDISyncTasksResponse, UnmarshallerContext _ctx) {
		
		listRefDISyncTasksResponse.setRequestId(_ctx.stringValue("ListRefDISyncTasksResponse.RequestId"));
		listRefDISyncTasksResponse.setSuccess(_ctx.booleanValue("ListRefDISyncTasksResponse.Success"));

		Data data = new Data();

		List<DISyncTasksItem> dISyncTasks = new ArrayList<DISyncTasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRefDISyncTasksResponse.Data.DISyncTasks.Length"); i++) {
			DISyncTasksItem dISyncTasksItem = new DISyncTasksItem();
			dISyncTasksItem.setNodeName(_ctx.stringValue("ListRefDISyncTasksResponse.Data.DISyncTasks["+ i +"].NodeName"));
			dISyncTasksItem.setNodeId(_ctx.longValue("ListRefDISyncTasksResponse.Data.DISyncTasks["+ i +"].NodeId"));
			dISyncTasksItem.setTaskType(_ctx.stringValue("ListRefDISyncTasksResponse.Data.DISyncTasks["+ i +"].TaskType"));
			dISyncTasksItem.setDiDestinationDatasource(_ctx.stringValue("ListRefDISyncTasksResponse.Data.DISyncTasks["+ i +"].DiDestinationDatasource"));
			dISyncTasksItem.setDiSourceDatasource(_ctx.stringValue("ListRefDISyncTasksResponse.Data.DISyncTasks["+ i +"].DiSourceDatasource"));

			dISyncTasks.add(dISyncTasksItem);
		}
		data.setDISyncTasks(dISyncTasks);
		listRefDISyncTasksResponse.setData(data);
	 
	 	return listRefDISyncTasksResponse;
	}
}