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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.HangUpDoubleCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class HangUpDoubleCallResponseUnmarshaller {

	public static HangUpDoubleCallResponse unmarshall(HangUpDoubleCallResponse hangUpDoubleCallResponse, UnmarshallerContext _ctx) {
		
		hangUpDoubleCallResponse.setRequestId(_ctx.stringValue("HangUpDoubleCallResponse.RequestId"));
		hangUpDoubleCallResponse.setMessage(_ctx.stringValue("HangUpDoubleCallResponse.Message"));
		hangUpDoubleCallResponse.setCode(_ctx.stringValue("HangUpDoubleCallResponse.Code"));
		hangUpDoubleCallResponse.setSuccess(_ctx.booleanValue("HangUpDoubleCallResponse.Success"));
	 
	 	return hangUpDoubleCallResponse;
	}
}