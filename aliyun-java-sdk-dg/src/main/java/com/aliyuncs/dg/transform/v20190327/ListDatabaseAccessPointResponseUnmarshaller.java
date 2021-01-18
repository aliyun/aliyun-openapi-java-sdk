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

package com.aliyuncs.dg.transform.v20190327;

import com.aliyuncs.dg.model.v20190327.ListDatabaseAccessPointResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDatabaseAccessPointResponseUnmarshaller {

	public static ListDatabaseAccessPointResponse unmarshall(ListDatabaseAccessPointResponse listDatabaseAccessPointResponse, UnmarshallerContext _ctx) {
		
		listDatabaseAccessPointResponse.setRequestId(_ctx.stringValue("ListDatabaseAccessPointResponse.RequestId"));
		listDatabaseAccessPointResponse.setSuccess(_ctx.stringValue("ListDatabaseAccessPointResponse.Success"));
		listDatabaseAccessPointResponse.setCode(_ctx.stringValue("ListDatabaseAccessPointResponse.Code"));
		listDatabaseAccessPointResponse.setErrorMsg(_ctx.stringValue("ListDatabaseAccessPointResponse.ErrorMsg"));
		listDatabaseAccessPointResponse.setData(_ctx.stringValue("ListDatabaseAccessPointResponse.Data"));
		listDatabaseAccessPointResponse.setCount(_ctx.integerValue("ListDatabaseAccessPointResponse.Count"));
	 
	 	return listDatabaseAccessPointResponse;
	}
}