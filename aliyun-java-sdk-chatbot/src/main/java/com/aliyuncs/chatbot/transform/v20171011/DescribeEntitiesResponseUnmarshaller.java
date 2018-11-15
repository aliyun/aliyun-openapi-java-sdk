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

import com.aliyuncs.chatbot.model.v20171011.DescribeEntitiesResponse;
import com.aliyuncs.chatbot.model.v20171011.DescribeEntitiesResponse.MembersItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEntitiesResponseUnmarshaller {

	public static DescribeEntitiesResponse unmarshall(DescribeEntitiesResponse describeEntitiesResponse, UnmarshallerContext context) {
		
		describeEntitiesResponse.setRequestId(context.stringValue("DescribeEntitiesResponse.RequestId"));
		describeEntitiesResponse.setEntityId(context.longValue("DescribeEntitiesResponse.EntityId"));
		describeEntitiesResponse.setEntityName(context.stringValue("DescribeEntitiesResponse.EntityName"));
		describeEntitiesResponse.setEntityType(context.stringValue("DescribeEntitiesResponse.EntityType"));
		describeEntitiesResponse.setRegex(context.stringValue("DescribeEntitiesResponse.Regex"));
		describeEntitiesResponse.setCreateTime(context.stringValue("DescribeEntitiesResponse.CreateTime"));
		describeEntitiesResponse.setModifyTime(context.stringValue("DescribeEntitiesResponse.ModifyTime"));
		describeEntitiesResponse.setCreateUserId(context.stringValue("DescribeEntitiesResponse.CreateUserId"));
		describeEntitiesResponse.setCreateUserName(context.stringValue("DescribeEntitiesResponse.CreateUserName"));
		describeEntitiesResponse.setModifyUserId(context.stringValue("DescribeEntitiesResponse.ModifyUserId"));
		describeEntitiesResponse.setModifyUserName(context.stringValue("DescribeEntitiesResponse.ModifyUserName"));

		List<MembersItem> members = new ArrayList<MembersItem>();
		for (int i = 0; i < context.lengthValue("DescribeEntitiesResponse.Members.Length"); i++) {
			MembersItem membersItem = new MembersItem();
			membersItem.setMemberName(context.stringValue("DescribeEntitiesResponse.Members["+ i +"].MemberName"));

			List<String> synonyms = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeEntitiesResponse.Members["+ i +"].Synonyms.Length"); j++) {
				synonyms.add(context.stringValue("DescribeEntitiesResponse.Members["+ i +"].Synonyms["+ j +"]"));
			}
			membersItem.setSynonyms(synonyms);

			members.add(membersItem);
		}
		describeEntitiesResponse.setMembers(members);
	 
	 	return describeEntitiesResponse;
	}
}