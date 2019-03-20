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

import com.aliyuncs.cms.model.v20180308.QueryProjectMetaResponse;
import com.aliyuncs.cms.model.v20180308.QueryProjectMetaResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProjectMetaResponseUnmarshaller {

	public static QueryProjectMetaResponse unmarshall(QueryProjectMetaResponse queryProjectMetaResponse, UnmarshallerContext context) {
		
		queryProjectMetaResponse.setRequestId(context.stringValue("QueryProjectMetaResponse.RequestId"));
		queryProjectMetaResponse.setSuccess(context.booleanValue("QueryProjectMetaResponse.Success"));
		queryProjectMetaResponse.setErrorCode(context.stringValue("QueryProjectMetaResponse.ErrorCode"));
		queryProjectMetaResponse.setErrorMessage(context.stringValue("QueryProjectMetaResponse.ErrorMessage"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("QueryProjectMetaResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setProject(context.stringValue("QueryProjectMetaResponse.Resources["+ i +"].Project"));
			resource.setDescription(context.stringValue("QueryProjectMetaResponse.Resources["+ i +"].Description"));
			resource.setLabels(context.stringValue("QueryProjectMetaResponse.Resources["+ i +"].Labels"));

			resources.add(resource);
		}
		queryProjectMetaResponse.setResources(resources);
	 
	 	return queryProjectMetaResponse;
	}
}