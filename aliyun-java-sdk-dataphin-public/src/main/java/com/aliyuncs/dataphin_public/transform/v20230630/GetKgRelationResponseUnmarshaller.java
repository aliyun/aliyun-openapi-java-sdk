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

import com.aliyuncs.dataphin_public.model.v20230630.GetKgRelationResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgRelationResponse.RelationInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgRelationResponse.RelationInfo.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKgRelationResponseUnmarshaller {

	public static GetKgRelationResponse unmarshall(GetKgRelationResponse getKgRelationResponse, UnmarshallerContext _ctx) {
		
		getKgRelationResponse.setRequestId(_ctx.stringValue("GetKgRelationResponse.RequestId"));
		getKgRelationResponse.setMessage(_ctx.stringValue("GetKgRelationResponse.Message"));
		getKgRelationResponse.setHttpStatusCode(_ctx.integerValue("GetKgRelationResponse.HttpStatusCode"));
		getKgRelationResponse.setCode(_ctx.stringValue("GetKgRelationResponse.Code"));
		getKgRelationResponse.setSuccess(_ctx.booleanValue("GetKgRelationResponse.Success"));

		RelationInfo relationInfo = new RelationInfo();
		relationInfo.setRelationType(_ctx.stringValue("GetKgRelationResponse.RelationInfo.RelationType"));
		relationInfo.setRelationId(_ctx.stringValue("GetKgRelationResponse.RelationInfo.RelationId"));
		relationInfo.setTargetEntityId(_ctx.stringValue("GetKgRelationResponse.RelationInfo.TargetEntityId"));
		relationInfo.setSourceEntityId(_ctx.stringValue("GetKgRelationResponse.RelationInfo.SourceEntityId"));

		List<Property> propertyList = new ArrayList<Property>();
		for (int i = 0; i < _ctx.lengthValue("GetKgRelationResponse.RelationInfo.PropertyList.Length"); i++) {
			Property property = new Property();
			property.setValue(_ctx.stringValue("GetKgRelationResponse.RelationInfo.PropertyList["+ i +"].Value"));
			property.setDataType(_ctx.stringValue("GetKgRelationResponse.RelationInfo.PropertyList["+ i +"].DataType"));
			property.setCode(_ctx.stringValue("GetKgRelationResponse.RelationInfo.PropertyList["+ i +"].Code"));

			propertyList.add(property);
		}
		relationInfo.setPropertyList(propertyList);
		getKgRelationResponse.setRelationInfo(relationInfo);
	 
	 	return getKgRelationResponse;
	}
}