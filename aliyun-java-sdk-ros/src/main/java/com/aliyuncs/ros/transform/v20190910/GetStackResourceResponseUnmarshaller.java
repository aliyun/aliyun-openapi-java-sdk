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

import com.aliyuncs.ros.model.v20190910.GetStackResourceResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStackResourceResponseUnmarshaller {

	public static GetStackResourceResponse unmarshall(GetStackResourceResponse getStackResourceResponse, UnmarshallerContext _ctx) {
		
		getStackResourceResponse.setRequestId(_ctx.stringValue("GetStackResourceResponse.RequestId"));
		getStackResourceResponse.setStatus(_ctx.stringValue("GetStackResourceResponse.Status"));
		getStackResourceResponse.setDescription(_ctx.stringValue("GetStackResourceResponse.Description"));
		getStackResourceResponse.setStatusReason(_ctx.stringValue("GetStackResourceResponse.StatusReason"));
		getStackResourceResponse.setPhysicalResourceId(_ctx.stringValue("GetStackResourceResponse.PhysicalResourceId"));
		getStackResourceResponse.setCreateTime(_ctx.stringValue("GetStackResourceResponse.CreateTime"));
		getStackResourceResponse.setMetadata(_ctx.mapValue("GetStackResourceResponse.Metadata"));
		getStackResourceResponse.setResourceType(_ctx.stringValue("GetStackResourceResponse.ResourceType"));
		getStackResourceResponse.setLogicalResourceId(_ctx.stringValue("GetStackResourceResponse.LogicalResourceId"));
		getStackResourceResponse.setResourceDriftStatus(_ctx.stringValue("GetStackResourceResponse.ResourceDriftStatus"));
		getStackResourceResponse.setUpdateTime(_ctx.stringValue("GetStackResourceResponse.UpdateTime"));
		getStackResourceResponse.setDriftDetectionTime(_ctx.stringValue("GetStackResourceResponse.DriftDetectionTime"));
		getStackResourceResponse.setStackName(_ctx.stringValue("GetStackResourceResponse.StackName"));
		getStackResourceResponse.setStackId(_ctx.stringValue("GetStackResourceResponse.StackId"));

		List<Map<Object, Object>> resourceAttributes = _ctx.listMapValue("GetStackResourceResponse.ResourceAttributes");
		getStackResourceResponse.setResourceAttributes(resourceAttributes);
	 
	 	return getStackResourceResponse;
	}
}