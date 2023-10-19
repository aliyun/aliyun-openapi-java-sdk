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

import com.aliyuncs.dms_enterprise.model.v20181101.GetAuthorityTemplateItemResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetAuthorityTemplateItemResponse.AuthorityTemplateItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuthorityTemplateItemResponseUnmarshaller {

	public static GetAuthorityTemplateItemResponse unmarshall(GetAuthorityTemplateItemResponse getAuthorityTemplateItemResponse, UnmarshallerContext _ctx) {
		
		getAuthorityTemplateItemResponse.setRequestId(_ctx.stringValue("GetAuthorityTemplateItemResponse.RequestId"));
		getAuthorityTemplateItemResponse.setErrorCode(_ctx.stringValue("GetAuthorityTemplateItemResponse.ErrorCode"));
		getAuthorityTemplateItemResponse.setErrorMessage(_ctx.stringValue("GetAuthorityTemplateItemResponse.ErrorMessage"));
		getAuthorityTemplateItemResponse.setSuccess(_ctx.booleanValue("GetAuthorityTemplateItemResponse.Success"));
		getAuthorityTemplateItemResponse.setTid(_ctx.longValue("GetAuthorityTemplateItemResponse.Tid"));

		List<AuthorityTemplateItem> authorityTemplateItemList = new ArrayList<AuthorityTemplateItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList.Length"); i++) {
			AuthorityTemplateItem authorityTemplateItem = new AuthorityTemplateItem();
			authorityTemplateItem.setItemId(_ctx.longValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].ItemId"));
			authorityTemplateItem.setTemplateId(_ctx.longValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].TemplateId"));
			authorityTemplateItem.setModifierId(_ctx.longValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].ModifierId"));
			authorityTemplateItem.setResourceType(_ctx.stringValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].ResourceType"));
			authorityTemplateItem.setInstanceId(_ctx.longValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].InstanceId"));
			authorityTemplateItem.setDbId(_ctx.longValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].DbId"));
			authorityTemplateItem.setTableName(_ctx.stringValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].TableName"));
			authorityTemplateItem.setAttribute(_ctx.stringValue("GetAuthorityTemplateItemResponse.AuthorityTemplateItemList["+ i +"].Attribute"));

			authorityTemplateItemList.add(authorityTemplateItem);
		}
		getAuthorityTemplateItemResponse.setAuthorityTemplateItemList(authorityTemplateItemList);
	 
	 	return getAuthorityTemplateItemResponse;
	}
}