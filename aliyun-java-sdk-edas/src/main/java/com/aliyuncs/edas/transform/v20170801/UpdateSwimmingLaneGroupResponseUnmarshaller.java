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

import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLaneGroupResponse;
import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLaneGroupResponse.Data;
import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLaneGroupResponse.Data.Application;
import com.aliyuncs.edas.model.v20170801.UpdateSwimmingLaneGroupResponse.Data.EntryApplication;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSwimmingLaneGroupResponseUnmarshaller {

	public static UpdateSwimmingLaneGroupResponse unmarshall(UpdateSwimmingLaneGroupResponse updateSwimmingLaneGroupResponse, UnmarshallerContext _ctx) {
		
		updateSwimmingLaneGroupResponse.setRequestId(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.RequestId"));
		updateSwimmingLaneGroupResponse.setCode(_ctx.integerValue("UpdateSwimmingLaneGroupResponse.Code"));
		updateSwimmingLaneGroupResponse.setMessage(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateSwimmingLaneGroupResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.Data.Name"));
		data.setNamespaceId(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.Data.NamespaceId"));

		EntryApplication entryApplication = new EntryApplication();
		entryApplication.setAppName(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.Data.EntryApplication.AppName"));
		entryApplication.setAppId(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.Data.EntryApplication.AppId"));
		data.setEntryApplication(entryApplication);

		List<Application> applicationList = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("UpdateSwimmingLaneGroupResponse.Data.ApplicationList.Length"); i++) {
			Application application = new Application();
			application.setAppName(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.Data.ApplicationList["+ i +"].AppName"));
			application.setAppId(_ctx.stringValue("UpdateSwimmingLaneGroupResponse.Data.ApplicationList["+ i +"].AppId"));

			applicationList.add(application);
		}
		data.setApplicationList(applicationList);
		updateSwimmingLaneGroupResponse.setData(data);
	 
	 	return updateSwimmingLaneGroupResponse;
	}
}