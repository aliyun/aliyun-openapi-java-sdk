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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.UpdateWarningConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWarningConfigResponseUnmarshaller {

	public static UpdateWarningConfigResponse unmarshall(UpdateWarningConfigResponse updateWarningConfigResponse, UnmarshallerContext _ctx) {
		
		updateWarningConfigResponse.setRequestId(_ctx.stringValue("UpdateWarningConfigResponse.RequestId"));
		updateWarningConfigResponse.setSuccess(_ctx.booleanValue("UpdateWarningConfigResponse.Success"));
		updateWarningConfigResponse.setCode(_ctx.stringValue("UpdateWarningConfigResponse.Code"));
		updateWarningConfigResponse.setMessage(_ctx.stringValue("UpdateWarningConfigResponse.Message"));
	 
	 	return updateWarningConfigResponse;
	}
}