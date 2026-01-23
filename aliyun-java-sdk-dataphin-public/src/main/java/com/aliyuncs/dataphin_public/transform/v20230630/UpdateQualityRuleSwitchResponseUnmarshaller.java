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

import com.aliyuncs.dataphin_public.model.v20230630.UpdateQualityRuleSwitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateQualityRuleSwitchResponseUnmarshaller {

	public static UpdateQualityRuleSwitchResponse unmarshall(UpdateQualityRuleSwitchResponse updateQualityRuleSwitchResponse, UnmarshallerContext _ctx) {
		
		updateQualityRuleSwitchResponse.setRequestId(_ctx.stringValue("UpdateQualityRuleSwitchResponse.RequestId"));
		updateQualityRuleSwitchResponse.setSuccess(_ctx.booleanValue("UpdateQualityRuleSwitchResponse.Success"));
		updateQualityRuleSwitchResponse.setHttpStatusCode(_ctx.integerValue("UpdateQualityRuleSwitchResponse.HttpStatusCode"));
		updateQualityRuleSwitchResponse.setCode(_ctx.stringValue("UpdateQualityRuleSwitchResponse.Code"));
		updateQualityRuleSwitchResponse.setMessage(_ctx.stringValue("UpdateQualityRuleSwitchResponse.Message"));
		updateQualityRuleSwitchResponse.setData(_ctx.integerValue("UpdateQualityRuleSwitchResponse.Data"));
	 
	 	return updateQualityRuleSwitchResponse;
	}
}