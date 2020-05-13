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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeProjectAppSecurityResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeProjectAppSecurityResponse.ProjectAppSecurity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProjectAppSecurityResponseUnmarshaller {

	public static DescribeProjectAppSecurityResponse unmarshall(DescribeProjectAppSecurityResponse describeProjectAppSecurityResponse, UnmarshallerContext _ctx) {
		
		describeProjectAppSecurityResponse.setRequestId(_ctx.stringValue("DescribeProjectAppSecurityResponse.RequestId"));

		ProjectAppSecurity projectAppSecurity = new ProjectAppSecurity();
		projectAppSecurity.setId(_ctx.longValue("DescribeProjectAppSecurityResponse.ProjectAppSecurity.Id"));
		projectAppSecurity.setAppId(_ctx.stringValue("DescribeProjectAppSecurityResponse.ProjectAppSecurity.AppId"));
		projectAppSecurity.setAppKey(_ctx.stringValue("DescribeProjectAppSecurityResponse.ProjectAppSecurity.AppKey"));
		projectAppSecurity.setAppSecret(_ctx.stringValue("DescribeProjectAppSecurityResponse.ProjectAppSecurity.AppSecret"));
		projectAppSecurity.setGmtCreate(_ctx.longValue("DescribeProjectAppSecurityResponse.ProjectAppSecurity.GmtCreate"));
		projectAppSecurity.setGmtModified(_ctx.longValue("DescribeProjectAppSecurityResponse.ProjectAppSecurity.GmtModified"));
		describeProjectAppSecurityResponse.setProjectAppSecurity(projectAppSecurity);
	 
	 	return describeProjectAppSecurityResponse;
	}
}