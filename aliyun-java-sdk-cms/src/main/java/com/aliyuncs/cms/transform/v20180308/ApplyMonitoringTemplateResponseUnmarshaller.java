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

import com.aliyuncs.cms.model.v20180308.ApplyMonitoringTemplateResponse;
import com.aliyuncs.cms.model.v20180308.ApplyMonitoringTemplateResponse.Resource;
import com.aliyuncs.cms.model.v20180308.ApplyMonitoringTemplateResponse.Resource.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyMonitoringTemplateResponseUnmarshaller {

	public static ApplyMonitoringTemplateResponse unmarshall(ApplyMonitoringTemplateResponse applyMonitoringTemplateResponse, UnmarshallerContext context) {
		
		applyMonitoringTemplateResponse.setRequestId(context.stringValue("ApplyMonitoringTemplateResponse.RequestId"));
		applyMonitoringTemplateResponse.setSuccess(context.booleanValue("ApplyMonitoringTemplateResponse.Success"));
		applyMonitoringTemplateResponse.setErrorCode(context.integerValue("ApplyMonitoringTemplateResponse.ErrorCode"));
		applyMonitoringTemplateResponse.setErrorMessage(context.stringValue("ApplyMonitoringTemplateResponse.ErrorMessage"));

		Resource resource = new Resource();
		resource.setGroupId(context.longValue("ApplyMonitoringTemplateResponse.Resource.GroupId"));

		List<Result> eventResults = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ApplyMonitoringTemplateResponse.Resource.EventResults.Length"); i++) {
			Result result = new Result();
			result.setGroupId(context.longValue("ApplyMonitoringTemplateResponse.Resource.EventResults["+ i +"].GroupId"));
			result.setName(context.stringValue("ApplyMonitoringTemplateResponse.Resource.EventResults["+ i +"].Name"));
			result.setMessage(context.stringValue("ApplyMonitoringTemplateResponse.Resource.EventResults["+ i +"].Message"));
			result.setDisplayName(context.stringValue("ApplyMonitoringTemplateResponse.Resource.EventResults["+ i +"].DisplayName"));
			result.setCode(context.integerValue("ApplyMonitoringTemplateResponse.Resource.EventResults["+ i +"].Code"));
			result.setSuccess(context.booleanValue("ApplyMonitoringTemplateResponse.Resource.EventResults["+ i +"].Success"));

			eventResults.add(result);
		}
		resource.setEventResults(eventResults);

		List<Result> alertResults = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("ApplyMonitoringTemplateResponse.Resource.AlertResults.Length"); i++) {
			Result result = new Result();
			result.setGroupId(context.longValue("ApplyMonitoringTemplateResponse.Resource.AlertResults["+ i +"].GroupId"));
			result.setName(context.stringValue("ApplyMonitoringTemplateResponse.Resource.AlertResults["+ i +"].Name"));
			result.setMessage(context.stringValue("ApplyMonitoringTemplateResponse.Resource.AlertResults["+ i +"].Message"));
			result.setDisplayName(context.stringValue("ApplyMonitoringTemplateResponse.Resource.AlertResults["+ i +"].DisplayName"));
			result.setCode(context.integerValue("ApplyMonitoringTemplateResponse.Resource.AlertResults["+ i +"].Code"));
			result.setSuccess(context.booleanValue("ApplyMonitoringTemplateResponse.Resource.AlertResults["+ i +"].Success"));

			alertResults.add(result);
		}
		resource.setAlertResults(alertResults);
		applyMonitoringTemplateResponse.setResource(resource);
	 
	 	return applyMonitoringTemplateResponse;
	}
}