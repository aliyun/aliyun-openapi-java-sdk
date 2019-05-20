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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetOutBoundDataResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetOutBoundDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOutBoundDataResponseUnmarshaller {

	public static GetOutBoundDataResponse unmarshall(GetOutBoundDataResponse getOutBoundDataResponse, UnmarshallerContext context) {
		
		getOutBoundDataResponse.setRequestId(context.stringValue("GetOutBoundDataResponse.RequestId"));
		getOutBoundDataResponse.setSuccess(context.booleanValue("GetOutBoundDataResponse.Success"));
		getOutBoundDataResponse.setCode(context.stringValue("GetOutBoundDataResponse.Code"));
		getOutBoundDataResponse.setMessage(context.stringValue("GetOutBoundDataResponse.Message"));
		getOutBoundDataResponse.setHttpStatusCode(context.integerValue("GetOutBoundDataResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSuccessNumber(context.stringValue("GetOutBoundDataResponse.data.SuccessNumber"));
		data.setSuccessRate(context.stringValue("GetOutBoundDataResponse.data.SuccessRate"));
		data.setLossNumber(context.stringValue("GetOutBoundDataResponse.data.LossNumber"));
		data.setLossRate(context.stringValue("GetOutBoundDataResponse.data.LossRate"));
		data.setOccupancyRate(context.stringValue("GetOutBoundDataResponse.data.OccupancyRate"));
		data.setAverageReadyTime(context.stringValue("GetOutBoundDataResponse.data.AverageReadyTime"));
		getOutBoundDataResponse.setData(data);
	 
	 	return getOutBoundDataResponse;
	}
}