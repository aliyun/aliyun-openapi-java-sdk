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

import com.aliyuncs.aiccs.model.v20191015.EditQualityRuleTagResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EditQualityRuleTagResponseUnmarshaller {

	public static EditQualityRuleTagResponse unmarshall(EditQualityRuleTagResponse editQualityRuleTagResponse, UnmarshallerContext _ctx) {
		
		editQualityRuleTagResponse.setRequestId(_ctx.stringValue("EditQualityRuleTagResponse.RequestId"));
		editQualityRuleTagResponse.setCode(_ctx.stringValue("EditQualityRuleTagResponse.Code"));
		editQualityRuleTagResponse.setMessage(_ctx.stringValue("EditQualityRuleTagResponse.Message"));
		editQualityRuleTagResponse.setSuccess(_ctx.booleanValue("EditQualityRuleTagResponse.Success"));
		editQualityRuleTagResponse.setData(_ctx.stringValue("EditQualityRuleTagResponse.Data"));
	 
	 	return editQualityRuleTagResponse;
	}
}