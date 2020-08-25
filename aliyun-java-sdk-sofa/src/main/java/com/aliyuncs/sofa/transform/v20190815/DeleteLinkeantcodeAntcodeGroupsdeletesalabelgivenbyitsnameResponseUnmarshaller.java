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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse unmarshall(DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.RequestId"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.ResultCode"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setColor(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.Color"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.Description"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setGroupId(_ctx.longValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.GroupId"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.Id"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.Name"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.ProjectId"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.SourceType"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setTemplate(_ctx.booleanValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.Template"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.TenantId"));
		deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse;
	}
}