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
package com.aliyuncs.ossadmin.transform.v20150520;

import com.aliyuncs.ossadmin.model.v20150520.GetImgVpcInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImgVpcInfoResponseUnmarshaller {

	public static GetImgVpcInfoResponse unmarshall(GetImgVpcInfoResponse getImgVpcInfoResponse, UnmarshallerContext context) {
		
		getImgVpcInfoResponse.setrequestId(context.stringValue("GetImgVpcInfoResponse.requestId"));
		getImgVpcInfoResponse.setvip(context.stringValue("GetImgVpcInfoResponse.vip"));
		getImgVpcInfoResponse.setvpcId(context.stringValue("GetImgVpcInfoResponse.vpcId"));
	 
	 	return getImgVpcInfoResponse;
	}
}