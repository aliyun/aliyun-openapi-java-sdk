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

package com.aliyuncs.dms_lab.transform.v20200915;

import com.aliyuncs.dms_lab.model.v20200915.ReleaseDatabaseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseDatabaseResponseUnmarshaller {

	public static ReleaseDatabaseResponse unmarshall(ReleaseDatabaseResponse releaseDatabaseResponse, UnmarshallerContext _ctx) {
		
		releaseDatabaseResponse.setRequestId(_ctx.stringValue("ReleaseDatabaseResponse.RequestId"));
		releaseDatabaseResponse.setSuccess(_ctx.booleanValue("ReleaseDatabaseResponse.Success"));
		releaseDatabaseResponse.setErrorMessage(_ctx.stringValue("ReleaseDatabaseResponse.ErrorMessage"));
		releaseDatabaseResponse.setErrorCode(_ctx.stringValue("ReleaseDatabaseResponse.ErrorCode"));
		releaseDatabaseResponse.setTaskId(_ctx.longValue("ReleaseDatabaseResponse.TaskId"));
	 
	 	return releaseDatabaseResponse;
	}
}