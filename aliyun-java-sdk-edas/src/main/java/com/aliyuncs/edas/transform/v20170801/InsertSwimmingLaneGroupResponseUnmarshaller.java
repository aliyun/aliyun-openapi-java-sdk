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

import com.aliyuncs.edas.model.v20170801.InsertSwimmingLaneGroupResponse;
import com.aliyuncs.edas.model.v20170801.InsertSwimmingLaneGroupResponse.Data;
import com.aliyuncs.edas.model.v20170801.InsertSwimmingLaneGroupResponse.Data.Application;
import com.aliyuncs.edas.model.v20170801.InsertSwimmingLaneGroupResponse.Data.EntryApplication;
import com.aliyuncs.transform.UnmarshallerContext;


public class InsertSwimmingLaneGroupResponseUnmarshaller {

	public static InsertSwimmingLaneGroupResponse unmarshall(InsertSwimmingLaneGroupResponse insertSwimmingLaneGroupResponse, UnmarshallerContext _ctx) {
		
		insertSwimmingLaneGroupResponse.setRequestId(_ctx.stringValue("InsertSwimmingLaneGroupResponse.RequestId"));
		insertSwimmingLaneGroupResponse.setCode(_ctx.integerValue("InsertSwimmingLaneGroupResponse.Code"));
		insertSwimmingLaneGroupResponse.setMessage(_ctx.stringValue("InsertSwimmingLaneGroupResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("InsertSwimmingLaneGroupResponse.Data.Id"));
		data.setName(_ctx.stringValue("InsertSwimmingLaneGroupResponse.Data.Name"));
		data.setNamespaceId(_ctx.stringValue("InsertSwimmingLaneGroupResponse.Data.NamespaceId"));

		EntryApplication entryApplication = new EntryApplication();
		entryApplication.setAppName(_ctx.stringValue("InsertSwimmingLaneGroupResponse.Data.EntryApplication.AppName"));
		entryApplication.setAppId(_ctx.stringValue("InsertSwimmingLaneGroupResponse.Data.EntryApplication.AppId"));
		data.setEntryApplication(entryApplication);

		List<Application> applicationList = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("InsertSwimmingLaneGroupResponse.Data.ApplicationList.Length"); i++) {
			Application application = new Application();
			application.setAppName(_ctx.stringValue("InsertSwimmingLaneGroupResponse.Data.ApplicationList["+ i +"].AppName"));
			application.setAppId(_ctx.stringValue("InsertSwimmingLaneGroupResponse.Data.ApplicationList["+ i +"].AppId"));

			applicationList.add(application);
		}
		data.setApplicationList(applicationList);
		insertSwimmingLaneGroupResponse.setData(data);
	 
	 	return insertSwimmingLaneGroupResponse;
	}
}