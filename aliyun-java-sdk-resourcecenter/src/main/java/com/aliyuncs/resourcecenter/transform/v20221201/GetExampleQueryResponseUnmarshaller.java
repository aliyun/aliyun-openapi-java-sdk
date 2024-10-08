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

package com.aliyuncs.resourcecenter.transform.v20221201;

import com.aliyuncs.resourcecenter.model.v20221201.GetExampleQueryResponse;
import com.aliyuncs.resourcecenter.model.v20221201.GetExampleQueryResponse.ExampleQuery;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetExampleQueryResponseUnmarshaller {

	public static GetExampleQueryResponse unmarshall(GetExampleQueryResponse getExampleQueryResponse, UnmarshallerContext _ctx) {
		
		getExampleQueryResponse.setRequestId(_ctx.stringValue("GetExampleQueryResponse.RequestId"));

		ExampleQuery exampleQuery = new ExampleQuery();
		exampleQuery.setQueryId(_ctx.stringValue("GetExampleQueryResponse.ExampleQuery.QueryId"));
		exampleQuery.setExpression(_ctx.stringValue("GetExampleQueryResponse.ExampleQuery.Expression"));
		exampleQuery.setName(_ctx.stringValue("GetExampleQueryResponse.ExampleQuery.Name"));
		exampleQuery.setDescription(_ctx.stringValue("GetExampleQueryResponse.ExampleQuery.Description"));
		getExampleQueryResponse.setExampleQuery(exampleQuery);
	 
	 	return getExampleQueryResponse;
	}
}