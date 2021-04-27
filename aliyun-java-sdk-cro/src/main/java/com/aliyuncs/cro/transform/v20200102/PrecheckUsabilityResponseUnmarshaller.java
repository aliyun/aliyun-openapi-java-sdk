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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.PrecheckUsabilityResponse;
import com.aliyuncs.cro.model.v20200102.PrecheckUsabilityResponse.CheckResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PrecheckUsabilityResponseUnmarshaller {

	public static PrecheckUsabilityResponse unmarshall(PrecheckUsabilityResponse precheckUsabilityResponse, UnmarshallerContext _ctx) {
		
		precheckUsabilityResponse.setRequestId(_ctx.stringValue("PrecheckUsabilityResponse.RequestId"));

		CheckResult checkResult = new CheckResult();
		checkResult.setUnavailableStatus(_ctx.booleanValue("PrecheckUsabilityResponse.CheckResult.UnavailableStatus"));
		checkResult.setAuthorityUsableCode(_ctx.integerValue("PrecheckUsabilityResponse.CheckResult.AuthorityUsableCode"));
		checkResult.setUsableClient(_ctx.booleanValue("PrecheckUsabilityResponse.CheckResult.UsableClient"));
		checkResult.setHitRisk(_ctx.booleanValue("PrecheckUsabilityResponse.CheckResult.HitRisk"));
		precheckUsabilityResponse.setCheckResult(checkResult);
	 
	 	return precheckUsabilityResponse;
	}
}