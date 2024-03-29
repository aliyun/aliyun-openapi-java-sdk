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

package com.aliyuncs.cc5g.transform.v20220314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cc5g.model.v20220314.GetDiagnoseResultForSingleCardResponse;
import com.aliyuncs.cc5g.model.v20220314.GetDiagnoseResultForSingleCardResponse.DiagnoseItemItem;
import com.aliyuncs.cc5g.model.v20220314.GetDiagnoseResultForSingleCardResponse.DiagnoseItemItem.SubItemsItem;
import com.aliyuncs.cc5g.model.v20220314.GetDiagnoseResultForSingleCardResponse.DiagnoseResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiagnoseResultForSingleCardResponseUnmarshaller {

	public static GetDiagnoseResultForSingleCardResponse unmarshall(GetDiagnoseResultForSingleCardResponse getDiagnoseResultForSingleCardResponse, UnmarshallerContext _ctx) {
		
		getDiagnoseResultForSingleCardResponse.setRequestId(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.RequestId"));
		getDiagnoseResultForSingleCardResponse.setWirelessCloudConnectorId(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.WirelessCloudConnectorId"));
		getDiagnoseResultForSingleCardResponse.setCardIp(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.CardIp"));
		getDiagnoseResultForSingleCardResponse.setIccId(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.IccId"));
		getDiagnoseResultForSingleCardResponse.setDestination(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.Destination"));
		getDiagnoseResultForSingleCardResponse.setDestinationType(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.DestinationType"));
		getDiagnoseResultForSingleCardResponse.setBeginTime(_ctx.longValue("GetDiagnoseResultForSingleCardResponse.BeginTime"));
		getDiagnoseResultForSingleCardResponse.setEndTime(_ctx.longValue("GetDiagnoseResultForSingleCardResponse.EndTime"));
		getDiagnoseResultForSingleCardResponse.setStatus(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.Status"));

		List<DiagnoseResult> errorResult = new ArrayList<DiagnoseResult>();
		for (int i = 0; i < _ctx.lengthValue("GetDiagnoseResultForSingleCardResponse.ErrorResult.Length"); i++) {
			DiagnoseResult diagnoseResult = new DiagnoseResult();
			diagnoseResult.setErrorLevel(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.ErrorResult["+ i +"].ErrorLevel"));
			diagnoseResult.setErrorPart(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.ErrorResult["+ i +"].ErrorPart"));
			diagnoseResult.setErrorItem(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.ErrorResult["+ i +"].ErrorItem"));
			diagnoseResult.setErrorDesc(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.ErrorResult["+ i +"].ErrorDesc"));
			diagnoseResult.setErrorSuggestion(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.ErrorResult["+ i +"].ErrorSuggestion"));

			errorResult.add(diagnoseResult);
		}
		getDiagnoseResultForSingleCardResponse.setErrorResult(errorResult);

		List<DiagnoseItemItem> diagnoseItem = new ArrayList<DiagnoseItemItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDiagnoseResultForSingleCardResponse.DiagnoseItem.Length"); i++) {
			DiagnoseItemItem diagnoseItemItem = new DiagnoseItemItem();
			diagnoseItemItem.setPart(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.DiagnoseItem["+ i +"].Part"));
			diagnoseItemItem.setStatus(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.DiagnoseItem["+ i +"].Status"));

			List<SubItemsItem> subItems = new ArrayList<SubItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetDiagnoseResultForSingleCardResponse.DiagnoseItem["+ i +"].SubItems.Length"); j++) {
				SubItemsItem subItemsItem = new SubItemsItem();
				subItemsItem.setSubItem(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.DiagnoseItem["+ i +"].SubItems["+ j +"].SubItem"));
				subItemsItem.setSubItemStatus(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.DiagnoseItem["+ i +"].SubItems["+ j +"].SubItemStatus"));
				subItemsItem.setSubItemInfo(_ctx.stringValue("GetDiagnoseResultForSingleCardResponse.DiagnoseItem["+ i +"].SubItems["+ j +"].SubItemInfo"));

				subItems.add(subItemsItem);
			}
			diagnoseItemItem.setSubItems(subItems);

			diagnoseItem.add(diagnoseItemItem);
		}
		getDiagnoseResultForSingleCardResponse.setDiagnoseItem(diagnoseItem);
	 
	 	return getDiagnoseResultForSingleCardResponse;
	}
}