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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.GetLosslessRuleByAppResponse;
import com.aliyuncs.mse.model.v20190531.GetLosslessRuleByAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLosslessRuleByAppResponseUnmarshaller {

	public static GetLosslessRuleByAppResponse unmarshall(GetLosslessRuleByAppResponse getLosslessRuleByAppResponse, UnmarshallerContext _ctx) {
		
		getLosslessRuleByAppResponse.setRequestId(_ctx.stringValue("GetLosslessRuleByAppResponse.RequestId"));
		getLosslessRuleByAppResponse.setSuccess(_ctx.booleanValue("GetLosslessRuleByAppResponse.Success"));
		getLosslessRuleByAppResponse.setCode(_ctx.integerValue("GetLosslessRuleByAppResponse.Code"));
		getLosslessRuleByAppResponse.setErrorCode(_ctx.stringValue("GetLosslessRuleByAppResponse.ErrorCode"));
		getLosslessRuleByAppResponse.setHttpStatusCode(_ctx.integerValue("GetLosslessRuleByAppResponse.HttpStatusCode"));
		getLosslessRuleByAppResponse.setMessage(_ctx.stringValue("GetLosslessRuleByAppResponse.Message"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("GetLosslessRuleByAppResponse.Data.AppName"));
		data.setAppId(_ctx.stringValue("GetLosslessRuleByAppResponse.Data.AppId"));
		data.setCount(_ctx.integerValue("GetLosslessRuleByAppResponse.Data.Count"));
		data.setEnable(_ctx.booleanValue("GetLosslessRuleByAppResponse.Data.Enable"));
		data.setWarmupTime(_ctx.integerValue("GetLosslessRuleByAppResponse.Data.WarmupTime"));
		data.setDelayTime(_ctx.integerValue("GetLosslessRuleByAppResponse.Data.DelayTime"));
		data.setFuncType(_ctx.integerValue("GetLosslessRuleByAppResponse.Data.FuncType"));
		data.setAligned(_ctx.booleanValue("GetLosslessRuleByAppResponse.Data.Aligned"));
		data.setRelated(_ctx.booleanValue("GetLosslessRuleByAppResponse.Data.Related"));
		data.setLossLessDetail(_ctx.booleanValue("GetLosslessRuleByAppResponse.Data.LossLessDetail"));
		data.setNotice(_ctx.booleanValue("GetLosslessRuleByAppResponse.Data.Notice"));
		getLosslessRuleByAppResponse.setData(data);
	 
	 	return getLosslessRuleByAppResponse;
	}
}