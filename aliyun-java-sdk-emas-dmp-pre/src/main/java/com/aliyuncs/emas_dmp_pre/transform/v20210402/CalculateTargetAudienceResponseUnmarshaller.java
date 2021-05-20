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

package com.aliyuncs.emas_dmp_pre.transform.v20210402;

import com.aliyuncs.emas_dmp_pre.model.v20210402.CalculateTargetAudienceResponse;
import com.aliyuncs.emas_dmp_pre.model.v20210402.CalculateTargetAudienceResponse.CalculateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CalculateTargetAudienceResponseUnmarshaller {

	public static CalculateTargetAudienceResponse unmarshall(CalculateTargetAudienceResponse calculateTargetAudienceResponse, UnmarshallerContext _ctx) {
		
		calculateTargetAudienceResponse.setRequestId(_ctx.stringValue("CalculateTargetAudienceResponse.RequestId"));

		CalculateResult calculateResult = new CalculateResult();
		calculateResult.setTotalNumber(_ctx.longValue("CalculateTargetAudienceResponse.CalculateResult.TotalNumber"));
		calculateTargetAudienceResponse.setCalculateResult(calculateResult);
	 
	 	return calculateTargetAudienceResponse;
	}
}