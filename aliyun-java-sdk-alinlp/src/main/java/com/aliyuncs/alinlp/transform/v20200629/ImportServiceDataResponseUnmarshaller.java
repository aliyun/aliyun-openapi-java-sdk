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

package com.aliyuncs.alinlp.transform.v20200629;

import com.aliyuncs.alinlp.model.v20200629.ImportServiceDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportServiceDataResponseUnmarshaller {

	public static ImportServiceDataResponse unmarshall(ImportServiceDataResponse importServiceDataResponse, UnmarshallerContext _ctx) {
		
		importServiceDataResponse.setRequestId(_ctx.stringValue("ImportServiceDataResponse.RequestId"));
		importServiceDataResponse.setCode(_ctx.integerValue("ImportServiceDataResponse.Code"));
		importServiceDataResponse.setData(_ctx.longValue("ImportServiceDataResponse.Data"));
		importServiceDataResponse.setSuccess(_ctx.booleanValue("ImportServiceDataResponse.Success"));
		importServiceDataResponse.setMsg(_ctx.stringValue("ImportServiceDataResponse.Msg"));
	 
	 	return importServiceDataResponse;
	}
}