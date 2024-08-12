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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.ListDeviceOtaTaskByTenantResponse;
import com.aliyuncs.wyota.model.v20210420.ListDeviceOtaTaskByTenantResponse.Data;
import com.aliyuncs.wyota.model.v20210420.ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDeviceOtaTaskByTenantResponseUnmarshaller {

	public static ListDeviceOtaTaskByTenantResponse unmarshall(ListDeviceOtaTaskByTenantResponse listDeviceOtaTaskByTenantResponse, UnmarshallerContext _ctx) {
		
		listDeviceOtaTaskByTenantResponse.setRequestId(_ctx.stringValue("ListDeviceOtaTaskByTenantResponse.RequestId"));
		listDeviceOtaTaskByTenantResponse.setCode(_ctx.stringValue("ListDeviceOtaTaskByTenantResponse.Code"));
		listDeviceOtaTaskByTenantResponse.setMessage(_ctx.stringValue("ListDeviceOtaTaskByTenantResponse.Message"));
		listDeviceOtaTaskByTenantResponse.setPageNumber(_ctx.integerValue("ListDeviceOtaTaskByTenantResponse.PageNumber"));
		listDeviceOtaTaskByTenantResponse.setPageSize(_ctx.integerValue("ListDeviceOtaTaskByTenantResponse.PageSize"));
		listDeviceOtaTaskByTenantResponse.setTotalCount(_ctx.longValue("ListDeviceOtaTaskByTenantResponse.TotalCount"));

		Data data = new Data();

		List<TenantDeviceOtaTask> tenantDeviceOtaTasks = new ArrayList<TenantDeviceOtaTask>();
		for (int i = 0; i < _ctx.lengthValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks.Length"); i++) {
			TenantDeviceOtaTask tenantDeviceOtaTask = new TenantDeviceOtaTask();
			tenantDeviceOtaTask.setTaskId(_ctx.integerValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks["+ i +"].TaskId"));
			tenantDeviceOtaTask.setModel(_ctx.stringValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks["+ i +"].Model"));
			tenantDeviceOtaTask.setVersion(_ctx.stringValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks["+ i +"].Version"));
			tenantDeviceOtaTask.setStatus(_ctx.integerValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks["+ i +"].Status"));
			tenantDeviceOtaTask.setOperationStatus(_ctx.integerValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks["+ i +"].OperationStatus"));
			tenantDeviceOtaTask.setPublishTime(_ctx.stringValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks["+ i +"].PublishTime"));
			tenantDeviceOtaTask.setUpgradeCount(_ctx.longValue("ListDeviceOtaTaskByTenantResponse.Data.TenantDeviceOtaTasks["+ i +"].UpgradeCount"));

			tenantDeviceOtaTasks.add(tenantDeviceOtaTask);
		}
		data.setTenantDeviceOtaTasks(tenantDeviceOtaTasks);
		listDeviceOtaTaskByTenantResponse.setData(data);
	 
	 	return listDeviceOtaTaskByTenantResponse;
	}
}