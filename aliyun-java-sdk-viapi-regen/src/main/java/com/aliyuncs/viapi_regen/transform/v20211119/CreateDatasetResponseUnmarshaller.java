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

import com.aliyuncs.viapi_regen.model.v20211119.CreateDatasetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CreateDatasetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatasetResponseUnmarshaller {

	public static CreateDatasetResponse unmarshall(CreateDatasetResponse createDatasetResponse, UnmarshallerContext _ctx) {
		
		createDatasetResponse.setRequestId(_ctx.stringValue("CreateDatasetResponse.RequestId"));
		createDatasetResponse.setMessage(_ctx.stringValue("CreateDatasetResponse.Message"));
		createDatasetResponse.setCode(_ctx.stringValue("CreateDatasetResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateDatasetResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("CreateDatasetResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("CreateDatasetResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("CreateDatasetResponse.Data.Description"));
		createDatasetResponse.setData(data);
	 
	 	return createDatasetResponse;
	}
}