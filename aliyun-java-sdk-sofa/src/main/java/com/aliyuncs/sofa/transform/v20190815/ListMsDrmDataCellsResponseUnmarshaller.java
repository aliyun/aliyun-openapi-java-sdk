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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListMsDrmDataCellsResponse;
import com.aliyuncs.sofa.model.v20190815.ListMsDrmDataCellsResponse.DrmDataCellInfo;
import com.aliyuncs.sofa.model.v20190815.ListMsDrmDataCellsResponse.DrmDataCellInfo.CellInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMsDrmDataCellsResponseUnmarshaller {

	public static ListMsDrmDataCellsResponse unmarshall(ListMsDrmDataCellsResponse listMsDrmDataCellsResponse, UnmarshallerContext _ctx) {
		
		listMsDrmDataCellsResponse.setRequestId(_ctx.stringValue("ListMsDrmDataCellsResponse.RequestId"));
		listMsDrmDataCellsResponse.setResultCode(_ctx.stringValue("ListMsDrmDataCellsResponse.ResultCode"));
		listMsDrmDataCellsResponse.setResultMessage(_ctx.stringValue("ListMsDrmDataCellsResponse.ResultMessage"));

		DrmDataCellInfo drmDataCellInfo = new DrmDataCellInfo();
		drmDataCellInfo.setHasSpecialCell(_ctx.booleanValue("ListMsDrmDataCellsResponse.DrmDataCellInfo.HasSpecialCell"));

		List<CellInfosItem> cellInfos = new ArrayList<CellInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMsDrmDataCellsResponse.DrmDataCellInfo.CellInfos.Length"); i++) {
			CellInfosItem cellInfosItem = new CellInfosItem();
			cellInfosItem.setCell(_ctx.stringValue("ListMsDrmDataCellsResponse.DrmDataCellInfo.CellInfos["+ i +"].Cell"));
			cellInfosItem.setSpecialPush(_ctx.booleanValue("ListMsDrmDataCellsResponse.DrmDataCellInfo.CellInfos["+ i +"].SpecialPush"));
			cellInfosItem.setValue(_ctx.stringValue("ListMsDrmDataCellsResponse.DrmDataCellInfo.CellInfos["+ i +"].Value"));

			cellInfos.add(cellInfosItem);
		}
		drmDataCellInfo.setCellInfos(cellInfos);
		listMsDrmDataCellsResponse.setDrmDataCellInfo(drmDataCellInfo);
	 
	 	return listMsDrmDataCellsResponse;
	}
}