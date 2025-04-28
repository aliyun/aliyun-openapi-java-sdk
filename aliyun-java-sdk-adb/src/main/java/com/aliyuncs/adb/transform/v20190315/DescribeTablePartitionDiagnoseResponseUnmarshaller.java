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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeTablePartitionDiagnoseResponse;
import com.aliyuncs.adb.model.v20190315.DescribeTablePartitionDiagnoseResponse.DetectionItemsItem;
import com.aliyuncs.adb.model.v20190315.DescribeTablePartitionDiagnoseResponse.TablePartitionDiagnose;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTablePartitionDiagnoseResponseUnmarshaller {

	public static DescribeTablePartitionDiagnoseResponse unmarshall(DescribeTablePartitionDiagnoseResponse describeTablePartitionDiagnoseResponse, UnmarshallerContext _ctx) {
		
		describeTablePartitionDiagnoseResponse.setRequestId(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.RequestId"));
		describeTablePartitionDiagnoseResponse.setTotalCount(_ctx.integerValue("DescribeTablePartitionDiagnoseResponse.TotalCount"));
		describeTablePartitionDiagnoseResponse.setPageSize(_ctx.integerValue("DescribeTablePartitionDiagnoseResponse.PageSize"));
		describeTablePartitionDiagnoseResponse.setPageNumber(_ctx.integerValue("DescribeTablePartitionDiagnoseResponse.PageNumber"));
		describeTablePartitionDiagnoseResponse.setDBClusterId(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.DBClusterId"));
		describeTablePartitionDiagnoseResponse.setSuggestMaxRecordsPerPartition(_ctx.longValue("DescribeTablePartitionDiagnoseResponse.SuggestMaxRecordsPerPartition"));
		describeTablePartitionDiagnoseResponse.setSuggestMinRecordsPerPartition(_ctx.longValue("DescribeTablePartitionDiagnoseResponse.SuggestMinRecordsPerPartition"));

		List<TablePartitionDiagnose> items = new ArrayList<TablePartitionDiagnose>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTablePartitionDiagnoseResponse.Items.Length"); i++) {
			TablePartitionDiagnose tablePartitionDiagnose = new TablePartitionDiagnose();
			tablePartitionDiagnose.setTableName(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.Items["+ i +"].TableName"));
			tablePartitionDiagnose.setPartitionDetail(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.Items["+ i +"].PartitionDetail"));
			tablePartitionDiagnose.setSchemaName(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.Items["+ i +"].SchemaName"));
			tablePartitionDiagnose.setPartitionNumber(_ctx.integerValue("DescribeTablePartitionDiagnoseResponse.Items["+ i +"].PartitionNumber"));
			tablePartitionDiagnose.setSpaceRatio(_ctx.doubleValue("DescribeTablePartitionDiagnoseResponse.Items["+ i +"].SpaceRatio"));
			tablePartitionDiagnose.setTotalSize(_ctx.longValue("DescribeTablePartitionDiagnoseResponse.Items["+ i +"].TotalSize"));

			items.add(tablePartitionDiagnose);
		}
		describeTablePartitionDiagnoseResponse.setItems(items);

		List<DetectionItemsItem> detectionItems = new ArrayList<DetectionItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTablePartitionDiagnoseResponse.DetectionItems.Length"); i++) {
			DetectionItemsItem detectionItemsItem = new DetectionItemsItem();
			detectionItemsItem.setName(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.DetectionItems["+ i +"].Name"));
			detectionItemsItem.setMessage(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.DetectionItems["+ i +"].Message"));
			detectionItemsItem.setStatus(_ctx.stringValue("DescribeTablePartitionDiagnoseResponse.DetectionItems["+ i +"].Status"));

			detectionItems.add(detectionItemsItem);
		}
		describeTablePartitionDiagnoseResponse.setDetectionItems(detectionItems);
	 
	 	return describeTablePartitionDiagnoseResponse;
	}
}