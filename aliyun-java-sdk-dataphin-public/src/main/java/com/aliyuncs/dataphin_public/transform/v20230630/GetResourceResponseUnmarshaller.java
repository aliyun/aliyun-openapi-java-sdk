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

import com.aliyuncs.dataphin_public.model.v20230630.GetResourceResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetResourceResponse.ResourceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceResponseUnmarshaller {

	public static GetResourceResponse unmarshall(GetResourceResponse getResourceResponse, UnmarshallerContext _ctx) {
		
		getResourceResponse.setRequestId(_ctx.stringValue("GetResourceResponse.RequestId"));
		getResourceResponse.setMessage(_ctx.stringValue("GetResourceResponse.Message"));
		getResourceResponse.setHttpStatusCode(_ctx.integerValue("GetResourceResponse.HttpStatusCode"));
		getResourceResponse.setCode(_ctx.stringValue("GetResourceResponse.Code"));
		getResourceResponse.setSuccess(_ctx.booleanValue("GetResourceResponse.Success"));

		ResourceInfo resourceInfo = new ResourceInfo();
		resourceInfo.setLastModifier(_ctx.stringValue("GetResourceResponse.ResourceInfo.LastModifier"));
		resourceInfo.setDescription(_ctx.stringValue("GetResourceResponse.ResourceInfo.Description"));
		resourceInfo.setSize(_ctx.longValue("GetResourceResponse.ResourceInfo.Size"));
		resourceInfo.setProjectId(_ctx.longValue("GetResourceResponse.ResourceInfo.ProjectId"));
		resourceInfo.setGmtModified(_ctx.stringValue("GetResourceResponse.ResourceInfo.GmtModified"));
		resourceInfo.setResourceType(_ctx.stringValue("GetResourceResponse.ResourceInfo.ResourceType"));
		resourceInfo.setCreator(_ctx.stringValue("GetResourceResponse.ResourceInfo.Creator"));
		resourceInfo.setName(_ctx.stringValue("GetResourceResponse.ResourceInfo.Name"));
		resourceInfo.setStorageAddress(_ctx.stringValue("GetResourceResponse.ResourceInfo.StorageAddress"));
		resourceInfo.setGmtCreate(_ctx.stringValue("GetResourceResponse.ResourceInfo.GmtCreate"));
		resourceInfo.setComputeEngineType(_ctx.stringValue("GetResourceResponse.ResourceInfo.ComputeEngineType"));
		resourceInfo.setId(_ctx.longValue("GetResourceResponse.ResourceInfo.Id"));
		resourceInfo.setDirectory(_ctx.stringValue("GetResourceResponse.ResourceInfo.Directory"));
		getResourceResponse.setResourceInfo(resourceInfo);
	 
	 	return getResourceResponse;
	}
}