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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.SetUserAlarmThresholdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetUserAlarmThresholdResponseUnmarshaller {

	public static SetUserAlarmThresholdResponse unmarshall(SetUserAlarmThresholdResponse setUserAlarmThresholdResponse, UnmarshallerContext context) {
		
		setUserAlarmThresholdResponse.setRequestId(context.stringValue("SetUserAlarmThresholdResponse.RequestId"));
		setUserAlarmThresholdResponse.setCode(context.stringValue("SetUserAlarmThresholdResponse.Code"));
		setUserAlarmThresholdResponse.setMessage(context.stringValue("SetUserAlarmThresholdResponse.Message"));
		setUserAlarmThresholdResponse.setSuccess(context.booleanValue("SetUserAlarmThresholdResponse.Success"));
		setUserAlarmThresholdResponse.setData(context.booleanValue("SetUserAlarmThresholdResponse.Data"));
	 
	 	return setUserAlarmThresholdResponse;
	}
}