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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsDeleteScheduleTaskKeyValueConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDeleteScheduleTaskKeyValueConfigResponseUnmarshaller {

	public static OpsDeleteScheduleTaskKeyValueConfigResponse unmarshall(OpsDeleteScheduleTaskKeyValueConfigResponse opsDeleteScheduleTaskKeyValueConfigResponse, UnmarshallerContext _ctx) {
		
		opsDeleteScheduleTaskKeyValueConfigResponse.setRequestId(_ctx.stringValue("OpsDeleteScheduleTaskKeyValueConfigResponse.RequestId"));
		opsDeleteScheduleTaskKeyValueConfigResponse.setExtendedCode(_ctx.stringValue("OpsDeleteScheduleTaskKeyValueConfigResponse.ExtendedCode"));
		opsDeleteScheduleTaskKeyValueConfigResponse.setMessage(_ctx.stringValue("OpsDeleteScheduleTaskKeyValueConfigResponse.Message"));
		opsDeleteScheduleTaskKeyValueConfigResponse.setCode(_ctx.stringValue("OpsDeleteScheduleTaskKeyValueConfigResponse.Code"));
		opsDeleteScheduleTaskKeyValueConfigResponse.setSuccess(_ctx.stringValue("OpsDeleteScheduleTaskKeyValueConfigResponse.Success"));
	 
	 	return opsDeleteScheduleTaskKeyValueConfigResponse;
	}
}