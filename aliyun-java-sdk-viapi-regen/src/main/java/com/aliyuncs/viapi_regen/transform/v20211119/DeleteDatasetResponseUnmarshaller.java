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

import com.aliyuncs.viapi_regen.model.v20211119.DeleteDatasetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DeleteDatasetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDatasetResponseUnmarshaller {

	public static DeleteDatasetResponse unmarshall(DeleteDatasetResponse deleteDatasetResponse, UnmarshallerContext _ctx) {
		
		deleteDatasetResponse.setRequestId(_ctx.stringValue("DeleteDatasetResponse.RequestId"));
		deleteDatasetResponse.setMessage(_ctx.stringValue("DeleteDatasetResponse.Message"));
		deleteDatasetResponse.setCode(_ctx.stringValue("DeleteDatasetResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteDatasetResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("DeleteDatasetResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("DeleteDatasetResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("DeleteDatasetResponse.Data.Description"));
		deleteDatasetResponse.setData(data);
	 
	 	return deleteDatasetResponse;
	}
}