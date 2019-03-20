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

import com.aliyuncs.cms.model.v20180308.CreateMyGroupAlertBatchResponse;
import com.aliyuncs.cms.model.v20180308.CreateMyGroupAlertBatchResponse.AlertResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMyGroupAlertBatchResponseUnmarshaller {

	public static CreateMyGroupAlertBatchResponse unmarshall(CreateMyGroupAlertBatchResponse createMyGroupAlertBatchResponse, UnmarshallerContext context) {
		
		createMyGroupAlertBatchResponse.setRequestId(context.stringValue("CreateMyGroupAlertBatchResponse.RequestId"));
		createMyGroupAlertBatchResponse.setSuccess(context.booleanValue("CreateMyGroupAlertBatchResponse.Success"));
		createMyGroupAlertBatchResponse.setErrorCode(context.integerValue("CreateMyGroupAlertBatchResponse.ErrorCode"));
		createMyGroupAlertBatchResponse.setErrorMessage(context.stringValue("CreateMyGroupAlertBatchResponse.ErrorMessage"));

		List<AlertResult> resources = new ArrayList<AlertResult>();
		for (int i = 0; i < context.lengthValue("CreateMyGroupAlertBatchResponse.Resources.Length"); i++) {
			AlertResult alertResult = new AlertResult();
			alertResult.setAlertName(context.stringValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].AlertName"));
			alertResult.setDisplayName(context.stringValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].DisplayName"));
			alertResult.setMetricNamespace(context.stringValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].MetricNamespace"));
			alertResult.setMetricName(context.stringValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].MetricName"));
			alertResult.setMessage(context.stringValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].Message"));
			alertResult.setCode(context.integerValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].Code"));
			alertResult.setSuccess(context.booleanValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].Success"));
			alertResult.setGroupId(context.longValue("CreateMyGroupAlertBatchResponse.Resources["+ i +"].GroupId"));

			resources.add(alertResult);
		}
		createMyGroupAlertBatchResponse.setResources(resources);
	 
	 	return createMyGroupAlertBatchResponse;
	}
}