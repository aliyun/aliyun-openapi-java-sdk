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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderTasksResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListTakeStockOrderTasksResponse.TakeStockOrderTaskModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTakeStockOrderTasksResponseUnmarshaller {

	public static ListTakeStockOrderTasksResponse unmarshall(ListTakeStockOrderTasksResponse listTakeStockOrderTasksResponse, UnmarshallerContext _ctx) {
		
		listTakeStockOrderTasksResponse.setRequestId(_ctx.stringValue("ListTakeStockOrderTasksResponse.RequestId"));
		listTakeStockOrderTasksResponse.setPageSize(_ctx.integerValue("ListTakeStockOrderTasksResponse.PageSize"));
		listTakeStockOrderTasksResponse.setTotalCount(_ctx.integerValue("ListTakeStockOrderTasksResponse.TotalCount"));
		listTakeStockOrderTasksResponse.setPageNumber(_ctx.integerValue("ListTakeStockOrderTasksResponse.PageNumber"));
		listTakeStockOrderTasksResponse.setSuccess(_ctx.booleanValue("ListTakeStockOrderTasksResponse.Success"));

		List<TakeStockOrderTaskModel> takeStockOrderTasks = new ArrayList<TakeStockOrderTaskModel>();
		for (int i = 0; i < _ctx.lengthValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks.Length"); i++) {
			TakeStockOrderTaskModel takeStockOrderTaskModel = new TakeStockOrderTaskModel();
			takeStockOrderTaskModel.setDeviceNumber(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].DeviceNumber"));
			takeStockOrderTaskModel.setCreateDate(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].CreateDate"));
			takeStockOrderTaskModel.setOperateQuantity(_ctx.integerValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].OperateQuantity"));
			takeStockOrderTaskModel.setStatus(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].Status"));
			takeStockOrderTaskModel.setTakeStockTaskId(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].TakeStockTaskId"));
			takeStockOrderTaskModel.setSyncStatus(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].SyncStatus"));
			takeStockOrderTaskModel.setDescription(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].Description"));
			takeStockOrderTaskModel.setTakeStockOrderId(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].TakeStockOrderId"));
			takeStockOrderTaskModel.setCode(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].Code"));
			takeStockOrderTaskModel.setUpdateDate(_ctx.stringValue("ListTakeStockOrderTasksResponse.TakeStockOrderTasks["+ i +"].UpdateDate"));

			takeStockOrderTasks.add(takeStockOrderTaskModel);
		}
		listTakeStockOrderTasksResponse.setTakeStockOrderTasks(takeStockOrderTasks);
	 
	 	return listTakeStockOrderTasksResponse;
	}
}