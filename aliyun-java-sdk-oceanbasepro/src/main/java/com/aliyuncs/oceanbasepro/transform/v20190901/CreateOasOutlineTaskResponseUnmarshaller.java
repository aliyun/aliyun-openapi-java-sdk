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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.CreateOasOutlineTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOasOutlineTaskResponseUnmarshaller {

	public static CreateOasOutlineTaskResponse unmarshall(CreateOasOutlineTaskResponse createOasOutlineTaskResponse, UnmarshallerContext _ctx) {
		
		createOasOutlineTaskResponse.setRequestId(_ctx.stringValue("CreateOasOutlineTaskResponse.RequestId"));
		createOasOutlineTaskResponse.setSuccess(_ctx.booleanValue("CreateOasOutlineTaskResponse.Success"));
		createOasOutlineTaskResponse.setMessage(_ctx.stringValue("CreateOasOutlineTaskResponse.Message"));
	 
	 	return createOasOutlineTaskResponse;
	}
}