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

package com.aliyuncs.efc_service.transform.v20190318;

import com.aliyuncs.efc_service.model.v20190318.CheckMasterTrusteeshipResponse;
import com.aliyuncs.efc_service.model.v20190318.CheckMasterTrusteeshipResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckMasterTrusteeshipResponseUnmarshaller {

	public static CheckMasterTrusteeshipResponse unmarshall(CheckMasterTrusteeshipResponse checkMasterTrusteeshipResponse, UnmarshallerContext _ctx) {
		
		checkMasterTrusteeshipResponse.setRequestId(_ctx.stringValue("CheckMasterTrusteeshipResponse.RequestId"));
		checkMasterTrusteeshipResponse.setSuccess(_ctx.booleanValue("CheckMasterTrusteeshipResponse.Success"));
		checkMasterTrusteeshipResponse.setCode(_ctx.stringValue("CheckMasterTrusteeshipResponse.Code"));
		checkMasterTrusteeshipResponse.setMessage(_ctx.stringValue("CheckMasterTrusteeshipResponse.Message"));

		Data data = new Data();
		data.setCheckResult(_ctx.booleanValue("CheckMasterTrusteeshipResponse.Data.CheckResult"));
		data.setCode(_ctx.stringValue("CheckMasterTrusteeshipResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("CheckMasterTrusteeshipResponse.Data.Message"));
		checkMasterTrusteeshipResponse.setData(data);
	 
	 	return checkMasterTrusteeshipResponse;
	}
}