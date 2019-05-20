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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.FindRecordsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindRecordsResponseUnmarshaller {

	public static FindRecordsResponse unmarshall(FindRecordsResponse findRecordsResponse, UnmarshallerContext context) {
		
		findRecordsResponse.setRequestId(context.stringValue("FindRecordsResponse.RequestId"));
		findRecordsResponse.setSuccess(context.booleanValue("FindRecordsResponse.Success"));
		findRecordsResponse.setCode(context.stringValue("FindRecordsResponse.Code"));
		findRecordsResponse.setMessage(context.stringValue("FindRecordsResponse.Message"));
		findRecordsResponse.setHttpStatusCode(context.integerValue("FindRecordsResponse.HttpStatusCode"));

		List<String> records = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("FindRecordsResponse.Records.Length"); i++) {
			records.add(context.stringValue("FindRecordsResponse.Records["+ i +"]"));
		}
		findRecordsResponse.setRecords(records);
	 
	 	return findRecordsResponse;
	}
}