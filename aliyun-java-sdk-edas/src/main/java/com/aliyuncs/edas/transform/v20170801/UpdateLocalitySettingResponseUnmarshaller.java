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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.UpdateLocalitySettingResponse;
import com.aliyuncs.edas.model.v20170801.UpdateLocalitySettingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLocalitySettingResponseUnmarshaller {

	public static UpdateLocalitySettingResponse unmarshall(UpdateLocalitySettingResponse updateLocalitySettingResponse, UnmarshallerContext _ctx) {
		
		updateLocalitySettingResponse.setRequestId(_ctx.stringValue("UpdateLocalitySettingResponse.RequestId"));
		updateLocalitySettingResponse.setCode(_ctx.integerValue("UpdateLocalitySettingResponse.Code"));
		updateLocalitySettingResponse.setHttpStatusCode(_ctx.integerValue("UpdateLocalitySettingResponse.HttpStatusCode"));
		updateLocalitySettingResponse.setMessage(_ctx.stringValue("UpdateLocalitySettingResponse.Message"));
		updateLocalitySettingResponse.setSuccess(_ctx.booleanValue("UpdateLocalitySettingResponse.Success"));

		Data data = new Data();
		data.setEnabled(_ctx.booleanValue("UpdateLocalitySettingResponse.Data.Enabled"));
		data.setThreshold(_ctx.floatValue("UpdateLocalitySettingResponse.Data.Threshold"));
		updateLocalitySettingResponse.setData(data);
	 
	 	return updateLocalitySettingResponse;
	}
}