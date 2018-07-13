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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListContainerAppsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListContainerAppsResponse.ContainerAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListContainerAppsResponseUnmarshaller {

	public static ListContainerAppsResponse unmarshall(ListContainerAppsResponse listContainerAppsResponse, UnmarshallerContext context) {
		
		listContainerAppsResponse.setRequestId(context.stringValue("ListContainerAppsResponse.RequestId"));
		listContainerAppsResponse.setTotalCount(context.integerValue("ListContainerAppsResponse.TotalCount"));
		listContainerAppsResponse.setPageNumber(context.integerValue("ListContainerAppsResponse.PageNumber"));
		listContainerAppsResponse.setPageSize(context.integerValue("ListContainerAppsResponse.PageSize"));

		List<ContainerAppsItem> containerApps = new ArrayList<ContainerAppsItem>();
		for (int i = 0; i < context.lengthValue("ListContainerAppsResponse.ContainerApps.Length"); i++) {
			ContainerAppsItem containerAppsItem = new ContainerAppsItem();
			containerAppsItem.setId(context.stringValue("ListContainerAppsResponse.ContainerApps["+ i +"].Id"));
			containerAppsItem.setName(context.stringValue("ListContainerAppsResponse.ContainerApps["+ i +"].Name"));
			containerAppsItem.setDescription(context.stringValue("ListContainerAppsResponse.ContainerApps["+ i +"].Description"));
			containerAppsItem.setRepository(context.stringValue("ListContainerAppsResponse.ContainerApps["+ i +"].Repository"));
			containerAppsItem.setImageTag(context.stringValue("ListContainerAppsResponse.ContainerApps["+ i +"].ImageTag"));
			containerAppsItem.setCreateTime(context.stringValue("ListContainerAppsResponse.ContainerApps["+ i +"].CreateTime"));
			containerAppsItem.setType(context.stringValue("ListContainerAppsResponse.ContainerApps["+ i +"].Type"));

			containerApps.add(containerAppsItem);
		}
		listContainerAppsResponse.setContainerApps(containerApps);
	 
	 	return listContainerAppsResponse;
	}
}