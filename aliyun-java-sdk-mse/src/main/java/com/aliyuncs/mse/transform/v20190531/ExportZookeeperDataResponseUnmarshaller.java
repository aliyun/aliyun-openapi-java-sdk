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

import com.aliyuncs.mse.model.v20190531.ExportZookeeperDataResponse;
import com.aliyuncs.mse.model.v20190531.ExportZookeeperDataResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportZookeeperDataResponseUnmarshaller {

	public static ExportZookeeperDataResponse unmarshall(ExportZookeeperDataResponse exportZookeeperDataResponse, UnmarshallerContext _ctx) {
		
		exportZookeeperDataResponse.setRequestId(_ctx.stringValue("ExportZookeeperDataResponse.RequestId"));
		exportZookeeperDataResponse.setSuccess(_ctx.booleanValue("ExportZookeeperDataResponse.Success"));
		exportZookeeperDataResponse.setMessage(_ctx.stringValue("ExportZookeeperDataResponse.Message"));
		exportZookeeperDataResponse.setDynamicMessage(_ctx.stringValue("ExportZookeeperDataResponse.DynamicMessage"));
		exportZookeeperDataResponse.setErrorCode(_ctx.stringValue("ExportZookeeperDataResponse.ErrorCode"));
		exportZookeeperDataResponse.setHttpStatusCode(_ctx.stringValue("ExportZookeeperDataResponse.HttpStatusCode"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("ExportZookeeperDataResponse.Data.InstanceId"));
		data.setExportType(_ctx.stringValue("ExportZookeeperDataResponse.Data.ExportType"));
		data.setContentMap(_ctx.mapValue("ExportZookeeperDataResponse.Data.ContentMap"));
		data.setExtend(_ctx.stringValue("ExportZookeeperDataResponse.Data.Extend"));
		data.setStatus(_ctx.stringValue("ExportZookeeperDataResponse.Data.Status"));
		data.setKubeoneTaskIds(_ctx.stringValue("ExportZookeeperDataResponse.Data.KubeoneTaskIds"));
		data.setId(_ctx.integerValue("ExportZookeeperDataResponse.Data.Id"));
		data.setCreateTime(_ctx.longValue("ExportZookeeperDataResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.longValue("ExportZookeeperDataResponse.Data.UpdateTime"));
		exportZookeeperDataResponse.setData(data);
	 
	 	return exportZookeeperDataResponse;
	}
}