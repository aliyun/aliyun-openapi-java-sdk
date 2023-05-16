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

package com.aliyuncs.agency.transform.v20170718;

import com.aliyuncs.agency.model.v20170718.GetFxCustomerTypeResponse;
import com.aliyuncs.agency.model.v20170718.GetFxCustomerTypeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFxCustomerTypeResponseUnmarshaller {

	public static GetFxCustomerTypeResponse unmarshall(GetFxCustomerTypeResponse getFxCustomerTypeResponse, UnmarshallerContext _ctx) {
		
		getFxCustomerTypeResponse.setRequestId(_ctx.stringValue("GetFxCustomerTypeResponse.RequestId"));
		getFxCustomerTypeResponse.setCode(_ctx.stringValue("GetFxCustomerTypeResponse.Code"));
		getFxCustomerTypeResponse.setMessage(_ctx.stringValue("GetFxCustomerTypeResponse.Message"));
		getFxCustomerTypeResponse.setSuccess(_ctx.booleanValue("GetFxCustomerTypeResponse.Success"));

		Data data = new Data();
		data.setParentId(_ctx.longValue("GetFxCustomerTypeResponse.Data.ParentId"));
		data.setIsSub(_ctx.integerValue("GetFxCustomerTypeResponse.Data.IsSub"));
		data.setCustomerType(_ctx.integerValue("GetFxCustomerTypeResponse.Data.CustomerType"));
		getFxCustomerTypeResponse.setData(data);
	 
	 	return getFxCustomerTypeResponse;
	}
}