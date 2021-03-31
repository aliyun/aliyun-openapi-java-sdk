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

import com.aliyuncs.green.model.v20170823.DescribeUserBizTypesResponse;
import com.aliyuncs.green.model.v20170823.DescribeUserBizTypesResponse.ImportItem;
import com.aliyuncs.green.model.v20170823.DescribeUserBizTypesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserBizTypesResponseUnmarshaller {

	public static DescribeUserBizTypesResponse unmarshall(DescribeUserBizTypesResponse describeUserBizTypesResponse, UnmarshallerContext _ctx) {
		
		describeUserBizTypesResponse.setRequestId(_ctx.stringValue("DescribeUserBizTypesResponse.RequestId"));

		List<Item> bizTypeList = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserBizTypesResponse.BizTypeList.Length"); i++) {
			Item item = new Item();
			item.setBizType(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeList["+ i +"].BizType"));
			item.setSourceBizType(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeList["+ i +"].SourceBizType"));
			item.setGray(_ctx.booleanValue("DescribeUserBizTypesResponse.BizTypeList["+ i +"].Gray"));
			item.setSource(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeList["+ i +"].Source"));
			item.setCiteTemplate(_ctx.booleanValue("DescribeUserBizTypesResponse.BizTypeList["+ i +"].CiteTemplate"));
			item.setIndustryInfo(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeList["+ i +"].IndustryInfo"));
			item.setDescription(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeList["+ i +"].Description"));

			bizTypeList.add(item);
		}
		describeUserBizTypesResponse.setBizTypeList(bizTypeList);

		List<ImportItem> bizTypeListImport = new ArrayList<ImportItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserBizTypesResponse.BizTypeListImport.Length"); i++) {
			ImportItem importItem = new ImportItem();
			importItem.setBizType(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeListImport["+ i +"].BizType"));
			importItem.setSourceBizType(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeListImport["+ i +"].SourceBizType"));
			importItem.setGray(_ctx.booleanValue("DescribeUserBizTypesResponse.BizTypeListImport["+ i +"].Gray"));
			importItem.setSource(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeListImport["+ i +"].Source"));
			importItem.setCiteTemplate(_ctx.booleanValue("DescribeUserBizTypesResponse.BizTypeListImport["+ i +"].CiteTemplate"));
			importItem.setIndustryInfo(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeListImport["+ i +"].IndustryInfo"));
			importItem.setDescription(_ctx.stringValue("DescribeUserBizTypesResponse.BizTypeListImport["+ i +"].Description"));

			bizTypeListImport.add(importItem);
		}
		describeUserBizTypesResponse.setBizTypeListImport(bizTypeListImport);
	 
	 	return describeUserBizTypesResponse;
	}
}