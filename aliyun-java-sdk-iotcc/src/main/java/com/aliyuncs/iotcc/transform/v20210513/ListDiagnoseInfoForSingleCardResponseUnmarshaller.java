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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListDiagnoseInfoForSingleCardResponse;
import com.aliyuncs.iotcc.model.v20210513.ListDiagnoseInfoForSingleCardResponse.DiagnoseInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiagnoseInfoForSingleCardResponseUnmarshaller {

	public static ListDiagnoseInfoForSingleCardResponse unmarshall(ListDiagnoseInfoForSingleCardResponse listDiagnoseInfoForSingleCardResponse, UnmarshallerContext _ctx) {
		
		listDiagnoseInfoForSingleCardResponse.setRequestId(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.RequestId"));
		listDiagnoseInfoForSingleCardResponse.setNextToken(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.NextToken"));
		listDiagnoseInfoForSingleCardResponse.setMaxResults(_ctx.longValue("ListDiagnoseInfoForSingleCardResponse.MaxResults"));
		listDiagnoseInfoForSingleCardResponse.setTotalCount(_ctx.longValue("ListDiagnoseInfoForSingleCardResponse.TotalCount"));

		List<DiagnoseInfoItem> diagnoseInfo = new ArrayList<DiagnoseInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo.Length"); i++) {
			DiagnoseInfoItem diagnoseInfoItem = new DiagnoseInfoItem();
			diagnoseInfoItem.setIoTCloudConnectorId(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].IoTCloudConnectorId"));
			diagnoseInfoItem.setCardIp(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].CardIp"));
			diagnoseInfoItem.setIccId(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].IccId"));
			diagnoseInfoItem.setSourceType(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].SourceType"));
			diagnoseInfoItem.setSource(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].Source"));
			diagnoseInfoItem.setDestinationType(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].DestinationType"));
			diagnoseInfoItem.setDestination(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].Destination"));
			diagnoseInfoItem.setBeginTime(_ctx.longValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].BeginTime"));
			diagnoseInfoItem.setEndTime(_ctx.longValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].EndTime"));
			diagnoseInfoItem.setStatus(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].Status"));
			diagnoseInfoItem.setDiagnoseTime(_ctx.longValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].DiagnoseTime"));
			diagnoseInfoItem.setTaskId(_ctx.stringValue("ListDiagnoseInfoForSingleCardResponse.DiagnoseInfo["+ i +"].TaskId"));

			diagnoseInfo.add(diagnoseInfoItem);
		}
		listDiagnoseInfoForSingleCardResponse.setDiagnoseInfo(diagnoseInfo);
	 
	 	return listDiagnoseInfoForSingleCardResponse;
	}
}