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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListSourceReplicaResponse;
import com.aliyuncs.iot.model.v20180120.ListSourceReplicaResponse.Data;
import com.aliyuncs.iot.model.v20180120.ListSourceReplicaResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSourceReplicaResponseUnmarshaller {

	public static ListSourceReplicaResponse unmarshall(ListSourceReplicaResponse listSourceReplicaResponse, UnmarshallerContext _ctx) {
		
		listSourceReplicaResponse.setRequestId(_ctx.stringValue("ListSourceReplicaResponse.RequestId"));
		listSourceReplicaResponse.setSuccess(_ctx.booleanValue("ListSourceReplicaResponse.Success"));
		listSourceReplicaResponse.setCode(_ctx.stringValue("ListSourceReplicaResponse.Code"));
		listSourceReplicaResponse.setErrorMessage(_ctx.stringValue("ListSourceReplicaResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListSourceReplicaResponse.Data.Total"));
		data.setTotalPage(_ctx.longValue("ListSourceReplicaResponse.Data.TotalPage"));
		data.setPageSize(_ctx.integerValue("ListSourceReplicaResponse.Data.PageSize"));
		data.setPageNo(_ctx.integerValue("ListSourceReplicaResponse.Data.PageNo"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSourceReplicaResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setReplicaUid(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].ReplicaUid"));
			dataListItem.setName(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].Name"));
			dataListItem.setCode(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].Code"));
			dataListItem.setSourceUid(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].SourceUid"));
			dataListItem.setTableUid(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].TableUid"));
			dataListItem.setSourceType(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].SourceType"));
			dataListItem.setTimeCycle(_ctx.integerValue("ListSourceReplicaResponse.Data.DataList["+ i +"].TimeCycle"));
			dataListItem.setTimeUnit(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].TimeUnit"));
			dataListItem.setRegion(_ctx.integerValue("ListSourceReplicaResponse.Data.DataList["+ i +"].Region"));
			dataListItem.setBeginLatest(_ctx.longValue("ListSourceReplicaResponse.Data.DataList["+ i +"].BeginLatest"));
			dataListItem.setEndLatest(_ctx.longValue("ListSourceReplicaResponse.Data.DataList["+ i +"].EndLatest"));
			dataListItem.setExtraProperty(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].ExtraProperty"));
			dataListItem.setStatus(_ctx.integerValue("ListSourceReplicaResponse.Data.DataList["+ i +"].Status"));
			dataListItem.setStorageSize(_ctx.longValue("ListSourceReplicaResponse.Data.DataList["+ i +"].StorageSize"));
			dataListItem.setProductCreateTime(_ctx.longValue("ListSourceReplicaResponse.Data.DataList["+ i +"].ProductCreateTime"));
			dataListItem.setNodeType(_ctx.integerValue("ListSourceReplicaResponse.Data.DataList["+ i +"].NodeType"));
			dataListItem.setNeedTips(_ctx.booleanValue("ListSourceReplicaResponse.Data.DataList["+ i +"].NeedTips"));
			dataListItem.setLongJobUid(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].LongJobUid"));
			dataListItem.setDesc(_ctx.stringValue("ListSourceReplicaResponse.Data.DataList["+ i +"].Desc"));
			dataListItem.setGmtCreate(_ctx.longValue("ListSourceReplicaResponse.Data.DataList["+ i +"].GmtCreate"));

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listSourceReplicaResponse.setData(data);
	 
	 	return listSourceReplicaResponse;
	}
}