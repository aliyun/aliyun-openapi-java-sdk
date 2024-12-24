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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.CheckReceiveResponse;
import com.aliyuncs.brinekingdom.model.v20190627.CheckReceiveResponse.ConsistentDemandResponseList;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckReceiveResponseUnmarshaller {

	public static CheckReceiveResponse unmarshall(CheckReceiveResponse checkReceiveResponse, UnmarshallerContext _ctx) {
		
		checkReceiveResponse.setRequestId(_ctx.stringValue("CheckReceiveResponse.RequestId"));
		checkReceiveResponse.setMessage(_ctx.stringValue("CheckReceiveResponse.Message"));
		checkReceiveResponse.setSuccess(_ctx.booleanValue("CheckReceiveResponse.Success"));

		List<ConsistentDemandResponseList> result = new ArrayList<ConsistentDemandResponseList>();
		for (int i = 0; i < _ctx.lengthValue("CheckReceiveResponse.Result.Length"); i++) {
			ConsistentDemandResponseList consistentDemandResponseList = new ConsistentDemandResponseList();
			consistentDemandResponseList.setConsistentDemandId(_ctx.longValue("CheckReceiveResponse.Result["+ i +"].ConsistentDemandId"));
			consistentDemandResponseList.setErrorMsg(_ctx.stringValue("CheckReceiveResponse.Result["+ i +"].ErrorMsg"));
			consistentDemandResponseList.setSource(_ctx.stringValue("CheckReceiveResponse.Result["+ i +"].Source"));
			consistentDemandResponseList.setSourceId(_ctx.stringValue("CheckReceiveResponse.Result["+ i +"].SourceId"));
			consistentDemandResponseList.setSuccess(_ctx.booleanValue("CheckReceiveResponse.Result["+ i +"].Success"));

			result.add(consistentDemandResponseList);
		}
		checkReceiveResponse.setResult(result);
	 
	 	return checkReceiveResponse;
	}
}