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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListPredictiveJobGroupOverallStatusResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListPredictiveJobGroupOverallStatusResponse.KeyValuePair;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPredictiveJobGroupOverallStatusResponseUnmarshaller {

	public static ListPredictiveJobGroupOverallStatusResponse unmarshall(ListPredictiveJobGroupOverallStatusResponse listPredictiveJobGroupOverallStatusResponse, UnmarshallerContext context) {
		
		listPredictiveJobGroupOverallStatusResponse.setRequestId(context.stringValue("ListPredictiveJobGroupOverallStatusResponse.RequestId"));
		listPredictiveJobGroupOverallStatusResponse.setSuccess(context.booleanValue("ListPredictiveJobGroupOverallStatusResponse.Success"));
		listPredictiveJobGroupOverallStatusResponse.setCode(context.stringValue("ListPredictiveJobGroupOverallStatusResponse.Code"));
		listPredictiveJobGroupOverallStatusResponse.setMessage(context.stringValue("ListPredictiveJobGroupOverallStatusResponse.Message"));
		listPredictiveJobGroupOverallStatusResponse.setHttpStatusCode(context.integerValue("ListPredictiveJobGroupOverallStatusResponse.HttpStatusCode"));

		List<KeyValuePair> overallStatus = new ArrayList<KeyValuePair>();
		for (int i = 0; i < context.lengthValue("ListPredictiveJobGroupOverallStatusResponse.OverallStatus.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(context.stringValue("ListPredictiveJobGroupOverallStatusResponse.OverallStatus["+ i +"].Key"));
			keyValuePair.setValue(context.stringValue("ListPredictiveJobGroupOverallStatusResponse.OverallStatus["+ i +"].Value"));

			overallStatus.add(keyValuePair);
		}
		listPredictiveJobGroupOverallStatusResponse.setOverallStatus(overallStatus);
	 
	 	return listPredictiveJobGroupOverallStatusResponse;
	}
}