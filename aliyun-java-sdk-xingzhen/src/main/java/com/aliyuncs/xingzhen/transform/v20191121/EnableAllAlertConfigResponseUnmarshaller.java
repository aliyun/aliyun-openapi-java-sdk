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

package com.aliyuncs.xingzhen.transform.v20191121;

import com.aliyuncs.xingzhen.model.v20191121.EnableAllAlertConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableAllAlertConfigResponseUnmarshaller {

	public static EnableAllAlertConfigResponse unmarshall(EnableAllAlertConfigResponse enableAllAlertConfigResponse, UnmarshallerContext _ctx) {
		
		enableAllAlertConfigResponse.setRequestId(_ctx.stringValue("EnableAllAlertConfigResponse.RequestId"));
		enableAllAlertConfigResponse.setSuccess(_ctx.booleanValue("EnableAllAlertConfigResponse.Success"));
		enableAllAlertConfigResponse.setCode(_ctx.stringValue("EnableAllAlertConfigResponse.Code"));
		enableAllAlertConfigResponse.setMessage(_ctx.stringValue("EnableAllAlertConfigResponse.Message"));
		enableAllAlertConfigResponse.setData(_ctx.booleanValue("EnableAllAlertConfigResponse.Data"));
	 
	 	return enableAllAlertConfigResponse;
	}
}