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
package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.GetStatisticsByUuidResponse;
import com.aliyuncs.aegis.model.v20161111.GetStatisticsByUuidResponse.Entity;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStatisticsByUuidResponseUnmarshaller {

	public static GetStatisticsByUuidResponse unmarshall(GetStatisticsByUuidResponse getStatisticsByUuidResponse, UnmarshallerContext context) {
		
		getStatisticsByUuidResponse.setRequestId(context.stringValue("GetStatisticsByUuidResponse.requestId"));
		getStatisticsByUuidResponse.setCode(context.stringValue("GetStatisticsByUuidResponse.Code"));
		getStatisticsByUuidResponse.setSuccess(context.booleanValue("GetStatisticsByUuidResponse.Success"));
		getStatisticsByUuidResponse.setMessage(context.stringValue("GetStatisticsByUuidResponse.Message"));

		List<Entity> data = new ArrayList<Entity>();
		for (int i = 0; i < context.lengthValue("GetStatisticsByUuidResponse.Data.Length"); i++) {
			Entity entity = new Entity();
			entity.setUuid(context.stringValue("GetStatisticsByUuidResponse.Data["+ i +"].Uuid"));
			entity.setAccount(context.integerValue("GetStatisticsByUuidResponse.Data["+ i +"].Account"));
			entity.setHealth(context.integerValue("GetStatisticsByUuidResponse.Data["+ i +"].Health"));
			entity.setPatch(context.integerValue("GetStatisticsByUuidResponse.Data["+ i +"].Patch"));
			entity.setTrojan(context.integerValue("GetStatisticsByUuidResponse.Data["+ i +"].Trojan"));
			entity.setOnline(context.booleanValue("GetStatisticsByUuidResponse.Data["+ i +"].Online"));

			data.add(entity);
		}
		getStatisticsByUuidResponse.setData(data);
	 
	 	return getStatisticsByUuidResponse;
	}
}