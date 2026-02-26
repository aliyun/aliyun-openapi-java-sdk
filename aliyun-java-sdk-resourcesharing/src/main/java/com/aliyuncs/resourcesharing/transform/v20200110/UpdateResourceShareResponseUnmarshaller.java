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

package com.aliyuncs.resourcesharing.transform.v20200110;

import com.aliyuncs.resourcesharing.model.v20200110.UpdateResourceShareResponse;
import com.aliyuncs.resourcesharing.model.v20200110.UpdateResourceShareResponse.ResourceShare;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateResourceShareResponseUnmarshaller {

	public static UpdateResourceShareResponse unmarshall(UpdateResourceShareResponse updateResourceShareResponse, UnmarshallerContext _ctx) {
		
		updateResourceShareResponse.setRequestId(_ctx.stringValue("UpdateResourceShareResponse.RequestId"));

		ResourceShare resourceShare = new ResourceShare();
		resourceShare.setUpdateTime(_ctx.stringValue("UpdateResourceShareResponse.ResourceShare.UpdateTime"));
		resourceShare.setResourceShareName(_ctx.stringValue("UpdateResourceShareResponse.ResourceShare.ResourceShareName"));
		resourceShare.setResourceShareOwner(_ctx.stringValue("UpdateResourceShareResponse.ResourceShare.ResourceShareOwner"));
		resourceShare.setCreateTime(_ctx.stringValue("UpdateResourceShareResponse.ResourceShare.CreateTime"));
		resourceShare.setResourceShareId(_ctx.stringValue("UpdateResourceShareResponse.ResourceShare.ResourceShareId"));
		resourceShare.setResourceShareStatus(_ctx.stringValue("UpdateResourceShareResponse.ResourceShare.ResourceShareStatus"));
		resourceShare.setAllowExternalTargets(_ctx.booleanValue("UpdateResourceShareResponse.ResourceShare.AllowExternalTargets"));
		updateResourceShareResponse.setResourceShare(resourceShare);
	 
	 	return updateResourceShareResponse;
	}
}