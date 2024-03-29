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

import com.aliyuncs.dataworks_public.model.v20200518.ListMetaCollectionEntitiesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListMetaCollectionEntitiesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListMetaCollectionEntitiesResponse.Data.EntityListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetaCollectionEntitiesResponseUnmarshaller {

	public static ListMetaCollectionEntitiesResponse unmarshall(ListMetaCollectionEntitiesResponse listMetaCollectionEntitiesResponse, UnmarshallerContext _ctx) {
		
		listMetaCollectionEntitiesResponse.setRequestId(_ctx.stringValue("ListMetaCollectionEntitiesResponse.RequestId"));
		listMetaCollectionEntitiesResponse.setSuccess(_ctx.booleanValue("ListMetaCollectionEntitiesResponse.Success"));
		listMetaCollectionEntitiesResponse.setErrorCode(_ctx.stringValue("ListMetaCollectionEntitiesResponse.ErrorCode"));
		listMetaCollectionEntitiesResponse.setErrorMessage(_ctx.stringValue("ListMetaCollectionEntitiesResponse.ErrorMessage"));
		listMetaCollectionEntitiesResponse.setHttpStatusCode(_ctx.integerValue("ListMetaCollectionEntitiesResponse.HttpStatusCode"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListMetaCollectionEntitiesResponse.Data.NextToken"));

		List<EntityListItem> entityList = new ArrayList<EntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMetaCollectionEntitiesResponse.Data.EntityList.Length"); i++) {
			EntityListItem entityListItem = new EntityListItem();
			entityListItem.setQualifiedName(_ctx.stringValue("ListMetaCollectionEntitiesResponse.Data.EntityList["+ i +"].QualifiedName"));
			entityListItem.setTenantId(_ctx.longValue("ListMetaCollectionEntitiesResponse.Data.EntityList["+ i +"].TenantId"));
			entityListItem.setEntityContent(_ctx.mapValue("ListMetaCollectionEntitiesResponse.Data.EntityList["+ i +"].EntityContent"));

			entityList.add(entityListItem);
		}
		data.setEntityList(entityList);
		listMetaCollectionEntitiesResponse.setData(data);
	 
	 	return listMetaCollectionEntitiesResponse;
	}
}