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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cds.model.v20170925.GetBuildsResponse;
import com.aliyuncs.cds.model.v20170925.GetBuildsResponse.Build;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBuildsResponseUnmarshaller {

	public static GetBuildsResponse unmarshall(GetBuildsResponse getBuildsResponse, UnmarshallerContext context) {
		
		getBuildsResponse.setRequestId(context.stringValue("GetBuildsResponse.RequestId"));

		List<Build> builds = new ArrayList<Build>();
		for (int i = 0; i < context.lengthValue("GetBuildsResponse.Builds.Length"); i++) {
			Build build = new Build();
			build.setBuildNumber(context.integerValue("GetBuildsResponse.Builds["+ i +"].BuildNumber"));
			build.setDuration(context.integerValue("GetBuildsResponse.Builds["+ i +"].Duration"));
			build.setStartTime(context.longValue("GetBuildsResponse.Builds["+ i +"].StartTime"));
			build.setLog(context.stringValue("GetBuildsResponse.Builds["+ i +"].Log"));
			build.setBuildEnv(context.stringValue("GetBuildsResponse.Builds["+ i +"].BuildEnv"));

			builds.add(build);
		}
		getBuildsResponse.setBuilds(builds);
	 
	 	return getBuildsResponse;
	}
}