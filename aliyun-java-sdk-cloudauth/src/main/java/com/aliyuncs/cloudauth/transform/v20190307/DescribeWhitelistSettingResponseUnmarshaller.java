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

import com.aliyuncs.cloudauth.model.v20190307.DescribeWhitelistSettingResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeWhitelistSettingResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWhitelistSettingResponseUnmarshaller {

	public static DescribeWhitelistSettingResponse unmarshall(DescribeWhitelistSettingResponse describeWhitelistSettingResponse, UnmarshallerContext _ctx) {
		
		describeWhitelistSettingResponse.setRequestId(_ctx.stringValue("DescribeWhitelistSettingResponse.RequestId"));
		describeWhitelistSettingResponse.setTotalCount(_ctx.integerValue("DescribeWhitelistSettingResponse.TotalCount"));
		describeWhitelistSettingResponse.setCurrentPage(_ctx.integerValue("DescribeWhitelistSettingResponse.CurrentPage"));
		describeWhitelistSettingResponse.setPageSize(_ctx.integerValue("DescribeWhitelistSettingResponse.PageSize"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWhitelistSettingResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setId(_ctx.longValue("DescribeWhitelistSettingResponse.Items["+ i +"].Id"));
			item.setSceneId(_ctx.longValue("DescribeWhitelistSettingResponse.Items["+ i +"].SceneId"));
			item.setValidStartDate(_ctx.stringValue("DescribeWhitelistSettingResponse.Items["+ i +"].ValidStartDate"));
			item.setValidEndDate(_ctx.stringValue("DescribeWhitelistSettingResponse.Items["+ i +"].ValidEndDate"));
			item.setCertNo(_ctx.stringValue("DescribeWhitelistSettingResponse.Items["+ i +"].CertNo"));
			item.setCertifyId(_ctx.stringValue("DescribeWhitelistSettingResponse.Items["+ i +"].CertifyId"));
			item.setStatus(_ctx.stringValue("DescribeWhitelistSettingResponse.Items["+ i +"].Status"));
			item.setGmtCreate(_ctx.stringValue("DescribeWhitelistSettingResponse.Items["+ i +"].GmtCreate"));
			item.setGmtModified(_ctx.stringValue("DescribeWhitelistSettingResponse.Items["+ i +"].GmtModified"));

			items.add(item);
		}
		describeWhitelistSettingResponse.setItems(items);
	 
	 	return describeWhitelistSettingResponse;
	}
}