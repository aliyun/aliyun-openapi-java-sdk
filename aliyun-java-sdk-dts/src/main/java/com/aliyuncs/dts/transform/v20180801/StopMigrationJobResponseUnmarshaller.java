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

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.StopMigrationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopMigrationJobResponseUnmarshaller {

	public static StopMigrationJobResponse unmarshall(StopMigrationJobResponse stopMigrationJobResponse, UnmarshallerContext _ctx) {
		
		stopMigrationJobResponse.setRequestId(_ctx.stringValue("StopMigrationJobResponse.RequestId"));
		stopMigrationJobResponse.setSuccess(_ctx.stringValue("StopMigrationJobResponse.Success"));
		stopMigrationJobResponse.setErrCode(_ctx.stringValue("StopMigrationJobResponse.ErrCode"));
		stopMigrationJobResponse.setErrMessage(_ctx.stringValue("StopMigrationJobResponse.ErrMessage"));
	 
	 	return stopMigrationJobResponse;
	}
}