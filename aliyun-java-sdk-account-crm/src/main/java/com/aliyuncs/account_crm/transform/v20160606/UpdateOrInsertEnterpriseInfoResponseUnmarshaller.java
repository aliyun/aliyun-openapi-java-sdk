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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.UpdateOrInsertEnterpriseInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateOrInsertEnterpriseInfoResponseUnmarshaller {

	public static UpdateOrInsertEnterpriseInfoResponse unmarshall(UpdateOrInsertEnterpriseInfoResponse updateOrInsertEnterpriseInfoResponse, UnmarshallerContext _ctx) {
		
		updateOrInsertEnterpriseInfoResponse.setRequestId(_ctx.stringValue("UpdateOrInsertEnterpriseInfoResponse.RequestId"));
		updateOrInsertEnterpriseInfoResponse.setCode(_ctx.stringValue("UpdateOrInsertEnterpriseInfoResponse.Code"));
		updateOrInsertEnterpriseInfoResponse.setMessage(_ctx.stringValue("UpdateOrInsertEnterpriseInfoResponse.Message"));
		updateOrInsertEnterpriseInfoResponse.setSuccess(_ctx.booleanValue("UpdateOrInsertEnterpriseInfoResponse.Success"));
	 
	 	return updateOrInsertEnterpriseInfoResponse;
	}
}