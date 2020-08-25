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

import com.aliyuncs.sofa.model.v20190815.RollbackLinkedeploycoreDeploycoreAppserviceResponse;
import com.aliyuncs.sofa.model.v20190815.RollbackLinkedeploycoreDeploycoreAppserviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RollbackLinkedeploycoreDeploycoreAppserviceResponseUnmarshaller {

	public static RollbackLinkedeploycoreDeploycoreAppserviceResponse unmarshall(RollbackLinkedeploycoreDeploycoreAppserviceResponse rollbackLinkedeploycoreDeploycoreAppserviceResponse, UnmarshallerContext _ctx) {
		
		rollbackLinkedeploycoreDeploycoreAppserviceResponse.setRequestId(_ctx.stringValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.RequestId"));
		rollbackLinkedeploycoreDeploycoreAppserviceResponse.setResultCode(_ctx.stringValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.ResultCode"));
		rollbackLinkedeploycoreDeploycoreAppserviceResponse.setResultMessage(_ctx.stringValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.ResultMessage"));
		rollbackLinkedeploycoreDeploycoreAppserviceResponse.setMessage(_ctx.stringValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.Message"));
		rollbackLinkedeploycoreDeploycoreAppserviceResponse.setResponseStatusCode(_ctx.longValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.ResponseStatusCode"));
		rollbackLinkedeploycoreDeploycoreAppserviceResponse.setSuccess(_ctx.booleanValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.Success"));

		Data data = new Data();
		data.setActionId(_ctx.longValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.Data.ActionId"));
		data.setAppServiceId(_ctx.longValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.Data.AppServiceId"));
		data.setConfigId(_ctx.longValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.Data.ConfigId"));
		data.setOrderId(_ctx.longValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.Data.OrderId"));
		data.setOrderUrl(_ctx.stringValue("RollbackLinkedeploycoreDeploycoreAppserviceResponse.Data.OrderUrl"));
		rollbackLinkedeploycoreDeploycoreAppserviceResponse.setData(data);
	 
	 	return rollbackLinkedeploycoreDeploycoreAppserviceResponse;
	}
}