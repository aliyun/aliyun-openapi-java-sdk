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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateDataAPIServiceResponse;
import com.aliyuncs.iot.model.v20180120.CreateDataAPIServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataAPIServiceResponseUnmarshaller {

	public static CreateDataAPIServiceResponse unmarshall(CreateDataAPIServiceResponse createDataAPIServiceResponse, UnmarshallerContext _ctx) {
		
		createDataAPIServiceResponse.setRequestId(_ctx.stringValue("CreateDataAPIServiceResponse.RequestId"));
		createDataAPIServiceResponse.setSuccess(_ctx.booleanValue("CreateDataAPIServiceResponse.Success"));
		createDataAPIServiceResponse.setCode(_ctx.stringValue("CreateDataAPIServiceResponse.Code"));
		createDataAPIServiceResponse.setErrorMessage(_ctx.stringValue("CreateDataAPIServiceResponse.ErrorMessage"));

		Data data = new Data();
		data.setApiSrn(_ctx.stringValue("CreateDataAPIServiceResponse.Data.ApiSrn"));
		data.setCreateTime(_ctx.longValue("CreateDataAPIServiceResponse.Data.CreateTime"));
		data.setLastUpdateTime(_ctx.longValue("CreateDataAPIServiceResponse.Data.LastUpdateTime"));
		createDataAPIServiceResponse.setData(data);
	 
	 	return createDataAPIServiceResponse;
	}
}