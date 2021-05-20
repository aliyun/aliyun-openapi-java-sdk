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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.DeleteQualityRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteQualityRuleResponseUnmarshaller {

	public static DeleteQualityRuleResponse unmarshall(DeleteQualityRuleResponse deleteQualityRuleResponse, UnmarshallerContext _ctx) {
		
		deleteQualityRuleResponse.setRequestId(_ctx.stringValue("DeleteQualityRuleResponse.RequestId"));
		deleteQualityRuleResponse.setMessage(_ctx.stringValue("DeleteQualityRuleResponse.Message"));
		deleteQualityRuleResponse.setData(_ctx.stringValue("DeleteQualityRuleResponse.Data"));
		deleteQualityRuleResponse.setCode(_ctx.stringValue("DeleteQualityRuleResponse.Code"));
		deleteQualityRuleResponse.setSuccess(_ctx.booleanValue("DeleteQualityRuleResponse.Success"));
	 
	 	return deleteQualityRuleResponse;
	}
}