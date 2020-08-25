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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse unmarshall(DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.RequestId"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ResultCode"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setColor(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Color"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Description"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setGroupId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.GroupId"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Id"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Name"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ProjectId"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.SourceType"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setTemplate(_ctx.booleanValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Template"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.TenantId"));
		deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse;
	}
}