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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.DescribeSnLabelCountsResponse;
import com.aliyuncs.wyota.model.v20210420.DescribeSnLabelCountsResponse.Data;
import com.aliyuncs.wyota.model.v20210420.DescribeSnLabelCountsResponse.Data.LabelCountDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnLabelCountsResponseUnmarshaller {

	public static DescribeSnLabelCountsResponse unmarshall(DescribeSnLabelCountsResponse describeSnLabelCountsResponse, UnmarshallerContext _ctx) {
		
		describeSnLabelCountsResponse.setRequestId(_ctx.stringValue("DescribeSnLabelCountsResponse.RequestId"));
		describeSnLabelCountsResponse.setMessage(_ctx.stringValue("DescribeSnLabelCountsResponse.Message"));
		describeSnLabelCountsResponse.setCode(_ctx.stringValue("DescribeSnLabelCountsResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("DescribeSnLabelCountsResponse.Data.TotalCount"));

		List<LabelCountDTOListItem> labelCountDTOList = new ArrayList<LabelCountDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSnLabelCountsResponse.Data.LabelCountDTOList.Length"); i++) {
			LabelCountDTOListItem labelCountDTOListItem = new LabelCountDTOListItem();
			labelCountDTOListItem.setLabel(_ctx.stringValue("DescribeSnLabelCountsResponse.Data.LabelCountDTOList["+ i +"].Label"));
			labelCountDTOListItem.setCount(_ctx.stringValue("DescribeSnLabelCountsResponse.Data.LabelCountDTOList["+ i +"].Count"));

			labelCountDTOList.add(labelCountDTOListItem);
		}
		data.setLabelCountDTOList(labelCountDTOList);
		describeSnLabelCountsResponse.setData(data);
	 
	 	return describeSnLabelCountsResponse;
	}
}