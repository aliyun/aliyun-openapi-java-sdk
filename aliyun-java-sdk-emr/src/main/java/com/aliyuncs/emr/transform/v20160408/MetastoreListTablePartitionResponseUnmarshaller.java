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

import com.aliyuncs.emr.model.v20160408.MetastoreListTablePartitionResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListTablePartitionResponse.Partition;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListTablePartitionResponseUnmarshaller {

	public static MetastoreListTablePartitionResponse unmarshall(MetastoreListTablePartitionResponse metastoreListTablePartitionResponse, UnmarshallerContext context) {
		
		metastoreListTablePartitionResponse.setRequestId(context.stringValue("MetastoreListTablePartitionResponse.RequestId"));
		metastoreListTablePartitionResponse.setTotalCount(context.integerValue("MetastoreListTablePartitionResponse.TotalCount"));
		metastoreListTablePartitionResponse.setPageNumber(context.integerValue("MetastoreListTablePartitionResponse.PageNumber"));
		metastoreListTablePartitionResponse.setPageSize(context.integerValue("MetastoreListTablePartitionResponse.PageSize"));

		List<Partition> partitionList = new ArrayList<Partition>();
		for (int i = 0; i < context.lengthValue("MetastoreListTablePartitionResponse.PartitionList.Length"); i++) {
			Partition partition = new Partition();
			partition.setDatabaseId(context.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].DatabaseId"));
			partition.setTableId(context.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].TableId"));
			partition.setPartitionName(context.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionName"));
			partition.setPartitionType(context.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionType"));
			partition.setPartitionComment(context.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionComment"));
			partition.setLocation(context.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].Location"));
			partition.setPartitionPath(context.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionPath"));
			partition.setBucketNum(context.integerValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].BucketNum"));
			partition.setGmtCreate(context.longValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].GmtCreate"));
			partition.setGmtModified(context.longValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].GmtModified"));

			partitionList.add(partition);
		}
		metastoreListTablePartitionResponse.setPartitionList(partitionList);
	 
	 	return metastoreListTablePartitionResponse;
	}
}