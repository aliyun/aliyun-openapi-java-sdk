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
package com.aliyuncs.yundun.transform.v20150416;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150416.AddCNameWafResponse;
import com.aliyuncs.yundun.model.v20150416.AddCNameWafResponse.WafInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCNameWafResponseUnmarshaller {

	public static AddCNameWafResponse unmarshall(AddCNameWafResponse addCNameWafResponse, UnmarshallerContext context) {
		
		addCNameWafResponse.setRequestId(context.stringValue("AddCNameWafResponse.RequestId"));

		List<WafInfo> wafInfoList = new ArrayList<WafInfo>();
		for (int i = 0; i < context.lengthValue("AddCNameWafResponse.WafInfoList.Length"); i++) {
			WafInfo  wafInfo = new WafInfo();
			wafInfo.setId(context.integerValue("AddCNameWafResponse.WafInfoList["+ i +"].Id"));
			wafInfo.setDomain(context.stringValue("AddCNameWafResponse.WafInfoList["+ i +"].Domain"));
			wafInfo.setCname(context.stringValue("AddCNameWafResponse.WafInfoList["+ i +"].Cname"));
			wafInfo.setStatus(context.integerValue("AddCNameWafResponse.WafInfoList["+ i +"].Status"));

			wafInfoList.add(wafInfo);
		}
		addCNameWafResponse.setWafInfoList(wafInfoList);
	 
	 	return addCNameWafResponse;
	}
}