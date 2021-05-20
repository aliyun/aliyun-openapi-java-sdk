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

package com.aliyuncs.facebody.transform.v20191230;

import com.aliyuncs.facebody.model.v20191230.CreateBodyDbResponse;
import com.aliyuncs.facebody.model.v20191230.CreateBodyDbResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBodyDbResponseUnmarshaller {

	public static CreateBodyDbResponse unmarshall(CreateBodyDbResponse createBodyDbResponse, UnmarshallerContext _ctx) {
		
		createBodyDbResponse.setRequestId(_ctx.stringValue("CreateBodyDbResponse.RequestId"));
		createBodyDbResponse.setCode(_ctx.stringValue("CreateBodyDbResponse.Code"));
		createBodyDbResponse.setMessage(_ctx.stringValue("CreateBodyDbResponse.Message"));

		Data data = new Data();
		data.setId(_ctx.longValue("CreateBodyDbResponse.Data.Id"));
		createBodyDbResponse.setData(data);
	 
	 	return createBodyDbResponse;
	}
}