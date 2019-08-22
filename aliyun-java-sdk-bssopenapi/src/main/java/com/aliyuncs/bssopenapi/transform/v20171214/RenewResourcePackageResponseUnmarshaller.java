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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.RenewResourcePackageResponse;
import com.aliyuncs.bssopenapi.model.v20171214.RenewResourcePackageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewResourcePackageResponseUnmarshaller {

	public static RenewResourcePackageResponse unmarshall(RenewResourcePackageResponse renewResourcePackageResponse, UnmarshallerContext _ctx) {
		
		renewResourcePackageResponse.setRequestId(_ctx.stringValue("RenewResourcePackageResponse.RequestId"));
		renewResourcePackageResponse.setOrderId(_ctx.longValue("RenewResourcePackageResponse.OrderId"));
		renewResourcePackageResponse.setSuccess(_ctx.booleanValue("RenewResourcePackageResponse.Success"));
		renewResourcePackageResponse.setCode(_ctx.stringValue("RenewResourcePackageResponse.Code"));
		renewResourcePackageResponse.setMessage(_ctx.stringValue("RenewResourcePackageResponse.Message"));

		Data data = new Data();
		data.setOrderId(_ctx.longValue("RenewResourcePackageResponse.Data.OrderId"));
		data.setInstanceId(_ctx.stringValue("RenewResourcePackageResponse.Data.InstanceId"));
		renewResourcePackageResponse.setData(data);
	 
	 	return renewResourcePackageResponse;
	}
}