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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.PreCheckCreateOrderForDegradeResponse;
import com.aliyuncs.rds.model.v20140815.PreCheckCreateOrderForDegradeResponse.FailuresItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreCheckCreateOrderForDegradeResponseUnmarshaller {

	public static PreCheckCreateOrderForDegradeResponse unmarshall(PreCheckCreateOrderForDegradeResponse preCheckCreateOrderForDegradeResponse, UnmarshallerContext _ctx) {
		
		preCheckCreateOrderForDegradeResponse.setRequestId(_ctx.stringValue("PreCheckCreateOrderForDegradeResponse.RequestId"));
		preCheckCreateOrderForDegradeResponse.setPreCheckResult(_ctx.booleanValue("PreCheckCreateOrderForDegradeResponse.PreCheckResult"));

		List<FailuresItem> failures = new ArrayList<FailuresItem>();
		for (int i = 0; i < _ctx.lengthValue("PreCheckCreateOrderForDegradeResponse.Failures.Length"); i++) {
			FailuresItem failuresItem = new FailuresItem();
			failuresItem.setCode(_ctx.stringValue("PreCheckCreateOrderForDegradeResponse.Failures["+ i +"].Code"));
			failuresItem.setMessage(_ctx.stringValue("PreCheckCreateOrderForDegradeResponse.Failures["+ i +"].Message"));

			failures.add(failuresItem);
		}
		preCheckCreateOrderForDegradeResponse.setFailures(failures);
	 
	 	return preCheckCreateOrderForDegradeResponse;
	}
}