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

import com.aliyuncs.sophonsoar.model.v20220728.DescribeLatestRecordSchemaResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeLatestRecordSchemaResponse.PlaybookNodeSchema;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.NodeSchemaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLatestRecordSchemaResponseUnmarshaller {

	public static DescribeLatestRecordSchemaResponse unmarshall(DescribeLatestRecordSchemaResponse describeLatestRecordSchemaResponse, UnmarshallerContext _ctx) {
		
		describeLatestRecordSchemaResponse.setRequestId(_ctx.stringValue("DescribeLatestRecordSchemaResponse.RequestId"));

		PlaybookNodeSchema playbookNodeSchema = new PlaybookNodeSchema();
		playbookNodeSchema.setIsFinished(_ctx.booleanValue("DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.IsFinished"));

		List<NodeSchemaItem> nodeSchema = new ArrayList<NodeSchemaItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.NodeSchema.Length"); i++) {
			NodeSchemaItem nodeSchemaItem = new NodeSchemaItem();
			nodeSchemaItem.setNodeName(_ctx.stringValue("DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.NodeSchema["+ i +"].NodeName"));
			nodeSchemaItem.setComponentName(_ctx.stringValue("DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.NodeSchema["+ i +"].ComponentName"));
			nodeSchemaItem.setActionName(_ctx.stringValue("DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.NodeSchema["+ i +"].ActionName"));

			List<String> outputFields = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.NodeSchema["+ i +"].OutputFields.Length"); j++) {
				outputFields.add(_ctx.stringValue("DescribeLatestRecordSchemaResponse.PlaybookNodeSchema.NodeSchema["+ i +"].OutputFields["+ j +"]"));
			}
			nodeSchemaItem.setOutputFields(outputFields);

			nodeSchema.add(nodeSchemaItem);
		}
		playbookNodeSchema.setNodeSchema(nodeSchema);
		describeLatestRecordSchemaResponse.setPlaybookNodeSchema(playbookNodeSchema);
	 
	 	return describeLatestRecordSchemaResponse;
	}
}