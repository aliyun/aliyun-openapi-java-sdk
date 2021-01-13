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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DescribeWhitelistResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeWhitelistResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhitelistResponseUnmarshaller {

	public static DescribeWhitelistResponse unmarshall(DescribeWhitelistResponse describeWhitelistResponse, UnmarshallerContext _ctx) {
		
		describeWhitelistResponse.setRequestId(_ctx.stringValue("DescribeWhitelistResponse.RequestId"));
		describeWhitelistResponse.setTotalCount(_ctx.integerValue("DescribeWhitelistResponse.TotalCount"));
		describeWhitelistResponse.setCurrentPage(_ctx.integerValue("DescribeWhitelistResponse.CurrentPage"));
		describeWhitelistResponse.setPageSize(_ctx.integerValue("DescribeWhitelistResponse.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWhitelistResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setId(_ctx.longValue("DescribeWhitelistResponse.Items["+ i +"].Id"));
			item.setUid(_ctx.longValue("DescribeWhitelistResponse.Items["+ i +"].Uid"));
			item.setBizType(_ctx.stringValue("DescribeWhitelistResponse.Items["+ i +"].BizType"));
			item.setStartDate(_ctx.longValue("DescribeWhitelistResponse.Items["+ i +"].StartDate"));
			item.setEndDate(_ctx.longValue("DescribeWhitelistResponse.Items["+ i +"].EndDate"));
			item.setIdCardNum(_ctx.stringValue("DescribeWhitelistResponse.Items["+ i +"].IdCardNum"));
			item.setBizId(_ctx.stringValue("DescribeWhitelistResponse.Items["+ i +"].BizId"));
			item.setValid(_ctx.integerValue("DescribeWhitelistResponse.Items["+ i +"].Valid"));
			item.setGmtCreate(_ctx.longValue("DescribeWhitelistResponse.Items["+ i +"].GmtCreate"));
			item.setGmtModified(_ctx.longValue("DescribeWhitelistResponse.Items["+ i +"].GmtModified"));

			items.add(item);
		}
		describeWhitelistResponse.setItems(items);
	 
	 	return describeWhitelistResponse;
	}
}