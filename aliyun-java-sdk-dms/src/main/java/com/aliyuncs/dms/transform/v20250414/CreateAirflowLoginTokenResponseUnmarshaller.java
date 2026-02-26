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

package com.aliyuncs.dms.transform.v20250414;

import com.aliyuncs.dms.model.v20250414.CreateAirflowLoginTokenResponse;
import com.aliyuncs.dms.model.v20250414.CreateAirflowLoginTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAirflowLoginTokenResponseUnmarshaller {

	public static CreateAirflowLoginTokenResponse unmarshall(CreateAirflowLoginTokenResponse createAirflowLoginTokenResponse, UnmarshallerContext _ctx) {
		
		createAirflowLoginTokenResponse.setRequestId(_ctx.stringValue("CreateAirflowLoginTokenResponse.RequestId"));
		createAirflowLoginTokenResponse.setHttpStatusCode(_ctx.integerValue("CreateAirflowLoginTokenResponse.HttpStatusCode"));
		createAirflowLoginTokenResponse.setSuccess(_ctx.booleanValue("CreateAirflowLoginTokenResponse.Success"));
		createAirflowLoginTokenResponse.setMessage(_ctx.stringValue("CreateAirflowLoginTokenResponse.Message"));
		createAirflowLoginTokenResponse.setErrorCode(_ctx.stringValue("CreateAirflowLoginTokenResponse.ErrorCode"));
		createAirflowLoginTokenResponse.setCode(_ctx.stringValue("CreateAirflowLoginTokenResponse.Code"));

		Data data = new Data();
		data.setToken(_ctx.stringValue("CreateAirflowLoginTokenResponse.Data.Token"));
		data.setHost(_ctx.stringValue("CreateAirflowLoginTokenResponse.Data.Host"));
		createAirflowLoginTokenResponse.setData(data);
	 
	 	return createAirflowLoginTokenResponse;
	}
}