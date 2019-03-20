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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.ListMonitoringTemplatesResponse;
import com.aliyuncs.cms.model.v20180308.ListMonitoringTemplatesResponse.Resource;
import com.aliyuncs.cms.model.v20180308.ListMonitoringTemplatesResponse.Resource.ApplyHistory;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMonitoringTemplatesResponseUnmarshaller {

	public static ListMonitoringTemplatesResponse unmarshall(ListMonitoringTemplatesResponse listMonitoringTemplatesResponse, UnmarshallerContext context) {
		
		listMonitoringTemplatesResponse.setRequestId(context.stringValue("ListMonitoringTemplatesResponse.RequestId"));
		listMonitoringTemplatesResponse.setSuccess(context.booleanValue("ListMonitoringTemplatesResponse.Success"));
		listMonitoringTemplatesResponse.setErrorCode(context.integerValue("ListMonitoringTemplatesResponse.ErrorCode"));
		listMonitoringTemplatesResponse.setErrorMessage(context.stringValue("ListMonitoringTemplatesResponse.ErrorMessage"));
		listMonitoringTemplatesResponse.setPageSize(context.longValue("ListMonitoringTemplatesResponse.PageSize"));
		listMonitoringTemplatesResponse.setPageNumber(context.longValue("ListMonitoringTemplatesResponse.PageNumber"));
		listMonitoringTemplatesResponse.setTotal(context.longValue("ListMonitoringTemplatesResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("ListMonitoringTemplatesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setName(context.stringValue("ListMonitoringTemplatesResponse.Resources["+ i +"].Name"));
			resource.setNamespace(context.stringValue("ListMonitoringTemplatesResponse.Resources["+ i +"].Namespace"));
			resource.setDescription(context.stringValue("ListMonitoringTemplatesResponse.Resources["+ i +"].Description"));
			resource.setAlertTemplatesJson(context.stringValue("ListMonitoringTemplatesResponse.Resources["+ i +"].AlertTemplatesJson"));
			resource.setRestVersion(context.longValue("ListMonitoringTemplatesResponse.Resources["+ i +"].RestVersion"));
			resource.setId(context.longValue("ListMonitoringTemplatesResponse.Resources["+ i +"].Id"));
			resource.setGmtCreate(context.longValue("ListMonitoringTemplatesResponse.Resources["+ i +"].GmtCreate"));
			resource.setGmtModified(context.longValue("ListMonitoringTemplatesResponse.Resources["+ i +"].GmtModified"));
			resource.setEventRuleTemplatesJson(context.stringValue("ListMonitoringTemplatesResponse.Resources["+ i +"].EventRuleTemplatesJson"));

			List<ApplyHistory> applyHistories = new ArrayList<ApplyHistory>();
			for (int j = 0; j < context.lengthValue("ListMonitoringTemplatesResponse.Resources["+ i +"].ApplyHistories.Length"); j++) {
				ApplyHistory applyHistory = new ApplyHistory();
				applyHistory.setGroupId(context.longValue("ListMonitoringTemplatesResponse.Resources["+ i +"].ApplyHistories["+ j +"].GroupId"));
				applyHistory.setGroupName(context.stringValue("ListMonitoringTemplatesResponse.Resources["+ i +"].ApplyHistories["+ j +"].GroupName"));
				applyHistory.setApplyTime(context.longValue("ListMonitoringTemplatesResponse.Resources["+ i +"].ApplyHistories["+ j +"].ApplyTime"));

				applyHistories.add(applyHistory);
			}
			resource.setApplyHistories(applyHistories);

			resources.add(resource);
		}
		listMonitoringTemplatesResponse.setResources(resources);
	 
	 	return listMonitoringTemplatesResponse;
	}
}