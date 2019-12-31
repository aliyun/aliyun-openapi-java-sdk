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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.CreateTaobaoISVMpkCellResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTaobaoISVMpkCellResponseUnmarshaller {

	public static CreateTaobaoISVMpkCellResponse unmarshall(CreateTaobaoISVMpkCellResponse createTaobaoISVMpkCellResponse, UnmarshallerContext _ctx) {
		
		createTaobaoISVMpkCellResponse.setRequestId(_ctx.stringValue("CreateTaobaoISVMpkCellResponse.RequestId"));
		createTaobaoISVMpkCellResponse.setHttpStatusCode(_ctx.stringValue("CreateTaobaoISVMpkCellResponse.HttpStatusCode"));
		createTaobaoISVMpkCellResponse.setSuccess(_ctx.booleanValue("CreateTaobaoISVMpkCellResponse.Success"));
		createTaobaoISVMpkCellResponse.setCode(_ctx.stringValue("CreateTaobaoISVMpkCellResponse.Code"));
		createTaobaoISVMpkCellResponse.setMessage(_ctx.stringValue("CreateTaobaoISVMpkCellResponse.Message"));
		createTaobaoISVMpkCellResponse.setCellId(_ctx.stringValue("CreateTaobaoISVMpkCellResponse.CellId"));
	 
	 	return createTaobaoISVMpkCellResponse;
	}
}