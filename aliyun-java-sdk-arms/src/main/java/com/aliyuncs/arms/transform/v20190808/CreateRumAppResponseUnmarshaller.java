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

import com.aliyuncs.arms.model.v20190808.CreateRumAppResponse;
import com.aliyuncs.arms.model.v20190808.CreateRumAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRumAppResponseUnmarshaller {

	public static CreateRumAppResponse unmarshall(CreateRumAppResponse createRumAppResponse, UnmarshallerContext _ctx) {
		
		createRumAppResponse.setRequestId(_ctx.stringValue("CreateRumAppResponse.RequestId"));
		createRumAppResponse.setCode(_ctx.integerValue("CreateRumAppResponse.Code"));
		createRumAppResponse.setSuccess(_ctx.booleanValue("CreateRumAppResponse.Success"));
		createRumAppResponse.setMessage(_ctx.stringValue("CreateRumAppResponse.Message"));
		createRumAppResponse.setHttpStatusCode(_ctx.integerValue("CreateRumAppResponse.HttpStatusCode"));
		createRumAppResponse.setResourceGroupId(_ctx.stringValue("CreateRumAppResponse.ResourceGroupId"));

		Data data = new Data();
		data.setPid(_ctx.stringValue("CreateRumAppResponse.Data.Pid"));
		data.setEndpoint(_ctx.stringValue("CreateRumAppResponse.Data.Endpoint"));
		data.setCdnDomain(_ctx.stringValue("CreateRumAppResponse.Data.CdnDomain"));
		createRumAppResponse.setData(data);
	 
	 	return createRumAppResponse;
	}
}