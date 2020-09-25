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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribePropertyCountResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyCountResponseUnmarshaller {

	public static DescribePropertyCountResponse unmarshall(DescribePropertyCountResponse describePropertyCountResponse, UnmarshallerContext _ctx) {
		
		describePropertyCountResponse.setRequestId(_ctx.stringValue("DescribePropertyCountResponse.RequestId"));
		describePropertyCountResponse.setPort(_ctx.integerValue("DescribePropertyCountResponse.Port"));
		describePropertyCountResponse.setProcess(_ctx.integerValue("DescribePropertyCountResponse.Process"));
		describePropertyCountResponse.setSoftware(_ctx.integerValue("DescribePropertyCountResponse.Software"));
		describePropertyCountResponse.setUser(_ctx.integerValue("DescribePropertyCountResponse.User"));
		describePropertyCountResponse.setCron(_ctx.integerValue("DescribePropertyCountResponse.Cron"));
		describePropertyCountResponse.setSca(_ctx.integerValue("DescribePropertyCountResponse.Sca"));
		describePropertyCountResponse.setAutoRun(_ctx.integerValue("DescribePropertyCountResponse.AutoRun"));
	 
	 	return describePropertyCountResponse;
	}
}