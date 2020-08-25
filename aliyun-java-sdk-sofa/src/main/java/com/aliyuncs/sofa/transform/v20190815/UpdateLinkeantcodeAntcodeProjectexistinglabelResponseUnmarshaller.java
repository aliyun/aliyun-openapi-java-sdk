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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeProjectexistinglabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeProjectexistinglabelResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeProjectexistinglabelResponse unmarshall(UpdateLinkeantcodeAntcodeProjectexistinglabelResponse updateLinkeantcodeAntcodeProjectexistinglabelResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.RequestId"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.ResultCode"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.ResultMessage"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setColor(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.Color"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.CreatedAt"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.Description"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setGroupId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.GroupId"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.Id"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.Name"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.ProjectId"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.SourceType"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setTemplate(_ctx.booleanValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.Template"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setTenantId(_ctx.longValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.TenantId"));
		updateLinkeantcodeAntcodeProjectexistinglabelResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeProjectexistinglabelResponse.UpdatedAt"));
	 
	 	return updateLinkeantcodeAntcodeProjectexistinglabelResponse;
	}
}