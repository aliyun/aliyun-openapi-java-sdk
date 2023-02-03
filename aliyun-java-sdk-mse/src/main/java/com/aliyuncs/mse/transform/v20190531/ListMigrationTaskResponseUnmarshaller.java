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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListMigrationTaskResponse;
import com.aliyuncs.mse.model.v20190531.ListMigrationTaskResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMigrationTaskResponseUnmarshaller {

	public static ListMigrationTaskResponse unmarshall(ListMigrationTaskResponse listMigrationTaskResponse, UnmarshallerContext _ctx) {
		
		listMigrationTaskResponse.setRequestId(_ctx.stringValue("ListMigrationTaskResponse.RequestId"));
		listMigrationTaskResponse.setHttpCode(_ctx.stringValue("ListMigrationTaskResponse.HttpCode"));
		listMigrationTaskResponse.setPageSize(_ctx.longValue("ListMigrationTaskResponse.PageSize"));
		listMigrationTaskResponse.setPageNumber(_ctx.longValue("ListMigrationTaskResponse.PageNumber"));
		listMigrationTaskResponse.setTotalCount(_ctx.longValue("ListMigrationTaskResponse.TotalCount"));
		listMigrationTaskResponse.setMessage(_ctx.stringValue("ListMigrationTaskResponse.Message"));
		listMigrationTaskResponse.setErrorCode(_ctx.stringValue("ListMigrationTaskResponse.ErrorCode"));
		listMigrationTaskResponse.setSuccess(_ctx.booleanValue("ListMigrationTaskResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMigrationTaskResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListMigrationTaskResponse.Data["+ i +"].Id"));
			dataItem.setUserId(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].UserId"));
			dataItem.setClusterType(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].ClusterType"));
			dataItem.setOriginInstanceAddress(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].OriginInstanceAddress"));
			dataItem.setOriginInstanceName(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].OriginInstanceName"));
			dataItem.setOriginInstanceNamespace(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].OriginInstanceNamespace"));
			dataItem.setTargetInstanceId(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].TargetInstanceId"));
			dataItem.setTargetClusterName(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].TargetClusterName"));
			dataItem.setTargetClusterUrl(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].TargetClusterUrl"));
			dataItem.setProjectDesc(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].ProjectDesc"));
			dataItem.setGmtCreate(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListMigrationTaskResponse.Data["+ i +"].GmtModified"));

			data.add(dataItem);
		}
		listMigrationTaskResponse.setData(data);
	 
	 	return listMigrationTaskResponse;
	}
}