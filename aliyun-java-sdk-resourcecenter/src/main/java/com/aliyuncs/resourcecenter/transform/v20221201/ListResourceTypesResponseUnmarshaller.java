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

package com.aliyuncs.resourcecenter.transform.v20221201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcecenter.model.v20221201.ListResourceTypesResponse;
import com.aliyuncs.resourcecenter.model.v20221201.ListResourceTypesResponse.ResourceType;
import com.aliyuncs.resourcecenter.model.v20221201.ListResourceTypesResponse.ResourceType.CodeMapping;
import com.aliyuncs.resourcecenter.model.v20221201.ListResourceTypesResponse.ResourceType.Urls;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceTypesResponseUnmarshaller {

	public static ListResourceTypesResponse unmarshall(ListResourceTypesResponse listResourceTypesResponse, UnmarshallerContext _ctx) {
		
		listResourceTypesResponse.setRequestId(_ctx.stringValue("ListResourceTypesResponse.RequestId"));
		listResourceTypesResponse.setSuccess(_ctx.booleanValue("ListResourceTypesResponse.Success"));
		listResourceTypesResponse.setErrorCode(_ctx.stringValue("ListResourceTypesResponse.ErrorCode"));
		listResourceTypesResponse.setErrorMessage(_ctx.stringValue("ListResourceTypesResponse.ErrorMessage"));
		listResourceTypesResponse.setDynamicCode(_ctx.stringValue("ListResourceTypesResponse.DynamicCode"));
		listResourceTypesResponse.setDynamicMessage(_ctx.stringValue("ListResourceTypesResponse.DynamicMessage"));

		List<ResourceType> resourceTypes = new ArrayList<ResourceType>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceTypesResponse.ResourceTypes.Length"); i++) {
			ResourceType resourceType = new ResourceType();
			resourceType.setResourceType(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].ResourceType"));
			resourceType.setProductName(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].ProductName"));
			resourceType.setResourceTypeName(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].ResourceTypeName"));

			List<String> filterKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListResourceTypesResponse.ResourceTypes["+ i +"].FilterKeys.Length"); j++) {
				filterKeys.add(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].FilterKeys["+ j +"]"));
			}
			resourceType.setFilterKeys(filterKeys);

			CodeMapping codeMapping = new CodeMapping();
			codeMapping.setResourceGroup(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].CodeMapping.ResourceGroup"));
			codeMapping.setTag(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].CodeMapping.Tag"));
			resourceType.setCodeMapping(codeMapping);

			Urls urls = new Urls();
			urls.setProductConsoleUrl(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].Urls.ProductConsoleUrl"));
			urls.setResourceConsoleUrl(_ctx.stringValue("ListResourceTypesResponse.ResourceTypes["+ i +"].Urls.ResourceConsoleUrl"));
			resourceType.setUrls(urls);

			resourceTypes.add(resourceType);
		}
		listResourceTypesResponse.setResourceTypes(resourceTypes);
	 
	 	return listResourceTypesResponse;
	}
}