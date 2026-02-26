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

package com.aliyuncs.nis.transform.v20211216;

import com.aliyuncs.nis.model.v20211216.CreateNetworkReachableAnalysisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNetworkReachableAnalysisResponseUnmarshaller {

	public static CreateNetworkReachableAnalysisResponse unmarshall(CreateNetworkReachableAnalysisResponse createNetworkReachableAnalysisResponse, UnmarshallerContext _ctx) {
		
		createNetworkReachableAnalysisResponse.setRequestId(_ctx.stringValue("CreateNetworkReachableAnalysisResponse.RequestId"));
		createNetworkReachableAnalysisResponse.setNetworkReachableAnalysisId(_ctx.stringValue("CreateNetworkReachableAnalysisResponse.NetworkReachableAnalysisId"));
	 
	 	return createNetworkReachableAnalysisResponse;
	}
}