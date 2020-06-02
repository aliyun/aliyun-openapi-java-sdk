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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setIsSuccess(_ctx.booleanValue("GetInstanceResponse.IsSuccess"));
		getInstanceResponse.setCode(_ctx.stringValue("GetInstanceResponse.Code"));
		getInstanceResponse.setInstanceName(_ctx.stringValue("GetInstanceResponse.InstanceName"));
		getInstanceResponse.setInstanceSpecification(_ctx.stringValue("GetInstanceResponse.InstanceSpecification"));
		getInstanceResponse.setInstanceStatus(_ctx.stringValue("GetInstanceResponse.InstanceStatus"));
		getInstanceResponse.setCreateTime(_ctx.longValue("GetInstanceResponse.CreateTime"));
		getInstanceResponse.setModifiedTime(_ctx.longValue("GetInstanceResponse.ModifiedTime"));
		getInstanceResponse.setInstanceId(_ctx.stringValue("GetInstanceResponse.InstanceId"));
	 
	 	return getInstanceResponse;
	}
}