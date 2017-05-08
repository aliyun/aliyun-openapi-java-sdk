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

import com.aliyuncs.itaas.model.v20170505.GetEnterpriseConfigResponse;
import com.aliyuncs.itaas.model.v20170505.GetEnterpriseConfigResponse.Data;
import com.aliyuncs.itaas.model.v20170505.GetEnterpriseConfigResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEnterpriseConfigResponseUnmarshaller {

	public static GetEnterpriseConfigResponse unmarshall(GetEnterpriseConfigResponse getEnterpriseConfigResponse, UnmarshallerContext context) {
		
		getEnterpriseConfigResponse.setRequestId(context.stringValue("GetEnterpriseConfigResponse.RequestId"));
		getEnterpriseConfigResponse.setErrorCode(context.integerValue("GetEnterpriseConfigResponse.ErrorCode"));
		getEnterpriseConfigResponse.setErrorMsg(context.stringValue("GetEnterpriseConfigResponse.ErrorMsg"));
		getEnterpriseConfigResponse.setSuccess(context.booleanValue("GetEnterpriseConfigResponse.Success"));

		Data data = new Data();
		data.setAuthorizationNeedAccessToken(context.booleanValue("GetEnterpriseConfigResponse.Data.AuthorizationNeedAccessToken"));
		data.setDrMeetingQrUrl(context.stringValue("GetEnterpriseConfigResponse.Data.DrMeetingQrUrl"));
		data.setDrWelcomeUrl(context.stringValue("GetEnterpriseConfigResponse.Data.DrWelcomeUrl"));
		data.setShareMboxNubmer(context.integerValue("GetEnterpriseConfigResponse.Data.ShareMboxNubmer"));
		data.setshareNeedInternet(context.booleanValue("GetEnterpriseConfigResponse.Data.shareNeedInternet"));
		data.setshareServiceFlag(context.booleanValue("GetEnterpriseConfigResponse.Data.shareServiceFlag"));
		getEnterpriseConfigResponse.setData(data);

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("GetEnterpriseConfigResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("GetEnterpriseConfigResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		getEnterpriseConfigResponse.setErrorList(errorListList);
	 
	 	return getEnterpriseConfigResponse;
	}
}