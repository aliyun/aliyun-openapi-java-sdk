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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineItemListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineItemListResponse.BaselineItemInfosItem;
import com.aliyuncs.sas.model.v20181203.DescribeImageBaselineItemListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageBaselineItemListResponseUnmarshaller {

	public static DescribeImageBaselineItemListResponse unmarshall(DescribeImageBaselineItemListResponse describeImageBaselineItemListResponse, UnmarshallerContext _ctx) {
		
		describeImageBaselineItemListResponse.setRequestId(_ctx.stringValue("DescribeImageBaselineItemListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageBaselineItemListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageBaselineItemListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageBaselineItemListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageBaselineItemListResponse.PageInfo.Count"));
		describeImageBaselineItemListResponse.setPageInfo(pageInfo);

		List<BaselineItemInfosItem> baselineItemInfos = new ArrayList<BaselineItemInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageBaselineItemListResponse.BaselineItemInfos.Length"); i++) {
			BaselineItemInfosItem baselineItemInfosItem = new BaselineItemInfosItem();
			baselineItemInfosItem.setStatus(_ctx.integerValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].Status"));
			baselineItemInfosItem.setWhiteList(_ctx.integerValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].WhiteList"));
			baselineItemInfosItem.setBaselineNameKey(_ctx.stringValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].BaselineNameKey"));
			baselineItemInfosItem.setBaselineItemAlias(_ctx.stringValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].BaselineItemAlias"));
			baselineItemInfosItem.setBaselineClassKey(_ctx.stringValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].BaselineClassKey"));
			baselineItemInfosItem.setBaselineClassAlias(_ctx.stringValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].BaselineClassAlias"));
			baselineItemInfosItem.setBaselineNameAlias(_ctx.stringValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].BaselineNameAlias"));
			baselineItemInfosItem.setBaselineItemKey(_ctx.stringValue("DescribeImageBaselineItemListResponse.BaselineItemInfos["+ i +"].BaselineItemKey"));

			baselineItemInfos.add(baselineItemInfosItem);
		}
		describeImageBaselineItemListResponse.setBaselineItemInfos(baselineItemInfos);
	 
	 	return describeImageBaselineItemListResponse;
	}
}