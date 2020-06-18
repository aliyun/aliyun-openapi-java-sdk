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

package com.aliyuncs.dyiotapi.transform.v20171111;

import com.aliyuncs.dyiotapi.model.v20171111.DoIotRechargeResponse;
import com.aliyuncs.dyiotapi.model.v20171111.DoIotRechargeResponse.IotRecharge;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoIotRechargeResponseUnmarshaller {

	public static DoIotRechargeResponse unmarshall(DoIotRechargeResponse doIotRechargeResponse, UnmarshallerContext _ctx) {
		
		doIotRechargeResponse.setRequestId(_ctx.stringValue("DoIotRechargeResponse.RequestId"));
		doIotRechargeResponse.setCode(_ctx.stringValue("DoIotRechargeResponse.Code"));
		doIotRechargeResponse.setMessage(_ctx.stringValue("DoIotRechargeResponse.Message"));

		IotRecharge iotRecharge = new IotRecharge();
		iotRecharge.setOrderNo(_ctx.stringValue("DoIotRechargeResponse.IotRecharge.OrderNo"));
		iotRecharge.setDoneCode(_ctx.stringValue("DoIotRechargeResponse.IotRecharge.DoneCode"));
		iotRecharge.setOrderResult(_ctx.stringValue("DoIotRechargeResponse.IotRecharge.OrderResult"));
		doIotRechargeResponse.setIotRecharge(iotRecharge);
	 
	 	return doIotRechargeResponse;
	}
}