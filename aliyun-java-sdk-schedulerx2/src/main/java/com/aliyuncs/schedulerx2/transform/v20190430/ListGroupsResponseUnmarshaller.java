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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ListGroupsResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ListGroupsResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ListGroupsResponse.Data.AppGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupsResponseUnmarshaller {

	public static ListGroupsResponse unmarshall(ListGroupsResponse listGroupsResponse, UnmarshallerContext _ctx) {
		
		listGroupsResponse.setRequestId(_ctx.stringValue("ListGroupsResponse.RequestId"));
		listGroupsResponse.setCode(_ctx.integerValue("ListGroupsResponse.Code"));
		listGroupsResponse.setMessage(_ctx.stringValue("ListGroupsResponse.Message"));
		listGroupsResponse.setSuccess(_ctx.booleanValue("ListGroupsResponse.Success"));

		Data data = new Data();

		List<AppGroup> appGroups = new ArrayList<AppGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupsResponse.Data.AppGroups.Length"); i++) {
			AppGroup appGroup = new AppGroup();
			appGroup.setAppName(_ctx.stringValue("ListGroupsResponse.Data.AppGroups["+ i +"].AppName"));
			appGroup.setGroupId(_ctx.stringValue("ListGroupsResponse.Data.AppGroups["+ i +"].GroupId"));
			appGroup.setAppKey(_ctx.stringValue("ListGroupsResponse.Data.AppGroups["+ i +"].AppKey"));
			appGroup.setDescription(_ctx.stringValue("ListGroupsResponse.Data.AppGroups["+ i +"].Description"));

			appGroups.add(appGroup);
		}
		data.setAppGroups(appGroups);
		listGroupsResponse.setData(data);
	 
	 	return listGroupsResponse;
	}
}