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

package com.aliyuncs.dts_inner.transform.v20160801;

import com.aliyuncs.dts_inner.model.v20160801.CreateSynchronousJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSynchronousJobResponseUnmarshaller {

	public static CreateSynchronousJobResponse unmarshall(CreateSynchronousJobResponse createSynchronousJobResponse, UnmarshallerContext _ctx) {
		
		createSynchronousJobResponse.setRequestId(_ctx.stringValue("CreateSynchronousJobResponse.requestId"));
		createSynchronousJobResponse.setData(_ctx.stringValue("CreateSynchronousJobResponse.data"));
		createSynchronousJobResponse.setSuccess(_ctx.booleanValue("CreateSynchronousJobResponse.success"));
		createSynchronousJobResponse.setCode(_ctx.stringValue("CreateSynchronousJobResponse.code"));
		createSynchronousJobResponse.setMessage(_ctx.stringValue("CreateSynchronousJobResponse.message"));
	 
	 	return createSynchronousJobResponse;
	}
}