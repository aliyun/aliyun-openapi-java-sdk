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

import com.aliyuncs.rds.model.v20140815.PreCheckDBInstanceOperationResponse;
import com.aliyuncs.rds.model.v20140815.PreCheckDBInstanceOperationResponse.FailuresItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PreCheckDBInstanceOperationResponseUnmarshaller {

	public static PreCheckDBInstanceOperationResponse unmarshall(PreCheckDBInstanceOperationResponse preCheckDBInstanceOperationResponse, UnmarshallerContext _ctx) {
		
		preCheckDBInstanceOperationResponse.setRequestId(_ctx.stringValue("PreCheckDBInstanceOperationResponse.RequestId"));
		preCheckDBInstanceOperationResponse.setPreCheckResult(_ctx.booleanValue("PreCheckDBInstanceOperationResponse.PreCheckResult"));

		List<FailuresItem> failures = new ArrayList<FailuresItem>();
		for (int i = 0; i < _ctx.lengthValue("PreCheckDBInstanceOperationResponse.Failures.Length"); i++) {
			FailuresItem failuresItem = new FailuresItem();
			failuresItem.setMessage(_ctx.stringValue("PreCheckDBInstanceOperationResponse.Failures["+ i +"].Message"));
			failuresItem.setCode(_ctx.stringValue("PreCheckDBInstanceOperationResponse.Failures["+ i +"].Code"));

			failures.add(failuresItem);
		}
		preCheckDBInstanceOperationResponse.setFailures(failures);
	 
	 	return preCheckDBInstanceOperationResponse;
	}
}