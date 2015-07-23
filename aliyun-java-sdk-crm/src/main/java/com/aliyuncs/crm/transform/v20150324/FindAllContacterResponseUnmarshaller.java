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
package com.aliyuncs.crm.transform.v20150324;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.crm.model.v20150324.FindAllContacterResponse;
import com.aliyuncs.crm.model.v20150324.FindAllContacterResponse.ContacterInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindAllContacterResponseUnmarshaller {

	public static FindAllContacterResponse unmarshall(FindAllContacterResponse findAllContacterResponse, UnmarshallerContext context) {
		
		findAllContacterResponse.setSuccess(context.booleanValue("FindAllContacterResponse.Success"));
		findAllContacterResponse.setResultCode(context.stringValue("FindAllContacterResponse.ResultCode"));
		findAllContacterResponse.setResultMessage(context.stringValue("FindAllContacterResponse.ResultMessage"));

		List<ContacterInfo> data = new ArrayList<ContacterInfo>();
		for (int i = 0; i < context.lengthValue("FindAllContacterResponse.Data.Length"); i++) {
			ContacterInfo  contacterInfo = new ContacterInfo();
			contacterInfo.setContacterId(context.longValue("FindAllContacterResponse.Data["+ i +"].ContacterId"));
			contacterInfo.setKpId(context.longValue("FindAllContacterResponse.Data["+ i +"].KpId"));
			contacterInfo.setCustomerId(context.longValue("FindAllContacterResponse.Data["+ i +"].CustomerId"));
			contacterInfo.setContacterName(context.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterName"));
			contacterInfo.setContacterEmail(context.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterEmail"));
			contacterInfo.setContacterMobile(context.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterMobile"));
			contacterInfo.setContacterPosition(context.stringValue("FindAllContacterResponse.Data["+ i +"].ContacterPosition"));

			data.add(contacterInfo);
		}
		findAllContacterResponse.setData(data);
	 
	 	return findAllContacterResponse;
	}
}