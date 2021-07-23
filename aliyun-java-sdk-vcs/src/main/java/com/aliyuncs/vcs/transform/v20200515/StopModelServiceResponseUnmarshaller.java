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

import com.aliyuncs.vcs.model.v20200515.StopModelServiceResponse;
import com.aliyuncs.vcs.model.v20200515.StopModelServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopModelServiceResponseUnmarshaller {

	public static StopModelServiceResponse unmarshall(StopModelServiceResponse stopModelServiceResponse, UnmarshallerContext _ctx) {
		
		stopModelServiceResponse.setRequestId(_ctx.stringValue("StopModelServiceResponse.RequestId"));
		stopModelServiceResponse.setCode(_ctx.stringValue("StopModelServiceResponse.Code"));
		stopModelServiceResponse.setMessage(_ctx.stringValue("StopModelServiceResponse.Message"));

		Data data = new Data();
		data.setModelServiceInstanceId(_ctx.stringValue("StopModelServiceResponse.Data.ModelServiceInstanceId"));
		data.setModelServiceStatus(_ctx.stringValue("StopModelServiceResponse.Data.ModelServiceStatus"));
		data.setModelServiceInstanceName(_ctx.integerValue("StopModelServiceResponse.Data.ModelServiceInstanceName"));
		stopModelServiceResponse.setData(data);
	 
	 	return stopModelServiceResponse;
	}
}