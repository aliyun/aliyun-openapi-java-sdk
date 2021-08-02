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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListQueryHistoryResponse;
import com.aliyuncs.datalake.model.v20200710.ListQueryHistoryResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueryHistoryResponseUnmarshaller {

	public static ListQueryHistoryResponse unmarshall(ListQueryHistoryResponse listQueryHistoryResponse, UnmarshallerContext _ctx) {
		
		listQueryHistoryResponse.setRequestId(_ctx.stringValue("ListQueryHistoryResponse.RequestId"));
		listQueryHistoryResponse.setSuccess(_ctx.booleanValue("ListQueryHistoryResponse.Success"));
		listQueryHistoryResponse.setTotalCount(_ctx.integerValue("ListQueryHistoryResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQueryHistoryResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSql(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].Sql"));
			dataItem.setJobCompleted(_ctx.booleanValue("ListQueryHistoryResponse.Data["+ i +"].JobCompleted"));
			dataItem.setProgress(_ctx.integerValue("ListQueryHistoryResponse.Data["+ i +"].Progress"));
			dataItem.setStartTime(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].EndTime"));
			dataItem.setDuration(_ctx.longValue("ListQueryHistoryResponse.Data["+ i +"].Duration"));
			dataItem.setRowCount(_ctx.integerValue("ListQueryHistoryResponse.Data["+ i +"].RowCount"));
			dataItem.setGmtCreate(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].Id"));
			dataItem.setResultTmpTable(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].ResultTmpTable"));
			dataItem.setOwner(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].Owner"));
			dataItem.setRegionId(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].RegionId"));
			dataItem.setResultTmpDb(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].ResultTmpDb"));
			dataItem.setStatus(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].Status"));
			dataItem.setSuccess(_ctx.booleanValue("ListQueryHistoryResponse.Data["+ i +"].Success"));
			dataItem.setErrorMessage(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].ErrorMessage"));
			dataItem.setCreator(_ctx.longValue("ListQueryHistoryResponse.Data["+ i +"].Creator"));
			dataItem.setCreatorLoginName(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].CreatorLoginName"));
			dataItem.setRowCountOverLimit(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].RowCountOverLimit"));
			dataItem.setResultOssPath(_ctx.stringValue("ListQueryHistoryResponse.Data["+ i +"].ResultOssPath"));

			data.add(dataItem);
		}
		listQueryHistoryResponse.setData(data);
	 
	 	return listQueryHistoryResponse;
	}
}