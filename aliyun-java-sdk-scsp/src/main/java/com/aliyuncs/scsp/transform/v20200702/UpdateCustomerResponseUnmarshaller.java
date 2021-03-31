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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.UpdateCustomerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCustomerResponseUnmarshaller {

	public static UpdateCustomerResponse unmarshall(UpdateCustomerResponse updateCustomerResponse, UnmarshallerContext _ctx) {
		
		updateCustomerResponse.setRequestId(_ctx.stringValue("UpdateCustomerResponse.RequestId"));
		updateCustomerResponse.setMessage(_ctx.stringValue("UpdateCustomerResponse.Message"));
		updateCustomerResponse.setData(_ctx.longValue("UpdateCustomerResponse.Data"));
		updateCustomerResponse.setCode(_ctx.stringValue("UpdateCustomerResponse.Code"));
		updateCustomerResponse.setSuccess(_ctx.booleanValue("UpdateCustomerResponse.Success"));
	 
	 	return updateCustomerResponse;
	}
}