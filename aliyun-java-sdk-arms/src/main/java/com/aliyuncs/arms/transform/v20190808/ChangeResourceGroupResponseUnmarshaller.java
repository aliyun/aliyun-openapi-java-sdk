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

import com.aliyuncs.arms.model.v20190808.ChangeResourceGroupResponse;
import com.aliyuncs.arms.model.v20190808.ChangeResourceGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeResourceGroupResponseUnmarshaller {

	public static ChangeResourceGroupResponse unmarshall(ChangeResourceGroupResponse changeResourceGroupResponse, UnmarshallerContext _ctx) {
		
		changeResourceGroupResponse.setRequestId(_ctx.stringValue("ChangeResourceGroupResponse.RequestId"));
		changeResourceGroupResponse.setCode(_ctx.stringValue("ChangeResourceGroupResponse.Code"));
		changeResourceGroupResponse.setMessage(_ctx.stringValue("ChangeResourceGroupResponse.Message"));

		Data data = new Data();
		data.setResourceId(_ctx.stringValue("ChangeResourceGroupResponse.Data.ResourceId"));
		data.setResourceGroupId(_ctx.stringValue("ChangeResourceGroupResponse.Data.ResourceGroupId"));
		changeResourceGroupResponse.setData(data);
	 
	 	return changeResourceGroupResponse;
	}
}