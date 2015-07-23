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

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.drds.model.v20150413.DescribeDrdsInstancesResponse;
import com.aliyuncs.drds.model.v20150413.DescribeDrdsInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsInstancesResponseUnmarshaller {

	public static DescribeDrdsInstancesResponse unmarshall(DescribeDrdsInstancesResponse describeDrdsInstancesResponse, UnmarshallerContext context) {
		

		List<Instance> data = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsInstancesResponse.Data.Length"); i++) {
			Instance  instance = new Instance();
			instance.setDrdsInstanceId(context.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].DrdsInstanceId"));
			instance.setType(context.integerValue("DescribeDrdsInstancesResponse.Data["+ i +"].Type"));
			instance.setRegionId(context.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].RegionId"));
			instance.setZoneId(context.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].ZoneId"));
			instance.setDescription(context.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Description"));
			instance.setStatus(context.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Status"));
			instance.setVips(context.stringValue("DescribeDrdsInstancesResponse.Data["+ i +"].Vips"));
			instance.setCreateTime(context.longValue("DescribeDrdsInstancesResponse.Data["+ i +"].CreateTime"));
			instance.setVersion(context.longValue("DescribeDrdsInstancesResponse.Data["+ i +"].Version"));

			data.add(instance);
		}
		describeDrdsInstancesResponse.setData(data);
	 
	 	return describeDrdsInstancesResponse;
	}
}