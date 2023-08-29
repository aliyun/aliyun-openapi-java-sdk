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

import com.aliyuncs.bssopenapi.model.v20171214.RenewChangeInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.RenewChangeInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewChangeInstanceResponseUnmarshaller {

	public static RenewChangeInstanceResponse unmarshall(RenewChangeInstanceResponse renewChangeInstanceResponse, UnmarshallerContext _ctx) {
		
		renewChangeInstanceResponse.setRequestId(_ctx.stringValue("RenewChangeInstanceResponse.RequestId"));
		renewChangeInstanceResponse.setCode(_ctx.stringValue("RenewChangeInstanceResponse.Code"));
		renewChangeInstanceResponse.setMessage(_ctx.stringValue("RenewChangeInstanceResponse.Message"));
		renewChangeInstanceResponse.setSuccess(_ctx.booleanValue("RenewChangeInstanceResponse.Success"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("RenewChangeInstanceResponse.Data.OrderId"));
		data.setHostId(_ctx.stringValue("RenewChangeInstanceResponse.Data.HostId"));
		renewChangeInstanceResponse.setData(data);
	 
	 	return renewChangeInstanceResponse;
	}
}