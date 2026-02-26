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

import com.aliyuncs.iot.model.v20180120.ListPowerStationResponse;
import com.aliyuncs.iot.model.v20180120.ListPowerStationResponse.Data;
import com.aliyuncs.iot.model.v20180120.ListPowerStationResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPowerStationResponseUnmarshaller {

	public static ListPowerStationResponse unmarshall(ListPowerStationResponse listPowerStationResponse, UnmarshallerContext _ctx) {
		
		listPowerStationResponse.setRequestId(_ctx.stringValue("ListPowerStationResponse.RequestId"));
		listPowerStationResponse.setSuccess(_ctx.booleanValue("ListPowerStationResponse.Success"));
		listPowerStationResponse.setCode(_ctx.stringValue("ListPowerStationResponse.Code"));
		listPowerStationResponse.setErrorMessage(_ctx.stringValue("ListPowerStationResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListPowerStationResponse.Data.PageNo"));
		data.setTotal(_ctx.longValue("ListPowerStationResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("ListPowerStationResponse.Data.PageSize"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPowerStationResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setPowerStationUid(_ctx.stringValue("ListPowerStationResponse.Data.DataList["+ i +"].PowerStationUid"));
			dataListItem.setAlgoInstanceUid(_ctx.stringValue("ListPowerStationResponse.Data.DataList["+ i +"].AlgoInstanceUid"));
			dataListItem.setName(_ctx.stringValue("ListPowerStationResponse.Data.DataList["+ i +"].Name"));
			dataListItem.setDescription(_ctx.stringValue("ListPowerStationResponse.Data.DataList["+ i +"].Description"));
			dataListItem.setRatedPower(_ctx.integerValue("ListPowerStationResponse.Data.DataList["+ i +"].RatedPower"));

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listPowerStationResponse.setData(data);
	 
	 	return listPowerStationResponse;
	}
}