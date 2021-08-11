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

package com.aliyuncs.workbench_ide.transform.v20210121;

import com.aliyuncs.workbench_ide.model.v20210121.UpdateEnvironmentResourceConfigResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateEnvironmentResourceConfigResponseUnmarshaller {

	public static UpdateEnvironmentResourceConfigResponse unmarshall(UpdateEnvironmentResourceConfigResponse updateEnvironmentResourceConfigResponse, UnmarshallerContext _ctx) {
		
		updateEnvironmentResourceConfigResponse.setRequestId(_ctx.stringValue("UpdateEnvironmentResourceConfigResponse.RequestId"));
		updateEnvironmentResourceConfigResponse.setCode(_ctx.stringValue("UpdateEnvironmentResourceConfigResponse.Code"));
		updateEnvironmentResourceConfigResponse.setData(_ctx.mapValue("UpdateEnvironmentResourceConfigResponse.Data"));
		updateEnvironmentResourceConfigResponse.setMessage(_ctx.stringValue("UpdateEnvironmentResourceConfigResponse.Message"));
	 
	 	return updateEnvironmentResourceConfigResponse;
	}
}