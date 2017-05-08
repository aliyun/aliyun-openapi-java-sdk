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

import com.aliyuncs.itaas.model.v20170505.RemoveRegisterBoxResponse;
import com.aliyuncs.itaas.model.v20170505.RemoveRegisterBoxResponse.ErrorMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveRegisterBoxResponseUnmarshaller {

	public static RemoveRegisterBoxResponse unmarshall(RemoveRegisterBoxResponse removeRegisterBoxResponse, UnmarshallerContext context) {
		
		removeRegisterBoxResponse.setRequestId(context.stringValue("RemoveRegisterBoxResponse.RequestId"));
		removeRegisterBoxResponse.setErrorCode(context.integerValue("RemoveRegisterBoxResponse.ErrorCode"));
		removeRegisterBoxResponse.setErrorMsg(context.stringValue("RemoveRegisterBoxResponse.ErrorMsg"));
		removeRegisterBoxResponse.setSuccess(context.booleanValue("RemoveRegisterBoxResponse.Success"));

		List<ErrorMessage> errorListList = new ArrayList<ErrorMessage>();
		for (int i = 0; i < context.lengthValue("RemoveRegisterBoxResponse.ErrorList.Length"); i++) {
			ErrorMessage errorMessage = new ErrorMessage();
			errorMessage.setErrorMessage(context.stringValue("RemoveRegisterBoxResponse.ErrorList["+ i +"].ErrorMessage"));

			errorListList.add(errorMessage);
		}
		removeRegisterBoxResponse.setErrorList(errorListList);
	 
	 	return removeRegisterBoxResponse;
	}
}