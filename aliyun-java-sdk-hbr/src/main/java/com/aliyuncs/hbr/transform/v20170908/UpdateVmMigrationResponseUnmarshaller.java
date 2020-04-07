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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.UpdateVmMigrationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateVmMigrationResponseUnmarshaller {

	public static UpdateVmMigrationResponse unmarshall(UpdateVmMigrationResponse updateVmMigrationResponse, UnmarshallerContext _ctx) {
		
		updateVmMigrationResponse.setRequestId(_ctx.stringValue("UpdateVmMigrationResponse.RequestId"));
		updateVmMigrationResponse.setSuccess(_ctx.booleanValue("UpdateVmMigrationResponse.Success"));
		updateVmMigrationResponse.setCode(_ctx.stringValue("UpdateVmMigrationResponse.Code"));
		updateVmMigrationResponse.setMessage(_ctx.stringValue("UpdateVmMigrationResponse.Message"));
	 
	 	return updateVmMigrationResponse;
	}
}