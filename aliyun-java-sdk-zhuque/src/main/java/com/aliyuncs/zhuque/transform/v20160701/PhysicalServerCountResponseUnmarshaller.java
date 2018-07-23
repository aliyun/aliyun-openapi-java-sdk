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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.PhysicalServerCountResponse;
import com.aliyuncs.zhuque.model.v20160701.PhysicalServerCountResponse.ProjectItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PhysicalServerCountResponseUnmarshaller {

	public static PhysicalServerCountResponse unmarshall(PhysicalServerCountResponse physicalServerCountResponse, UnmarshallerContext context) {
		
		physicalServerCountResponse.setRequestId(context.stringValue("PhysicalServerCountResponse.RequestId"));

		List<ProjectItem> data = new ArrayList<ProjectItem>();
		for (int i = 0; i < context.lengthValue("PhysicalServerCountResponse.Data.Length"); i++) {
			ProjectItem projectItem = new ProjectItem();
			projectItem.setProjectId(context.stringValue("PhysicalServerCountResponse.Data["+ i +"].ProjectId"));
			projectItem.setTotalServerCountByProject(context.integerValue("PhysicalServerCountResponse.Data["+ i +"].TotalServerCountByProject"));

			data.add(projectItem);
		}
		physicalServerCountResponse.setData(data);
	 
	 	return physicalServerCountResponse;
	}
}