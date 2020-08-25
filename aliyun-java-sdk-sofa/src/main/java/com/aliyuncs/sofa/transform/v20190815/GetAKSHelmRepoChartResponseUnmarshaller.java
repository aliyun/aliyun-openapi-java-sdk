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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetAKSHelmRepoChartResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSHelmRepoChartResponseUnmarshaller {

	public static GetAKSHelmRepoChartResponse unmarshall(GetAKSHelmRepoChartResponse getAKSHelmRepoChartResponse, UnmarshallerContext _ctx) {
		
		getAKSHelmRepoChartResponse.setRequestId(_ctx.stringValue("GetAKSHelmRepoChartResponse.RequestId"));
		getAKSHelmRepoChartResponse.setResultCode(_ctx.stringValue("GetAKSHelmRepoChartResponse.ResultCode"));
		getAKSHelmRepoChartResponse.setResultMessage(_ctx.stringValue("GetAKSHelmRepoChartResponse.ResultMessage"));
		getAKSHelmRepoChartResponse.setChartName(_ctx.stringValue("GetAKSHelmRepoChartResponse.ChartName"));
		getAKSHelmRepoChartResponse.setChartVersion(_ctx.stringValue("GetAKSHelmRepoChartResponse.ChartVersion"));
		getAKSHelmRepoChartResponse.setDescription(_ctx.stringValue("GetAKSHelmRepoChartResponse.Description"));
		getAKSHelmRepoChartResponse.setHelmRepoChartTree(_ctx.stringValue("GetAKSHelmRepoChartResponse.HelmRepoChartTree"));
		getAKSHelmRepoChartResponse.setIcon(_ctx.stringValue("GetAKSHelmRepoChartResponse.Icon"));
		getAKSHelmRepoChartResponse.setReadme(_ctx.stringValue("GetAKSHelmRepoChartResponse.Readme"));
	 
	 	return getAKSHelmRepoChartResponse;
	}
}