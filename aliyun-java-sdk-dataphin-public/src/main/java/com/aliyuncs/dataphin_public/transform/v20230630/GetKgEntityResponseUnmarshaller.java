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

import com.aliyuncs.dataphin_public.model.v20230630.GetKgEntityResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgEntityResponse.EntityInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgEntityResponse.EntityInfo.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKgEntityResponseUnmarshaller {

	public static GetKgEntityResponse unmarshall(GetKgEntityResponse getKgEntityResponse, UnmarshallerContext _ctx) {
		
		getKgEntityResponse.setRequestId(_ctx.stringValue("GetKgEntityResponse.RequestId"));
		getKgEntityResponse.setMessage(_ctx.stringValue("GetKgEntityResponse.Message"));
		getKgEntityResponse.setHttpStatusCode(_ctx.integerValue("GetKgEntityResponse.HttpStatusCode"));
		getKgEntityResponse.setCode(_ctx.stringValue("GetKgEntityResponse.Code"));
		getKgEntityResponse.setSuccess(_ctx.booleanValue("GetKgEntityResponse.Success"));

		EntityInfo entityInfo = new EntityInfo();
		entityInfo.setEntityId(_ctx.stringValue("GetKgEntityResponse.EntityInfo.EntityId"));
		entityInfo.setEntityType(_ctx.stringValue("GetKgEntityResponse.EntityInfo.EntityType"));

		List<Property> propertyList = new ArrayList<Property>();
		for (int i = 0; i < _ctx.lengthValue("GetKgEntityResponse.EntityInfo.PropertyList.Length"); i++) {
			Property property = new Property();
			property.setValue(_ctx.stringValue("GetKgEntityResponse.EntityInfo.PropertyList["+ i +"].Value"));
			property.setDataType(_ctx.stringValue("GetKgEntityResponse.EntityInfo.PropertyList["+ i +"].DataType"));
			property.setCode(_ctx.stringValue("GetKgEntityResponse.EntityInfo.PropertyList["+ i +"].Code"));

			propertyList.add(property);
		}
		entityInfo.setPropertyList(propertyList);
		getKgEntityResponse.setEntityInfo(entityInfo);
	 
	 	return getKgEntityResponse;
	}
}