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

import com.aliyuncs.dataphin_public.model.v20230630.RemoveQualityRuleSchedulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveQualityRuleSchedulesResponseUnmarshaller {

	public static RemoveQualityRuleSchedulesResponse unmarshall(RemoveQualityRuleSchedulesResponse removeQualityRuleSchedulesResponse, UnmarshallerContext _ctx) {
		
		removeQualityRuleSchedulesResponse.setRequestId(_ctx.stringValue("RemoveQualityRuleSchedulesResponse.RequestId"));
		removeQualityRuleSchedulesResponse.setSuccess(_ctx.booleanValue("RemoveQualityRuleSchedulesResponse.Success"));
		removeQualityRuleSchedulesResponse.setHttpStatusCode(_ctx.integerValue("RemoveQualityRuleSchedulesResponse.HttpStatusCode"));
		removeQualityRuleSchedulesResponse.setCode(_ctx.stringValue("RemoveQualityRuleSchedulesResponse.Code"));
		removeQualityRuleSchedulesResponse.setMessage(_ctx.stringValue("RemoveQualityRuleSchedulesResponse.Message"));
		removeQualityRuleSchedulesResponse.setData(_ctx.integerValue("RemoveQualityRuleSchedulesResponse.Data"));
	 
	 	return removeQualityRuleSchedulesResponse;
	}
}