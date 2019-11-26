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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.QueryVirtualNumberRelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVirtualNumberRelResponseUnmarshaller {

	public static QueryVirtualNumberRelResponse unmarshall(QueryVirtualNumberRelResponse queryVirtualNumberRelResponse, UnmarshallerContext _ctx) {
		
		queryVirtualNumberRelResponse.setRequestId(_ctx.stringValue("QueryVirtualNumberRelResponse.RequestId"));
		queryVirtualNumberRelResponse.setCode(_ctx.stringValue("QueryVirtualNumberRelResponse.code"));
		queryVirtualNumberRelResponse.setData(_ctx.stringValue("QueryVirtualNumberRelResponse.data"));
	 
	 	return queryVirtualNumberRelResponse;
	}
}