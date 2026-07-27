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

import com.aliyuncs.dataphin_public.model.v20230630.ListKgRelationResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListKgRelationResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListKgRelationResponse.PageResult.Relation;
import com.aliyuncs.dataphin_public.model.v20230630.ListKgRelationResponse.PageResult.Relation.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKgRelationResponseUnmarshaller {

	public static ListKgRelationResponse unmarshall(ListKgRelationResponse listKgRelationResponse, UnmarshallerContext _ctx) {
		
		listKgRelationResponse.setRequestId(_ctx.stringValue("ListKgRelationResponse.RequestId"));
		listKgRelationResponse.setMessage(_ctx.stringValue("ListKgRelationResponse.Message"));
		listKgRelationResponse.setHttpStatusCode(_ctx.integerValue("ListKgRelationResponse.HttpStatusCode"));
		listKgRelationResponse.setCode(_ctx.stringValue("ListKgRelationResponse.Code"));
		listKgRelationResponse.setSuccess(_ctx.booleanValue("ListKgRelationResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListKgRelationResponse.PageResult.TotalCount"));

		List<Relation> relationList = new ArrayList<Relation>();
		for (int i = 0; i < _ctx.lengthValue("ListKgRelationResponse.PageResult.RelationList.Length"); i++) {
			Relation relation = new Relation();
			relation.setRelationType(_ctx.stringValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].RelationType"));
			relation.setRelationId(_ctx.stringValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].RelationId"));
			relation.setTargetEntityId(_ctx.stringValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].TargetEntityId"));
			relation.setSourceEntityId(_ctx.stringValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].SourceEntityId"));

			List<Property> propertyList = new ArrayList<Property>();
			for (int j = 0; j < _ctx.lengthValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].PropertyList.Length"); j++) {
				Property property = new Property();
				property.setValue(_ctx.stringValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].PropertyList["+ j +"].Value"));
				property.setDataType(_ctx.stringValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].PropertyList["+ j +"].DataType"));
				property.setCode(_ctx.stringValue("ListKgRelationResponse.PageResult.RelationList["+ i +"].PropertyList["+ j +"].Code"));

				propertyList.add(property);
			}
			relation.setPropertyList(propertyList);

			relationList.add(relation);
		}
		pageResult.setRelationList(relationList);
		listKgRelationResponse.setPageResult(pageResult);
	 
	 	return listKgRelationResponse;
	}
}