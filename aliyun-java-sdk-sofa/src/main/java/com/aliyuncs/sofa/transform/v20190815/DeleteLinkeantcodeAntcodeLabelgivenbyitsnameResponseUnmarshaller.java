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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse unmarshall(DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.RequestId"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.ResultCode"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setColor(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.Color"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setCreatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.CreatedAt"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setDescription(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.Description"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setGroupId(_ctx.longValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.GroupId"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setId(_ctx.longValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.Id"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setName(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.Name"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setProjectId(_ctx.longValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.ProjectId"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.ResponseStatusCode"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setSourceType(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.SourceType"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setTemplate(_ctx.booleanValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.Template"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setTenantId(_ctx.longValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.TenantId"));
		deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.setUpdatedAt(_ctx.stringValue("DeleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse.UpdatedAt"));
	 
	 	return deleteLinkeantcodeAntcodeLabelgivenbyitsnameResponse;
	}
}