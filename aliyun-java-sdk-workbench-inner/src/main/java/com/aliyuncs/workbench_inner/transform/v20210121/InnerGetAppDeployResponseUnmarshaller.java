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

import com.aliyuncs.workbench_inner.model.v20210121.InnerGetAppDeployResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerGetAppDeployResponseUnmarshaller {

	public static InnerGetAppDeployResponse unmarshall(InnerGetAppDeployResponse innerGetAppDeployResponse, UnmarshallerContext _ctx) {
		
		innerGetAppDeployResponse.setRequestId(_ctx.stringValue("InnerGetAppDeployResponse.RequestId"));
		innerGetAppDeployResponse.setCode(_ctx.stringValue("InnerGetAppDeployResponse.Code"));
		innerGetAppDeployResponse.setData(_ctx.mapValue("InnerGetAppDeployResponse.Data"));
		innerGetAppDeployResponse.setMessage(_ctx.stringValue("InnerGetAppDeployResponse.Message"));
	 
	 	return innerGetAppDeployResponse;
	}
}