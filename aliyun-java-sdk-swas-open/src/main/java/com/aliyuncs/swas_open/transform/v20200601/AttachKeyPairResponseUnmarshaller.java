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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.AttachKeyPairResponse;
import com.aliyuncs.swas_open.model.v20200601.AttachKeyPairResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachKeyPairResponseUnmarshaller {

	public static AttachKeyPairResponse unmarshall(AttachKeyPairResponse attachKeyPairResponse, UnmarshallerContext _ctx) {
		
		attachKeyPairResponse.setRequestId(_ctx.stringValue("AttachKeyPairResponse.RequestId"));
		attachKeyPairResponse.setTotalCount(_ctx.integerValue("AttachKeyPairResponse.TotalCount"));
		attachKeyPairResponse.setFailCount(_ctx.integerValue("AttachKeyPairResponse.FailCount"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("AttachKeyPairResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setCode(_ctx.stringValue("AttachKeyPairResponse.Results["+ i +"].Code"));
			result.setMessage(_ctx.stringValue("AttachKeyPairResponse.Results["+ i +"].Message"));
			result.setSuccess(_ctx.stringValue("AttachKeyPairResponse.Results["+ i +"].Success"));
			result.setInstanceId(_ctx.stringValue("AttachKeyPairResponse.Results["+ i +"].InstanceId"));

			results.add(result);
		}
		attachKeyPairResponse.setResults(results);
	 
	 	return attachKeyPairResponse;
	}
}