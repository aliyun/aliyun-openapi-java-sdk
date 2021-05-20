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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.CheckConnectionResponse;
import com.aliyuncs.datalake.model.v20200710.CheckConnectionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckConnectionResponseUnmarshaller {

	public static CheckConnectionResponse unmarshall(CheckConnectionResponse checkConnectionResponse, UnmarshallerContext _ctx) {
		
		checkConnectionResponse.setRequestId(_ctx.stringValue("CheckConnectionResponse.RequestId"));
		checkConnectionResponse.setSuccess(_ctx.booleanValue("CheckConnectionResponse.Success"));

		Data data = new Data();
		data.setIsValid(_ctx.booleanValue("CheckConnectionResponse.Data.IsValid"));
		data.setCode(_ctx.stringValue("CheckConnectionResponse.Data.Code"));
		data.setMsg(_ctx.stringValue("CheckConnectionResponse.Data.Msg"));
		checkConnectionResponse.setData(data);
	 
	 	return checkConnectionResponse;
	}
}