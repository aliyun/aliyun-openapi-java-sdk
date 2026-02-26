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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeNotifyTemplateListResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeNotifyTemplateListResponse.DataItem;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeNotifyTemplateListResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNotifyTemplateListResponseUnmarshaller {

	public static DescribeNotifyTemplateListResponse unmarshall(DescribeNotifyTemplateListResponse describeNotifyTemplateListResponse, UnmarshallerContext _ctx) {
		
		describeNotifyTemplateListResponse.setRequestId(_ctx.stringValue("DescribeNotifyTemplateListResponse.RequestId"));

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("DescribeNotifyTemplateListResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("DescribeNotifyTemplateListResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("DescribeNotifyTemplateListResponse.Page.PageSize"));
		describeNotifyTemplateListResponse.setPage(page);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNotifyTemplateListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTemplateName(_ctx.stringValue("DescribeNotifyTemplateListResponse.Data["+ i +"].TemplateName"));
			dataItem.setEventId(_ctx.stringValue("DescribeNotifyTemplateListResponse.Data["+ i +"].EventId"));
			dataItem.setSubject(_ctx.stringValue("DescribeNotifyTemplateListResponse.Data["+ i +"].Subject"));
			dataItem.setContent(_ctx.stringValue("DescribeNotifyTemplateListResponse.Data["+ i +"].Content"));
			dataItem.setParams(_ctx.stringValue("DescribeNotifyTemplateListResponse.Data["+ i +"].Params"));

			data.add(dataItem);
		}
		describeNotifyTemplateListResponse.setData(data);
	 
	 	return describeNotifyTemplateListResponse;
	}
}