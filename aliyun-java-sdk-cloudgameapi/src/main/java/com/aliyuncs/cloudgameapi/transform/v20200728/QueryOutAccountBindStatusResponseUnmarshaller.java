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

package com.aliyuncs.cloudgameapi.transform.v20200728;

import com.aliyuncs.cloudgameapi.model.v20200728.QueryOutAccountBindStatusResponse;
import com.aliyuncs.cloudgameapi.model.v20200728.QueryOutAccountBindStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOutAccountBindStatusResponseUnmarshaller {

	public static QueryOutAccountBindStatusResponse unmarshall(QueryOutAccountBindStatusResponse queryOutAccountBindStatusResponse, UnmarshallerContext _ctx) {
		
		queryOutAccountBindStatusResponse.setRequestId(_ctx.stringValue("QueryOutAccountBindStatusResponse.RequestId"));

		Data data = new Data();
		data.setBindStatus(_ctx.integerValue("QueryOutAccountBindStatusResponse.Data.BindStatus"));
		queryOutAccountBindStatusResponse.setData(data);
	 
	 	return queryOutAccountBindStatusResponse;
	}
}