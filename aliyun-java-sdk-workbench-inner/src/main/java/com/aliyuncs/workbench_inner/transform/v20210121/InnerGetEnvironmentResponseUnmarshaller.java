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

import com.aliyuncs.workbench_inner.model.v20210121.InnerGetEnvironmentResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGetEnvironmentResponseUnmarshaller {

	public static InnerGetEnvironmentResponse unmarshall(InnerGetEnvironmentResponse innerGetEnvironmentResponse, UnmarshallerContext _ctx) {
		
		innerGetEnvironmentResponse.setRequestId(_ctx.stringValue("InnerGetEnvironmentResponse.RequestId"));
		innerGetEnvironmentResponse.setCode(_ctx.stringValue("InnerGetEnvironmentResponse.Code"));
		innerGetEnvironmentResponse.setData(_ctx.mapValue("InnerGetEnvironmentResponse.Data"));
		innerGetEnvironmentResponse.setMessage(_ctx.stringValue("InnerGetEnvironmentResponse.Message"));
	 
	 	return innerGetEnvironmentResponse;
	}
}