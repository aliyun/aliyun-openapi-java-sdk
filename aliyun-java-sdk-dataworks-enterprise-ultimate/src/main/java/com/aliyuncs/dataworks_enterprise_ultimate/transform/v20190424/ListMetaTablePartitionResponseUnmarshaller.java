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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.ListMetaTablePartitionResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.ListMetaTablePartitionResponse.Partition;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetaTablePartitionResponseUnmarshaller {

	public static ListMetaTablePartitionResponse unmarshall(ListMetaTablePartitionResponse listMetaTablePartitionResponse, UnmarshallerContext _ctx) {
		
		listMetaTablePartitionResponse.setRequestId(_ctx.stringValue("ListMetaTablePartitionResponse.RequestId"));
		listMetaTablePartitionResponse.setErrCode(_ctx.longValue("ListMetaTablePartitionResponse.ErrCode"));
		listMetaTablePartitionResponse.setErrMsg(_ctx.stringValue("ListMetaTablePartitionResponse.ErrMsg"));
		listMetaTablePartitionResponse.setPageNum(_ctx.integerValue("ListMetaTablePartitionResponse.PageNum"));
		listMetaTablePartitionResponse.setPageSize(_ctx.integerValue("ListMetaTablePartitionResponse.PageSize"));
		listMetaTablePartitionResponse.setTotalNum(_ctx.integerValue("ListMetaTablePartitionResponse.TotalNum"));

		List<Partition> partitionList = new ArrayList<Partition>();
		for (int i = 0; i < _ctx.lengthValue("ListMetaTablePartitionResponse.PartitionList.Length"); i++) {
			Partition partition = new Partition();
			partition.setAppGuid(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].AppGuid"));
			partition.setTableGuid(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].TableGuid"));
			partition.setTableName(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].TableName"));
			partition.setId(_ctx.longValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].Id"));
			partition.setPartitionGuid(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].PartitionGuid"));
			partition.setPartitionName(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].PartitionName"));
			partition.setCreateTime(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].CreateTime"));
			partition.setType(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].Type"));
			partition.setModifyTime(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].ModifyTime"));
			partition.setExtraAttributes(_ctx.stringValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].ExtraAttributes"));
			partition.setDataSize(_ctx.longValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].DataSize"));
			partition.setRecords(_ctx.longValue("ListMetaTablePartitionResponse.PartitionList["+ i +"].Records"));

			partitionList.add(partition);
		}
		listMetaTablePartitionResponse.setPartitionList(partitionList);
	 
	 	return listMetaTablePartitionResponse;
	}
}