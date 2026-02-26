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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UpdateWebApplicationScalingConfigResponse;
import com.aliyuncs.sae.model.v20190506.UpdateWebApplicationScalingConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWebApplicationScalingConfigResponseUnmarshaller {

	public static UpdateWebApplicationScalingConfigResponse unmarshall(UpdateWebApplicationScalingConfigResponse updateWebApplicationScalingConfigResponse, UnmarshallerContext _ctx) {
		
		updateWebApplicationScalingConfigResponse.setRequestId(_ctx.stringValue("UpdateWebApplicationScalingConfigResponse.RequestId"));
		updateWebApplicationScalingConfigResponse.setCode(_ctx.integerValue("UpdateWebApplicationScalingConfigResponse.Code"));
		updateWebApplicationScalingConfigResponse.setMessage(_ctx.stringValue("UpdateWebApplicationScalingConfigResponse.Message"));
		updateWebApplicationScalingConfigResponse.setSuccess(_ctx.booleanValue("UpdateWebApplicationScalingConfigResponse.Success"));

		Data data = new Data();
		data.setMaximumInstanceCount(_ctx.longValue("UpdateWebApplicationScalingConfigResponse.Data.MaximumInstanceCount"));
		data.setMinimumInstanceCount(_ctx.longValue("UpdateWebApplicationScalingConfigResponse.Data.MinimumInstanceCount"));
		updateWebApplicationScalingConfigResponse.setData(data);
	 
	 	return updateWebApplicationScalingConfigResponse;
	}
}