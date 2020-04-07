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

import com.aliyuncs.hbr.model.v20170908.TestRestoreVmMigrationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestRestoreVmMigrationResponseUnmarshaller {

	public static TestRestoreVmMigrationResponse unmarshall(TestRestoreVmMigrationResponse testRestoreVmMigrationResponse, UnmarshallerContext _ctx) {
		
		testRestoreVmMigrationResponse.setRequestId(_ctx.stringValue("TestRestoreVmMigrationResponse.RequestId"));
		testRestoreVmMigrationResponse.setSuccess(_ctx.booleanValue("TestRestoreVmMigrationResponse.Success"));
		testRestoreVmMigrationResponse.setCode(_ctx.stringValue("TestRestoreVmMigrationResponse.Code"));
		testRestoreVmMigrationResponse.setMessage(_ctx.stringValue("TestRestoreVmMigrationResponse.Message"));
		testRestoreVmMigrationResponse.setPass(_ctx.booleanValue("TestRestoreVmMigrationResponse.Pass"));
		testRestoreVmMigrationResponse.setErrorCode(_ctx.stringValue("TestRestoreVmMigrationResponse.ErrorCode"));
		testRestoreVmMigrationResponse.setRestoreTime(_ctx.longValue("TestRestoreVmMigrationResponse.RestoreTime"));
	 
	 	return testRestoreVmMigrationResponse;
	}
}