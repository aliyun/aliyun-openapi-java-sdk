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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListTablePartitionsResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListTablePartitionsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListTablePartitionsResponse.Data.TablePartitions;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTablePartitionsResponseUnmarshaller {

	public static ListTablePartitionsResponse unmarshall(ListTablePartitionsResponse listTablePartitionsResponse, UnmarshallerContext _ctx) {
		
		listTablePartitionsResponse.setRequestId(_ctx.stringValue("ListTablePartitionsResponse.RequestId"));
		listTablePartitionsResponse.setErrorCode(_ctx.stringValue("ListTablePartitionsResponse.ErrorCode"));
		listTablePartitionsResponse.setErrorMessage(_ctx.stringValue("ListTablePartitionsResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("ListTablePartitionsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListTablePartitionsResponse.Data.TotalCount"));

		List<TablePartitions> pagedData = new ArrayList<TablePartitions>();
		for (int i = 0; i < _ctx.lengthValue("ListTablePartitionsResponse.Data.PagedData.Length"); i++) {
			TablePartitions tablePartitions = new TablePartitions();
			tablePartitions.setGmtCreate(_ctx.longValue("ListTablePartitionsResponse.Data.PagedData["+ i +"].GmtCreate"));
			tablePartitions.setGmtModified(_ctx.longValue("ListTablePartitionsResponse.Data.PagedData["+ i +"].GmtModified"));
			tablePartitions.setLocation(_ctx.stringValue("ListTablePartitionsResponse.Data.PagedData["+ i +"].Location"));
			tablePartitions.setPartitionName(_ctx.stringValue("ListTablePartitionsResponse.Data.PagedData["+ i +"].PartitionName"));
			tablePartitions.setPartitionPath(_ctx.stringValue("ListTablePartitionsResponse.Data.PagedData["+ i +"].PartitionPath"));
			tablePartitions.setPartitionType(_ctx.stringValue("ListTablePartitionsResponse.Data.PagedData["+ i +"].PartitionType"));
			tablePartitions.setPartitionComment(_ctx.stringValue("ListTablePartitionsResponse.Data.PagedData["+ i +"].PartitionComment"));

			pagedData.add(tablePartitions);
		}
		data.setPagedData(pagedData);
		listTablePartitionsResponse.setData(data);
	 
	 	return listTablePartitionsResponse;
	}
}