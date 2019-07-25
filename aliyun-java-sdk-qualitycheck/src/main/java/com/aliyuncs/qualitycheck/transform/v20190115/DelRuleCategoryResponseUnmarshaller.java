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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.DelRuleCategoryResponse;
import com.aliyuncs.qualitycheck.model.v20190115.DelRuleCategoryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DelRuleCategoryResponseUnmarshaller {

	public static DelRuleCategoryResponse unmarshall(DelRuleCategoryResponse delRuleCategoryResponse, UnmarshallerContext _ctx) {
		
		delRuleCategoryResponse.setRequestId(_ctx.stringValue("DelRuleCategoryResponse.RequestId"));
		delRuleCategoryResponse.setSuccess(_ctx.booleanValue("DelRuleCategoryResponse.Success"));
		delRuleCategoryResponse.setCode(_ctx.stringValue("DelRuleCategoryResponse.Code"));
		delRuleCategoryResponse.setMessage(_ctx.stringValue("DelRuleCategoryResponse.Message"));

		Data data = new Data();
		data.setSelect(_ctx.booleanValue("DelRuleCategoryResponse.Data.Select"));
		delRuleCategoryResponse.setData(data);
	 
	 	return delRuleCategoryResponse;
	}
}