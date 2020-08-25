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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeGroupslabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeGroupslabelResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeGroupslabelResponse unmarshall(UpdateLinkeantcodeAntcodeGroupslabelResponse updateLinkeantcodeAntcodeGroupslabelResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeGroupslabelResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.RequestId"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.ResultCode"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.ResultMessage"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setColor(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.Color"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.CreatedAt"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.Description"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setGroupId(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.GroupId"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.Id"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.Name"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.ProjectId"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.SourceType"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setTemplate(_ctx.booleanValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.Template"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setTenantId(_ctx.longValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.TenantId"));
		updateLinkeantcodeAntcodeGroupslabelResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeGroupslabelResponse.UpdatedAt"));
	 
	 	return updateLinkeantcodeAntcodeGroupslabelResponse;
	}
}