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

import com.aliyuncs.vcs.model.v20200515.AddAiotPersonTableItemsForTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAiotPersonTableItemsForTablesResponseUnmarshaller {

	public static AddAiotPersonTableItemsForTablesResponse unmarshall(AddAiotPersonTableItemsForTablesResponse addAiotPersonTableItemsForTablesResponse, UnmarshallerContext _ctx) {
		
		addAiotPersonTableItemsForTablesResponse.setRequestId(_ctx.stringValue("AddAiotPersonTableItemsForTablesResponse.RequestId"));
		addAiotPersonTableItemsForTablesResponse.setCode(_ctx.stringValue("AddAiotPersonTableItemsForTablesResponse.Code"));
		addAiotPersonTableItemsForTablesResponse.setMessage(_ctx.stringValue("AddAiotPersonTableItemsForTablesResponse.Message"));
	 
	 	return addAiotPersonTableItemsForTablesResponse;
	}
}