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

import com.aliyuncs.adb.model.v20190315.DescribeExcessivePrimaryKeysResponse;
import com.aliyuncs.adb.model.v20190315.DescribeExcessivePrimaryKeysResponse.DetectionItemsArray;
import com.aliyuncs.adb.model.v20190315.DescribeExcessivePrimaryKeysResponse.ExcessivePrimaryKeyInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExcessivePrimaryKeysResponseUnmarshaller {

	public static DescribeExcessivePrimaryKeysResponse unmarshall(DescribeExcessivePrimaryKeysResponse describeExcessivePrimaryKeysResponse, UnmarshallerContext _ctx) {
		
		describeExcessivePrimaryKeysResponse.setRequestId(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.RequestId"));
		describeExcessivePrimaryKeysResponse.setTotalCount(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.TotalCount"));
		describeExcessivePrimaryKeysResponse.setPageNumber(_ctx.integerValue("DescribeExcessivePrimaryKeysResponse.PageNumber"));
		describeExcessivePrimaryKeysResponse.setPageSize(_ctx.integerValue("DescribeExcessivePrimaryKeysResponse.PageSize"));
		describeExcessivePrimaryKeysResponse.setDBClusterId(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.DBClusterId"));
		describeExcessivePrimaryKeysResponse.setAccessDeniedDetail(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.AccessDeniedDetail"));

		List<ExcessivePrimaryKeyInfos> tables = new ArrayList<ExcessivePrimaryKeyInfos>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExcessivePrimaryKeysResponse.Tables.Length"); i++) {
			ExcessivePrimaryKeyInfos excessivePrimaryKeyInfos = new ExcessivePrimaryKeyInfos();
			excessivePrimaryKeyInfos.setTableName(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].TableName"));
			excessivePrimaryKeyInfos.setSchemaName(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].SchemaName"));
			excessivePrimaryKeyInfos.setColumnCount(_ctx.integerValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].ColumnCount"));
			excessivePrimaryKeyInfos.setPrimaryKeyCount(_ctx.integerValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].PrimaryKeyCount"));
			excessivePrimaryKeyInfos.setPrimaryKeyColumns(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].PrimaryKeyColumns"));
			excessivePrimaryKeyInfos.setSpaceRatio(_ctx.doubleValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].SpaceRatio"));
			excessivePrimaryKeyInfos.setTotalSize(_ctx.longValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].TotalSize"));
			excessivePrimaryKeyInfos.setPrimaryKeyIndexSize(_ctx.longValue("DescribeExcessivePrimaryKeysResponse.Tables["+ i +"].PrimaryKeyIndexSize"));

			tables.add(excessivePrimaryKeyInfos);
		}
		describeExcessivePrimaryKeysResponse.setTables(tables);

		List<DetectionItemsArray> detectionItems = new ArrayList<DetectionItemsArray>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExcessivePrimaryKeysResponse.DetectionItems.Length"); i++) {
			DetectionItemsArray detectionItemsArray = new DetectionItemsArray();
			detectionItemsArray.setName(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.DetectionItems["+ i +"].Name"));
			detectionItemsArray.setMessage(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.DetectionItems["+ i +"].Message"));
			detectionItemsArray.setStatus(_ctx.stringValue("DescribeExcessivePrimaryKeysResponse.DetectionItems["+ i +"].Status"));

			detectionItems.add(detectionItemsArray);
		}
		describeExcessivePrimaryKeysResponse.setDetectionItems(detectionItems);
	 
	 	return describeExcessivePrimaryKeysResponse;
	}
}