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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatethelabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdatethelabelResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdatethelabelResponse unmarshall(UpdateLinkeantcodeAntcodeUpdatethelabelResponse updateLinkeantcodeAntcodeUpdatethelabelResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setColor(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.Color"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.CreatedAt"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.Description"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setGroupId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.GroupId"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.Id"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.Name"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.ProjectId"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.SourceType"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setTemplate(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.Template"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setTenantId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.TenantId"));
		updateLinkeantcodeAntcodeUpdatethelabelResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatethelabelResponse.UpdatedAt"));
	 
	 	return updateLinkeantcodeAntcodeUpdatethelabelResponse;
	}
}