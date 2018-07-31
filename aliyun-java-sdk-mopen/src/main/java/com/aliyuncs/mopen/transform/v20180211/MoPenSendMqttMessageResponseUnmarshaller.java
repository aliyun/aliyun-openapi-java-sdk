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

package com.aliyuncs.mopen.transform.v20180211;

import com.aliyuncs.mopen.model.v20180211.MoPenSendMqttMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoPenSendMqttMessageResponseUnmarshaller {

	public static MoPenSendMqttMessageResponse unmarshall(MoPenSendMqttMessageResponse moPenSendMqttMessageResponse, UnmarshallerContext context) {
		
		moPenSendMqttMessageResponse.setRequestId(context.stringValue("MoPenSendMqttMessageResponse.RequestId"));
		moPenSendMqttMessageResponse.setCode(context.stringValue("MoPenSendMqttMessageResponse.Code"));
		moPenSendMqttMessageResponse.setMessage(context.stringValue("MoPenSendMqttMessageResponse.Message"));
		moPenSendMqttMessageResponse.setSuccess(context.booleanValue("MoPenSendMqttMessageResponse.Success"));
		moPenSendMqttMessageResponse.setDescription(context.stringValue("MoPenSendMqttMessageResponse.Description"));
	 
	 	return moPenSendMqttMessageResponse;
	}
}