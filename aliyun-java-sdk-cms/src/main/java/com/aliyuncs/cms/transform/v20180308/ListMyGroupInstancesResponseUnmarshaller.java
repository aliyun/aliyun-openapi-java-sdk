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

import com.aliyuncs.cms.model.v20180308.ListMyGroupInstancesResponse;
import com.aliyuncs.cms.model.v20180308.ListMyGroupInstancesResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMyGroupInstancesResponseUnmarshaller {

	public static ListMyGroupInstancesResponse unmarshall(ListMyGroupInstancesResponse listMyGroupInstancesResponse, UnmarshallerContext context) {
		
		listMyGroupInstancesResponse.setRequestId(context.stringValue("ListMyGroupInstancesResponse.RequestId"));
		listMyGroupInstancesResponse.setSuccess(context.booleanValue("ListMyGroupInstancesResponse.Success"));
		listMyGroupInstancesResponse.setErrorCode(context.integerValue("ListMyGroupInstancesResponse.ErrorCode"));
		listMyGroupInstancesResponse.setErrorMessage(context.stringValue("ListMyGroupInstancesResponse.ErrorMessage"));
		listMyGroupInstancesResponse.setPageNumber(context.integerValue("ListMyGroupInstancesResponse.PageNumber"));
		listMyGroupInstancesResponse.setPageSize(context.integerValue("ListMyGroupInstancesResponse.PageSize"));
		listMyGroupInstancesResponse.setTotal(context.integerValue("ListMyGroupInstancesResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("ListMyGroupInstancesResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setId(context.longValue("ListMyGroupInstancesResponse.Resources["+ i +"].Id"));
			resource.setAliUid(context.longValue("ListMyGroupInstancesResponse.Resources["+ i +"].AliUid"));
			resource.setRegionId(context.stringValue("ListMyGroupInstancesResponse.Resources["+ i +"].RegionId"));
			resource.setInstanceId(context.stringValue("ListMyGroupInstancesResponse.Resources["+ i +"].InstanceId"));
			resource.setCategory(context.stringValue("ListMyGroupInstancesResponse.Resources["+ i +"].Category"));

			resources.add(resource);
		}
		listMyGroupInstancesResponse.setResources(resources);
	 
	 	return listMyGroupInstancesResponse;
	}
}