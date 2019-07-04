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

import com.aliyuncs.green.model.v20170823.DescribeWebsiteInstanceResponse;
import com.aliyuncs.green.model.v20170823.DescribeWebsiteInstanceResponse.WebsiteInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebsiteInstanceResponseUnmarshaller {

	public static DescribeWebsiteInstanceResponse unmarshall(DescribeWebsiteInstanceResponse describeWebsiteInstanceResponse, UnmarshallerContext _ctx) {
		
		describeWebsiteInstanceResponse.setRequestId(_ctx.stringValue("DescribeWebsiteInstanceResponse.RequestId"));
		describeWebsiteInstanceResponse.setPageSize(_ctx.integerValue("DescribeWebsiteInstanceResponse.PageSize"));
		describeWebsiteInstanceResponse.setCurrentPage(_ctx.integerValue("DescribeWebsiteInstanceResponse.CurrentPage"));
		describeWebsiteInstanceResponse.setTotalCount(_ctx.integerValue("DescribeWebsiteInstanceResponse.TotalCount"));

		List<WebsiteInstance> websiteInstanceList = new ArrayList<WebsiteInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList.Length"); i++) {
			WebsiteInstance websiteInstance = new WebsiteInstance();
			websiteInstance.setProtocol(_ctx.stringValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].Protocol"));
			websiteInstance.setInstanceId(_ctx.stringValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].InstanceId"));
			websiteInstance.setWebsiteScanInterval(_ctx.integerValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].WebsiteScanInterval"));
			websiteInstance.setDomain(_ctx.stringValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].Domain"));
			websiteInstance.setBuyTime(_ctx.stringValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].BuyTime"));
			websiteInstance.setIndexPageScanInterval(_ctx.integerValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].IndexPageScanInterval"));
			websiteInstance.setIndexPage(_ctx.stringValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].IndexPage"));
			websiteInstance.setExpiredTime(_ctx.stringValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].ExpiredTime"));
			websiteInstance.setStatus(_ctx.stringValue("DescribeWebsiteInstanceResponse.WebsiteInstanceList["+ i +"].Status"));

			websiteInstanceList.add(websiteInstance);
		}
		describeWebsiteInstanceResponse.setWebsiteInstanceList(websiteInstanceList);
	 
	 	return describeWebsiteInstanceResponse;
	}
}