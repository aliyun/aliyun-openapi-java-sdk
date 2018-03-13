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

import com.aliyuncs.cloudwf.model.v20170328.SaveGroupApRadioConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveGroupApRadioConfigResponseUnmarshaller {

	public static SaveGroupApRadioConfigResponse unmarshall(SaveGroupApRadioConfigResponse saveGroupApRadioConfigResponse, UnmarshallerContext context) {
		
		saveGroupApRadioConfigResponse.setRequestId(context.stringValue("SaveGroupApRadioConfigResponse.RequestId"));
		saveGroupApRadioConfigResponse.setSuccess(context.booleanValue("SaveGroupApRadioConfigResponse.Success"));
		saveGroupApRadioConfigResponse.setMessage(context.stringValue("SaveGroupApRadioConfigResponse.Message"));
		saveGroupApRadioConfigResponse.setData(context.stringValue("SaveGroupApRadioConfigResponse.Data"));
		saveGroupApRadioConfigResponse.setErrorCode(context.integerValue("SaveGroupApRadioConfigResponse.ErrorCode"));
		saveGroupApRadioConfigResponse.setErrorMsg(context.stringValue("SaveGroupApRadioConfigResponse.ErrorMsg"));
	 
	 	return saveGroupApRadioConfigResponse;
	}
}