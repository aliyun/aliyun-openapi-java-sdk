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

import com.aliyuncs.itaas.model.v20170505.GetRegisterHistoryListResponse;
import com.aliyuncs.itaas.model.v20170505.GetRegisterHistoryListResponse.ErrorMessage;
import com.aliyuncs.itaas.model.v20170505.GetRegisterHistoryListResponse.RegisterHistoryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRegisterHistoryListResponseUnmarshaller {

	public static GetRegisterHistoryListResponse unmarshall(GetRegisterHistoryListResponse getRegisterHistoryListResponse, UnmarshallerContext context) {
		
		getRegisterHistoryListResponse.setRequestId(context.stringValue("GetRegisterHistoryListResponse.RequestId"));
		getRegisterHistoryListResponse.setErrorCode(context.integerValue("GetRegisterHistoryListResponse.ErrorCode"));
		getRegisterHistoryListResponse.setErrorMsg(context.stringValue("GetRegisterHistoryListResponse.ErrorMsg"));
		getRegisterHistoryListResponse.setSuccess(context.booleanValue("GetRegisterHistoryListResponse.Success"));

		List<RegisterHistoryInfo> dataList = new ArrayList<RegisterHistoryInfo>();
		for (int i = 0; i < context.lengthValue("GetRegisterHistoryListResponse.Data.Length"); i++) {
			RegisterHistoryInfo registerHistoryInfo = new RegisterHistoryInfo();
			registerHistoryInfo.setCreateTimeL(context.longValue("GetRegisterHistoryListResponse.Data["+ i +"].CreateTimeL"));
			registerHistoryInfo.setDrIp(context.stringValue("GetRegisterHistoryListResponse.Data["+ i +"].DrIp"));
			registerHistoryInfo.setDrMac(context.stringValue("GetRegisterHistoryListResponse.Data["+ i +"].DrMac"));
			registerHistoryInfo.setDrName(context.stringValue("GetRegisterHistoryListResponse.Data["+ i +"].DrName"));
			registerHistoryInfo.setEventinfo(context.stringValue("GetRegisterHistoryListResponse.Data["+ i +"].Eventinfo"));
			registerHistoryInfo.setEventtype(context.integerValue("GetRegisterHistoryListResponse.Data["+ i +"].Eventtype"));
			registerHistoryInfo.setEventtypeTxt(context.stringValue("GetRegisterHistoryListResponse.Data["+ i +"].EventtypeTxt"));
			registerHistoryInfo.setMemo(context.stringValue("GetRegisterHistoryListResponse.Data["+ i +"].Memo"));
			registerHistoryInfo.setScreencode(context.stringValue("GetRegisterHistoryListResponse.Data["+ i +"].Screencode"));

			dataList.add(registerHistoryInfo);
		}
		getRegisterHistoryListResponse.setData(dataList);

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("GetRegisterHistoryListResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("GetRegisterHistoryListResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		getRegisterHistoryListResponse.setErrorList(errorListList);
	 
	 	return getRegisterHistoryListResponse;
	}
}