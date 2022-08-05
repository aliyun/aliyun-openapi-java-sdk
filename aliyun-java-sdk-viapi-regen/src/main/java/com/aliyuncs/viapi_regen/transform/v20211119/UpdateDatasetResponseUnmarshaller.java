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

import com.aliyuncs.viapi_regen.model.v20211119.UpdateDatasetResponse;
import com.aliyuncs.viapi_regen.model.v20211119.UpdateDatasetResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDatasetResponseUnmarshaller {

	public static UpdateDatasetResponse unmarshall(UpdateDatasetResponse updateDatasetResponse, UnmarshallerContext _ctx) {
		
		updateDatasetResponse.setRequestId(_ctx.stringValue("UpdateDatasetResponse.RequestId"));
		updateDatasetResponse.setMessage(_ctx.stringValue("UpdateDatasetResponse.Message"));
		updateDatasetResponse.setCode(_ctx.stringValue("UpdateDatasetResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateDatasetResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("UpdateDatasetResponse.Data.GmtCreate"));
		data.setName(_ctx.stringValue("UpdateDatasetResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("UpdateDatasetResponse.Data.Description"));
		updateDatasetResponse.setData(data);
	 
	 	return updateDatasetResponse;
	}
}