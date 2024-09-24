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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UpgradeApplicationApmServiceResponse;
import com.aliyuncs.sae.model.v20190506.UpgradeApplicationApmServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeApplicationApmServiceResponseUnmarshaller {

	public static UpgradeApplicationApmServiceResponse unmarshall(UpgradeApplicationApmServiceResponse upgradeApplicationApmServiceResponse, UnmarshallerContext _ctx) {
		
		upgradeApplicationApmServiceResponse.setRequestId(_ctx.stringValue("UpgradeApplicationApmServiceResponse.RequestId"));
		upgradeApplicationApmServiceResponse.setMessage(_ctx.stringValue("UpgradeApplicationApmServiceResponse.Message"));
		upgradeApplicationApmServiceResponse.setTraceId(_ctx.stringValue("UpgradeApplicationApmServiceResponse.TraceId"));
		upgradeApplicationApmServiceResponse.setErrorCode(_ctx.stringValue("UpgradeApplicationApmServiceResponse.ErrorCode"));
		upgradeApplicationApmServiceResponse.setCode(_ctx.stringValue("UpgradeApplicationApmServiceResponse.Code"));
		upgradeApplicationApmServiceResponse.setSuccess(_ctx.booleanValue("UpgradeApplicationApmServiceResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.booleanValue("UpgradeApplicationApmServiceResponse.Data.Status"));
		upgradeApplicationApmServiceResponse.setData(data);
	 
	 	return upgradeApplicationApmServiceResponse;
	}
}