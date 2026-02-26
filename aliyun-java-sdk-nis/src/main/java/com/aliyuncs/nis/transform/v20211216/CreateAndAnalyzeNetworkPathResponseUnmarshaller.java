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

import com.aliyuncs.nis.model.v20211216.CreateAndAnalyzeNetworkPathResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAndAnalyzeNetworkPathResponseUnmarshaller {

	public static CreateAndAnalyzeNetworkPathResponse unmarshall(CreateAndAnalyzeNetworkPathResponse createAndAnalyzeNetworkPathResponse, UnmarshallerContext _ctx) {
		
		createAndAnalyzeNetworkPathResponse.setRequestId(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.RequestId"));
		createAndAnalyzeNetworkPathResponse.setNetworkReachableAnalysisId(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.NetworkReachableAnalysisId"));
		createAndAnalyzeNetworkPathResponse.setSourceId(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.SourceId"));
		createAndAnalyzeNetworkPathResponse.setTargetId(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.TargetId"));
		createAndAnalyzeNetworkPathResponse.setSourceType(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.SourceType"));
		createAndAnalyzeNetworkPathResponse.setTargetType(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.TargetType"));
		createAndAnalyzeNetworkPathResponse.setSourcePort(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.SourcePort"));
		createAndAnalyzeNetworkPathResponse.setTargetPort(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.TargetPort"));
		createAndAnalyzeNetworkPathResponse.setBizProtocol(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.Protocol"));
		createAndAnalyzeNetworkPathResponse.setSourceIpAddress(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.SourceIpAddress"));
		createAndAnalyzeNetworkPathResponse.setTargetIpAddress(_ctx.stringValue("CreateAndAnalyzeNetworkPathResponse.TargetIpAddress"));
	 
	 	return createAndAnalyzeNetworkPathResponse;
	}
}