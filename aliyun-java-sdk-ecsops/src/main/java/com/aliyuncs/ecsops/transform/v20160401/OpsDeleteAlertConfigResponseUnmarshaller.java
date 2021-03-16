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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsDeleteAlertConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDeleteAlertConfigResponseUnmarshaller {

	public static OpsDeleteAlertConfigResponse unmarshall(OpsDeleteAlertConfigResponse opsDeleteAlertConfigResponse, UnmarshallerContext _ctx) {
		
		opsDeleteAlertConfigResponse.setRequestId(_ctx.stringValue("OpsDeleteAlertConfigResponse.RequestId"));
		opsDeleteAlertConfigResponse.setData(_ctx.stringValue("OpsDeleteAlertConfigResponse.Data"));
	 
	 	return opsDeleteAlertConfigResponse;
	}
}