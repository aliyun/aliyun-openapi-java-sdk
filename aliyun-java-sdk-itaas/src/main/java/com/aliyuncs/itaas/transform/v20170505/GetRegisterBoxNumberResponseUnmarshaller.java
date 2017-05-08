/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.itaas.transform.v20170505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxNumberResponse;
import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxNumberResponse.Data;
import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxNumberResponse.Data.BoxInfo;
import com.aliyuncs.itaas.model.v20170505.GetRegisterBoxNumberResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegisterBoxNumberResponseUnmarshaller {

	public static GetRegisterBoxNumberResponse unmarshall(GetRegisterBoxNumberResponse getRegisterBoxNumberResponse, UnmarshallerContext context) {
		
		getRegisterBoxNumberResponse.setRequestId(context.stringValue("GetRegisterBoxNumberResponse.RequestId"));
		getRegisterBoxNumberResponse.setErrorCode(context.integerValue("GetRegisterBoxNumberResponse.ErrorCode"));
		getRegisterBoxNumberResponse.setErrorMsg(context.stringValue("GetRegisterBoxNumberResponse.ErrorMsg"));
		getRegisterBoxNumberResponse.setSuccess(context.booleanValue("GetRegisterBoxNumberResponse.Success"));

		Data data = new Data();
		data.setActivedNumber(context.integerValue("GetRegisterBoxNumberResponse.Data.ActivedNumber"));
		data.setBuyNumber(context.integerValue("GetRegisterBoxNumberResponse.Data.BuyNumber"));

		List<BoxInfo> boxesListList = new ArrayList<BoxInfo>();
		for (int i = 0; i < context.lengthValue("GetRegisterBoxNumberResponse.Data.BoxesList.Length"); i++) {
			BoxInfo boxInfo = new BoxInfo();
			boxInfo.setCurVersion(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].CurVersion"));
			boxInfo.setDrName(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].DrName"));
			boxInfo.setDrSessionId(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].DrSessionId"));
			boxInfo.setDrStatus(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].DrStatus"));
			boxInfo.setDrStatusTxt(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].DrStatusTxt"));
			boxInfo.setIpaddress(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].Ipaddress"));
			boxInfo.setLastReportTimeL(context.longValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].LastReportTimeL"));
			boxInfo.setOnlineTimeL(context.longValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].OnlineTimeL"));
			boxInfo.setScreencode(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].Screencode"));
			boxInfo.setSysVersion(context.stringValue("GetRegisterBoxNumberResponse.Data.BoxesList["+ i +"].SysVersion"));

			boxesListList.add(boxInfo);
		}
		data.setBoxesList(boxesListList);
		getRegisterBoxNumberResponse.setData(data);

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("GetRegisterBoxNumberResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("GetRegisterBoxNumberResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		getRegisterBoxNumberResponse.setErrorList(errorListList);
	 
	 	return getRegisterBoxNumberResponse;
	}
}