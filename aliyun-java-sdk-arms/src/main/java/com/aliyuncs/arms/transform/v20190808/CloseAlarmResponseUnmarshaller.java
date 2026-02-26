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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CloseAlarmResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseAlarmResponseUnmarshaller {

	public static CloseAlarmResponse unmarshall(CloseAlarmResponse closeAlarmResponse, UnmarshallerContext _ctx) {
		
		closeAlarmResponse.setRequestId(_ctx.stringValue("CloseAlarmResponse.RequestId"));
		closeAlarmResponse.setResult(_ctx.booleanValue("CloseAlarmResponse.Result"));
		closeAlarmResponse.setCode(_ctx.longValue("CloseAlarmResponse.Code"));
		closeAlarmResponse.setSuccess(_ctx.booleanValue("CloseAlarmResponse.Success"));
		closeAlarmResponse.setMessage(_ctx.stringValue("CloseAlarmResponse.Message"));
	 
	 	return closeAlarmResponse;
	}
}