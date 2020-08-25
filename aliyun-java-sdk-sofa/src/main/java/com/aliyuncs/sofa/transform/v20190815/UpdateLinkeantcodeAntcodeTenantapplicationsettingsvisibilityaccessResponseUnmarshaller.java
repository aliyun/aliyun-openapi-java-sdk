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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse unmarshall(UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.RequestId"));
		updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.ResultCode"));
		updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.ResultMessage"));
		updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.setProjectVisibilityLevel(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.ProjectVisibilityLevel"));
		updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.ResponseStatusCode"));

		List<Long> restrictedVisibilityLevels = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.RestrictedVisibilityLevels.Length"); i++) {
			restrictedVisibilityLevels.add(_ctx.longValue("UpdateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.RestrictedVisibilityLevels["+ i +"]"));
		}
		updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse.setRestrictedVisibilityLevels(restrictedVisibilityLevels);
	 
	 	return updateLinkeantcodeAntcodeTenantapplicationsettingsvisibilityaccessResponse;
	}
}