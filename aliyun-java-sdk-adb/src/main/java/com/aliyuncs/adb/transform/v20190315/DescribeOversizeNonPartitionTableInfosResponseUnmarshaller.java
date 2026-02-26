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

import com.aliyuncs.adb.model.v20190315.DescribeOversizeNonPartitionTableInfosResponse;
import com.aliyuncs.adb.model.v20190315.DescribeOversizeNonPartitionTableInfosResponse.DetectionItemsArray;
import com.aliyuncs.adb.model.v20190315.DescribeOversizeNonPartitionTableInfosResponse.OversizeNonPartitionTableInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOversizeNonPartitionTableInfosResponseUnmarshaller {

	public static DescribeOversizeNonPartitionTableInfosResponse unmarshall(DescribeOversizeNonPartitionTableInfosResponse describeOversizeNonPartitionTableInfosResponse, UnmarshallerContext _ctx) {
		
		describeOversizeNonPartitionTableInfosResponse.setRequestId(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.RequestId"));
		describeOversizeNonPartitionTableInfosResponse.setTotalCount(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.TotalCount"));
		describeOversizeNonPartitionTableInfosResponse.setPageNumber(_ctx.integerValue("DescribeOversizeNonPartitionTableInfosResponse.PageNumber"));
		describeOversizeNonPartitionTableInfosResponse.setPageSize(_ctx.integerValue("DescribeOversizeNonPartitionTableInfosResponse.PageSize"));
		describeOversizeNonPartitionTableInfosResponse.setDBClusterId(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.DBClusterId"));

		List<OversizeNonPartitionTableInfo> tables = new ArrayList<OversizeNonPartitionTableInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOversizeNonPartitionTableInfosResponse.Tables.Length"); i++) {
			OversizeNonPartitionTableInfo oversizeNonPartitionTableInfo = new OversizeNonPartitionTableInfo();
			oversizeNonPartitionTableInfo.setSchemaName(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].SchemaName"));
			oversizeNonPartitionTableInfo.setTableName(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].TableName"));
			oversizeNonPartitionTableInfo.setRowCount(_ctx.longValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].RowCount"));
			oversizeNonPartitionTableInfo.setIndexSize(_ctx.longValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].IndexSize"));
			oversizeNonPartitionTableInfo.setDataSize(_ctx.longValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].DataSize"));
			oversizeNonPartitionTableInfo.setLocalDataSize(_ctx.longValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].LocalDataSize"));
			oversizeNonPartitionTableInfo.setPrimaryKeySize(_ctx.longValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].PrimaryKeySize"));
			oversizeNonPartitionTableInfo.setRemoteDataSize(_ctx.longValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].RemoteDataSize"));
			oversizeNonPartitionTableInfo.setSpaceRatio(_ctx.doubleValue("DescribeOversizeNonPartitionTableInfosResponse.Tables["+ i +"].SpaceRatio"));

			tables.add(oversizeNonPartitionTableInfo);
		}
		describeOversizeNonPartitionTableInfosResponse.setTables(tables);

		List<DetectionItemsArray> detectionItems = new ArrayList<DetectionItemsArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOversizeNonPartitionTableInfosResponse.DetectionItems.Length"); i++) {
			DetectionItemsArray detectionItemsArray = new DetectionItemsArray();
			detectionItemsArray.setName(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.DetectionItems["+ i +"].Name"));
			detectionItemsArray.setMessage(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.DetectionItems["+ i +"].Message"));
			detectionItemsArray.setStatus(_ctx.stringValue("DescribeOversizeNonPartitionTableInfosResponse.DetectionItems["+ i +"].Status"));

			detectionItems.add(detectionItemsArray);
		}
		describeOversizeNonPartitionTableInfosResponse.setDetectionItems(detectionItems);
	 
	 	return describeOversizeNonPartitionTableInfosResponse;
	}
}