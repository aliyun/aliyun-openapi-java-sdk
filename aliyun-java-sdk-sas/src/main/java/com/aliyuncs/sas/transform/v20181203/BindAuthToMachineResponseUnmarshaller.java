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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.BindAuthToMachineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindAuthToMachineResponseUnmarshaller {

	public static BindAuthToMachineResponse unmarshall(BindAuthToMachineResponse bindAuthToMachineResponse, UnmarshallerContext _ctx) {
		
		bindAuthToMachineResponse.setRequestId(_ctx.stringValue("BindAuthToMachineResponse.RequestId"));
		bindAuthToMachineResponse.setResultCode(_ctx.integerValue("BindAuthToMachineResponse.ResultCode"));
		bindAuthToMachineResponse.setInsufficientCount(_ctx.integerValue("BindAuthToMachineResponse.InsufficientCount"));
		bindAuthToMachineResponse.setUnBindCount(_ctx.integerValue("BindAuthToMachineResponse.UnBindCount"));
		bindAuthToMachineResponse.setBindCount(_ctx.integerValue("BindAuthToMachineResponse.BindCount"));
		bindAuthToMachineResponse.setInsufficientEcsCount(_ctx.integerValue("BindAuthToMachineResponse.InsufficientEcsCount"));
		bindAuthToMachineResponse.setInsufficientCoreCount(_ctx.integerValue("BindAuthToMachineResponse.InsufficientCoreCount"));
	 
	 	return bindAuthToMachineResponse;
	}
}