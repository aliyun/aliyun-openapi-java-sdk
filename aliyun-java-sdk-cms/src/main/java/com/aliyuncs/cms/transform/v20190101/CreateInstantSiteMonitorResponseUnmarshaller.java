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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.CreateInstantSiteMonitorResponse;
import com.aliyuncs.cms.model.v20190101.CreateInstantSiteMonitorResponse.CreateResultListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstantSiteMonitorResponseUnmarshaller {

	public static CreateInstantSiteMonitorResponse unmarshall(CreateInstantSiteMonitorResponse createInstantSiteMonitorResponse, UnmarshallerContext _ctx) {
		
		createInstantSiteMonitorResponse.setRequestId(_ctx.stringValue("CreateInstantSiteMonitorResponse.RequestId"));
		createInstantSiteMonitorResponse.setCode(_ctx.stringValue("CreateInstantSiteMonitorResponse.Code"));
		createInstantSiteMonitorResponse.setMessage(_ctx.stringValue("CreateInstantSiteMonitorResponse.Message"));
		createInstantSiteMonitorResponse.setSuccess(_ctx.stringValue("CreateInstantSiteMonitorResponse.Success"));

		List<CreateResultListItem> createResultList = new ArrayList<CreateResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstantSiteMonitorResponse.CreateResultList.Length"); i++) {
			CreateResultListItem createResultListItem = new CreateResultListItem();
			createResultListItem.setTaskId(_ctx.stringValue("CreateInstantSiteMonitorResponse.CreateResultList["+ i +"].TaskId"));
			createResultListItem.setTaskName(_ctx.stringValue("CreateInstantSiteMonitorResponse.CreateResultList["+ i +"].TaskName"));

			createResultList.add(createResultListItem);
		}
		createInstantSiteMonitorResponse.setCreateResultList(createResultList);
	 
	 	return createInstantSiteMonitorResponse;
	}
}