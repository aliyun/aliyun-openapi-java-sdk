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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse;
import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse.Data.Application;
import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse.Data.Application.ChildrenItem;
import com.aliyuncs.sae.model.v20190506.ListApplicationsResponse.Data.Application.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationsResponseUnmarshaller {

	public static ListApplicationsResponse unmarshall(ListApplicationsResponse listApplicationsResponse, UnmarshallerContext _ctx) {
		
		listApplicationsResponse.setRequestId(_ctx.stringValue("ListApplicationsResponse.RequestId"));
		listApplicationsResponse.setMessage(_ctx.stringValue("ListApplicationsResponse.Message"));
		listApplicationsResponse.setErrorCode(_ctx.stringValue("ListApplicationsResponse.ErrorCode"));
		listApplicationsResponse.setCode(_ctx.stringValue("ListApplicationsResponse.Code"));
		listApplicationsResponse.setSuccess(_ctx.booleanValue("ListApplicationsResponse.Success"));
		listApplicationsResponse.setCurrentPage(_ctx.integerValue("ListApplicationsResponse.CurrentPage"));
		listApplicationsResponse.setTotalSize(_ctx.integerValue("ListApplicationsResponse.TotalSize"));
		listApplicationsResponse.setPageSize(_ctx.integerValue("ListApplicationsResponse.PageSize"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListApplicationsResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.integerValue("ListApplicationsResponse.Data.TotalSize"));
		data.setPageSize(_ctx.integerValue("ListApplicationsResponse.Data.PageSize"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationsResponse.Data.Applications.Length"); i++) {
			Application application = new Application();
			application.setAppName(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].AppName"));
			application.setNamespaceId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].NamespaceId"));
			application.setAppDeletingStatus(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].AppDeletingStatus"));
			application.setAppId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].AppId"));
			application.setScaleRuleEnabled(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].ScaleRuleEnabled"));
			application.setScaleRuleType(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].ScaleRuleType"));
			application.setRunningInstances(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].RunningInstances"));
			application.setInstances(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Instances"));
			application.setRegionId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].RegionId"));
			application.setAppDescription(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].AppDescription"));
			application.setCpu(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Cpu"));
			application.setMem(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Mem"));
			application.setMseEnabled(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].MseEnabled"));
			application.setMseNamespaceId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].MseNamespaceId"));
			application.setBaseAppId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].BaseAppId"));
			application.setProgrammingLanguage(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].ProgrammingLanguage"));
			application.setImageUrl(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].ImageUrl"));
			application.setPackageUrl(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].PackageUrl"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsResponse.Data.Applications["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			application.setTags(tags);

			List<ChildrenItem> children = new ArrayList<ChildrenItem>();
			for (int j = 0; j < _ctx.lengthValue("ListApplicationsResponse.Data.Applications["+ i +"].Children.Length"); j++) {
				ChildrenItem childrenItem = new ChildrenItem();
				childrenItem.setAppName(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].AppName"));
				childrenItem.setNamespaceId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].NamespaceId"));
				childrenItem.setAppDeletingStatus(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].AppDeletingStatus"));
				childrenItem.setAppId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].AppId"));
				childrenItem.setScaleRuleEnabled(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].ScaleRuleEnabled"));
				childrenItem.setScaleRuleType(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].ScaleRuleType"));
				childrenItem.setRunningInstances(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].RunningInstances"));
				childrenItem.setInstances(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].Instances"));
				childrenItem.setRegionId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].RegionId"));
				childrenItem.setAppDescription(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].AppDescription"));
				childrenItem.setCpu(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].Cpu"));
				childrenItem.setMem(_ctx.integerValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].Mem"));
				childrenItem.setMseEnabled(_ctx.booleanValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].MseEnabled"));
				childrenItem.setBaseAppId(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].BaseAppId"));
				childrenItem.setProgrammingLanguage(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].ProgrammingLanguage"));

				List<TagsItem> tags1 = new ArrayList<TagsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].Tags.Length"); k++) {
					TagsItem tagsItem1 = new TagsItem();
					tagsItem1.setKey(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].Tags["+ k +"].Key"));
					tagsItem1.setValue(_ctx.stringValue("ListApplicationsResponse.Data.Applications["+ i +"].Children["+ j +"].Tags["+ k +"].Value"));

					tags1.add(tagsItem1);
				}
				childrenItem.setTags1(tags1);

				children.add(childrenItem);
			}
			application.setChildren(children);

			applications.add(application);
		}
		data.setApplications(applications);
		listApplicationsResponse.setData(data);
	 
	 	return listApplicationsResponse;
	}
}