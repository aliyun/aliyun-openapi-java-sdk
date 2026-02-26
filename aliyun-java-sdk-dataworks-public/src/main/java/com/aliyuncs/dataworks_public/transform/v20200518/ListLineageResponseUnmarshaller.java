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

import com.aliyuncs.dataworks_public.model.v20200518.ListLineageResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListLineageResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListLineageResponse.Data.DataEntityListItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListLineageResponse.Data.DataEntityListItem.Entity;
import com.aliyuncs.dataworks_public.model.v20200518.ListLineageResponse.Data.DataEntityListItem.RelationListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLineageResponseUnmarshaller {

	public static ListLineageResponse unmarshall(ListLineageResponse listLineageResponse, UnmarshallerContext _ctx) {
		
		listLineageResponse.setRequestId(_ctx.stringValue("ListLineageResponse.RequestId"));
		listLineageResponse.setHttpStatusCode(_ctx.integerValue("ListLineageResponse.HttpStatusCode"));
		listLineageResponse.setErrorMessage(_ctx.stringValue("ListLineageResponse.ErrorMessage"));
		listLineageResponse.setSuccess(_ctx.booleanValue("ListLineageResponse.Success"));
		listLineageResponse.setErrorCode(_ctx.stringValue("ListLineageResponse.ErrorCode"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListLineageResponse.Data.NextToken"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLineageResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setCreateTimestamp(_ctx.longValue("ListLineageResponse.Data.DataEntityList["+ i +"].CreateTimestamp"));

			Entity entity = new Entity();
			entity.setQualifiedName(_ctx.stringValue("ListLineageResponse.Data.DataEntityList["+ i +"].Entity.QualifiedName"));
			entity.setTenantId(_ctx.longValue("ListLineageResponse.Data.DataEntityList["+ i +"].Entity.TenantId"));
			entity.setEntityContent(_ctx.mapValue("ListLineageResponse.Data.DataEntityList["+ i +"].Entity.EntityContent"));
			dataEntityListItem.setEntity(entity);

			List<RelationListItem> relationList = new ArrayList<RelationListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListLineageResponse.Data.DataEntityList["+ i +"].RelationList.Length"); j++) {
				RelationListItem relationListItem = new RelationListItem();
				relationListItem.setGuid(_ctx.stringValue("ListLineageResponse.Data.DataEntityList["+ i +"].RelationList["+ j +"].Guid"));
				relationListItem.setDatasource(_ctx.stringValue("ListLineageResponse.Data.DataEntityList["+ i +"].RelationList["+ j +"].Datasource"));
				relationListItem.setType(_ctx.stringValue("ListLineageResponse.Data.DataEntityList["+ i +"].RelationList["+ j +"].Type"));
				relationListItem.setChannel(_ctx.stringValue("ListLineageResponse.Data.DataEntityList["+ i +"].RelationList["+ j +"].Channel"));

				relationList.add(relationListItem);
			}
			dataEntityListItem.setRelationList(relationList);

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		listLineageResponse.setData(data);
	 
	 	return listLineageResponse;
	}
}