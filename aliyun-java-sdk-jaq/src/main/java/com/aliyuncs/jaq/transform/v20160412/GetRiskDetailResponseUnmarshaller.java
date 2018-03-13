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
package com.aliyuncs.jaq.transform.v20160412;

import com.aliyuncs.jaq.model.v20160412.GetRiskDetailResponse;
import com.aliyuncs.jaq.model.v20160412.GetRiskDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRiskDetailResponseUnmarshaller {

	public static GetRiskDetailResponse unmarshall(GetRiskDetailResponse getRiskDetailResponse, UnmarshallerContext context) {
		
		getRiskDetailResponse.setErrorCode(context.integerValue("GetRiskDetailResponse.ErrorCode"));
		getRiskDetailResponse.setErrorMsg(context.stringValue("GetRiskDetailResponse.ErrorMsg"));

		Data data = new Data();
		data.setTaskStatus(context.integerValue("GetRiskDetailResponse.Data.TaskStatus"));
		data.setVulnInfo(context.stringValue("GetRiskDetailResponse.Data.VulnInfo"));
		data.setMalwareInfo(context.stringValue("GetRiskDetailResponse.Data.MalwareInfo"));
		data.setFakeInfo(context.stringValue("GetRiskDetailResponse.Data.FakeInfo"));
		data.setPluginInfo(context.stringValue("GetRiskDetailResponse.Data.PluginInfo"));
		getRiskDetailResponse.setData(data);
	 
	 	return getRiskDetailResponse;
	}
}