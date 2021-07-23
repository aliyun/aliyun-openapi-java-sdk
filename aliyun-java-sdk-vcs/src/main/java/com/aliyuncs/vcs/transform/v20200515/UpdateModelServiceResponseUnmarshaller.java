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

import com.aliyuncs.vcs.model.v20200515.UpdateModelServiceResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateModelServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateModelServiceResponseUnmarshaller {

	public static UpdateModelServiceResponse unmarshall(UpdateModelServiceResponse updateModelServiceResponse, UnmarshallerContext _ctx) {
		
		updateModelServiceResponse.setRequestId(_ctx.stringValue("UpdateModelServiceResponse.RequestId"));
		updateModelServiceResponse.setCode(_ctx.stringValue("UpdateModelServiceResponse.Code"));
		updateModelServiceResponse.setMessage(_ctx.stringValue("UpdateModelServiceResponse.Message"));

		Data data = new Data();
		data.setModelServiceInstanceId(_ctx.stringValue("UpdateModelServiceResponse.Data.ModelServiceInstanceId"));
		data.setModelServiceStatus(_ctx.stringValue("UpdateModelServiceResponse.Data.ModelServiceStatus"));
		data.setQpsRequired(_ctx.integerValue("UpdateModelServiceResponse.Data.QpsRequired"));
		data.setAlgorithmCode(_ctx.stringValue("UpdateModelServiceResponse.Data.AlgorithmCode"));
		data.setModelServiceInstanceName(_ctx.stringValue("UpdateModelServiceResponse.Data.ModelServiceInstanceName"));
		updateModelServiceResponse.setData(data);
	 
	 	return updateModelServiceResponse;
	}
}