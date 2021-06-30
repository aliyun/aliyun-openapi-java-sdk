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

package com.aliyuncs.workbench_inner.transform.v20210121;

import com.aliyuncs.workbench_inner.model.v20210121.InnerAddEnvironmentResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerAddEnvironmentResponseUnmarshaller {

	public static InnerAddEnvironmentResponse unmarshall(InnerAddEnvironmentResponse innerAddEnvironmentResponse, UnmarshallerContext _ctx) {
		
		innerAddEnvironmentResponse.setRequestId(_ctx.stringValue("InnerAddEnvironmentResponse.RequestId"));
		innerAddEnvironmentResponse.setCode(_ctx.stringValue("InnerAddEnvironmentResponse.Code"));
		innerAddEnvironmentResponse.setData(_ctx.mapValue("InnerAddEnvironmentResponse.Data"));
		innerAddEnvironmentResponse.setMessage(_ctx.stringValue("InnerAddEnvironmentResponse.Message"));
	 
	 	return innerAddEnvironmentResponse;
	}
}