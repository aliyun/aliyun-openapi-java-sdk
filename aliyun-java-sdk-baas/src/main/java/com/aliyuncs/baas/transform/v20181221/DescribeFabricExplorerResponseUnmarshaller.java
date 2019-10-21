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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.DescribeFabricExplorerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFabricExplorerResponseUnmarshaller {

	public static DescribeFabricExplorerResponse unmarshall(DescribeFabricExplorerResponse describeFabricExplorerResponse, UnmarshallerContext _ctx) {
		
		describeFabricExplorerResponse.setRequestId(_ctx.stringValue("DescribeFabricExplorerResponse.RequestId"));
		describeFabricExplorerResponse.setSuccess(_ctx.booleanValue("DescribeFabricExplorerResponse.Success"));
		describeFabricExplorerResponse.setErrorCode(_ctx.integerValue("DescribeFabricExplorerResponse.ErrorCode"));
		describeFabricExplorerResponse.setResult(_ctx.stringValue("DescribeFabricExplorerResponse.Result"));
		describeFabricExplorerResponse.setDynamicCode(_ctx.stringValue("DescribeFabricExplorerResponse.DynamicCode"));
		describeFabricExplorerResponse.setDynamicMessage(_ctx.stringValue("DescribeFabricExplorerResponse.DynamicMessage"));
	 
	 	return describeFabricExplorerResponse;
	}
}