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
package com.aliyuncs.teslamaxcompute.transform.v20171130;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20171130.GetUserInfoResponse;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetUserInfoResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetUserInfoResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInfoResponseUnmarshaller {

	public static GetUserInfoResponse unmarshall(GetUserInfoResponse getUserInfoResponse, UnmarshallerContext context) {
		
		getUserInfoResponse.setRequestId(context.stringValue("GetUserInfoResponse.RequestId"));
		getUserInfoResponse.setCode(context.integerValue("GetUserInfoResponse.Code"));
		getUserInfoResponse.setMessage(context.stringValue("GetUserInfoResponse.Message"));

		Data data = new Data();
		data.setTotal(context.integerValue("GetUserInfoResponse.Data.Total"));

		List<Instance> detail = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("GetUserInfoResponse.Data.Detail.Length"); i++) {
			Instance instance = new Instance();
			instance.setProject(context.stringValue("GetUserInfoResponse.Data.Detail["+ i +"].Project"));
			instance.setInstanceId(context.stringValue("GetUserInfoResponse.Data.Detail["+ i +"].InstanceId"));
			instance.setStatus(context.stringValue("GetUserInfoResponse.Data.Detail["+ i +"].Status"));
			instance.setUserAccount(context.stringValue("GetUserInfoResponse.Data.Detail["+ i +"].UserAccount"));
			instance.setNickName(context.stringValue("GetUserInfoResponse.Data.Detail["+ i +"].NickName"));
			instance.setCluster(context.stringValue("GetUserInfoResponse.Data.Detail["+ i +"].Cluster"));
			instance.setRunTime(context.stringValue("GetUserInfoResponse.Data.Detail["+ i +"].RunTime"));

			detail.add(instance);
		}
		data.setDetail(detail);
		getUserInfoResponse.setData(data);
	 
	 	return getUserInfoResponse;
	}
}