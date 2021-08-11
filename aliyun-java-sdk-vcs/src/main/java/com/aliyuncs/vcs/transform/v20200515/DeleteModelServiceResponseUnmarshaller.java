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

import com.aliyuncs.vcs.model.v20200515.DeleteModelServiceResponse;
import com.aliyuncs.vcs.model.v20200515.DeleteModelServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteModelServiceResponseUnmarshaller {

	public static DeleteModelServiceResponse unmarshall(DeleteModelServiceResponse deleteModelServiceResponse, UnmarshallerContext _ctx) {
		
		deleteModelServiceResponse.setRequestId(_ctx.stringValue("DeleteModelServiceResponse.RequestId"));
		deleteModelServiceResponse.setCode(_ctx.stringValue("DeleteModelServiceResponse.Code"));
		deleteModelServiceResponse.setMessage(_ctx.stringValue("DeleteModelServiceResponse.Message"));

		Data data = new Data();
		data.setModelServiceInstanceId(_ctx.stringValue("DeleteModelServiceResponse.Data.ModelServiceInstanceId"));
		data.setModelServiceStatus(_ctx.stringValue("DeleteModelServiceResponse.Data.ModelServiceStatus"));
		data.setModelServiceInstanceName(_ctx.integerValue("DeleteModelServiceResponse.Data.ModelServiceInstanceName"));
		deleteModelServiceResponse.setData(data);
	 
	 	return deleteModelServiceResponse;
	}
}