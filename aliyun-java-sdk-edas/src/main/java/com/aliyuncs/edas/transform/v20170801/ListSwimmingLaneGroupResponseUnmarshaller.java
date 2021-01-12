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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListSwimmingLaneGroupResponse;
import com.aliyuncs.edas.model.v20170801.ListSwimmingLaneGroupResponse.SwimmingLaneGroup;
import com.aliyuncs.edas.model.v20170801.ListSwimmingLaneGroupResponse.SwimmingLaneGroup.Application;
import com.aliyuncs.edas.model.v20170801.ListSwimmingLaneGroupResponse.SwimmingLaneGroup.EntryApplication;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSwimmingLaneGroupResponseUnmarshaller {

	public static ListSwimmingLaneGroupResponse unmarshall(ListSwimmingLaneGroupResponse listSwimmingLaneGroupResponse, UnmarshallerContext _ctx) {
		
		listSwimmingLaneGroupResponse.setRequestId(_ctx.stringValue("ListSwimmingLaneGroupResponse.RequestId"));
		listSwimmingLaneGroupResponse.setCode(_ctx.integerValue("ListSwimmingLaneGroupResponse.Code"));
		listSwimmingLaneGroupResponse.setMessage(_ctx.stringValue("ListSwimmingLaneGroupResponse.Message"));

		List<SwimmingLaneGroup> data = new ArrayList<SwimmingLaneGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListSwimmingLaneGroupResponse.Data.Length"); i++) {
			SwimmingLaneGroup swimmingLaneGroup = new SwimmingLaneGroup();
			swimmingLaneGroup.setId(_ctx.longValue("ListSwimmingLaneGroupResponse.Data["+ i +"].Id"));
			swimmingLaneGroup.setName(_ctx.stringValue("ListSwimmingLaneGroupResponse.Data["+ i +"].Name"));
			swimmingLaneGroup.setNamespaceId(_ctx.stringValue("ListSwimmingLaneGroupResponse.Data["+ i +"].NamespaceId"));

			EntryApplication entryApplication = new EntryApplication();
			entryApplication.setAppName(_ctx.stringValue("ListSwimmingLaneGroupResponse.Data["+ i +"].EntryApplication.AppName"));
			entryApplication.setAppId(_ctx.stringValue("ListSwimmingLaneGroupResponse.Data["+ i +"].EntryApplication.AppId"));
			entryApplication.setSource(_ctx.stringValue("ListSwimmingLaneGroupResponse.Data["+ i +"].EntryApplication.Source"));
			swimmingLaneGroup.setEntryApplication(entryApplication);

			List<Application> applicationList = new ArrayList<Application>();
			for (int j = 0; j < _ctx.lengthValue("ListSwimmingLaneGroupResponse.Data["+ i +"].ApplicationList.Length"); j++) {
				Application application = new Application();
				application.setAppName(_ctx.stringValue("ListSwimmingLaneGroupResponse.Data["+ i +"].ApplicationList["+ j +"].AppName"));
				application.setAppId(_ctx.stringValue("ListSwimmingLaneGroupResponse.Data["+ i +"].ApplicationList["+ j +"].AppId"));

				applicationList.add(application);
			}
			swimmingLaneGroup.setApplicationList(applicationList);

			data.add(swimmingLaneGroup);
		}
		listSwimmingLaneGroupResponse.setData(data);
	 
	 	return listSwimmingLaneGroupResponse;
	}
}