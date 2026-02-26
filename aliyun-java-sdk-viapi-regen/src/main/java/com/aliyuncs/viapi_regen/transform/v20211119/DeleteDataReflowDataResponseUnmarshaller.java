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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.DeleteDataReflowDataResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DeleteDataReflowDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDataReflowDataResponseUnmarshaller {

	public static DeleteDataReflowDataResponse unmarshall(DeleteDataReflowDataResponse deleteDataReflowDataResponse, UnmarshallerContext _ctx) {
		
		deleteDataReflowDataResponse.setRequestId(_ctx.stringValue("DeleteDataReflowDataResponse.RequestId"));
		deleteDataReflowDataResponse.setMessage(_ctx.stringValue("DeleteDataReflowDataResponse.Message"));
		deleteDataReflowDataResponse.setCode(_ctx.stringValue("DeleteDataReflowDataResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteDataReflowDataResponse.Data.Id"));
		data.setServiceId(_ctx.longValue("DeleteDataReflowDataResponse.Data.ServiceId"));
		data.setStatus(_ctx.stringValue("DeleteDataReflowDataResponse.Data.Status"));
		data.setGmtModified(_ctx.longValue("DeleteDataReflowDataResponse.Data.GmtModified"));
		deleteDataReflowDataResponse.setData(data);
	 
	 	return deleteDataReflowDataResponse;
	}
}