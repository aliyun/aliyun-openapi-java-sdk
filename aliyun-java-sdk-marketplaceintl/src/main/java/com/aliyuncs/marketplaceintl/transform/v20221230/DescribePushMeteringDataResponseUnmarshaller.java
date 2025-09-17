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

package com.aliyuncs.marketplaceintl.transform.v20221230;

import com.aliyuncs.marketplaceintl.model.v20221230.DescribePushMeteringDataResponse;
import com.aliyuncs.marketplaceintl.model.v20221230.DescribePushMeteringDataResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePushMeteringDataResponseUnmarshaller {

	public static DescribePushMeteringDataResponse unmarshall(DescribePushMeteringDataResponse describePushMeteringDataResponse, UnmarshallerContext _ctx) {
		
		describePushMeteringDataResponse.setRequestId(_ctx.stringValue("DescribePushMeteringDataResponse.RequestId"));
		describePushMeteringDataResponse.setMessage(_ctx.stringValue("DescribePushMeteringDataResponse.Message"));
		describePushMeteringDataResponse.setForceFatal(_ctx.booleanValue("DescribePushMeteringDataResponse.ForceFatal"));
		describePushMeteringDataResponse.setDynamicMessage(_ctx.stringValue("DescribePushMeteringDataResponse.DynamicMessage"));
		describePushMeteringDataResponse.setCode(_ctx.stringValue("DescribePushMeteringDataResponse.Code"));
		describePushMeteringDataResponse.setSuccess(_ctx.booleanValue("DescribePushMeteringDataResponse.Success"));

		Result result = new Result();
		result.setEndTime(_ctx.longValue("DescribePushMeteringDataResponse.Result.EndTime"));
		result.setInstanceId(_ctx.stringValue("DescribePushMeteringDataResponse.Result.InstanceId"));
		result.setIsPushBilling(_ctx.booleanValue("DescribePushMeteringDataResponse.Result.IsPushBilling"));
		result.setMeteringAssist(_ctx.stringValue("DescribePushMeteringDataResponse.Result.MeteringAssist"));
		result.setMeteringEntity(_ctx.stringValue("DescribePushMeteringDataResponse.Result.MeteringEntity"));
		result.setPushOrderBizId(_ctx.stringValue("DescribePushMeteringDataResponse.Result.PushOrderBizId"));
		result.setStartTime(_ctx.longValue("DescribePushMeteringDataResponse.Result.StartTime"));
		describePushMeteringDataResponse.setResult(result);
	 
	 	return describePushMeteringDataResponse;
	}
}