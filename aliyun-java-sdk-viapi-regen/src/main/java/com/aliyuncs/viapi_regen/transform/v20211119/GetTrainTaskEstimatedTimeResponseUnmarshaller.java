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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.GetTrainTaskEstimatedTimeResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetTrainTaskEstimatedTimeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTrainTaskEstimatedTimeResponseUnmarshaller {

	public static GetTrainTaskEstimatedTimeResponse unmarshall(GetTrainTaskEstimatedTimeResponse getTrainTaskEstimatedTimeResponse, UnmarshallerContext _ctx) {
		
		getTrainTaskEstimatedTimeResponse.setRequestId(_ctx.stringValue("GetTrainTaskEstimatedTimeResponse.RequestId"));
		getTrainTaskEstimatedTimeResponse.setMessage(_ctx.stringValue("GetTrainTaskEstimatedTimeResponse.Message"));
		getTrainTaskEstimatedTimeResponse.setCode(_ctx.stringValue("GetTrainTaskEstimatedTimeResponse.Code"));

		Data data = new Data();
		data.setEstimatedTime(_ctx.stringValue("GetTrainTaskEstimatedTimeResponse.Data.EstimatedTime"));
		getTrainTaskEstimatedTimeResponse.setData(data);
	 
	 	return getTrainTaskEstimatedTimeResponse;
	}
}