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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUserlimitsettingsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUserlimitsettingsResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUserlimitsettingsResponse unmarshall(UpdateLinkeantcodeAntcodeUserlimitsettingsResponse updateLinkeantcodeAntcodeUserlimitsettingsResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUserlimitsettingsResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserlimitsettingsResponse.RequestId"));
		updateLinkeantcodeAntcodeUserlimitsettingsResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserlimitsettingsResponse.ResultCode"));
		updateLinkeantcodeAntcodeUserlimitsettingsResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUserlimitsettingsResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUserlimitsettingsResponse.setLimitRateKbytesPerSec(_ctx.longValue("UpdateLinkeantcodeAntcodeUserlimitsettingsResponse.LimitRateKbytesPerSec"));
		updateLinkeantcodeAntcodeUserlimitsettingsResponse.setLimitReqPerSec(_ctx.longValue("UpdateLinkeantcodeAntcodeUserlimitsettingsResponse.LimitReqPerSec"));
		updateLinkeantcodeAntcodeUserlimitsettingsResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUserlimitsettingsResponse.ResponseStatusCode"));
	 
	 	return updateLinkeantcodeAntcodeUserlimitsettingsResponse;
	}
}