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

package com.aliyuncs.drds.transform.v20171016;

import com.aliyuncs.drds.model.v20171016.CreateReadOnlyAccountResponse;
import com.aliyuncs.drds.model.v20171016.CreateReadOnlyAccountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateReadOnlyAccountResponseUnmarshaller {

	public static CreateReadOnlyAccountResponse unmarshall(CreateReadOnlyAccountResponse createReadOnlyAccountResponse, UnmarshallerContext _ctx) {
		
		createReadOnlyAccountResponse.setRequestId(_ctx.stringValue("CreateReadOnlyAccountResponse.RequestId"));
		createReadOnlyAccountResponse.setSuccess(_ctx.booleanValue("CreateReadOnlyAccountResponse.Success"));

		Data data = new Data();
		data.setDbName(_ctx.stringValue("CreateReadOnlyAccountResponse.Data.DbName"));
		data.setDrdsInstanceId(_ctx.stringValue("CreateReadOnlyAccountResponse.Data.DrdsInstanceId"));
		data.setAccountName(_ctx.stringValue("CreateReadOnlyAccountResponse.Data.AccountName"));
		createReadOnlyAccountResponse.setData(data);
	 
	 	return createReadOnlyAccountResponse;
	}
}