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

import com.aliyuncs.dyvms.model.v20170620.QueryNumberListBy400CorpNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNumberListBy400CorpNameResponseUnmarshaller {

	public static QueryNumberListBy400CorpNameResponse unmarshall(QueryNumberListBy400CorpNameResponse queryNumberListBy400CorpNameResponse, UnmarshallerContext _ctx) {
		
		queryNumberListBy400CorpNameResponse.setRequestId(_ctx.stringValue("QueryNumberListBy400CorpNameResponse.RequestId"));
		queryNumberListBy400CorpNameResponse.setCode(_ctx.stringValue("QueryNumberListBy400CorpNameResponse.code"));
		queryNumberListBy400CorpNameResponse.setData(_ctx.stringValue("QueryNumberListBy400CorpNameResponse.data"));
	 
	 	return queryNumberListBy400CorpNameResponse;
	}
}