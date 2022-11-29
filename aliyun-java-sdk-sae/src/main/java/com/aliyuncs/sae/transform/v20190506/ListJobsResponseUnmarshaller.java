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

import com.aliyuncs.sae.model.v20190506.ListJobsResponse;
import com.aliyuncs.sae.model.v20190506.ListJobsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListJobsResponse.Data.Application;
import com.aliyuncs.sae.model.v20190506.ListJobsResponse.Data.Application.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setMessage(_ctx.stringValue("ListJobsResponse.Message"));
		listJobsResponse.setErrorCode(_ctx.stringValue("ListJobsResponse.ErrorCode"));
		listJobsResponse.setCode(_ctx.stringValue("ListJobsResponse.Code"));
		listJobsResponse.setSuccess(_ctx.booleanValue("ListJobsResponse.Success"));
		listJobsResponse.setCurrentPage(_ctx.integerValue("ListJobsResponse.CurrentPage"));
		listJobsResponse.setTotalSize(_ctx.integerValue("ListJobsResponse.TotalSize"));
		listJobsResponse.setPageSize(_ctx.integerValue("ListJobsResponse.PageSize"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("ListJobsResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.integerValue("ListJobsResponse.Data.TotalSize"));
		data.setPageSize(_ctx.integerValue("ListJobsResponse.Data.PageSize"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Data.Applications.Length"); i++) {
			Application application = new Application();
			application.setAppName(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].AppName"));
			application.setNamespaceId(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].NamespaceId"));
			application.setAppDeletingStatus(_ctx.booleanValue("ListJobsResponse.Data.Applications["+ i +"].AppDeletingStatus"));
			application.setAppId(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].AppId"));
			application.setScaleRuleEnabled(_ctx.booleanValue("ListJobsResponse.Data.Applications["+ i +"].ScaleRuleEnabled"));
			application.setScaleRuleType(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].ScaleRuleType"));
			application.setRunningInstances(_ctx.integerValue("ListJobsResponse.Data.Applications["+ i +"].RunningInstances"));
			application.setInstances(_ctx.integerValue("ListJobsResponse.Data.Applications["+ i +"].Instances"));
			application.setRegionId(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].RegionId"));
			application.setAppDescription(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].AppDescription"));
			application.setTriggerConfig(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].TriggerConfig"));
			application.setSuspend(_ctx.booleanValue("ListJobsResponse.Data.Applications["+ i +"].Suspend"));
			application.setActive(_ctx.longValue("ListJobsResponse.Data.Applications["+ i +"].Active"));
			application.setSucceeded(_ctx.longValue("ListJobsResponse.Data.Applications["+ i +"].Succeeded"));
			application.setFailed(_ctx.longValue("ListJobsResponse.Data.Applications["+ i +"].Failed"));
			application.setLastStartTime(_ctx.longValue("ListJobsResponse.Data.Applications["+ i +"].LastStartTime"));
			application.setCompletionTime(_ctx.longValue("ListJobsResponse.Data.Applications["+ i +"].CompletionTime"));
			application.setLastChangeorderState(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].LastChangeorderState"));
			application.setLastJobState(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].LastJobState"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListJobsResponse.Data.Applications["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListJobsResponse.Data.Applications["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			application.setTags(tags);

			applications.add(application);
		}
		data.setApplications(applications);
		listJobsResponse.setData(data);
	 
	 	return listJobsResponse;
	}
}