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

package com.aliyuncs.nlp_automl.transform.v20191111;

import com.aliyuncs.nlp_automl.model.v20191111.DeployModelResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployModelResponseUnmarshaller {

	public static DeployModelResponse unmarshall(DeployModelResponse deployModelResponse, UnmarshallerContext _ctx) {
		
		deployModelResponse.setRequestId(_ctx.stringValue("DeployModelResponse.RequestId"));
		deployModelResponse.setData(_ctx.mapValue("DeployModelResponse.Data"));
		deployModelResponse.setCode(_ctx.integerValue("DeployModelResponse.Code"));
		deployModelResponse.setMessage(_ctx.stringValue("DeployModelResponse.Message"));
		deployModelResponse.setSuccess(_ctx.booleanValue("DeployModelResponse.Success"));
	 
	 	return deployModelResponse;
	}
}