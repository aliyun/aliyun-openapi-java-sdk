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

package com.aliyuncs.dbfs.transform.v20200418;

import com.aliyuncs.dbfs.model.v20200418.CreateConstantsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConstantsResponseUnmarshaller {

	public static CreateConstantsResponse unmarshall(CreateConstantsResponse createConstantsResponse, UnmarshallerContext _ctx) {
		
		createConstantsResponse.setRequestId(_ctx.stringValue("CreateConstantsResponse.RequestId"));
		createConstantsResponse.setData(_ctx.stringValue("CreateConstantsResponse.Data"));
		createConstantsResponse.setPageSize(_ctx.longValue("CreateConstantsResponse.PageSize"));
		createConstantsResponse.setTotalCount(_ctx.longValue("CreateConstantsResponse.TotalCount"));
		createConstantsResponse.setPageNumber(_ctx.longValue("CreateConstantsResponse.PageNumber"));
	 
	 	return createConstantsResponse;
	}
}