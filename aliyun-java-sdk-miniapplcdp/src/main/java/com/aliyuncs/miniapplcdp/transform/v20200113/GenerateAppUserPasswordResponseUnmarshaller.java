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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.GenerateAppUserPasswordResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.GenerateAppUserPasswordResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateAppUserPasswordResponseUnmarshaller {

	public static GenerateAppUserPasswordResponse unmarshall(GenerateAppUserPasswordResponse generateAppUserPasswordResponse, UnmarshallerContext _ctx) {
		
		generateAppUserPasswordResponse.setRequestId(_ctx.stringValue("GenerateAppUserPasswordResponse.RequestId"));

		Data data = new Data();
		data.setUserName(_ctx.stringValue("GenerateAppUserPasswordResponse.Data.UserName"));
		data.setPassword(_ctx.stringValue("GenerateAppUserPasswordResponse.Data.Password"));
		generateAppUserPasswordResponse.setData(data);
	 
	 	return generateAppUserPasswordResponse;
	}
}