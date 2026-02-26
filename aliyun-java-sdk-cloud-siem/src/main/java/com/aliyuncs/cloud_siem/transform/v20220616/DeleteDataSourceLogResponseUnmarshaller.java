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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.DeleteDataSourceLogResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DeleteDataSourceLogResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDataSourceLogResponseUnmarshaller {

	public static DeleteDataSourceLogResponse unmarshall(DeleteDataSourceLogResponse deleteDataSourceLogResponse, UnmarshallerContext _ctx) {
		
		deleteDataSourceLogResponse.setRequestId(_ctx.stringValue("DeleteDataSourceLogResponse.RequestId"));

		Data data = new Data();
		data.setCount(_ctx.integerValue("DeleteDataSourceLogResponse.Data.Count"));
		data.setLogInstanceId(_ctx.stringValue("DeleteDataSourceLogResponse.Data.LogInstanceId"));
		deleteDataSourceLogResponse.setData(data);
	 
	 	return deleteDataSourceLogResponse;
	}
}