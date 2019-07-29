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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.BatchBindTemplatesResponse;
import com.aliyuncs.vs.model.v20181212.BatchBindTemplatesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchBindTemplatesResponseUnmarshaller {

	public static BatchBindTemplatesResponse unmarshall(BatchBindTemplatesResponse batchBindTemplatesResponse, UnmarshallerContext _ctx) {
		
		batchBindTemplatesResponse.setRequestId(_ctx.stringValue("BatchBindTemplatesResponse.RequestId"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("BatchBindTemplatesResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setTemplateId(_ctx.stringValue("BatchBindTemplatesResponse.Results["+ i +"].TemplateId"));
			result.setInstanceId(_ctx.stringValue("BatchBindTemplatesResponse.Results["+ i +"].InstanceId"));
			result.setInstanceType(_ctx.stringValue("BatchBindTemplatesResponse.Results["+ i +"].InstanceType"));
			result.setError(_ctx.stringValue("BatchBindTemplatesResponse.Results["+ i +"].Error"));

			results.add(result);
		}
		batchBindTemplatesResponse.setResults(results);
	 
	 	return batchBindTemplatesResponse;
	}
}