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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse unmarshall(UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.RequestId"));
		updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.ResultCode"));
		updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.ResultMessage"));
		updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.setData(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.Data"));
		updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.setMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.Message"));
		updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.setStatus(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse.Status"));
	 
	 	return updateLinkeantcodeAntcodeProjectsprojectidartifactsmanagementidResponse;
	}
}