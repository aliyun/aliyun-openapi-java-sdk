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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse unmarshall(DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.RequestId"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.ResultCode"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setColor(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.Color"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.Description"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setGroupId(_ctx.longValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.GroupId"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.Id"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.Name"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.ProjectId"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.SourceType"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setTemplate(_ctx.booleanValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.Template"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.TenantId"));
		deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse;
	}
}