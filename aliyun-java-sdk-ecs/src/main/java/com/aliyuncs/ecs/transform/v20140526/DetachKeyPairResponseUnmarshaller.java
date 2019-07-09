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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DetachKeyPairResponse;
import com.aliyuncs.ecs.model.v20140526.DetachKeyPairResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachKeyPairResponseUnmarshaller {

	public static DetachKeyPairResponse unmarshall(DetachKeyPairResponse detachKeyPairResponse, UnmarshallerContext _ctx) {
		
		detachKeyPairResponse.setRequestId(_ctx.stringValue("DetachKeyPairResponse.RequestId"));
		detachKeyPairResponse.setTotalCount(_ctx.stringValue("DetachKeyPairResponse.TotalCount"));
		detachKeyPairResponse.setFailCount(_ctx.stringValue("DetachKeyPairResponse.FailCount"));
		detachKeyPairResponse.setKeyPairName(_ctx.stringValue("DetachKeyPairResponse.KeyPairName"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("DetachKeyPairResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setInstanceId(_ctx.stringValue("DetachKeyPairResponse.Results["+ i +"].InstanceId"));
			result.setSuccess(_ctx.stringValue("DetachKeyPairResponse.Results["+ i +"].Success"));
			result.setCode(_ctx.stringValue("DetachKeyPairResponse.Results["+ i +"].Code"));
			result.setMessage(_ctx.stringValue("DetachKeyPairResponse.Results["+ i +"].Message"));

			results.add(result);
		}
		detachKeyPairResponse.setResults(results);
	 
	 	return detachKeyPairResponse;
	}
}