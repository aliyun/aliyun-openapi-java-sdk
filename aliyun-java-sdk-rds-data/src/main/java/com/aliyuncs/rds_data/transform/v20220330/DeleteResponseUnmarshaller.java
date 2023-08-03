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

import com.aliyuncs.rds_data.model.v20220330.DeleteResponse;
import com.aliyuncs.rds_data.model.v20220330.DeleteResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteResponseUnmarshaller {

	public static DeleteResponse unmarshall(DeleteResponse deleteResponse, UnmarshallerContext _ctx) {
		
		deleteResponse.setRequestId(_ctx.stringValue("DeleteResponse.RequestId"));
		deleteResponse.setSuccess(_ctx.booleanValue("DeleteResponse.Success"));
		deleteResponse.setCode(_ctx.stringValue("DeleteResponse.Code"));
		deleteResponse.setMessage(_ctx.stringValue("DeleteResponse.Message"));

		Data data = new Data();
		data.setNumberOfRecordsUpdated(_ctx.longValue("DeleteResponse.Data.NumberOfRecordsUpdated"));
		deleteResponse.setData(data);
	 
	 	return deleteResponse;
	}
}