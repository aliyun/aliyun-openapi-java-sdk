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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListApplicationGroupsResponse;
import com.aliyuncs.oos.model.v20190601.ListApplicationGroupsResponse.ApplicationGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationGroupsResponseUnmarshaller {

	public static ListApplicationGroupsResponse unmarshall(ListApplicationGroupsResponse listApplicationGroupsResponse, UnmarshallerContext _ctx) {
		
		listApplicationGroupsResponse.setRequestId(_ctx.stringValue("ListApplicationGroupsResponse.RequestId"));
		listApplicationGroupsResponse.setNextToken(_ctx.stringValue("ListApplicationGroupsResponse.NextToken"));
		listApplicationGroupsResponse.setMaxResults(_ctx.integerValue("ListApplicationGroupsResponse.MaxResults"));

		List<ApplicationGroup> applicationGroups = new ArrayList<ApplicationGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationGroupsResponse.ApplicationGroups.Length"); i++) {
			ApplicationGroup applicationGroup = new ApplicationGroup();
			applicationGroup.setCmsGroupId(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].CmsGroupId"));
			applicationGroup.setDeployRegionId(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].DeployRegionId"));
			applicationGroup.setUpdateDate(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].UpdateDate"));
			applicationGroup.setDescription(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].Description"));
			applicationGroup.setImportTagKey(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].ImportTagKey"));
			applicationGroup.setApplicationName(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].ApplicationName"));
			applicationGroup.setImportTagValue(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].ImportTagValue"));
			applicationGroup.setName(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].Name"));
			applicationGroup.setCreateDate(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].CreateDate"));
			applicationGroup.setStatus(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].Status"));
			applicationGroup.setDeployParameters(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].DeployParameters"));
			applicationGroup.setStatusReason(_ctx.stringValue("ListApplicationGroupsResponse.ApplicationGroups["+ i +"].StatusReason"));

			applicationGroups.add(applicationGroup);
		}
		listApplicationGroupsResponse.setApplicationGroups(applicationGroups);
	 
	 	return listApplicationGroupsResponse;
	}
}