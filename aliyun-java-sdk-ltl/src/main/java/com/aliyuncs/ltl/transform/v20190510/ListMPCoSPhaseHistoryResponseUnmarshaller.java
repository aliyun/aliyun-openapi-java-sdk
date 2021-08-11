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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseHistoryResponse;
import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseHistoryResponse.Data;
import com.aliyuncs.ltl.model.v20190510.ListMPCoSPhaseHistoryResponse.Data.HistoryDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMPCoSPhaseHistoryResponseUnmarshaller {

	public static ListMPCoSPhaseHistoryResponse unmarshall(ListMPCoSPhaseHistoryResponse listMPCoSPhaseHistoryResponse, UnmarshallerContext _ctx) {
		
		listMPCoSPhaseHistoryResponse.setRequestId(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.RequestId"));
		listMPCoSPhaseHistoryResponse.setCode(_ctx.integerValue("ListMPCoSPhaseHistoryResponse.Code"));
		listMPCoSPhaseHistoryResponse.setSuccess(_ctx.booleanValue("ListMPCoSPhaseHistoryResponse.Success"));
		listMPCoSPhaseHistoryResponse.setMessage(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListMPCoSPhaseHistoryResponse.Data.Total"));
		data.setNum(_ctx.integerValue("ListMPCoSPhaseHistoryResponse.Data.Num"));
		data.setSize(_ctx.integerValue("ListMPCoSPhaseHistoryResponse.Data.Size"));

		List<HistoryDataInfo> pageData = new ArrayList<HistoryDataInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListMPCoSPhaseHistoryResponse.Data.PageData.Length"); i++) {
			HistoryDataInfo historyDataInfo = new HistoryDataInfo();
			historyDataInfo.setDataSeq(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].DataSeq"));
			historyDataInfo.setBlockNumber(_ctx.longValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].BlockNumber"));
			historyDataInfo.setPreviousHash(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].PreviousHash"));
			historyDataInfo.setDataHash(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].DataHash"));
			historyDataInfo.setBlockHash(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].BlockHash"));
			historyDataInfo.setTransactionHash(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].TransactionHash"));
			historyDataInfo.setDataValue(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].DataValue"));
			historyDataInfo.setTimestamp(_ctx.longValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].Timestamp"));
			historyDataInfo.setIotId(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].IotId"));
			historyDataInfo.setProductKey(_ctx.stringValue("ListMPCoSPhaseHistoryResponse.Data.PageData["+ i +"].ProductKey"));

			pageData.add(historyDataInfo);
		}
		data.setPageData(pageData);
		listMPCoSPhaseHistoryResponse.setData(data);
	 
	 	return listMPCoSPhaseHistoryResponse;
	}
}