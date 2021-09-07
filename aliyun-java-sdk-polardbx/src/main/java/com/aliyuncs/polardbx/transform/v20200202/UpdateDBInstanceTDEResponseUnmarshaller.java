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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.UpdateDBInstanceTDEResponse;
import com.aliyuncs.polardbx.model.v20200202.UpdateDBInstanceTDEResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDBInstanceTDEResponseUnmarshaller {

	public static UpdateDBInstanceTDEResponse unmarshall(UpdateDBInstanceTDEResponse updateDBInstanceTDEResponse, UnmarshallerContext _ctx) {
		
		updateDBInstanceTDEResponse.setRequestId(_ctx.stringValue("UpdateDBInstanceTDEResponse.RequestId"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("UpdateDBInstanceTDEResponse.Data.TaskId"));
		updateDBInstanceTDEResponse.setData(data);
	 
	 	return updateDBInstanceTDEResponse;
	}
}