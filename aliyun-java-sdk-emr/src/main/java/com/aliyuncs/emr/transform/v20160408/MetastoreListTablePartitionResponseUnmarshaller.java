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

	public static MetastoreListTablePartitionResponse unmarshall(MetastoreListTablePartitionResponse metastoreListTablePartitionResponse, UnmarshallerContext _ctx) {
		
		metastoreListTablePartitionResponse.setRequestId(_ctx.stringValue("MetastoreListTablePartitionResponse.RequestId"));
		metastoreListTablePartitionResponse.setTotalCount(_ctx.integerValue("MetastoreListTablePartitionResponse.TotalCount"));
		metastoreListTablePartitionResponse.setPageNumber(_ctx.integerValue("MetastoreListTablePartitionResponse.PageNumber"));
		metastoreListTablePartitionResponse.setPageSize(_ctx.integerValue("MetastoreListTablePartitionResponse.PageSize"));

		List<Partition> partitionList = new ArrayList<Partition>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListTablePartitionResponse.PartitionList.Length"); i++) {
			Partition partition = new Partition();
			partition.setDatabaseId(_ctx.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].DatabaseId"));
			partition.setTableId(_ctx.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].TableId"));
			partition.setPartitionName(_ctx.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionName"));
			partition.setPartitionType(_ctx.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionType"));
			partition.setPartitionComment(_ctx.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionComment"));
			partition.setLocation(_ctx.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].Location"));
			partition.setPartitionPath(_ctx.stringValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].PartitionPath"));
			partition.setBucketNum(_ctx.integerValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].BucketNum"));
			partition.setGmtCreate(_ctx.longValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].GmtCreate"));
			partition.setGmtModified(_ctx.longValue("MetastoreListTablePartitionResponse.PartitionList["+ i +"].GmtModified"));

			partitionList.add(partition);
		}
		metastoreListTablePartitionResponse.setPartitionList(partitionList);
	 
	 	return metastoreListTablePartitionResponse;
	}
}