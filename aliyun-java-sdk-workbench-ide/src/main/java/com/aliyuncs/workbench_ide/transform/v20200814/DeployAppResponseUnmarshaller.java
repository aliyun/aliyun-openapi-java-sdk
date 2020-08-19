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

package com.aliyuncs.workbench_ide.transform.v20200814;

import com.aliyuncs.workbench_ide.model.v20200814.DeployAppResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployAppResponseUnmarshaller {

	public static DeployAppResponse unmarshall(DeployAppResponse deployAppResponse, UnmarshallerContext _ctx) {
		
		deployAppResponse.setRequestId(_ctx.stringValue("DeployAppResponse.RequestId"));
		deployAppResponse.setResultNo(_ctx.integerValue("DeployAppResponse.ResultNo"));
		deployAppResponse.setResultMessage(_ctx.stringValue("DeployAppResponse.ResultMessage"));
		deployAppResponse.setData(_ctx.mapValue("DeployAppResponse.Data"));
	 
	 	return deployAppResponse;
	}
}