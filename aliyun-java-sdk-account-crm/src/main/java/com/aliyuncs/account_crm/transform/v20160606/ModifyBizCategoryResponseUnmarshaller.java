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

import com.aliyuncs.account_crm.model.v20160606.ModifyBizCategoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyBizCategoryResponseUnmarshaller {

	public static ModifyBizCategoryResponse unmarshall(ModifyBizCategoryResponse modifyBizCategoryResponse, UnmarshallerContext _ctx) {
		
		modifyBizCategoryResponse.setRequestId(_ctx.stringValue("ModifyBizCategoryResponse.RequestId"));
		modifyBizCategoryResponse.setCode(_ctx.stringValue("ModifyBizCategoryResponse.Code"));
		modifyBizCategoryResponse.setMessage(_ctx.stringValue("ModifyBizCategoryResponse.Message"));
		modifyBizCategoryResponse.setSuccess(_ctx.booleanValue("ModifyBizCategoryResponse.Success"));
	 
	 	return modifyBizCategoryResponse;
	}
}