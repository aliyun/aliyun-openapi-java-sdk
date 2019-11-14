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

package com.aliyuncs.fss.transform.v20190125;

import com.aliyuncs.fss.model.v20190125.QuerySoftwareVulnResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySoftwareVulnResponseUnmarshaller {

	public static QuerySoftwareVulnResponse unmarshall(QuerySoftwareVulnResponse querySoftwareVulnResponse, UnmarshallerContext _ctx) {
		
		querySoftwareVulnResponse.setRequestId(_ctx.stringValue("QuerySoftwareVulnResponse.RequestId"));
		querySoftwareVulnResponse.setVulns(_ctx.stringValue("QuerySoftwareVulnResponse.Vulns"));
		querySoftwareVulnResponse.setFssCode(_ctx.integerValue("QuerySoftwareVulnResponse.FssCode"));
		querySoftwareVulnResponse.setFssMessage(_ctx.stringValue("QuerySoftwareVulnResponse.FssMessage"));
	 
	 	return querySoftwareVulnResponse;
	}
}