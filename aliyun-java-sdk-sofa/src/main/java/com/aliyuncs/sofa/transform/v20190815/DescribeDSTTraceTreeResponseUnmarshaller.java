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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeDSTTraceTreeResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTraceTreeResponse.TreeItemsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeDSTTraceTreeResponse.TreeItemsItem.DetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDSTTraceTreeResponseUnmarshaller {

	public static DescribeDSTTraceTreeResponse unmarshall(DescribeDSTTraceTreeResponse describeDSTTraceTreeResponse, UnmarshallerContext _ctx) {
		
		describeDSTTraceTreeResponse.setRequestId(_ctx.stringValue("DescribeDSTTraceTreeResponse.RequestId"));
		describeDSTTraceTreeResponse.setResultCode(_ctx.stringValue("DescribeDSTTraceTreeResponse.ResultCode"));
		describeDSTTraceTreeResponse.setResultMessage(_ctx.stringValue("DescribeDSTTraceTreeResponse.ResultMessage"));

		List<TreeItemsItem> treeItems = new ArrayList<TreeItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDSTTraceTreeResponse.TreeItems.Length"); i++) {
			TreeItemsItem treeItemsItem = new TreeItemsItem();
			treeItemsItem.setApp(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].App"));
			treeItemsItem.setBasicInfo(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].BasicInfo"));
			treeItemsItem.setDuration(_ctx.longValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].Duration"));
			treeItemsItem.setHasLog(_ctx.booleanValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].HasLog"));
			treeItemsItem.setIp(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].Ip"));
			treeItemsItem.setItemId(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].ItemId"));
			treeItemsItem.setItemParentId(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].ItemParentId"));
			treeItemsItem.setResult(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].Result"));
			treeItemsItem.setSpanId(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].SpanId"));
			treeItemsItem.setStartTime(_ctx.longValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].StartTime"));
			treeItemsItem.setType(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].Type"));

			List<DetailsItem> details = new ArrayList<DetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].Details.Length"); j++) {
				DetailsItem detailsItem = new DetailsItem();
				detailsItem.setKey(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].Details["+ j +"].Key"));
				detailsItem.setValue(_ctx.stringValue("DescribeDSTTraceTreeResponse.TreeItems["+ i +"].Details["+ j +"].Value"));

				details.add(detailsItem);
			}
			treeItemsItem.setDetails(details);

			treeItems.add(treeItemsItem);
		}
		describeDSTTraceTreeResponse.setTreeItems(treeItems);
	 
	 	return describeDSTTraceTreeResponse;
	}
}