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

import com.aliyuncs.sofa.model.v20190815.RetryLinkedeploycoreDeploycoreActionretryResponse;
import com.aliyuncs.sofa.model.v20190815.RetryLinkedeploycoreDeploycoreActionretryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RetryLinkedeploycoreDeploycoreActionretryResponseUnmarshaller {

	public static RetryLinkedeploycoreDeploycoreActionretryResponse unmarshall(RetryLinkedeploycoreDeploycoreActionretryResponse retryLinkedeploycoreDeploycoreActionretryResponse, UnmarshallerContext _ctx) {
		
		retryLinkedeploycoreDeploycoreActionretryResponse.setRequestId(_ctx.stringValue("RetryLinkedeploycoreDeploycoreActionretryResponse.RequestId"));
		retryLinkedeploycoreDeploycoreActionretryResponse.setResultCode(_ctx.stringValue("RetryLinkedeploycoreDeploycoreActionretryResponse.ResultCode"));
		retryLinkedeploycoreDeploycoreActionretryResponse.setResultMessage(_ctx.stringValue("RetryLinkedeploycoreDeploycoreActionretryResponse.ResultMessage"));
		retryLinkedeploycoreDeploycoreActionretryResponse.setMessage(_ctx.stringValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Message"));
		retryLinkedeploycoreDeploycoreActionretryResponse.setResponseStatusCode(_ctx.longValue("RetryLinkedeploycoreDeploycoreActionretryResponse.ResponseStatusCode"));
		retryLinkedeploycoreDeploycoreActionretryResponse.setSuccess(_ctx.booleanValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Success"));

		Data data = new Data();
		data.setActionId(_ctx.longValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Data.ActionId"));
		data.setAppServiceId(_ctx.longValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Data.AppServiceId"));
		data.setMessage(_ctx.stringValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Data.Message"));
		data.setOrderId(_ctx.longValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Data.OrderId"));
		data.setOrderUrl(_ctx.stringValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Data.OrderUrl"));
		data.setSuccess(_ctx.booleanValue("RetryLinkedeploycoreDeploycoreActionretryResponse.Data.Success"));
		retryLinkedeploycoreDeploycoreActionretryResponse.setData(data);
	 
	 	return retryLinkedeploycoreDeploycoreActionretryResponse;
	}
}