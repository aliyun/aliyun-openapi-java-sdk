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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.MetastoreListPartitionResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListPartitionResponse.Partition;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListPartitionResponseUnmarshaller {

	public static MetastoreListPartitionResponse unmarshall(MetastoreListPartitionResponse metastoreListPartitionResponse, UnmarshallerContext context) {
		
		metastoreListPartitionResponse.setRequestId(context.stringValue("MetastoreListPartitionResponse.RequestId"));
		metastoreListPartitionResponse.setTotalCount(context.integerValue("MetastoreListPartitionResponse.TotalCount"));
		metastoreListPartitionResponse.setPageNumber(context.integerValue("MetastoreListPartitionResponse.PageNumber"));
		metastoreListPartitionResponse.setPageSize(context.integerValue("MetastoreListPartitionResponse.PageSize"));

		List<Partition> partitionList = new ArrayList<Partition>();
		for (int i = 0; i < context.lengthValue("MetastoreListPartitionResponse.PartitionList.Length"); i++) {
			Partition partition = new Partition();
			partition.setDatabaseId(context.stringValue("MetastoreListPartitionResponse.PartitionList["+ i +"].DatabaseId"));
			partition.setTableId(context.stringValue("MetastoreListPartitionResponse.PartitionList["+ i +"].TableId"));
			partition.setPartitionName(context.stringValue("MetastoreListPartitionResponse.PartitionList["+ i +"].PartitionName"));
			partition.setPartitionType(context.stringValue("MetastoreListPartitionResponse.PartitionList["+ i +"].PartitionType"));
			partition.setPartitionComment(context.stringValue("MetastoreListPartitionResponse.PartitionList["+ i +"].PartitionComment"));
			partition.setLocation(context.stringValue("MetastoreListPartitionResponse.PartitionList["+ i +"].Location"));
			partition.setPartitionPath(context.stringValue("MetastoreListPartitionResponse.PartitionList["+ i +"].PartitionPath"));
			partition.setBucketNum(context.integerValue("MetastoreListPartitionResponse.PartitionList["+ i +"].BucketNum"));
			partition.setGmtCreate(context.longValue("MetastoreListPartitionResponse.PartitionList["+ i +"].GmtCreate"));
			partition.setGmtModified(context.longValue("MetastoreListPartitionResponse.PartitionList["+ i +"].GmtModified"));

			partitionList.add(partition);
		}
		metastoreListPartitionResponse.setPartitionList(partitionList);
	 
	 	return metastoreListPartitionResponse;
	}
}