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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse unmarshall(UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse updateLinkeantcodeAntcodeProjectpullrequestconfigResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.RequestId"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.ResultCode"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.ResultMessage"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.CreatedAt"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setFfOnlyEnabled(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.FfOnlyEnabled"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.Id"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setOnlyAllChecksSucceed(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.OnlyAllChecksSucceed"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setOnlyAllDiscussionsResolved(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.OnlyAllDiscussionsResolved"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.ProjectId"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setRebaseEnabled(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.RebaseEnabled"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setReviewRequired(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.ReviewRequired"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setShouldRemoveSourceBranch(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.ShouldRemoveSourceBranch"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setSquashMerge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.SquashMerge"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.UpdatedAt"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setWorkitemFinishWhenMerge(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.WorkitemFinishWhenMerge"));
		updateLinkeantcodeAntcodeProjectpullrequestconfigResponse.setWorkitemRequired(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectpullrequestconfigResponse.WorkitemRequired"));
	 
	 	return updateLinkeantcodeAntcodeProjectpullrequestconfigResponse;
	}
}