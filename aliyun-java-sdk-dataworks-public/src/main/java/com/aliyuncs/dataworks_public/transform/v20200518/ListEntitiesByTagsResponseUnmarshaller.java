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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListEntitiesByTagsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListEntitiesByTagsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListEntitiesByTagsResponse.Data.EntityListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEntitiesByTagsResponseUnmarshaller {

	public static ListEntitiesByTagsResponse unmarshall(ListEntitiesByTagsResponse listEntitiesByTagsResponse, UnmarshallerContext _ctx) {
		
		listEntitiesByTagsResponse.setRequestId(_ctx.stringValue("ListEntitiesByTagsResponse.RequestId"));
		listEntitiesByTagsResponse.setSuccess(_ctx.booleanValue("ListEntitiesByTagsResponse.Success"));
		listEntitiesByTagsResponse.setErrorCode(_ctx.stringValue("ListEntitiesByTagsResponse.ErrorCode"));
		listEntitiesByTagsResponse.setErrorMessage(_ctx.stringValue("ListEntitiesByTagsResponse.ErrorMessage"));
		listEntitiesByTagsResponse.setHttpStatusCode(_ctx.integerValue("ListEntitiesByTagsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListEntitiesByTagsResponse.Data.NextToken"));

		List<EntityListItem> entityList = new ArrayList<EntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEntitiesByTagsResponse.Data.EntityList.Length"); i++) {
			EntityListItem entityListItem = new EntityListItem();
			entityListItem.setQualifiedName(_ctx.stringValue("ListEntitiesByTagsResponse.Data.EntityList["+ i +"].QualifiedName"));
			entityListItem.setTenantId(_ctx.longValue("ListEntitiesByTagsResponse.Data.EntityList["+ i +"].TenantId"));
			entityListItem.setEntityContent(_ctx.mapValue("ListEntitiesByTagsResponse.Data.EntityList["+ i +"].EntityContent"));

			entityList.add(entityListItem);
		}
		data.setEntityList(entityList);
		listEntitiesByTagsResponse.setData(data);
	 
	 	return listEntitiesByTagsResponse;
	}
}