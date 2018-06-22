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

import com.aliyuncs.cms.model.v20180308.ApplyTemplateResponse;
import com.aliyuncs.cms.model.v20180308.ApplyTemplateResponse.Resource;
import com.aliyuncs.cms.model.v20180308.ApplyTemplateResponse.Resource.AlertResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyTemplateResponseUnmarshaller {

	public static ApplyTemplateResponse unmarshall(ApplyTemplateResponse applyTemplateResponse, UnmarshallerContext context) {
		
		applyTemplateResponse.setRequestId(context.stringValue("ApplyTemplateResponse.RequestId"));
		applyTemplateResponse.setSuccess(context.booleanValue("ApplyTemplateResponse.Success"));
		applyTemplateResponse.setErrorCode(context.integerValue("ApplyTemplateResponse.ErrorCode"));
		applyTemplateResponse.setErrorMessage(context.stringValue("ApplyTemplateResponse.ErrorMessage"));

		Resource resource = new Resource();

		List<AlertResult> createAlertResults = new ArrayList<AlertResult>();
		for (int i = 0; i < context.lengthValue("ApplyTemplateResponse.Resource.CreateAlertResults.Length"); i++) {
			AlertResult alertResult = new AlertResult();
			alertResult.setName(context.stringValue("ApplyTemplateResponse.Resource.CreateAlertResults["+ i +"].Name"));
			alertResult.setDisplayName(context.stringValue("ApplyTemplateResponse.Resource.CreateAlertResults["+ i +"].DisplayName"));
			alertResult.setMetricNamespace(context.stringValue("ApplyTemplateResponse.Resource.CreateAlertResults["+ i +"].MetricNamespace"));
			alertResult.setMetricName(context.stringValue("ApplyTemplateResponse.Resource.CreateAlertResults["+ i +"].MetricName"));
			alertResult.setMessage(context.stringValue("ApplyTemplateResponse.Resource.CreateAlertResults["+ i +"].Message"));
			alertResult.setSuccess(context.stringValue("ApplyTemplateResponse.Resource.CreateAlertResults["+ i +"].Success"));

			createAlertResults.add(alertResult);
		}
		resource.setCreateAlertResults(createAlertResults);
		applyTemplateResponse.setResource(resource);
	 
	 	return applyTemplateResponse;
	}
}