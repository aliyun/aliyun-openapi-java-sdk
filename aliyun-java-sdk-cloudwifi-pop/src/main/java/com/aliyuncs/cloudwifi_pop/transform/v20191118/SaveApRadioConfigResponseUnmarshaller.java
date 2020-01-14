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

package com.aliyuncs.cloudwifi_pop.transform.v20191118;

import com.aliyuncs.cloudwifi_pop.model.v20191118.SaveApRadioConfigResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveApRadioConfigResponseUnmarshaller {

	public static SaveApRadioConfigResponse unmarshall(SaveApRadioConfigResponse saveApRadioConfigResponse, UnmarshallerContext _ctx) {
		
		saveApRadioConfigResponse.setRequestId(_ctx.stringValue("SaveApRadioConfigResponse.RequestId"));
		saveApRadioConfigResponse.setData(_ctx.mapValue("SaveApRadioConfigResponse.Data"));
		saveApRadioConfigResponse.setIsSuccess(_ctx.booleanValue("SaveApRadioConfigResponse.IsSuccess"));
		saveApRadioConfigResponse.setErrorCode(_ctx.integerValue("SaveApRadioConfigResponse.ErrorCode"));
		saveApRadioConfigResponse.setErrorMessage(_ctx.stringValue("SaveApRadioConfigResponse.ErrorMessage"));
	 
	 	return saveApRadioConfigResponse;
	}
}