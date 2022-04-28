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

import com.aliyuncs.vcs.model.v20200515.CreateSearchTableResponse;
import com.aliyuncs.vcs.model.v20200515.CreateSearchTableResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSearchTableResponseUnmarshaller {

	public static CreateSearchTableResponse unmarshall(CreateSearchTableResponse createSearchTableResponse, UnmarshallerContext _ctx) {
		
		createSearchTableResponse.setRequestId(_ctx.stringValue("CreateSearchTableResponse.RequestId"));
		createSearchTableResponse.setSuccess(_ctx.booleanValue("CreateSearchTableResponse.Success"));
		createSearchTableResponse.setCode(_ctx.stringValue("CreateSearchTableResponse.Code"));
		createSearchTableResponse.setMessage(_ctx.stringValue("CreateSearchTableResponse.Message"));

		Data data = new Data();
		data.setSearchTableId(_ctx.stringValue("CreateSearchTableResponse.Data.SearchTableId"));
		createSearchTableResponse.setData(data);
	 
	 	return createSearchTableResponse;
	}
}