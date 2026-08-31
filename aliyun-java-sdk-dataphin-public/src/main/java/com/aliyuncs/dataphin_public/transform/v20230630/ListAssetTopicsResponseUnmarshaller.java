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

import com.aliyuncs.dataphin_public.model.v20230630.ListAssetTopicsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetTopicsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetTopicsResponse.Data.Topic;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetTopicsResponse.Data.Topic.Owner;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetTopicsResponse.Data.Topic.VisibleUser;
import com.aliyuncs.dataphin_public.model.v20230630.ListAssetTopicsResponse.Data.Topic.VisibleUserGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssetTopicsResponseUnmarshaller {

	public static ListAssetTopicsResponse unmarshall(ListAssetTopicsResponse listAssetTopicsResponse, UnmarshallerContext _ctx) {
		
		listAssetTopicsResponse.setRequestId(_ctx.stringValue("ListAssetTopicsResponse.RequestId"));
		listAssetTopicsResponse.setMessage(_ctx.stringValue("ListAssetTopicsResponse.Message"));
		listAssetTopicsResponse.setHttpStatusCode(_ctx.integerValue("ListAssetTopicsResponse.HttpStatusCode"));
		listAssetTopicsResponse.setCode(_ctx.stringValue("ListAssetTopicsResponse.Code"));
		listAssetTopicsResponse.setSuccess(_ctx.booleanValue("ListAssetTopicsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListAssetTopicsResponse.Data.TotalCount"));

		List<Topic> topicList = new ArrayList<Topic>();
		for (int i = 0; i < _ctx.lengthValue("ListAssetTopicsResponse.Data.TopicList.Length"); i++) {
			Topic topic = new Topic();
			topic.setModifyTime(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].ModifyTime"));
			topic.setAssetType(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].AssetType"));
			topic.setVisibilityType(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].VisibilityType"));
			topic.setTopicId(_ctx.longValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].TopicId"));
			topic.setTopicDescription(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].TopicDescription"));
			topic.setTopicName(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].TopicName"));

			List<VisibleUserGroup> visibleUserGroups = new ArrayList<VisibleUserGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].VisibleUserGroups.Length"); j++) {
				VisibleUserGroup visibleUserGroup = new VisibleUserGroup();
				visibleUserGroup.setUserGroupId(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].VisibleUserGroups["+ j +"].UserGroupId"));
				visibleUserGroup.setUserGroupName(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].VisibleUserGroups["+ j +"].UserGroupName"));

				visibleUserGroups.add(visibleUserGroup);
			}
			topic.setVisibleUserGroups(visibleUserGroups);

			List<VisibleUser> visibleUsers = new ArrayList<VisibleUser>();
			for (int j = 0; j < _ctx.lengthValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].VisibleUsers.Length"); j++) {
				VisibleUser visibleUser = new VisibleUser();
				visibleUser.setUserName(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].VisibleUsers["+ j +"].UserName"));
				visibleUser.setUserId(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].VisibleUsers["+ j +"].UserId"));

				visibleUsers.add(visibleUser);
			}
			topic.setVisibleUsers(visibleUsers);

			List<Owner> owners = new ArrayList<Owner>();
			for (int j = 0; j < _ctx.lengthValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].Owners.Length"); j++) {
				Owner owner = new Owner();
				owner.setUserName(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].Owners["+ j +"].UserName"));
				owner.setUserId(_ctx.stringValue("ListAssetTopicsResponse.Data.TopicList["+ i +"].Owners["+ j +"].UserId"));

				owners.add(owner);
			}
			topic.setOwners(owners);

			topicList.add(topic);
		}
		data.setTopicList(topicList);
		listAssetTopicsResponse.setData(data);
	 
	 	return listAssetTopicsResponse;
	}
}