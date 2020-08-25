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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkedeploycoreDeploycoreAppserviceResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkedeploycoreDeploycoreAppserviceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkedeploycoreDeploycoreAppserviceResponseUnmarshaller {

	public static DeleteLinkedeploycoreDeploycoreAppserviceResponse unmarshall(DeleteLinkedeploycoreDeploycoreAppserviceResponse deleteLinkedeploycoreDeploycoreAppserviceResponse, UnmarshallerContext _ctx) {
		
		deleteLinkedeploycoreDeploycoreAppserviceResponse.setRequestId(_ctx.stringValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.RequestId"));
		deleteLinkedeploycoreDeploycoreAppserviceResponse.setResultCode(_ctx.stringValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.ResultCode"));
		deleteLinkedeploycoreDeploycoreAppserviceResponse.setResultMessage(_ctx.stringValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.ResultMessage"));
		deleteLinkedeploycoreDeploycoreAppserviceResponse.setMessage(_ctx.stringValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.Message"));
		deleteLinkedeploycoreDeploycoreAppserviceResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.ResponseStatusCode"));
		deleteLinkedeploycoreDeploycoreAppserviceResponse.setSuccess(_ctx.booleanValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.Success"));

		Data data = new Data();
		data.setActionId(_ctx.longValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.Data.ActionId"));
		data.setAppServiceId(_ctx.longValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.Data.AppServiceId"));
		data.setConfigId(_ctx.longValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.Data.ConfigId"));
		data.setOrderId(_ctx.longValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.Data.OrderId"));
		data.setOrderUrl(_ctx.stringValue("DeleteLinkedeploycoreDeploycoreAppserviceResponse.Data.OrderUrl"));
		deleteLinkedeploycoreDeploycoreAppserviceResponse.setData(data);
	 
	 	return deleteLinkedeploycoreDeploycoreAppserviceResponse;
	}
}