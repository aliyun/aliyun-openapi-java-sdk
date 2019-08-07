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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeApplicationsResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeApplicationsResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationsResponseUnmarshaller {

	public static DescribeApplicationsResponse unmarshall(DescribeApplicationsResponse describeApplicationsResponse, UnmarshallerContext _ctx) {
		
		describeApplicationsResponse.setRequestId(_ctx.stringValue("DescribeApplicationsResponse.RequestId"));
		describeApplicationsResponse.setCode(_ctx.stringValue("DescribeApplicationsResponse.Code"));
		describeApplicationsResponse.setMessage(_ctx.stringValue("DescribeApplicationsResponse.Message"));
		describeApplicationsResponse.setPageNumber(_ctx.integerValue("DescribeApplicationsResponse.PageNumber"));
		describeApplicationsResponse.setPageSize(_ctx.integerValue("DescribeApplicationsResponse.PageSize"));
		describeApplicationsResponse.setTotalCount(_ctx.integerValue("DescribeApplicationsResponse.TotalCount"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationsResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setAppId(_ctx.stringValue("DescribeApplicationsResponse.Applications["+ i +"].AppId"));
			application.setAppName(_ctx.stringValue("DescribeApplicationsResponse.Applications["+ i +"].AppName"));
			application.setAppDescription(_ctx.stringValue("DescribeApplicationsResponse.Applications["+ i +"].AppDescription"));
			application.setCategoryName(_ctx.stringValue("DescribeApplicationsResponse.Applications["+ i +"].CategoryName"));
			application.setCreateUsername(_ctx.stringValue("DescribeApplicationsResponse.Applications["+ i +"].CreateUsername"));
			application.setUpdateUsername(_ctx.stringValue("DescribeApplicationsResponse.Applications["+ i +"].UpdateUsername"));
			application.setCreateTime(_ctx.longValue("DescribeApplicationsResponse.Applications["+ i +"].CreateTime"));
			application.setUpdateTime(_ctx.longValue("DescribeApplicationsResponse.Applications["+ i +"].UpdateTime"));
			application.setRunningEnvs(_ctx.integerValue("DescribeApplicationsResponse.Applications["+ i +"].RunningEnvs"));
			application.setTotalEnvs(_ctx.integerValue("DescribeApplicationsResponse.Applications["+ i +"].TotalEnvs"));
			application.setTerminatedEnvs(_ctx.integerValue("DescribeApplicationsResponse.Applications["+ i +"].TerminatedEnvs"));

			applications.add(application);
		}
		describeApplicationsResponse.setApplications(applications);
	 
	 	return describeApplicationsResponse;
	}
}