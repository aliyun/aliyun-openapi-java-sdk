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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListKgEntityResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListKgEntityResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListKgEntityResponse.PageResult.Entity;
import com.aliyuncs.dataphin_public.model.v20230630.ListKgEntityResponse.PageResult.Entity.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKgEntityResponseUnmarshaller {

	public static ListKgEntityResponse unmarshall(ListKgEntityResponse listKgEntityResponse, UnmarshallerContext _ctx) {
		
		listKgEntityResponse.setRequestId(_ctx.stringValue("ListKgEntityResponse.RequestId"));
		listKgEntityResponse.setMessage(_ctx.stringValue("ListKgEntityResponse.Message"));
		listKgEntityResponse.setHttpStatusCode(_ctx.integerValue("ListKgEntityResponse.HttpStatusCode"));
		listKgEntityResponse.setCode(_ctx.stringValue("ListKgEntityResponse.Code"));
		listKgEntityResponse.setSuccess(_ctx.booleanValue("ListKgEntityResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListKgEntityResponse.PageResult.TotalCount"));

		List<Entity> entityList = new ArrayList<Entity>();
		for (int i = 0; i < _ctx.lengthValue("ListKgEntityResponse.PageResult.EntityList.Length"); i++) {
			Entity entity = new Entity();
			entity.setEntityId(_ctx.stringValue("ListKgEntityResponse.PageResult.EntityList["+ i +"].EntityId"));
			entity.setEntityType(_ctx.stringValue("ListKgEntityResponse.PageResult.EntityList["+ i +"].EntityType"));

			List<Property> propertyList = new ArrayList<Property>();
			for (int j = 0; j < _ctx.lengthValue("ListKgEntityResponse.PageResult.EntityList["+ i +"].PropertyList.Length"); j++) {
				Property property = new Property();
				property.setValue(_ctx.stringValue("ListKgEntityResponse.PageResult.EntityList["+ i +"].PropertyList["+ j +"].Value"));
				property.setDataType(_ctx.stringValue("ListKgEntityResponse.PageResult.EntityList["+ i +"].PropertyList["+ j +"].DataType"));
				property.setCode(_ctx.stringValue("ListKgEntityResponse.PageResult.EntityList["+ i +"].PropertyList["+ j +"].Code"));

				propertyList.add(property);
			}
			entity.setPropertyList(propertyList);

			entityList.add(entity);
		}
		pageResult.setEntityList(entityList);
		listKgEntityResponse.setPageResult(pageResult);
	 
	 	return listKgEntityResponse;
	}
}