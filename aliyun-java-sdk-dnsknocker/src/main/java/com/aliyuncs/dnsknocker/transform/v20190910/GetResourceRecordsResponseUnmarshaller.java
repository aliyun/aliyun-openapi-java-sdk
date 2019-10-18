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

package com.aliyuncs.dnsknocker.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dnsknocker.model.v20190910.GetResourceRecordsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceRecordsResponseUnmarshaller {

	public static GetResourceRecordsResponse unmarshall(GetResourceRecordsResponse getResourceRecordsResponse, UnmarshallerContext _ctx) {
		
		getResourceRecordsResponse.setRequestId(_ctx.stringValue("GetResourceRecordsResponse.RequestId"));
		getResourceRecordsResponse.setResultCode(_ctx.stringValue("GetResourceRecordsResponse.ResultCode"));
		getResourceRecordsResponse.setResultMessage(_ctx.stringValue("GetResourceRecordsResponse.ResultMessage"));
		getResourceRecordsResponse.setSuccess(_ctx.booleanValue("GetResourceRecordsResponse.Success"));

		List<String> resourceRecordSet = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetResourceRecordsResponse.ResourceRecordSet.Length"); i++) {
			resourceRecordSet.add(_ctx.stringValue("GetResourceRecordsResponse.ResourceRecordSet["+ i +"]"));
		}
		getResourceRecordsResponse.setResourceRecordSet(resourceRecordSet);
	 
	 	return getResourceRecordsResponse;
	}
}