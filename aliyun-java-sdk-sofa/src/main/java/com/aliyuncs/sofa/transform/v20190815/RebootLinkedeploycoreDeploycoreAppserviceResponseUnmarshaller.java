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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.RebootLinkedeploycoreDeploycoreAppserviceResponse;
import com.aliyuncs.sofa.model.v20190815.RebootLinkedeploycoreDeploycoreAppserviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebootLinkedeploycoreDeploycoreAppserviceResponseUnmarshaller {

	public static RebootLinkedeploycoreDeploycoreAppserviceResponse unmarshall(RebootLinkedeploycoreDeploycoreAppserviceResponse rebootLinkedeploycoreDeploycoreAppserviceResponse, UnmarshallerContext _ctx) {
		
		rebootLinkedeploycoreDeploycoreAppserviceResponse.setRequestId(_ctx.stringValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.RequestId"));
		rebootLinkedeploycoreDeploycoreAppserviceResponse.setResultCode(_ctx.stringValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.ResultCode"));
		rebootLinkedeploycoreDeploycoreAppserviceResponse.setResultMessage(_ctx.stringValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.ResultMessage"));
		rebootLinkedeploycoreDeploycoreAppserviceResponse.setMessage(_ctx.stringValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.Message"));
		rebootLinkedeploycoreDeploycoreAppserviceResponse.setResponseStatusCode(_ctx.longValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.ResponseStatusCode"));
		rebootLinkedeploycoreDeploycoreAppserviceResponse.setSuccess(_ctx.booleanValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.Success"));

		Data data = new Data();
		data.setActionId(_ctx.longValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.Data.ActionId"));
		data.setAppServiceId(_ctx.longValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.Data.AppServiceId"));
		data.setConfigId(_ctx.longValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.Data.ConfigId"));
		data.setOrderId(_ctx.longValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.Data.OrderId"));
		data.setOrderUrl(_ctx.stringValue("RebootLinkedeploycoreDeploycoreAppserviceResponse.Data.OrderUrl"));
		rebootLinkedeploycoreDeploycoreAppserviceResponse.setData(data);
	 
	 	return rebootLinkedeploycoreDeploycoreAppserviceResponse;
	}
}