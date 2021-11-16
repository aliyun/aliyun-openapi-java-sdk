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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.UpdateQualityRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateQualityRuleResponseUnmarshaller {

	public static UpdateQualityRuleResponse unmarshall(UpdateQualityRuleResponse updateQualityRuleResponse, UnmarshallerContext _ctx) {
		
		updateQualityRuleResponse.setRequestId(_ctx.stringValue("UpdateQualityRuleResponse.RequestId"));
		updateQualityRuleResponse.setErrorCode(_ctx.stringValue("UpdateQualityRuleResponse.ErrorCode"));
		updateQualityRuleResponse.setData(_ctx.booleanValue("UpdateQualityRuleResponse.Data"));
		updateQualityRuleResponse.setSuccess(_ctx.booleanValue("UpdateQualityRuleResponse.Success"));
		updateQualityRuleResponse.setErrorMessage(_ctx.stringValue("UpdateQualityRuleResponse.ErrorMessage"));
		updateQualityRuleResponse.setHttpStatusCode(_ctx.integerValue("UpdateQualityRuleResponse.HttpStatusCode"));
	 
	 	return updateQualityRuleResponse;
	}
}