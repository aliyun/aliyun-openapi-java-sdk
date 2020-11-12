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

package com.aliyuncs.openanalytics_open.transform.v20200928;

import com.aliyuncs.openanalytics_open.model.v20200928.AlterDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AlterDatabaseResponseUnmarshaller {

	public static AlterDatabaseResponse unmarshall(AlterDatabaseResponse alterDatabaseResponse, UnmarshallerContext _ctx) {
		
		alterDatabaseResponse.setRequestId(_ctx.stringValue("AlterDatabaseResponse.RequestId"));
		alterDatabaseResponse.setMessage(_ctx.stringValue("AlterDatabaseResponse.Message"));
		alterDatabaseResponse.setData(_ctx.stringValue("AlterDatabaseResponse.Data"));
		alterDatabaseResponse.setCode(_ctx.stringValue("AlterDatabaseResponse.Code"));
		alterDatabaseResponse.setSuccess(_ctx.booleanValue("AlterDatabaseResponse.Success"));
	 
	 	return alterDatabaseResponse;
	}
}