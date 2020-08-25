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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse unmarshall(UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.RequestId"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.ResultCode"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.ResultMessage"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setColor(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.Color"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setCreatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.CreatedAt"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setDescription(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.Description"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setGroupId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.GroupId"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.Id"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setName(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.Name"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setProjectId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.ProjectId"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.ResponseStatusCode"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setSourceType(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.SourceType"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setTemplate(_ctx.booleanValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.Template"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setTenantId(_ctx.longValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.TenantId"));
		updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.setUpdatedAt(_ctx.stringValue("UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse.UpdatedAt"));
	 
	 	return updateLinkeantcodeAntcodeUpdatesanexistinglabelResponse;
	}
}