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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.SaveProbeDataSubscriberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveProbeDataSubscriberResponseUnmarshaller {

	public static SaveProbeDataSubscriberResponse unmarshall(SaveProbeDataSubscriberResponse saveProbeDataSubscriberResponse, UnmarshallerContext context) {
		
		saveProbeDataSubscriberResponse.setRequestId(context.stringValue("SaveProbeDataSubscriberResponse.RequestId"));
		saveProbeDataSubscriberResponse.setSuccess(context.booleanValue("SaveProbeDataSubscriberResponse.Success"));
		saveProbeDataSubscriberResponse.setMessage(context.stringValue("SaveProbeDataSubscriberResponse.Message"));
		saveProbeDataSubscriberResponse.setData(context.stringValue("SaveProbeDataSubscriberResponse.Data"));
		saveProbeDataSubscriberResponse.setErrorCode(context.integerValue("SaveProbeDataSubscriberResponse.ErrorCode"));
		saveProbeDataSubscriberResponse.setErrorMsg(context.stringValue("SaveProbeDataSubscriberResponse.ErrorMsg"));
	 
	 	return saveProbeDataSubscriberResponse;
	}
}