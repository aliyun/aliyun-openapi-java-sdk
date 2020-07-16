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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.CreateDataCollectionResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateDataCollectionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataCollectionResponseUnmarshaller {

	public static CreateDataCollectionResponse unmarshall(CreateDataCollectionResponse createDataCollectionResponse, UnmarshallerContext _ctx) {
		
		createDataCollectionResponse.setRequestId(_ctx.stringValue("CreateDataCollectionResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateDataCollectionResponse.result.id"));
		result.setName(_ctx.stringValue("CreateDataCollectionResponse.result.name"));
		result.setType(_ctx.stringValue("CreateDataCollectionResponse.result.type"));
		result.setStatus(_ctx.integerValue("CreateDataCollectionResponse.result.status"));
		result.setDataCollectionType(_ctx.stringValue("CreateDataCollectionResponse.result.dataCollectionType"));
		result.setIndustryName(_ctx.stringValue("CreateDataCollectionResponse.result.industryName"));
		result.setCreated(_ctx.integerValue("CreateDataCollectionResponse.result.created"));
		result.setUpdated(_ctx.integerValue("CreateDataCollectionResponse.result.updated"));
		result.setSundialId(_ctx.stringValue("CreateDataCollectionResponse.result.sundialId"));
		createDataCollectionResponse.setResult(result);
	 
	 	return createDataCollectionResponse;
	}
}