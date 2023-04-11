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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.UpdateAuthorityTemplateResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.UpdateAuthorityTemplateResponse.AuthorityTemplateView;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAuthorityTemplateResponseUnmarshaller {

	public static UpdateAuthorityTemplateResponse unmarshall(UpdateAuthorityTemplateResponse updateAuthorityTemplateResponse, UnmarshallerContext _ctx) {
		
		updateAuthorityTemplateResponse.setRequestId(_ctx.stringValue("UpdateAuthorityTemplateResponse.RequestId"));
		updateAuthorityTemplateResponse.setErrorCode(_ctx.stringValue("UpdateAuthorityTemplateResponse.ErrorCode"));
		updateAuthorityTemplateResponse.setErrorMessage(_ctx.stringValue("UpdateAuthorityTemplateResponse.ErrorMessage"));
		updateAuthorityTemplateResponse.setSuccess(_ctx.booleanValue("UpdateAuthorityTemplateResponse.Success"));

		AuthorityTemplateView authorityTemplateView = new AuthorityTemplateView();
		authorityTemplateView.setTemplateId(_ctx.longValue("UpdateAuthorityTemplateResponse.AuthorityTemplateView.TemplateId"));
		authorityTemplateView.setCreatorId(_ctx.longValue("UpdateAuthorityTemplateResponse.AuthorityTemplateView.CreatorId"));
		authorityTemplateView.setName(_ctx.stringValue("UpdateAuthorityTemplateResponse.AuthorityTemplateView.Name"));
		authorityTemplateView.setDescription(_ctx.stringValue("UpdateAuthorityTemplateResponse.AuthorityTemplateView.Description"));
		updateAuthorityTemplateResponse.setAuthorityTemplateView(authorityTemplateView);
	 
	 	return updateAuthorityTemplateResponse;
	}
}