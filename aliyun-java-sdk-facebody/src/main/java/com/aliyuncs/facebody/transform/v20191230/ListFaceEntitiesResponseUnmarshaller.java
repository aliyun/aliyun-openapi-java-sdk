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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.ListFaceEntitiesResponse;
import com.aliyuncs.facebody.model.v20191230.ListFaceEntitiesResponse.Data;
import com.aliyuncs.facebody.model.v20191230.ListFaceEntitiesResponse.Data.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceEntitiesResponseUnmarshaller {

	public static ListFaceEntitiesResponse unmarshall(ListFaceEntitiesResponse listFaceEntitiesResponse, UnmarshallerContext _ctx) {
		
		listFaceEntitiesResponse.setRequestId(_ctx.stringValue("ListFaceEntitiesResponse.RequestId"));

		Data data = new Data();
		data.setToken(_ctx.stringValue("ListFaceEntitiesResponse.Data.Token"));
		data.setTotalCount(_ctx.integerValue("ListFaceEntitiesResponse.Data.TotalCount"));

		List<Entity> entities = new ArrayList<Entity>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceEntitiesResponse.Data.Entities.Length"); i++) {
			Entity entity = new Entity();
			entity.setDbName(_ctx.stringValue("ListFaceEntitiesResponse.Data.Entities["+ i +"].DbName"));
			entity.setEntityId(_ctx.stringValue("ListFaceEntitiesResponse.Data.Entities["+ i +"].EntityId"));
			entity.setFaceCount(_ctx.integerValue("ListFaceEntitiesResponse.Data.Entities["+ i +"].FaceCount"));
			entity.setLabels(_ctx.stringValue("ListFaceEntitiesResponse.Data.Entities["+ i +"].Labels"));
			entity.setCreatedAt(_ctx.longValue("ListFaceEntitiesResponse.Data.Entities["+ i +"].CreatedAt"));
			entity.setUpdatedAt(_ctx.longValue("ListFaceEntitiesResponse.Data.Entities["+ i +"].UpdatedAt"));

			entities.add(entity);
		}
		data.setEntities(entities);
		listFaceEntitiesResponse.setData(data);
	 
	 	return listFaceEntitiesResponse;
	}
}