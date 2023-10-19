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

import com.aliyuncs.dms_enterprise.model.v20181101.CreateAuthorityTemplateResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.CreateAuthorityTemplateResponse.AuthorityTemplateView;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAuthorityTemplateResponseUnmarshaller {

	public static CreateAuthorityTemplateResponse unmarshall(CreateAuthorityTemplateResponse createAuthorityTemplateResponse, UnmarshallerContext _ctx) {
		
		createAuthorityTemplateResponse.setRequestId(_ctx.stringValue("CreateAuthorityTemplateResponse.RequestId"));
		createAuthorityTemplateResponse.setErrorCode(_ctx.stringValue("CreateAuthorityTemplateResponse.ErrorCode"));
		createAuthorityTemplateResponse.setErrorMessage(_ctx.stringValue("CreateAuthorityTemplateResponse.ErrorMessage"));
		createAuthorityTemplateResponse.setSuccess(_ctx.booleanValue("CreateAuthorityTemplateResponse.Success"));
		createAuthorityTemplateResponse.setTid(_ctx.longValue("CreateAuthorityTemplateResponse.Tid"));

		AuthorityTemplateView authorityTemplateView = new AuthorityTemplateView();
		authorityTemplateView.setTemplateId(_ctx.longValue("CreateAuthorityTemplateResponse.AuthorityTemplateView.TemplateId"));
		authorityTemplateView.setName(_ctx.stringValue("CreateAuthorityTemplateResponse.AuthorityTemplateView.Name"));
		authorityTemplateView.setCreatorId(_ctx.longValue("CreateAuthorityTemplateResponse.AuthorityTemplateView.CreatorId"));
		authorityTemplateView.setDescription(_ctx.stringValue("CreateAuthorityTemplateResponse.AuthorityTemplateView.Description"));
		authorityTemplateView.setCreateTime(_ctx.stringValue("CreateAuthorityTemplateResponse.AuthorityTemplateView.CreateTime"));
		createAuthorityTemplateResponse.setAuthorityTemplateView(authorityTemplateView);
	 
	 	return createAuthorityTemplateResponse;
	}
}