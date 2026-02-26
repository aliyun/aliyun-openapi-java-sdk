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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetResourceByVersionResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetResourceByVersionResponse.ResourceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceByVersionResponseUnmarshaller {

	public static GetResourceByVersionResponse unmarshall(GetResourceByVersionResponse getResourceByVersionResponse, UnmarshallerContext _ctx) {
		
		getResourceByVersionResponse.setRequestId(_ctx.stringValue("GetResourceByVersionResponse.RequestId"));
		getResourceByVersionResponse.setSuccess(_ctx.booleanValue("GetResourceByVersionResponse.Success"));
		getResourceByVersionResponse.setHttpStatusCode(_ctx.integerValue("GetResourceByVersionResponse.HttpStatusCode"));
		getResourceByVersionResponse.setCode(_ctx.stringValue("GetResourceByVersionResponse.Code"));
		getResourceByVersionResponse.setMessage(_ctx.stringValue("GetResourceByVersionResponse.Message"));

		ResourceInfo resourceInfo = new ResourceInfo();
		resourceInfo.setId(_ctx.longValue("GetResourceByVersionResponse.ResourceInfo.Id"));
		resourceInfo.setName(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Name"));
		resourceInfo.setProjectId(_ctx.longValue("GetResourceByVersionResponse.ResourceInfo.ProjectId"));
		resourceInfo.setResourceType(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.ResourceType"));
		resourceInfo.setDirectory(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Directory"));
		resourceInfo.setStorageAddress(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.StorageAddress"));
		resourceInfo.setSize(_ctx.longValue("GetResourceByVersionResponse.ResourceInfo.Size"));
		resourceInfo.setDescription(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Description"));
		resourceInfo.setGmtCreate(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.GmtCreate"));
		resourceInfo.setGmtModified(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.GmtModified"));
		resourceInfo.setComputeEngineType(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.ComputeEngineType"));
		resourceInfo.setCreator(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Creator"));
		resourceInfo.setLastModifier(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.LastModifier"));
		getResourceByVersionResponse.setResourceInfo(resourceInfo);
	 
	 	return getResourceByVersionResponse;
	}
}