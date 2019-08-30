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

import com.aliyuncs.ros.model.v20190910.GetResourceTypeResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceTypeResponseUnmarshaller {

	public static GetResourceTypeResponse unmarshall(GetResourceTypeResponse getResourceTypeResponse, UnmarshallerContext _ctx) {
		
		getResourceTypeResponse.setRequestId(_ctx.stringValue("GetResourceTypeResponse.RequestId"));
		getResourceTypeResponse.setAttributes(_ctx.mapValue("GetResourceTypeResponse.Attributes"));
		getResourceTypeResponse.setProperties(_ctx.mapValue("GetResourceTypeResponse.Properties"));
		getResourceTypeResponse.setResourceType(_ctx.stringValue("GetResourceTypeResponse.ResourceType"));
	 
	 	return getResourceTypeResponse;
	}
}