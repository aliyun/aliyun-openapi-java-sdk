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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GetTemplateSummaryResponse;
import com.aliyuncs.ros.model.v20190910.GetTemplateSummaryResponse.ResourceIdentifierSummary;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTemplateSummaryResponseUnmarshaller {

	public static GetTemplateSummaryResponse unmarshall(GetTemplateSummaryResponse getTemplateSummaryResponse, UnmarshallerContext _ctx) {
		
		getTemplateSummaryResponse.setRequestId(_ctx.stringValue("GetTemplateSummaryResponse.RequestId"));
		getTemplateSummaryResponse.setDescription(_ctx.stringValue("GetTemplateSummaryResponse.Description"));
		getTemplateSummaryResponse.setMetadata(_ctx.mapValue("GetTemplateSummaryResponse.Metadata"));
		getTemplateSummaryResponse.setVersion(_ctx.stringValue("GetTemplateSummaryResponse.Version"));

		List<Map<Object, Object>> parameters = _ctx.listMapValue("GetTemplateSummaryResponse.Parameters");
		getTemplateSummaryResponse.setParameters(parameters);

		List<String> resourceTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateSummaryResponse.ResourceTypes.Length"); i++) {
			resourceTypes.add(_ctx.stringValue("GetTemplateSummaryResponse.ResourceTypes["+ i +"]"));
		}
		getTemplateSummaryResponse.setResourceTypes(resourceTypes);

		List<ResourceIdentifierSummary> resourceIdentifierSummaries = new ArrayList<ResourceIdentifierSummary>();
		for (int i = 0; i < _ctx.lengthValue("GetTemplateSummaryResponse.ResourceIdentifierSummaries.Length"); i++) {
			ResourceIdentifierSummary resourceIdentifierSummary = new ResourceIdentifierSummary();
			resourceIdentifierSummary.setResourceType(_ctx.stringValue("GetTemplateSummaryResponse.ResourceIdentifierSummaries["+ i +"].ResourceType"));

			List<String> logicalResourceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateSummaryResponse.ResourceIdentifierSummaries["+ i +"].LogicalResourceIds.Length"); j++) {
				logicalResourceIds.add(_ctx.stringValue("GetTemplateSummaryResponse.ResourceIdentifierSummaries["+ i +"].LogicalResourceIds["+ j +"]"));
			}
			resourceIdentifierSummary.setLogicalResourceIds(logicalResourceIds);

			List<String> resourceIdentifiers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTemplateSummaryResponse.ResourceIdentifierSummaries["+ i +"].ResourceIdentifiers.Length"); j++) {
				resourceIdentifiers.add(_ctx.stringValue("GetTemplateSummaryResponse.ResourceIdentifierSummaries["+ i +"].ResourceIdentifiers["+ j +"]"));
			}
			resourceIdentifierSummary.setResourceIdentifiers(resourceIdentifiers);

			resourceIdentifierSummaries.add(resourceIdentifierSummary);
		}
		getTemplateSummaryResponse.setResourceIdentifierSummaries(resourceIdentifierSummaries);
	 
	 	return getTemplateSummaryResponse;
	}
}