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

package com.aliyuncs.rds_data.transform.v20220330;

import com.aliyuncs.rds_data.model.v20220330.UpdateResponse;
import com.aliyuncs.rds_data.model.v20220330.UpdateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateResponseUnmarshaller {

	public static UpdateResponse unmarshall(UpdateResponse updateResponse, UnmarshallerContext _ctx) {
		
		updateResponse.setRequestId(_ctx.stringValue("UpdateResponse.RequestId"));
		updateResponse.setSuccess(_ctx.booleanValue("UpdateResponse.Success"));
		updateResponse.setCode(_ctx.stringValue("UpdateResponse.Code"));
		updateResponse.setMessage(_ctx.stringValue("UpdateResponse.Message"));

		Data data = new Data();
		data.setNumberOfRecordsUpdated(_ctx.longValue("UpdateResponse.Data.NumberOfRecordsUpdated"));
		updateResponse.setData(data);
	 
	 	return updateResponse;
	}
}