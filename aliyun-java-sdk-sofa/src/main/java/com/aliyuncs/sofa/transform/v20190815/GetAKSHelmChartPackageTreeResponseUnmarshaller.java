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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetAKSHelmChartPackageTreeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAKSHelmChartPackageTreeResponseUnmarshaller {

	public static GetAKSHelmChartPackageTreeResponse unmarshall(GetAKSHelmChartPackageTreeResponse getAKSHelmChartPackageTreeResponse, UnmarshallerContext _ctx) {
		
		getAKSHelmChartPackageTreeResponse.setRequestId(_ctx.stringValue("GetAKSHelmChartPackageTreeResponse.RequestId"));
		getAKSHelmChartPackageTreeResponse.setResultCode(_ctx.stringValue("GetAKSHelmChartPackageTreeResponse.ResultCode"));
		getAKSHelmChartPackageTreeResponse.setResultMessage(_ctx.stringValue("GetAKSHelmChartPackageTreeResponse.ResultMessage"));

		List<String> chartPackageTree = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAKSHelmChartPackageTreeResponse.ChartPackageTree.Length"); i++) {
			chartPackageTree.add(_ctx.stringValue("GetAKSHelmChartPackageTreeResponse.ChartPackageTree["+ i +"]"));
		}
		getAKSHelmChartPackageTreeResponse.setChartPackageTree(chartPackageTree);
	 
	 	return getAKSHelmChartPackageTreeResponse;
	}
}