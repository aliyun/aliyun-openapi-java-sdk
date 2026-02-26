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

import com.aliyuncs.brinekingdom.model.v20190627.ReceiveResponse;
import com.aliyuncs.brinekingdom.model.v20190627.ReceiveResponse.ConsistentDemandResponseList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReceiveResponseUnmarshaller {

	public static ReceiveResponse unmarshall(ReceiveResponse receiveResponse, UnmarshallerContext _ctx) {
		
		receiveResponse.setRequestId(_ctx.stringValue("ReceiveResponse.RequestId"));
		receiveResponse.setMessage(_ctx.stringValue("ReceiveResponse.Message"));
		receiveResponse.setSuccess(_ctx.booleanValue("ReceiveResponse.Success"));

		List<ConsistentDemandResponseList> result = new ArrayList<ConsistentDemandResponseList>();
		for (int i = 0; i < _ctx.lengthValue("ReceiveResponse.Result.Length"); i++) {
			ConsistentDemandResponseList consistentDemandResponseList = new ConsistentDemandResponseList();
			consistentDemandResponseList.setConsistentDemandId(_ctx.longValue("ReceiveResponse.Result["+ i +"].ConsistentDemandId"));
			consistentDemandResponseList.setErrorMsg(_ctx.stringValue("ReceiveResponse.Result["+ i +"].ErrorMsg"));
			consistentDemandResponseList.setSource(_ctx.stringValue("ReceiveResponse.Result["+ i +"].Source"));
			consistentDemandResponseList.setSourceId(_ctx.stringValue("ReceiveResponse.Result["+ i +"].SourceId"));
			consistentDemandResponseList.setSuccess(_ctx.booleanValue("ReceiveResponse.Result["+ i +"].Success"));

			result.add(consistentDemandResponseList);
		}
		receiveResponse.setResult(result);
	 
	 	return receiveResponse;
	}
}