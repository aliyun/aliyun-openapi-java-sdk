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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListAssetSelectionSelectedTargetResponse;
import com.aliyuncs.sas.model.v20181203.ListAssetSelectionSelectedTargetResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAssetSelectionSelectedTargetResponseUnmarshaller {

	public static ListAssetSelectionSelectedTargetResponse unmarshall(ListAssetSelectionSelectedTargetResponse listAssetSelectionSelectedTargetResponse, UnmarshallerContext _ctx) {
		
		listAssetSelectionSelectedTargetResponse.setRequestId(_ctx.stringValue("ListAssetSelectionSelectedTargetResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAssetSelectionSelectedTargetResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTargetId(_ctx.stringValue("ListAssetSelectionSelectedTargetResponse.Data["+ i +"].TargetId"));
			dataItem.setTargetName(_ctx.stringValue("ListAssetSelectionSelectedTargetResponse.Data["+ i +"].TargetName"));

			data.add(dataItem);
		}
		listAssetSelectionSelectedTargetResponse.setData(data);
	 
	 	return listAssetSelectionSelectedTargetResponse;
	}
}