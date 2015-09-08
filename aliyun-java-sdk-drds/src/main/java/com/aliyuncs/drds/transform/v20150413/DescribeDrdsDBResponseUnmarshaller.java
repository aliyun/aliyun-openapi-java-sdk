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
package com.aliyuncs.drds.transform.v20150413;

import com.aliyuncs.drds.model.v20150413.DescribeDrdsDBResponse;
import com.aliyuncs.drds.model.v20150413.DescribeDrdsDBResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDBResponseUnmarshaller {

	public static DescribeDrdsDBResponse unmarshall(DescribeDrdsDBResponse describeDrdsDBResponse, UnmarshallerContext context) {
		
		describeDrdsDBResponse.setRequestId(context.stringValue("DescribeDrdsDBResponse.RequestId"));
		describeDrdsDBResponse.setSuccess(context.booleanValue("DescribeDrdsDBResponse.Success"));

		Data  data = new Data();
		data.setDbName(context.stringValue("DescribeDrdsDBResponse.Data.DbName"));
		data.setStatus(context.integerValue("DescribeDrdsDBResponse.Data.Status"));
		data.setCreateTime(context.stringValue("DescribeDrdsDBResponse.Data.CreateTime"));
		data.setMsg(context.stringValue("DescribeDrdsDBResponse.Data.Msg"));
		data.setMode(context.stringValue("DescribeDrdsDBResponse.Data.Mode"));
		describeDrdsDBResponse.setData(data);
	 
	 	return describeDrdsDBResponse;
	}
}