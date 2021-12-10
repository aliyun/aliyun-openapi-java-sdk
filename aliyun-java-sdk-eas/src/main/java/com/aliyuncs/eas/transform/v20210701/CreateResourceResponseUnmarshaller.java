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

package com.aliyuncs.eas.transform.v20210701;

import com.aliyuncs.eas.model.v20210701.CreateResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateResourceResponseUnmarshaller {

	public static CreateResourceResponse unmarshall(CreateResourceResponse createResourceResponse, UnmarshallerContext _ctx) {
		
		createResourceResponse.setRequestId(_ctx.stringValue("CreateResourceResponse.RequestId"));
		createResourceResponse.setResourceID(_ctx.stringValue("CreateResourceResponse.ResourceID"));
		createResourceResponse.setResourceName(_ctx.stringValue("CreateResourceResponse.ResourceName"));
		createResourceResponse.setClusterId(_ctx.stringValue("CreateResourceResponse.ClusterId"));
		createResourceResponse.setOwnerUid(_ctx.stringValue("CreateResourceResponse.OwnerUid"));
	 
	 	return createResourceResponse;
	}
}