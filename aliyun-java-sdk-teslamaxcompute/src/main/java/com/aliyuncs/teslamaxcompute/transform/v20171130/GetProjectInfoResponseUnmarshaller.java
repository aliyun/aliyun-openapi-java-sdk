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

import com.aliyuncs.teslamaxcompute.model.v20171130.GetProjectInfoResponse;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetProjectInfoResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20171130.GetProjectInfoResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectInfoResponseUnmarshaller {

	public static GetProjectInfoResponse unmarshall(GetProjectInfoResponse getProjectInfoResponse, UnmarshallerContext context) {
		
		getProjectInfoResponse.setCode(context.integerValue("GetProjectInfoResponse.code"));
		getProjectInfoResponse.setMessage(context.stringValue("GetProjectInfoResponse.message"));
		getProjectInfoResponse.setRequest_id(context.stringValue("GetProjectInfoResponse.request_id"));

		Data data = new Data();
		data.setTotal(context.integerValue("GetProjectInfoResponse.data.total"));

		List<Instance> detail = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("GetProjectInfoResponse.data.detail.Length"); i++) {
			Instance instance = new Instance();
			instance.setProject(context.stringValue("GetProjectInfoResponse.data.detail["+ i +"].project"));
			instance.setInstanceid(context.stringValue("GetProjectInfoResponse.data.detail["+ i +"].instanceid"));
			instance.setStatus(context.stringValue("GetProjectInfoResponse.data.detail["+ i +"].status"));
			instance.setUserAccount(context.stringValue("GetProjectInfoResponse.data.detail["+ i +"].userAccount"));
			instance.setChName(context.stringValue("GetProjectInfoResponse.data.detail["+ i +"].chName"));
			instance.setCluster(context.stringValue("GetProjectInfoResponse.data.detail["+ i +"].cluster"));
			instance.setRunTime(context.stringValue("GetProjectInfoResponse.data.detail["+ i +"].runTime"));

			detail.add(instance);
		}
		data.setDetail(detail);
		getProjectInfoResponse.setData(data);
	 
	 	return getProjectInfoResponse;
	}
}