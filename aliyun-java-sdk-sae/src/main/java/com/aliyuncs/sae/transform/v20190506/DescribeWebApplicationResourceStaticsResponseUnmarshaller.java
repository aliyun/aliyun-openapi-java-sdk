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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResourceStaticsResponse;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResourceStaticsResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeWebApplicationResourceStaticsResponse.Data.WebAppStaticsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebApplicationResourceStaticsResponseUnmarshaller {

	public static DescribeWebApplicationResourceStaticsResponse unmarshall(DescribeWebApplicationResourceStaticsResponse describeWebApplicationResourceStaticsResponse, UnmarshallerContext _ctx) {
		
		describeWebApplicationResourceStaticsResponse.setRequestId(_ctx.stringValue("DescribeWebApplicationResourceStaticsResponse.RequestId"));
		describeWebApplicationResourceStaticsResponse.setCode(_ctx.integerValue("DescribeWebApplicationResourceStaticsResponse.Code"));
		describeWebApplicationResourceStaticsResponse.setMessage(_ctx.stringValue("DescribeWebApplicationResourceStaticsResponse.Message"));
		describeWebApplicationResourceStaticsResponse.setSuccess(_ctx.booleanValue("DescribeWebApplicationResourceStaticsResponse.Success"));

		Data data = new Data();
		data.setLength(_ctx.integerValue("DescribeWebApplicationResourceStaticsResponse.Data.Length"));

		List<WebAppStaticsItem> webAppStatics = new ArrayList<WebAppStaticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebApplicationResourceStaticsResponse.Data.WebAppStatics.Length"); i++) {
			WebAppStaticsItem webAppStaticsItem = new WebAppStaticsItem();
			webAppStaticsItem.setCpuUsage(_ctx.longValue("DescribeWebApplicationResourceStaticsResponse.Data.WebAppStatics["+ i +"].CpuUsage"));
			webAppStaticsItem.setInvocations(_ctx.longValue("DescribeWebApplicationResourceStaticsResponse.Data.WebAppStatics["+ i +"].Invocations"));
			webAppStaticsItem.setInternetTrafficOut(_ctx.longValue("DescribeWebApplicationResourceStaticsResponse.Data.WebAppStatics["+ i +"].InternetTrafficOut"));
			webAppStaticsItem.setMemoryUsage(_ctx.longValue("DescribeWebApplicationResourceStaticsResponse.Data.WebAppStatics["+ i +"].MemoryUsage"));

			webAppStatics.add(webAppStaticsItem);
		}
		data.setWebAppStatics(webAppStatics);
		describeWebApplicationResourceStaticsResponse.setData(data);
	 
	 	return describeWebApplicationResourceStaticsResponse;
	}
}