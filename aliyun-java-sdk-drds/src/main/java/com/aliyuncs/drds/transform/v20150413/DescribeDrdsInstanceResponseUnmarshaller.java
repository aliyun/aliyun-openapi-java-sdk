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

import com.aliyuncs.drds.model.v20150413.DescribeDrdsInstanceResponse;
import com.aliyuncs.drds.model.v20150413.DescribeDrdsInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstanceResponseUnmarshaller {

	public static DescribeDrdsInstanceResponse unmarshall(DescribeDrdsInstanceResponse describeDrdsInstanceResponse, UnmarshallerContext context) {
		

		Data  data = new Data();
		data.setDrdsInstanceId(context.stringValue("DescribeDrdsInstanceResponse.Data.DrdsInstanceId"));
		data.setType(context.integerValue("DescribeDrdsInstanceResponse.Data.Type"));
		data.setRegionId(context.stringValue("DescribeDrdsInstanceResponse.Data.RegionId"));
		data.setZoneId(context.stringValue("DescribeDrdsInstanceResponse.Data.ZoneId"));
		data.setDescription(context.stringValue("DescribeDrdsInstanceResponse.Data.Description"));
		data.setStatus(context.stringValue("DescribeDrdsInstanceResponse.Data.Status"));
		data.setVips(context.stringValue("DescribeDrdsInstanceResponse.Data.Vips"));
		data.setCreateTime(context.longValue("DescribeDrdsInstanceResponse.Data.CreateTime"));
		data.setVersion(context.longValue("DescribeDrdsInstanceResponse.Data.Version"));
		describeDrdsInstanceResponse.setData(data);
	 
	 	return describeDrdsInstanceResponse;
	}
}