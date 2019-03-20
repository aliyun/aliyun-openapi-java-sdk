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

package com.aliyuncs.itaas.transform.v20170505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxListResponse;
import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxListResponse.Data;
import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxListResponse.Data.BoxInfo;
import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxListResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegisterBoxListResponseUnmarshaller {

	public static GetRegisterBoxListResponse unmarshall(GetRegisterBoxListResponse getRegisterBoxListResponse, UnmarshallerContext context) {
		
		getRegisterBoxListResponse.setRequestId(context.stringValue("GetRegisterBoxListResponse.RequestId"));
		getRegisterBoxListResponse.setErrorCode(context.integerValue("GetRegisterBoxListResponse.ErrorCode"));
		getRegisterBoxListResponse.setErrorMsg(context.stringValue("GetRegisterBoxListResponse.ErrorMsg"));
		getRegisterBoxListResponse.setSuccess(context.booleanValue("GetRegisterBoxListResponse.Success"));

		Data data = new Data();
		data.setActivedNumber(context.integerValue("GetRegisterBoxListResponse.Data.ActivedNumber"));
		data.setBuyNumber(context.integerValue("GetRegisterBoxListResponse.Data.BuyNumber"));

		List<BoxInfo> boxesList = new ArrayList<BoxInfo>();
		for (int i = 0; i < context.lengthValue("GetRegisterBoxListResponse.Data.BoxesList.Length"); i++) {
			BoxInfo boxInfo = new BoxInfo();
			boxInfo.setCurVersion(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].CurVersion"));
			boxInfo.setDrName(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].DrName"));
			boxInfo.setDrSessionId(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].DrSessionId"));
			boxInfo.setDrStatus(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].DrStatus"));
			boxInfo.setDrStatusTxt(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].DrStatusTxt"));
			boxInfo.setIpaddress(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].Ipaddress"));
			boxInfo.setLastReportTimeL(context.longValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].LastReportTimeL"));
			boxInfo.setOnlineTimeL(context.longValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].OnlineTimeL"));
			boxInfo.setScreencode(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].Screencode"));
			boxInfo.setSysVersion(context.stringValue("GetRegisterBoxListResponse.Data.BoxesList["+ i +"].SysVersion"));

			boxesList.add(boxInfo);
		}
		data.setBoxesList(boxesList);
		getRegisterBoxListResponse.setData(data);

		List<ErrorMessage> errorList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("GetRegisterBoxListResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("GetRegisterBoxListResponse.ErrorList["+ i +"].ErrorMessage"));

			errorList.add(errorMessage);
		}
		getRegisterBoxListResponse.setErrorList(errorList);
	 
	 	return getRegisterBoxListResponse;
	}
}