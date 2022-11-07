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

package com.aliyuncs.eais.transform.v20190624;

import com.aliyuncs.eais.model.v20190624.CreateEaiJupyterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEaiJupyterResponseUnmarshaller {

	public static CreateEaiJupyterResponse unmarshall(CreateEaiJupyterResponse createEaiJupyterResponse, UnmarshallerContext _ctx) {
		
		createEaiJupyterResponse.setRequestId(_ctx.stringValue("CreateEaiJupyterResponse.RequestId"));
		createEaiJupyterResponse.setElasticAcceleratedInstanceId(_ctx.stringValue("CreateEaiJupyterResponse.ElasticAcceleratedInstanceId"));
	 
	 	return createEaiJupyterResponse;
	}
}