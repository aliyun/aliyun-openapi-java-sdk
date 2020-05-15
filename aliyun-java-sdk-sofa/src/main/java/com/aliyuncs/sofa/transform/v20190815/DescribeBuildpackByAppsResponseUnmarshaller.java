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

import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackByAppsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBuildpackByAppsResponseUnmarshaller {

	public static DescribeBuildpackByAppsResponse unmarshall(DescribeBuildpackByAppsResponse describeBuildpackByAppsResponse, UnmarshallerContext _ctx) {
		
		describeBuildpackByAppsResponse.setRequestId(_ctx.stringValue("DescribeBuildpackByAppsResponse.RequestId"));
		describeBuildpackByAppsResponse.setResultCode(_ctx.stringValue("DescribeBuildpackByAppsResponse.ResultCode"));
		describeBuildpackByAppsResponse.setResultMessage(_ctx.stringValue("DescribeBuildpackByAppsResponse.ResultMessage"));
		describeBuildpackByAppsResponse.setBuildpackv2adapter(_ctx.stringValue("DescribeBuildpackByAppsResponse.Buildpackv2adapter"));
	 
	 	return describeBuildpackByAppsResponse;
	}
}