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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.CloseDeployOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseDeployOrderResponseUnmarshaller {

	public static CloseDeployOrderResponse unmarshall(CloseDeployOrderResponse closeDeployOrderResponse, UnmarshallerContext _ctx) {
		
		closeDeployOrderResponse.setRequestId(_ctx.stringValue("CloseDeployOrderResponse.RequestId"));
		closeDeployOrderResponse.setCode(_ctx.integerValue("CloseDeployOrderResponse.Code"));
		closeDeployOrderResponse.setErrMsg(_ctx.stringValue("CloseDeployOrderResponse.ErrMsg"));
		closeDeployOrderResponse.setSuccess(_ctx.booleanValue("CloseDeployOrderResponse.Success"));
	 
	 	return closeDeployOrderResponse;
	}
}