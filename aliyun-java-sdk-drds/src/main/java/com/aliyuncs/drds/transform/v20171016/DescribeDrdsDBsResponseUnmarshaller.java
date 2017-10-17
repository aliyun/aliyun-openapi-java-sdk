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
package com.aliyuncs.drds.transform.v20171016;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20171016.DescribeDrdsDBsResponse;
import com.aliyuncs.drds.model.v20171016.DescribeDrdsDBsResponse.Db;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDBsResponseUnmarshaller {

	public static DescribeDrdsDBsResponse unmarshall(DescribeDrdsDBsResponse describeDrdsDBsResponse, UnmarshallerContext context) {
		
		describeDrdsDBsResponse.setRequestId(context.stringValue("DescribeDrdsDBsResponse.RequestId"));
		describeDrdsDBsResponse.setSuccess(context.booleanValue("DescribeDrdsDBsResponse.Success"));

		List<Db> data = new ArrayList<Db>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsDBsResponse.Data.Length"); i++) {
			Db db = new Db();
			db.setDbName(context.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].DbName"));
			db.setStatus(context.integerValue("DescribeDrdsDBsResponse.Data["+ i +"].Status"));
			db.setCreateTime(context.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].CreateTime"));
			db.setMsg(context.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].Msg"));
			db.setMode(context.stringValue("DescribeDrdsDBsResponse.Data["+ i +"].Mode"));

			data.add(db);
		}
		describeDrdsDBsResponse.setData(data);
	 
	 	return describeDrdsDBsResponse;
	}
}