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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnStorageResponse;
import com.aliyuncs.rds.model.v20140815.DescribeOptimizeAdviceOnStorageResponse.AdviceOnStorage;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOptimizeAdviceOnStorageResponseUnmarshaller {

	public static DescribeOptimizeAdviceOnStorageResponse unmarshall(DescribeOptimizeAdviceOnStorageResponse describeOptimizeAdviceOnStorageResponse, UnmarshallerContext context) {
		
		describeOptimizeAdviceOnStorageResponse.setRequestId(context.stringValue("DescribeOptimizeAdviceOnStorageResponse.RequestId"));
		describeOptimizeAdviceOnStorageResponse.setDBInstanceId(context.stringValue("DescribeOptimizeAdviceOnStorageResponse.DBInstanceId"));
		describeOptimizeAdviceOnStorageResponse.setTotalRecordsCount(context.integerValue("DescribeOptimizeAdviceOnStorageResponse.TotalRecordsCount"));
		describeOptimizeAdviceOnStorageResponse.setPageNumber(context.integerValue("DescribeOptimizeAdviceOnStorageResponse.PageNumber"));
		describeOptimizeAdviceOnStorageResponse.setPageRecordCount(context.integerValue("DescribeOptimizeAdviceOnStorageResponse.PageRecordCount"));

		List<AdviceOnStorage> items = new ArrayList<AdviceOnStorage>();
		for (int i = 0; i < context.lengthValue("DescribeOptimizeAdviceOnStorageResponse.Items.Length"); i++) {
			AdviceOnStorage adviceOnStorage = new AdviceOnStorage();
			adviceOnStorage.setDBName(context.stringValue("DescribeOptimizeAdviceOnStorageResponse.Items["+ i +"].DBName"));
			adviceOnStorage.setTableName(context.stringValue("DescribeOptimizeAdviceOnStorageResponse.Items["+ i +"].TableName"));
			adviceOnStorage.setCurrentEngine(context.stringValue("DescribeOptimizeAdviceOnStorageResponse.Items["+ i +"].CurrentEngine"));
			adviceOnStorage.setAdviseEngine(context.stringValue("DescribeOptimizeAdviceOnStorageResponse.Items["+ i +"].AdviseEngine"));

			items.add(adviceOnStorage);
		}
		describeOptimizeAdviceOnStorageResponse.setItems(items);
	 
	 	return describeOptimizeAdviceOnStorageResponse;
	}
}