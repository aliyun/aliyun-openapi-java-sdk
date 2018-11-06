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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeSuspiciousOverallConfigResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeSuspiciousOverallConfigResponse.OverallConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspiciousOverallConfigResponseUnmarshaller {

	public static DescribeSuspiciousOverallConfigResponse unmarshall(DescribeSuspiciousOverallConfigResponse describeSuspiciousOverallConfigResponse, UnmarshallerContext context) {
		
		describeSuspiciousOverallConfigResponse.setRequestId(context.stringValue("DescribeSuspiciousOverallConfigResponse.RequestId"));

		OverallConfig overallConfig = new OverallConfig();
		overallConfig.setType(context.stringValue("DescribeSuspiciousOverallConfigResponse.OverallConfig.Type"));
		overallConfig.setConfig(context.stringValue("DescribeSuspiciousOverallConfigResponse.OverallConfig.Config"));
		describeSuspiciousOverallConfigResponse.setOverallConfig(overallConfig);
	 
	 	return describeSuspiciousOverallConfigResponse;
	}
}