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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleTaskLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityRuleTaskLogResponseUnmarshaller {

	public static GetQualityRuleTaskLogResponse unmarshall(GetQualityRuleTaskLogResponse getQualityRuleTaskLogResponse, UnmarshallerContext _ctx) {
		
		getQualityRuleTaskLogResponse.setRequestId(_ctx.stringValue("GetQualityRuleTaskLogResponse.RequestId"));
		getQualityRuleTaskLogResponse.setSuccess(_ctx.booleanValue("GetQualityRuleTaskLogResponse.Success"));
		getQualityRuleTaskLogResponse.setHttpStatusCode(_ctx.integerValue("GetQualityRuleTaskLogResponse.HttpStatusCode"));
		getQualityRuleTaskLogResponse.setCode(_ctx.stringValue("GetQualityRuleTaskLogResponse.Code"));
		getQualityRuleTaskLogResponse.setMessage(_ctx.stringValue("GetQualityRuleTaskLogResponse.Message"));
		getQualityRuleTaskLogResponse.setData(_ctx.stringValue("GetQualityRuleTaskLogResponse.Data"));
	 
	 	return getQualityRuleTaskLogResponse;
	}
}