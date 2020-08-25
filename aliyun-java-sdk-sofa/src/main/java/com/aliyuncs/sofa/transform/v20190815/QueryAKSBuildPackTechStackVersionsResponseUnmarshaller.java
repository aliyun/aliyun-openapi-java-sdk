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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryAKSBuildPackTechStackVersionsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryAKSBuildPackTechStackVersionsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAKSBuildPackTechStackVersionsResponseUnmarshaller {

	public static QueryAKSBuildPackTechStackVersionsResponse unmarshall(QueryAKSBuildPackTechStackVersionsResponse queryAKSBuildPackTechStackVersionsResponse, UnmarshallerContext _ctx) {
		
		queryAKSBuildPackTechStackVersionsResponse.setRequestId(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.RequestId"));
		queryAKSBuildPackTechStackVersionsResponse.setResultCode(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.ResultCode"));
		queryAKSBuildPackTechStackVersionsResponse.setResultMessage(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.ResultMessage"));
		queryAKSBuildPackTechStackVersionsResponse.setTotal(_ctx.longValue("QueryAKSBuildPackTechStackVersionsResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAKSBuildPackTechStackVersionsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setDescription(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].Description"));
			listItem.setExternalDestImage(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].ExternalDestImage"));
			listItem.setExternalRegistryPassword(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].ExternalRegistryPassword"));
			listItem.setExternalRegistryUser(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].ExternalRegistryUser"));
			listItem.setFromImage(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].FromImage"));
			listItem.setId(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].Id"));
			listItem.setName(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].Name"));
			listItem.setOnline(_ctx.booleanValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].Online"));
			listItem.setOwner(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].Owner"));
			listItem.setPackageDir(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].PackageDir"));
			listItem.setRegionId(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].RegionId"));
			listItem.setRegistryPassword(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].RegistryPassword"));
			listItem.setRegistryUser(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].RegistryUser"));
			listItem.setScope(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].Scope"));
			listItem.setTechStack(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].TechStack"));
			listItem.setTechStackId(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].TechStackId"));
			listItem.setUtcCreated(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].UtcCreated"));
			listItem.setUtcModified(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].UtcModified"));
			listItem.setVersion(_ctx.stringValue("QueryAKSBuildPackTechStackVersionsResponse.List["+ i +"].Version"));

			list.add(listItem);
		}
		queryAKSBuildPackTechStackVersionsResponse.setList(list);
	 
	 	return queryAKSBuildPackTechStackVersionsResponse;
	}
}