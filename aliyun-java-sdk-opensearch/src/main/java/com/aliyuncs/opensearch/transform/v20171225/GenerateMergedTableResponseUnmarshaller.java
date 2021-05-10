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

import com.aliyuncs.opensearch.model.v20171225.GenerateMergedTableResponse;
import com.aliyuncs.opensearch.model.v20171225.GenerateMergedTableResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateMergedTableResponseUnmarshaller {

	public static GenerateMergedTableResponse unmarshall(GenerateMergedTableResponse generateMergedTableResponse, UnmarshallerContext _ctx) {
		
		generateMergedTableResponse.setRequestId(_ctx.stringValue("GenerateMergedTableResponse.requestId"));

		Result result = new Result();
		result.setMergeTable(_ctx.mapValue("GenerateMergedTableResponse.result.mergeTable"));
		result.setFromTable(_ctx.mapValue("GenerateMergedTableResponse.result.fromTable"));
		result.setPrimaryKey(_ctx.stringValue("GenerateMergedTableResponse.result.primaryKey"));
		generateMergedTableResponse.setResult(result);
	 
	 	return generateMergedTableResponse;
	}
}