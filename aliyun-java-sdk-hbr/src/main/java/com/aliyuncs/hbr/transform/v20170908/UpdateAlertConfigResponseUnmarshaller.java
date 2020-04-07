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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.UpdateAlertConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAlertConfigResponseUnmarshaller {

	public static UpdateAlertConfigResponse unmarshall(UpdateAlertConfigResponse updateAlertConfigResponse, UnmarshallerContext _ctx) {
		
		updateAlertConfigResponse.setRequestId(_ctx.stringValue("UpdateAlertConfigResponse.RequestId"));
		updateAlertConfigResponse.setSuccess(_ctx.booleanValue("UpdateAlertConfigResponse.Success"));
		updateAlertConfigResponse.setCode(_ctx.stringValue("UpdateAlertConfigResponse.Code"));
		updateAlertConfigResponse.setMessage(_ctx.stringValue("UpdateAlertConfigResponse.Message"));
	 
	 	return updateAlertConfigResponse;
	}
}