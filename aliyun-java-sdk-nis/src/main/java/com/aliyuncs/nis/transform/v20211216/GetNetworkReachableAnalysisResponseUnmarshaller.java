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

import com.aliyuncs.nis.model.v20211216.GetNetworkReachableAnalysisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNetworkReachableAnalysisResponseUnmarshaller {

	public static GetNetworkReachableAnalysisResponse unmarshall(GetNetworkReachableAnalysisResponse getNetworkReachableAnalysisResponse, UnmarshallerContext _ctx) {
		
		getNetworkReachableAnalysisResponse.setRequestId(_ctx.stringValue("GetNetworkReachableAnalysisResponse.RequestId"));
		getNetworkReachableAnalysisResponse.setNetworkPathId(_ctx.stringValue("GetNetworkReachableAnalysisResponse.NetworkPathId"));
		getNetworkReachableAnalysisResponse.setNetworkReachableAnalysisId(_ctx.stringValue("GetNetworkReachableAnalysisResponse.NetworkReachableAnalysisId"));
		getNetworkReachableAnalysisResponse.setNetworkReachableAnalysisStatus(_ctx.stringValue("GetNetworkReachableAnalysisResponse.NetworkReachableAnalysisStatus"));
		getNetworkReachableAnalysisResponse.setNetworkReachableAnalysisResult(_ctx.stringValue("GetNetworkReachableAnalysisResponse.NetworkReachableAnalysisResult"));
		getNetworkReachableAnalysisResponse.setReachable(_ctx.booleanValue("GetNetworkReachableAnalysisResponse.Reachable"));
		getNetworkReachableAnalysisResponse.setCreateTime(_ctx.stringValue("GetNetworkReachableAnalysisResponse.CreateTime"));
		getNetworkReachableAnalysisResponse.setAliUid(_ctx.longValue("GetNetworkReachableAnalysisResponse.AliUid"));
		getNetworkReachableAnalysisResponse.setNetworkPathParameter(_ctx.stringValue("GetNetworkReachableAnalysisResponse.NetworkPathParameter"));
	 
	 	return getNetworkReachableAnalysisResponse;
	}
}