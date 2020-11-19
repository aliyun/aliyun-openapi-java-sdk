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

package com.aliyuncs.umdatacloud.transform.v20200401;

import com.aliyuncs.umdatacloud.model.v20200401.EnableStorageServiceResponse;
import com.aliyuncs.umdatacloud.model.v20200401.EnableStorageServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableStorageServiceResponseUnmarshaller {

	public static EnableStorageServiceResponse unmarshall(EnableStorageServiceResponse enableStorageServiceResponse, UnmarshallerContext _ctx) {
		
		enableStorageServiceResponse.setRequestId(_ctx.stringValue("EnableStorageServiceResponse.RequestId"));
		enableStorageServiceResponse.setMsg(_ctx.stringValue("EnableStorageServiceResponse.Msg"));
		enableStorageServiceResponse.setCode(_ctx.integerValue("EnableStorageServiceResponse.Code"));
		enableStorageServiceResponse.setSuccess(_ctx.booleanValue("EnableStorageServiceResponse.Success"));

		Data data = new Data();
		data.setResult(_ctx.booleanValue("EnableStorageServiceResponse.Data.Result"));
		enableStorageServiceResponse.setData(data);
	 
	 	return enableStorageServiceResponse;
	}
}