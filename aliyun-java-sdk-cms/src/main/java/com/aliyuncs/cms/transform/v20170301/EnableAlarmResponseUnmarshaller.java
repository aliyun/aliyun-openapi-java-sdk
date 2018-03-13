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
package com.aliyuncs.cms.transform.v20170301;

import com.aliyuncs.cms.model.v20170301.EnableAlarmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableAlarmResponseUnmarshaller {

	public static EnableAlarmResponse unmarshall(EnableAlarmResponse enableAlarmResponse, UnmarshallerContext context) {
		
		enableAlarmResponse.setRequestId(context.stringValue("EnableAlarmResponse.RequestId"));
		enableAlarmResponse.setSuccess(context.booleanValue("EnableAlarmResponse.Success"));
		enableAlarmResponse.setCode(context.stringValue("EnableAlarmResponse.Code"));
		enableAlarmResponse.setMessage(context.stringValue("EnableAlarmResponse.Message"));
	 
	 	return enableAlarmResponse;
	}
}