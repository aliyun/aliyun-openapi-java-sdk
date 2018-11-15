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

package com.aliyuncs.chatbot.transform.v20171011;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.chatbot.model.v20171011.QueryEntitiesResponse;
import com.aliyuncs.chatbot.model.v20171011.QueryEntitiesResponse.Entity;
import com.aliyuncs.chatbot.model.v20171011.QueryEntitiesResponse.Entity.MembersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEntitiesResponseUnmarshaller {

	public static QueryEntitiesResponse unmarshall(QueryEntitiesResponse queryEntitiesResponse, UnmarshallerContext context) {
		
		queryEntitiesResponse.setRequestId(context.stringValue("QueryEntitiesResponse.RequestId"));
		queryEntitiesResponse.setPageNumber(context.integerValue("QueryEntitiesResponse.PageNumber"));
		queryEntitiesResponse.setPageSize(context.integerValue("QueryEntitiesResponse.PageSize"));
		queryEntitiesResponse.setTotalCount(context.integerValue("QueryEntitiesResponse.TotalCount"));

		List<Entity> entities = new ArrayList<Entity>();
		for (int i = 0; i < context.lengthValue("QueryEntitiesResponse.Entities.Length"); i++) {
			Entity entity = new Entity();
			entity.setEntityId(context.longValue("QueryEntitiesResponse.Entities["+ i +"].EntityId"));
			entity.setEntityName(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].EntityName"));
			entity.setEntityType(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].EntityType"));
			entity.setRegex(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].Regex"));
			entity.setCreateTime(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].CreateTime"));
			entity.setModifyTime(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].ModifyTime"));
			entity.setCreateUserId(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].CreateUserId"));
			entity.setCreateUserName(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].CreateUserName"));
			entity.setModifyUserId(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].ModifyUserId"));
			entity.setModifyUserName(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].ModifyUserName"));

			List<MembersItem> members = new ArrayList<MembersItem>();
			for (int j = 0; j < context.lengthValue("QueryEntitiesResponse.Entities["+ i +"].Members.Length"); j++) {
				MembersItem membersItem = new MembersItem();
				membersItem.setMemberName(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].Members["+ j +"].MemberName"));

				List<String> synonyms = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("QueryEntitiesResponse.Entities["+ i +"].Members["+ j +"].Synonyms.Length"); k++) {
					synonyms.add(context.stringValue("QueryEntitiesResponse.Entities["+ i +"].Members["+ j +"].Synonyms["+ k +"]"));
				}
				membersItem.setSynonyms(synonyms);

				members.add(membersItem);
			}
			entity.setMembers(members);

			entities.add(entity);
		}
		queryEntitiesResponse.setEntities(entities);
	 
	 	return queryEntitiesResponse;
	}
}