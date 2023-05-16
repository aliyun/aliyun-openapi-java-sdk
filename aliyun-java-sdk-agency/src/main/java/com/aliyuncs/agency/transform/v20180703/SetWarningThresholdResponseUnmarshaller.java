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

package com.aliyuncs.agency.transform.v20180703;

import com.aliyuncs.agency.model.v20180703.SetWarningThresholdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetWarningThresholdResponseUnmarshaller {

	public static SetWarningThresholdResponse unmarshall(SetWarningThresholdResponse setWarningThresholdResponse, UnmarshallerContext _ctx) {
		
		setWarningThresholdResponse.setCode(_ctx.stringValue("SetWarningThresholdResponse.Code"));
		setWarningThresholdResponse.setMessage(_ctx.stringValue("SetWarningThresholdResponse.Message"));
		setWarningThresholdResponse.setSuccess(_ctx.booleanValue("SetWarningThresholdResponse.Success"));
	 
	 	return setWarningThresholdResponse;
	}
}