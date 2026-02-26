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

import com.aliyuncs.mse.model.v20190531.ListExportZookeeperDataResponse;
import com.aliyuncs.mse.model.v20190531.ListExportZookeeperDataResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExportZookeeperDataResponseUnmarshaller {

	public static ListExportZookeeperDataResponse unmarshall(ListExportZookeeperDataResponse listExportZookeeperDataResponse, UnmarshallerContext _ctx) {
		
		listExportZookeeperDataResponse.setRequestId(_ctx.stringValue("ListExportZookeeperDataResponse.RequestId"));
		listExportZookeeperDataResponse.setSuccess(_ctx.booleanValue("ListExportZookeeperDataResponse.Success"));
		listExportZookeeperDataResponse.setMessage(_ctx.stringValue("ListExportZookeeperDataResponse.Message"));
		listExportZookeeperDataResponse.setDynamicMessage(_ctx.stringValue("ListExportZookeeperDataResponse.DynamicMessage"));
		listExportZookeeperDataResponse.setErrorCode(_ctx.stringValue("ListExportZookeeperDataResponse.ErrorCode"));
		listExportZookeeperDataResponse.setHttpStatusCode(_ctx.stringValue("ListExportZookeeperDataResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExportZookeeperDataResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.stringValue("ListExportZookeeperDataResponse.Data["+ i +"].InstanceId"));
			dataItem.setExportType(_ctx.stringValue("ListExportZookeeperDataResponse.Data["+ i +"].ExportType"));
			dataItem.setContentMap(_ctx.stringValue("ListExportZookeeperDataResponse.Data["+ i +"].ContentMap"));
			dataItem.setExtend(_ctx.stringValue("ListExportZookeeperDataResponse.Data["+ i +"].Extend"));
			dataItem.setStatus(_ctx.stringValue("ListExportZookeeperDataResponse.Data["+ i +"].Status"));
			dataItem.setKubeoneTaskIds(_ctx.stringValue("ListExportZookeeperDataResponse.Data["+ i +"].KubeoneTaskIds"));
			dataItem.setId(_ctx.integerValue("ListExportZookeeperDataResponse.Data["+ i +"].Id"));
			dataItem.setCreateTime(_ctx.longValue("ListExportZookeeperDataResponse.Data["+ i +"].CreateTime"));
			dataItem.setUpdateTime(_ctx.longValue("ListExportZookeeperDataResponse.Data["+ i +"].UpdateTime"));

			data.add(dataItem);
		}
		listExportZookeeperDataResponse.setData(data);
	 
	 	return listExportZookeeperDataResponse;
	}
}