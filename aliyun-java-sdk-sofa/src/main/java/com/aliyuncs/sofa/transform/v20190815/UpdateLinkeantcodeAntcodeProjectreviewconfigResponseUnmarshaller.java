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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectreviewconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeProjectreviewconfigResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeProjectreviewconfigResponse unmarshall(UpdateLinkeantcodeAntcodeProjectreviewconfigResponse updateLinkeantcodeAntcodeProjectreviewconfigResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.RequestId"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.ResultCode"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.ResultMessage"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.CreatedAt"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.Id"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.ProjectId"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setRulesType(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.RulesType"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setSubmitterCanReview(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.SubmitterCanReview"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setThreshold(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.Threshold"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setThresholdClear(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.ThresholdClear"));
		updateLinkeantcodeAntcodeProjectreviewconfigResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.UpdatedAt"));
	 
	 	return updateLinkeantcodeAntcodeProjectreviewconfigResponse;
	}
}