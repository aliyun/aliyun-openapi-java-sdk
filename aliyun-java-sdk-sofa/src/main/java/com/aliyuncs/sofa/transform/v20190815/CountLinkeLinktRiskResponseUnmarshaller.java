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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CountLinkeLinktRiskResponse;
import com.aliyuncs.sofa.model.v20190815.CountLinkeLinktRiskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountLinkeLinktRiskResponseUnmarshaller {

	public static CountLinkeLinktRiskResponse unmarshall(CountLinkeLinktRiskResponse countLinkeLinktRiskResponse, UnmarshallerContext _ctx) {
		
		countLinkeLinktRiskResponse.setRequestId(_ctx.stringValue("CountLinkeLinktRiskResponse.RequestId"));
		countLinkeLinktRiskResponse.setResultCode(_ctx.stringValue("CountLinkeLinktRiskResponse.ResultCode"));
		countLinkeLinktRiskResponse.setResultMessage(_ctx.stringValue("CountLinkeLinktRiskResponse.ResultMessage"));
		countLinkeLinktRiskResponse.setErrorCode(_ctx.longValue("CountLinkeLinktRiskResponse.ErrorCode"));
		countLinkeLinktRiskResponse.setErrorMessage(_ctx.stringValue("CountLinkeLinktRiskResponse.ErrorMessage"));
		countLinkeLinktRiskResponse.setResponseStatusCode(_ctx.longValue("CountLinkeLinktRiskResponse.ResponseStatusCode"));
		countLinkeLinktRiskResponse.setSuccess(_ctx.booleanValue("CountLinkeLinktRiskResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("CountLinkeLinktRiskResponse.Data.Total"));
		data.setUnFinished(_ctx.longValue("CountLinkeLinktRiskResponse.Data.UnFinished"));
		countLinkeLinktRiskResponse.setData(data);
	 
	 	return countLinkeLinktRiskResponse;
	}
}