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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeProjectslabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeProjectslabelResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeProjectslabelResponse unmarshall(DeleteLinkeantcodeAntcodeProjectslabelResponse deleteLinkeantcodeAntcodeProjectslabelResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeProjectslabelResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.RequestId"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.ResultCode"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setColor(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.Color"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.Description"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setGroupId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.GroupId"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.Id"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.Name"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.ProjectId"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.SourceType"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setTemplate(_ctx.booleanValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.Template"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.TenantId"));
		deleteLinkeantcodeAntcodeProjectslabelResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeProjectslabelResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeProjectslabelResponse;
	}
}