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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsBatchRefreshInstanceAclResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchRefreshInstanceAclResponse.ResultEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsBatchRefreshInstanceAclResponseUnmarshaller {

	public static OpsBatchRefreshInstanceAclResponse unmarshall(OpsBatchRefreshInstanceAclResponse opsBatchRefreshInstanceAclResponse, UnmarshallerContext _ctx) {
		
		opsBatchRefreshInstanceAclResponse.setRequestId(_ctx.stringValue("OpsBatchRefreshInstanceAclResponse.RequestId"));
		opsBatchRefreshInstanceAclResponse.setMessage(_ctx.stringValue("OpsBatchRefreshInstanceAclResponse.Message"));
		opsBatchRefreshInstanceAclResponse.setCode(_ctx.stringValue("OpsBatchRefreshInstanceAclResponse.Code"));
		opsBatchRefreshInstanceAclResponse.setSuccess(_ctx.booleanValue("OpsBatchRefreshInstanceAclResponse.Success"));

		List<ResultEntry> resultEntries = new ArrayList<ResultEntry>();
		for (int i = 0; i < _ctx.lengthValue("OpsBatchRefreshInstanceAclResponse.ResultEntries.Length"); i++) {
			ResultEntry resultEntry = new ResultEntry();
			resultEntry.setKey(_ctx.stringValue("OpsBatchRefreshInstanceAclResponse.ResultEntries["+ i +"].Key"));
			resultEntry.setMessage(_ctx.stringValue("OpsBatchRefreshInstanceAclResponse.ResultEntries["+ i +"].Message"));

			resultEntries.add(resultEntry);
		}
		opsBatchRefreshInstanceAclResponse.setResultEntries(resultEntries);
	 
	 	return opsBatchRefreshInstanceAclResponse;
	}
}