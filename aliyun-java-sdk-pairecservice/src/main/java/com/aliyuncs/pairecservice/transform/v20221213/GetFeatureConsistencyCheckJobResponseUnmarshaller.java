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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.GetFeatureConsistencyCheckJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFeatureConsistencyCheckJobResponseUnmarshaller {

	public static GetFeatureConsistencyCheckJobResponse unmarshall(GetFeatureConsistencyCheckJobResponse getFeatureConsistencyCheckJobResponse, UnmarshallerContext _ctx) {
		
		getFeatureConsistencyCheckJobResponse.setRequestId(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.RequestId"));
		getFeatureConsistencyCheckJobResponse.setFeatureConsistencyCheckJobConfigId(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.FeatureConsistencyCheckJobConfigId"));
		getFeatureConsistencyCheckJobResponse.setFeatureConsistencyCheckJobConfigName(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.FeatureConsistencyCheckJobConfigName"));
		getFeatureConsistencyCheckJobResponse.setGmtStartTime(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.GmtStartTime"));
		getFeatureConsistencyCheckJobResponse.setGmtEndTime(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.GmtEndTime"));
		getFeatureConsistencyCheckJobResponse.setStatus(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.Status"));
		getFeatureConsistencyCheckJobResponse.setConfig(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.Config"));

		List<String> logs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetFeatureConsistencyCheckJobResponse.Logs.Length"); i++) {
			logs.add(_ctx.stringValue("GetFeatureConsistencyCheckJobResponse.Logs["+ i +"]"));
		}
		getFeatureConsistencyCheckJobResponse.setLogs(logs);
	 
	 	return getFeatureConsistencyCheckJobResponse;
	}
}