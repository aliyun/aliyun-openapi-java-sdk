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

import com.aliyuncs.itaas.model.v20170505.UpdateRoomNameResponse;
import com.aliyuncs.itaas.model.v20170505.UpdateRoomNameResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRoomNameResponseUnmarshaller {

	public static UpdateRoomNameResponse unmarshall(UpdateRoomNameResponse updateRoomNameResponse, UnmarshallerContext context) {
		
		updateRoomNameResponse.setRequestId(context.stringValue("UpdateRoomNameResponse.RequestId"));
		updateRoomNameResponse.setErrorCode(context.integerValue("UpdateRoomNameResponse.ErrorCode"));
		updateRoomNameResponse.setErrorMsg(context.stringValue("UpdateRoomNameResponse.ErrorMsg"));
		updateRoomNameResponse.setSuccess(context.booleanValue("UpdateRoomNameResponse.Success"));

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("UpdateRoomNameResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("UpdateRoomNameResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		updateRoomNameResponse.setErrorList(errorListList);
	 
	 	return updateRoomNameResponse;
	}
}