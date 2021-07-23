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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.StartModelServiceResponse;
import com.aliyuncs.vcs.model.v20200515.StartModelServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartModelServiceResponseUnmarshaller {

	public static StartModelServiceResponse unmarshall(StartModelServiceResponse startModelServiceResponse, UnmarshallerContext _ctx) {
		
		startModelServiceResponse.setRequestId(_ctx.stringValue("StartModelServiceResponse.RequestId"));
		startModelServiceResponse.setCode(_ctx.stringValue("StartModelServiceResponse.Code"));
		startModelServiceResponse.setMessage(_ctx.stringValue("StartModelServiceResponse.Message"));

		Data data = new Data();
		data.setModelServiceInstanceId(_ctx.stringValue("StartModelServiceResponse.Data.ModelServiceInstanceId"));
		data.setModelServiceStatus(_ctx.stringValue("StartModelServiceResponse.Data.ModelServiceStatus"));
		data.setModelServiceInstanceName(_ctx.integerValue("StartModelServiceResponse.Data.ModelServiceInstanceName"));
		startModelServiceResponse.setData(data);
	 
	 	return startModelServiceResponse;
	}
}