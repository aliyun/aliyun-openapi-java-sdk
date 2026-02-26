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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.UpgradeEngineVersionResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpgradeEngineVersionResponse.ResultItem;
import com.aliyuncs.elasticsearch.model.v20170613.UpgradeEngineVersionResponse.ResultItem.ValidateResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeEngineVersionResponseUnmarshaller {

	public static UpgradeEngineVersionResponse unmarshall(UpgradeEngineVersionResponse upgradeEngineVersionResponse, UnmarshallerContext _ctx) {
		
		upgradeEngineVersionResponse.setRequestId(_ctx.stringValue("UpgradeEngineVersionResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("UpgradeEngineVersionResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setValidateType(_ctx.stringValue("UpgradeEngineVersionResponse.Result["+ i +"].validateType"));
			resultItem.setStatus(_ctx.stringValue("UpgradeEngineVersionResponse.Result["+ i +"].status"));

			List<ValidateResultItem> validateResult = new ArrayList<ValidateResultItem>();
			for (int j = 0; j < _ctx.lengthValue("UpgradeEngineVersionResponse.Result["+ i +"].validateResult.Length"); j++) {
				ValidateResultItem validateResultItem = new ValidateResultItem();
				validateResultItem.setErrorType(_ctx.stringValue("UpgradeEngineVersionResponse.Result["+ i +"].validateResult["+ j +"].errorType"));
				validateResultItem.setErrorCode(_ctx.stringValue("UpgradeEngineVersionResponse.Result["+ i +"].validateResult["+ j +"].errorCode"));
				validateResultItem.setErrorMsg(_ctx.stringValue("UpgradeEngineVersionResponse.Result["+ i +"].validateResult["+ j +"].errorMsg"));

				validateResult.add(validateResultItem);
			}
			resultItem.setValidateResult(validateResult);

			result.add(resultItem);
		}
		upgradeEngineVersionResponse.setResult(result);
	 
	 	return upgradeEngineVersionResponse;
	}
}