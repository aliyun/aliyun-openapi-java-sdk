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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetAuthorityTemplateResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetAuthorityTemplateResponse.AuthorityTemplateView;
import com.aliyuncs.dms_enterprise.model.v20181101.GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuthorityTemplateResponseUnmarshaller {

	public static GetAuthorityTemplateResponse unmarshall(GetAuthorityTemplateResponse getAuthorityTemplateResponse, UnmarshallerContext _ctx) {
		
		getAuthorityTemplateResponse.setRequestId(_ctx.stringValue("GetAuthorityTemplateResponse.RequestId"));
		getAuthorityTemplateResponse.setErrorCode(_ctx.stringValue("GetAuthorityTemplateResponse.ErrorCode"));
		getAuthorityTemplateResponse.setErrorMessage(_ctx.stringValue("GetAuthorityTemplateResponse.ErrorMessage"));
		getAuthorityTemplateResponse.setSuccess(_ctx.booleanValue("GetAuthorityTemplateResponse.Success"));

		AuthorityTemplateView authorityTemplateView = new AuthorityTemplateView();
		authorityTemplateView.setTemplateId(_ctx.longValue("GetAuthorityTemplateResponse.AuthorityTemplateView.TemplateId"));
		authorityTemplateView.setCreatorId(_ctx.longValue("GetAuthorityTemplateResponse.AuthorityTemplateView.CreatorId"));
		authorityTemplateView.setName(_ctx.stringValue("GetAuthorityTemplateResponse.AuthorityTemplateView.Name"));
		authorityTemplateView.setDescription(_ctx.stringValue("GetAuthorityTemplateResponse.AuthorityTemplateView.Description"));
		authorityTemplateView.setCreateTime(_ctx.stringValue("GetAuthorityTemplateResponse.AuthorityTemplateView.CreateTime"));

		List<AuthorityTemplateItem> authorityTemplateItemList = new ArrayList<AuthorityTemplateItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList.Length"); i++) {
			AuthorityTemplateItem authorityTemplateItem = new AuthorityTemplateItem();
			authorityTemplateItem.setItemId(_ctx.longValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].ItemId"));
			authorityTemplateItem.setTemplateId(_ctx.longValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].TemplateId"));
			authorityTemplateItem.setModifierId(_ctx.longValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].ModifierId"));
			authorityTemplateItem.setResourceType(_ctx.stringValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].ResourceType"));
			authorityTemplateItem.setInstanceId(_ctx.longValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].InstanceId"));
			authorityTemplateItem.setDbId(_ctx.longValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].DbId"));
			authorityTemplateItem.setTableName(_ctx.stringValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].TableName"));
			authorityTemplateItem.setAttribute(_ctx.stringValue("GetAuthorityTemplateResponse.AuthorityTemplateView.AuthorityTemplateItemList["+ i +"].Attribute"));

			authorityTemplateItemList.add(authorityTemplateItem);
		}
		authorityTemplateView.setAuthorityTemplateItemList(authorityTemplateItemList);
		getAuthorityTemplateResponse.setAuthorityTemplateView(authorityTemplateView);
	 
	 	return getAuthorityTemplateResponse;
	}
}