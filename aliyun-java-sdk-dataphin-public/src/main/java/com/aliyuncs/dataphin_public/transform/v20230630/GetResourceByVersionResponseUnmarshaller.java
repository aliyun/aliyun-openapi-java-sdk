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
		getResourceByVersionResponse.setMessage(_ctx.stringValue("GetResourceByVersionResponse.Message"));
		getResourceByVersionResponse.setHttpStatusCode(_ctx.integerValue("GetResourceByVersionResponse.HttpStatusCode"));
		getResourceByVersionResponse.setCode(_ctx.stringValue("GetResourceByVersionResponse.Code"));
		getResourceByVersionResponse.setSuccess(_ctx.booleanValue("GetResourceByVersionResponse.Success"));

		ResourceInfo resourceInfo = new ResourceInfo();
		resourceInfo.setLastModifier(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.LastModifier"));
		resourceInfo.setDescription(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Description"));
		resourceInfo.setSize(_ctx.longValue("GetResourceByVersionResponse.ResourceInfo.Size"));
		resourceInfo.setProjectId(_ctx.longValue("GetResourceByVersionResponse.ResourceInfo.ProjectId"));
		resourceInfo.setGmtModified(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.GmtModified"));
		resourceInfo.setResourceType(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.ResourceType"));
		resourceInfo.setCreator(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Creator"));
		resourceInfo.setName(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Name"));
		resourceInfo.setStorageAddress(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.StorageAddress"));
		resourceInfo.setGmtCreate(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.GmtCreate"));
		resourceInfo.setComputeEngineType(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.ComputeEngineType"));
		resourceInfo.setId(_ctx.longValue("GetResourceByVersionResponse.ResourceInfo.Id"));
		resourceInfo.setDirectory(_ctx.stringValue("GetResourceByVersionResponse.ResourceInfo.Directory"));
		getResourceByVersionResponse.setResourceInfo(resourceInfo);
	 
	 	return getResourceByVersionResponse;
	}
}