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

package com.aliyuncs.resellertrade.transform.v20191227;

import com.aliyuncs.resellertrade.model.v20191227.MigrateResourceResponse;
import com.aliyuncs.resellertrade.model.v20191227.MigrateResourceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class MigrateResourceResponseUnmarshaller {

	public static MigrateResourceResponse unmarshall(MigrateResourceResponse migrateResourceResponse, UnmarshallerContext _ctx) {
		
		migrateResourceResponse.setRequestId(_ctx.stringValue("MigrateResourceResponse.RequestId"));
		migrateResourceResponse.setCode(_ctx.stringValue("MigrateResourceResponse.Code"));
		migrateResourceResponse.setMessage(_ctx.stringValue("MigrateResourceResponse.Message"));
		migrateResourceResponse.setSuccess(_ctx.booleanValue("MigrateResourceResponse.Success"));

		Data data = new Data();
		data.setProcEnvir(_ctx.stringValue("MigrateResourceResponse.Data.ProcEnvir"));
		data.setContent(_ctx.stringValue("MigrateResourceResponse.Data.Content"));
		migrateResourceResponse.setData(data);
	 
	 	return migrateResourceResponse;
	}
}