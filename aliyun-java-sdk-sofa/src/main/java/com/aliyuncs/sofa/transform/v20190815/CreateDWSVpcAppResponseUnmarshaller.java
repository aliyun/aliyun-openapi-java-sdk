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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateDWSVpcAppResponse;
import com.aliyuncs.sofa.model.v20190815.CreateDWSVpcAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDWSVpcAppResponseUnmarshaller {

	public static CreateDWSVpcAppResponse unmarshall(CreateDWSVpcAppResponse createDWSVpcAppResponse, UnmarshallerContext _ctx) {
		
		createDWSVpcAppResponse.setRequestId(_ctx.stringValue("CreateDWSVpcAppResponse.RequestId"));
		createDWSVpcAppResponse.setResultCode(_ctx.stringValue("CreateDWSVpcAppResponse.ResultCode"));
		createDWSVpcAppResponse.setResultMessage(_ctx.stringValue("CreateDWSVpcAppResponse.ResultMessage"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("CreateDWSVpcAppResponse.Data.AppId"));
		data.setAppName(_ctx.stringValue("CreateDWSVpcAppResponse.Data.AppName"));
		data.setRegionId(_ctx.stringValue("CreateDWSVpcAppResponse.Data.RegionId"));
		data.setVpcAddressPool(_ctx.stringValue("CreateDWSVpcAppResponse.Data.VpcAddressPool"));
		data.setVpcAddressPoolId(_ctx.stringValue("CreateDWSVpcAppResponse.Data.VpcAddressPoolId"));
		createDWSVpcAppResponse.setData(data);
	 
	 	return createDWSVpcAppResponse;
	}
}