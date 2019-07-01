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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeWebsiteInstanceIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebsiteInstanceIdResponseUnmarshaller {

	public static DescribeWebsiteInstanceIdResponse unmarshall(DescribeWebsiteInstanceIdResponse describeWebsiteInstanceIdResponse, UnmarshallerContext context) {
		
		describeWebsiteInstanceIdResponse.setRequestId(context.stringValue("DescribeWebsiteInstanceIdResponse.RequestId"));
		describeWebsiteInstanceIdResponse.setTotalCount(context.integerValue("DescribeWebsiteInstanceIdResponse.TotalCount"));

		List<String> websiteInstanceIdList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeWebsiteInstanceIdResponse.WebsiteInstanceIdList.Length"); i++) {
			websiteInstanceIdList.add(context.stringValue("DescribeWebsiteInstanceIdResponse.WebsiteInstanceIdList["+ i +"]"));
		}
		describeWebsiteInstanceIdResponse.setWebsiteInstanceIdList(websiteInstanceIdList);
	 
	 	return describeWebsiteInstanceIdResponse;
	}
}