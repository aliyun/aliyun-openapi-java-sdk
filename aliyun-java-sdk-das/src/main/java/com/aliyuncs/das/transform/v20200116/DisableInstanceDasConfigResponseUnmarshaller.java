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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DisableInstanceDasConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableInstanceDasConfigResponseUnmarshaller {

	public static DisableInstanceDasConfigResponse unmarshall(DisableInstanceDasConfigResponse disableInstanceDasConfigResponse, UnmarshallerContext _ctx) {
		
		disableInstanceDasConfigResponse.setRequestId(_ctx.stringValue("DisableInstanceDasConfigResponse.RequestId"));
		disableInstanceDasConfigResponse.setCode(_ctx.stringValue("DisableInstanceDasConfigResponse.Code"));
		disableInstanceDasConfigResponse.setMessage(_ctx.stringValue("DisableInstanceDasConfigResponse.Message"));
		disableInstanceDasConfigResponse.setData(_ctx.stringValue("DisableInstanceDasConfigResponse.Data"));
		disableInstanceDasConfigResponse.setSuccess(_ctx.stringValue("DisableInstanceDasConfigResponse.Success"));
	 
	 	return disableInstanceDasConfigResponse;
	}
}