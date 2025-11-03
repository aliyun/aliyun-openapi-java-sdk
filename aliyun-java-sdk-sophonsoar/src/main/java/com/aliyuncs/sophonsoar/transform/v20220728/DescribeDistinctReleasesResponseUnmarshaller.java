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

import com.aliyuncs.sophonsoar.model.v20220728.DescribeDistinctReleasesResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeDistinctReleasesResponse.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDistinctReleasesResponseUnmarshaller {

	public static DescribeDistinctReleasesResponse unmarshall(DescribeDistinctReleasesResponse describeDistinctReleasesResponse, UnmarshallerContext _ctx) {
		
		describeDistinctReleasesResponse.setRequestId(_ctx.stringValue("DescribeDistinctReleasesResponse.RequestId"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDistinctReleasesResponse.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setDescription(_ctx.stringValue("DescribeDistinctReleasesResponse.Records["+ i +"].Description"));
			recordsItem.setTaskflowMd5(_ctx.stringValue("DescribeDistinctReleasesResponse.Records["+ i +"].TaskflowMd5"));
			recordsItem.setFlowFlag(_ctx.integerValue("DescribeDistinctReleasesResponse.Records["+ i +"].FlowFlag"));
			recordsItem.setFlowTag(_ctx.integerValue("DescribeDistinctReleasesResponse.Records["+ i +"].FlowTag"));
			recordsItem.setTaskflowType(_ctx.stringValue("DescribeDistinctReleasesResponse.Records["+ i +"].TaskflowType"));

			records.add(recordsItem);
		}
		describeDistinctReleasesResponse.setRecords(records);
	 
	 	return describeDistinctReleasesResponse;
	}
}