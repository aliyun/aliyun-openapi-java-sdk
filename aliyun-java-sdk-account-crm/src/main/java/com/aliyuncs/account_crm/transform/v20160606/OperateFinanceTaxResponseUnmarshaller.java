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

import com.aliyuncs.account_crm.model.v20160606.OperateFinanceTaxResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateFinanceTaxResponseUnmarshaller {

	public static OperateFinanceTaxResponse unmarshall(OperateFinanceTaxResponse operateFinanceTaxResponse, UnmarshallerContext _ctx) {
		
		operateFinanceTaxResponse.setRequestId(_ctx.stringValue("OperateFinanceTaxResponse.RequestId"));
		operateFinanceTaxResponse.setCode(_ctx.stringValue("OperateFinanceTaxResponse.Code"));
		operateFinanceTaxResponse.setMessage(_ctx.stringValue("OperateFinanceTaxResponse.Message"));
		operateFinanceTaxResponse.setData(_ctx.stringValue("OperateFinanceTaxResponse.Data"));
		operateFinanceTaxResponse.setSuccess(_ctx.booleanValue("OperateFinanceTaxResponse.Success"));
	 
	 	return operateFinanceTaxResponse;
	}
}