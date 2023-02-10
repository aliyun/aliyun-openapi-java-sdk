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

import com.aliyuncs.ros.model.v20190910.GenerateTemplateByScratchResponse;
import com.aliyuncs.ros.model.v20190910.GenerateTemplateByScratchResponse.ResourceToImport;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateTemplateByScratchResponseUnmarshaller {

	public static GenerateTemplateByScratchResponse unmarshall(GenerateTemplateByScratchResponse generateTemplateByScratchResponse, UnmarshallerContext _ctx) {
		
		generateTemplateByScratchResponse.setRequestId(_ctx.stringValue("GenerateTemplateByScratchResponse.RequestId"));
		generateTemplateByScratchResponse.setTemplateBody(_ctx.stringValue("GenerateTemplateByScratchResponse.TemplateBody"));

		List<ResourceToImport> resourcesToImport = new ArrayList<ResourceToImport>();
		for (int i = 0; i < _ctx.lengthValue("GenerateTemplateByScratchResponse.ResourcesToImport.Length"); i++) {
			ResourceToImport resourceToImport = new ResourceToImport();
			resourceToImport.setResourceType(_ctx.stringValue("GenerateTemplateByScratchResponse.ResourcesToImport["+ i +"].ResourceType"));
			resourceToImport.setLogicalResourceId(_ctx.stringValue("GenerateTemplateByScratchResponse.ResourcesToImport["+ i +"].LogicalResourceId"));
			resourceToImport.setResourceIdentifier(_ctx.mapValue("GenerateTemplateByScratchResponse.ResourcesToImport["+ i +"].ResourceIdentifier"));

			resourcesToImport.add(resourceToImport);
		}
		generateTemplateByScratchResponse.setResourcesToImport(resourcesToImport);
	 
	 	return generateTemplateByScratchResponse;
	}
}