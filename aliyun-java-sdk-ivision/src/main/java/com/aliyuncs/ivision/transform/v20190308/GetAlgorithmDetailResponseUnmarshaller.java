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

package com.aliyuncs.ivision.transform.v20190308;

import com.aliyuncs.ivision.model.v20190308.GetAlgorithmDetailResponse;
import com.aliyuncs.ivision.model.v20190308.GetAlgorithmDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlgorithmDetailResponseUnmarshaller {

	public static GetAlgorithmDetailResponse unmarshall(GetAlgorithmDetailResponse getAlgorithmDetailResponse, UnmarshallerContext _ctx) {
		
		getAlgorithmDetailResponse.setRequestId(_ctx.stringValue("GetAlgorithmDetailResponse.RequestId"));
		getAlgorithmDetailResponse.setMessage(_ctx.stringValue("GetAlgorithmDetailResponse.Message"));
		getAlgorithmDetailResponse.setCode(_ctx.stringValue("GetAlgorithmDetailResponse.Code"));
		getAlgorithmDetailResponse.setSuccess(_ctx.booleanValue("GetAlgorithmDetailResponse.Success"));

		Data data = new Data();
		data.setAlgorithmName(_ctx.stringValue("GetAlgorithmDetailResponse.Data.AlgorithmName"));
		data.setDeployRegion(_ctx.stringValue("GetAlgorithmDetailResponse.Data.DeployRegion"));
		data.setCurrentMonthCount(_ctx.integerValue("GetAlgorithmDetailResponse.Data.CurrentMonthCount"));
		data.setAlgorithmCode(_ctx.stringValue("GetAlgorithmDetailResponse.Data.AlgorithmCode"));
		data.setApiDocUrl(_ctx.stringValue("GetAlgorithmDetailResponse.Data.ApiDocUrl"));
		data.setCurrentMonthSuccessCount(_ctx.integerValue("GetAlgorithmDetailResponse.Data.CurrentMonthSuccessCount"));
		getAlgorithmDetailResponse.setData(data);
	 
	 	return getAlgorithmDetailResponse;
	}
}