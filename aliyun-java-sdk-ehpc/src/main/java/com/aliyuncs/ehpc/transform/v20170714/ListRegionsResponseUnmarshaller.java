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
package com.aliyuncs.ehpc.transform.v20170714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20170714.ListRegionsResponse;
import com.aliyuncs.ehpc.model.v20170714.ListRegionsResponse.RegionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegionsResponseUnmarshaller {

	public static ListRegionsResponse unmarshall(ListRegionsResponse listRegionsResponse, UnmarshallerContext context) {
		
		listRegionsResponse.setRequestId(context.stringValue("ListRegionsResponse.RequestId"));

		List<RegionInfo> regions = new ArrayList<RegionInfo>();
		for (int i = 0; i < context.lengthValue("ListRegionsResponse.Regions.Length"); i++) {
			RegionInfo regionInfo = new RegionInfo();
			regionInfo.setRegionId(context.stringValue("ListRegionsResponse.Regions["+ i +"].RegionId"));
			regionInfo.setLocalName(context.stringValue("ListRegionsResponse.Regions["+ i +"].LocalName"));

			regions.add(regionInfo);
		}
		listRegionsResponse.setRegions(regions);
	 
	 	return listRegionsResponse;
	}
}