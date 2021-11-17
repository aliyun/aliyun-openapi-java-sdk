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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import com.aliyuncs.mindlive_biz.model.v20210214.SyncDeviceConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncDeviceConfigResponseUnmarshaller {

	public static SyncDeviceConfigResponse unmarshall(SyncDeviceConfigResponse syncDeviceConfigResponse, UnmarshallerContext _ctx) {
		
		syncDeviceConfigResponse.setRequestId(_ctx.stringValue("SyncDeviceConfigResponse.RequestId"));
		syncDeviceConfigResponse.setErrorMessage(_ctx.stringValue("SyncDeviceConfigResponse.ErrorMessage"));
		syncDeviceConfigResponse.setSuccess(_ctx.booleanValue("SyncDeviceConfigResponse.Success"));
		syncDeviceConfigResponse.setErrorCode(_ctx.stringValue("SyncDeviceConfigResponse.ErrorCode"));
	 
	 	return syncDeviceConfigResponse;
	}
}