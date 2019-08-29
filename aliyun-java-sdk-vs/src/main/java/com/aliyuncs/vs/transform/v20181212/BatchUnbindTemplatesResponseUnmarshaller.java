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

import com.aliyuncs.vs.model.v20181212.BatchUnbindTemplatesResponse;
import com.aliyuncs.vs.model.v20181212.BatchUnbindTemplatesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUnbindTemplatesResponseUnmarshaller {

	public static BatchUnbindTemplatesResponse unmarshall(BatchUnbindTemplatesResponse batchUnbindTemplatesResponse, UnmarshallerContext _ctx) {
		
		batchUnbindTemplatesResponse.setRequestId(_ctx.stringValue("BatchUnbindTemplatesResponse.RequestId"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("BatchUnbindTemplatesResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setTemplateId(_ctx.stringValue("BatchUnbindTemplatesResponse.Results["+ i +"].TemplateId"));
			result.setTemplateType(_ctx.stringValue("BatchUnbindTemplatesResponse.Results["+ i +"].TemplateType"));
			result.setInstanceId(_ctx.stringValue("BatchUnbindTemplatesResponse.Results["+ i +"].InstanceId"));
			result.setInstanceType(_ctx.stringValue("BatchUnbindTemplatesResponse.Results["+ i +"].InstanceType"));
			result.setError(_ctx.stringValue("BatchUnbindTemplatesResponse.Results["+ i +"].Error"));

			results.add(result);
		}
		batchUnbindTemplatesResponse.setResults(results);
	 
	 	return batchUnbindTemplatesResponse;
	}
}