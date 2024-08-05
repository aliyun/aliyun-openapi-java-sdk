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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.DeleteRumAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRumAppResponseUnmarshaller {

	public static DeleteRumAppResponse unmarshall(DeleteRumAppResponse deleteRumAppResponse, UnmarshallerContext _ctx) {
		
		deleteRumAppResponse.setRequestId(_ctx.stringValue("DeleteRumAppResponse.RequestId"));
		deleteRumAppResponse.setCode(_ctx.integerValue("DeleteRumAppResponse.Code"));
		deleteRumAppResponse.setSuccess(_ctx.booleanValue("DeleteRumAppResponse.Success"));
		deleteRumAppResponse.setMessage(_ctx.stringValue("DeleteRumAppResponse.Message"));
		deleteRumAppResponse.setHttpStatusCode(_ctx.integerValue("DeleteRumAppResponse.HttpStatusCode"));
		deleteRumAppResponse.setResult(_ctx.stringValue("DeleteRumAppResponse.Result"));
		deleteRumAppResponse.setResourceGroupId(_ctx.stringValue("DeleteRumAppResponse.ResourceGroupId"));
	 
	 	return deleteRumAppResponse;
	}
}