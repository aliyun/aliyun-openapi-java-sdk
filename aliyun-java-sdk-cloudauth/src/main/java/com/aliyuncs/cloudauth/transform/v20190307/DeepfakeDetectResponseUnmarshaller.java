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

package com.aliyuncs.cloudauth.transform.v20190307;

import com.aliyuncs.cloudauth.model.v20190307.DeepfakeDetectResponse;
import com.aliyuncs.cloudauth.model.v20190307.DeepfakeDetectResponse.ResultObject;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeepfakeDetectResponseUnmarshaller {

	public static DeepfakeDetectResponse unmarshall(DeepfakeDetectResponse deepfakeDetectResponse, UnmarshallerContext _ctx) {
		
		deepfakeDetectResponse.setRequestId(_ctx.stringValue("DeepfakeDetectResponse.RequestId"));
		deepfakeDetectResponse.setCode(_ctx.stringValue("DeepfakeDetectResponse.Code"));
		deepfakeDetectResponse.setMessage(_ctx.stringValue("DeepfakeDetectResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setResult(_ctx.stringValue("DeepfakeDetectResponse.ResultObject.Result"));
		resultObject.setRiskTag(_ctx.stringValue("DeepfakeDetectResponse.ResultObject.RiskTag"));
		resultObject.setRiskScore(_ctx.mapValue("DeepfakeDetectResponse.ResultObject.RiskScore"));
		deepfakeDetectResponse.setResultObject(resultObject);
	 
	 	return deepfakeDetectResponse;
	}
}