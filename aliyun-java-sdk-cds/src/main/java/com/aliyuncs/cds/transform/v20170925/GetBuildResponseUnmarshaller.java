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
package com.aliyuncs.cds.transform.v20170925;

import com.aliyuncs.cds.model.v20170925.GetBuildResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBuildResponseUnmarshaller {

	public static GetBuildResponse unmarshall(GetBuildResponse getBuildResponse, UnmarshallerContext context) {
		
		getBuildResponse.setRequestId(context.stringValue("GetBuildResponse.RequestId"));
		getBuildResponse.setBuildEnv(context.stringValue("GetBuildResponse.BuildEnv"));
		getBuildResponse.setBuildNumber(context.integerValue("GetBuildResponse.BuildNumber"));
		getBuildResponse.setDuration(context.integerValue("GetBuildResponse.Duration"));
		getBuildResponse.setLog(context.stringValue("GetBuildResponse.Log"));
		getBuildResponse.setStartTime(context.longValue("GetBuildResponse.StartTime"));
	 
	 	return getBuildResponse;
	}
}