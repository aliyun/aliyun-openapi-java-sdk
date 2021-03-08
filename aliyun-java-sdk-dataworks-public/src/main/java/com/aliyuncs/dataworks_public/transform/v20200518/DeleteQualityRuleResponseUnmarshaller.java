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

import com.aliyuncs.dataworks_public.model.v20200518.DeleteQualityRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQualityRuleResponseUnmarshaller {

	public static DeleteQualityRuleResponse unmarshall(DeleteQualityRuleResponse deleteQualityRuleResponse, UnmarshallerContext _ctx) {
		
		deleteQualityRuleResponse.setRequestId(_ctx.stringValue("DeleteQualityRuleResponse.RequestId"));
		deleteQualityRuleResponse.setErrorCode(_ctx.stringValue("DeleteQualityRuleResponse.ErrorCode"));
		deleteQualityRuleResponse.setData(_ctx.booleanValue("DeleteQualityRuleResponse.Data"));
		deleteQualityRuleResponse.setErrorMessage(_ctx.stringValue("DeleteQualityRuleResponse.ErrorMessage"));
		deleteQualityRuleResponse.setSuccess(_ctx.booleanValue("DeleteQualityRuleResponse.Success"));
		deleteQualityRuleResponse.setHttpStatusCode(_ctx.integerValue("DeleteQualityRuleResponse.HttpStatusCode"));
	 
	 	return deleteQualityRuleResponse;
	}
}