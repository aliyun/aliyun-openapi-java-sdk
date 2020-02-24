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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.UpgradeEngineVersionResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpgradeEngineVersionResponse.Result;
import com.aliyuncs.elasticsearch.model.v20170613.UpgradeEngineVersionResponse.Result.ValidateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeEngineVersionResponseUnmarshaller {

	public static UpgradeEngineVersionResponse unmarshall(UpgradeEngineVersionResponse upgradeEngineVersionResponse, UnmarshallerContext _ctx) {
		
		upgradeEngineVersionResponse.setRequestId(_ctx.stringValue("UpgradeEngineVersionResponse.RequestId"));

		Result result = new Result();
		result.setValidateType(_ctx.stringValue("UpgradeEngineVersionResponse.Result.validateType"));
		result.setStatus(_ctx.stringValue("UpgradeEngineVersionResponse.Result.status"));

		ValidateResult validateResult = new ValidateResult();
		validateResult.setErrorType(_ctx.stringValue("UpgradeEngineVersionResponse.Result.validateResult.errorType"));
		validateResult.setErrorCode(_ctx.stringValue("UpgradeEngineVersionResponse.Result.validateResult.errorCode"));
		validateResult.setErrorMsg(_ctx.stringValue("UpgradeEngineVersionResponse.Result.validateResult.errorMsg"));
		result.setValidateResult(validateResult);
		upgradeEngineVersionResponse.setResult(result);
	 
	 	return upgradeEngineVersionResponse;
	}
}