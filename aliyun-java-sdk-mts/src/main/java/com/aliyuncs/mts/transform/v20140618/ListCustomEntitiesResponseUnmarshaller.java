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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListCustomEntitiesResponse;
import com.aliyuncs.mts.model.v20140618.ListCustomEntitiesResponse.CustomEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomEntitiesResponseUnmarshaller {

	public static ListCustomEntitiesResponse unmarshall(ListCustomEntitiesResponse listCustomEntitiesResponse, UnmarshallerContext _ctx) {
		
		listCustomEntitiesResponse.setRequestId(_ctx.stringValue("ListCustomEntitiesResponse.RequestId"));
		listCustomEntitiesResponse.setPageNumber(_ctx.integerValue("ListCustomEntitiesResponse.PageNumber"));
		listCustomEntitiesResponse.setPageSize(_ctx.integerValue("ListCustomEntitiesResponse.PageSize"));
		listCustomEntitiesResponse.setTotalCount(_ctx.longValue("ListCustomEntitiesResponse.TotalCount"));

		List<CustomEntity> customEntities = new ArrayList<CustomEntity>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomEntitiesResponse.CustomEntities.Length"); i++) {
			CustomEntity customEntity = new CustomEntity();
			customEntity.setCustomEntityId(_ctx.stringValue("ListCustomEntitiesResponse.CustomEntities["+ i +"].CustomEntityId"));
			customEntity.setCustomEntityName(_ctx.stringValue("ListCustomEntitiesResponse.CustomEntities["+ i +"].CustomEntityName"));
			customEntity.setCustomEntityInfo(_ctx.stringValue("ListCustomEntitiesResponse.CustomEntities["+ i +"].CustomEntityInfo"));

			customEntities.add(customEntity);
		}
		listCustomEntitiesResponse.setCustomEntities(customEntities);
	 
	 	return listCustomEntitiesResponse;
	}
}