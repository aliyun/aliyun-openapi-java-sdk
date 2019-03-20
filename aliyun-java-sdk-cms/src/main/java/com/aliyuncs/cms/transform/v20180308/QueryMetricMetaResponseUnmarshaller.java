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

import com.aliyuncs.cms.model.v20180308.QueryMetricMetaResponse;
import com.aliyuncs.cms.model.v20180308.QueryMetricMetaResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMetricMetaResponseUnmarshaller {

	public static QueryMetricMetaResponse unmarshall(QueryMetricMetaResponse queryMetricMetaResponse, UnmarshallerContext context) {
		
		queryMetricMetaResponse.setRequestId(context.stringValue("QueryMetricMetaResponse.RequestId"));
		queryMetricMetaResponse.setSuccess(context.booleanValue("QueryMetricMetaResponse.Success"));
		queryMetricMetaResponse.setErrorCode(context.stringValue("QueryMetricMetaResponse.ErrorCode"));
		queryMetricMetaResponse.setErrorMessage(context.stringValue("QueryMetricMetaResponse.ErrorMessage"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("QueryMetricMetaResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setProject(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Project"));
			resource.setMetric(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Metric"));
			resource.setStatistics(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Statistics"));
			resource.setUnit(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Unit"));
			resource.setDescription(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Description"));
			resource.setDimensions(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Dimensions"));
			resource.setPeriods(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Periods"));
			resource.setLabels(context.stringValue("QueryMetricMetaResponse.Resources["+ i +"].Labels"));

			resources.add(resource);
		}
		queryMetricMetaResponse.setResources(resources);
	 
	 	return queryMetricMetaResponse;
	}
}