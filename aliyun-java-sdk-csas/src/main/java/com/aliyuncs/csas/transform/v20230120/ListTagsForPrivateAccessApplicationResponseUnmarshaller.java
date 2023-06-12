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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListTagsForPrivateAccessApplicationResponse;
import com.aliyuncs.csas.model.v20230120.ListTagsForPrivateAccessApplicationResponse.Application;
import com.aliyuncs.csas.model.v20230120.ListTagsForPrivateAccessApplicationResponse.Application.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagsForPrivateAccessApplicationResponseUnmarshaller {

	public static ListTagsForPrivateAccessApplicationResponse unmarshall(ListTagsForPrivateAccessApplicationResponse listTagsForPrivateAccessApplicationResponse, UnmarshallerContext _ctx) {
		
		listTagsForPrivateAccessApplicationResponse.setRequestId(_ctx.stringValue("ListTagsForPrivateAccessApplicationResponse.RequestId"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListTagsForPrivateAccessApplicationResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setApplicationId(_ctx.stringValue("ListTagsForPrivateAccessApplicationResponse.Applications["+ i +"].ApplicationId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTagsForPrivateAccessApplicationResponse.Applications["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagId(_ctx.stringValue("ListTagsForPrivateAccessApplicationResponse.Applications["+ i +"].Tags["+ j +"].TagId"));
				tag.setName(_ctx.stringValue("ListTagsForPrivateAccessApplicationResponse.Applications["+ i +"].Tags["+ j +"].Name"));
				tag.setDescription(_ctx.stringValue("ListTagsForPrivateAccessApplicationResponse.Applications["+ i +"].Tags["+ j +"].Description"));
				tag.setTagType(_ctx.stringValue("ListTagsForPrivateAccessApplicationResponse.Applications["+ i +"].Tags["+ j +"].TagType"));
				tag.setCreateTime(_ctx.stringValue("ListTagsForPrivateAccessApplicationResponse.Applications["+ i +"].Tags["+ j +"].CreateTime"));

				tags.add(tag);
			}
			application.setTags(tags);

			applications.add(application);
		}
		listTagsForPrivateAccessApplicationResponse.setApplications(applications);
	 
	 	return listTagsForPrivateAccessApplicationResponse;
	}
}