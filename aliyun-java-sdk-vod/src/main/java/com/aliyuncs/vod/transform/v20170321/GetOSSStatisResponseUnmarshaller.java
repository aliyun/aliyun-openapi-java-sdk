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
package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetOSSStatisResponse;
import com.aliyuncs.vod.model.v20170321.GetOSSStatisResponse.OSSMetric;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOSSStatisResponseUnmarshaller {

	public static GetOSSStatisResponse unmarshall(GetOSSStatisResponse getOSSStatisResponse, UnmarshallerContext context) {
		
		getOSSStatisResponse.setRequestId(context.stringValue("GetOSSStatisResponse.RequestId"));
		getOSSStatisResponse.setMaxStorageUtilization(context.longValue("GetOSSStatisResponse.MaxStorageUtilization"));

		List<OSSMetric> ossStatisListList = new ArrayList<OSSMetric>();
		for (int i = 0; i < context.lengthValue("GetOSSStatisResponse.OssStatisList.Length"); i++) {
			OSSMetric oSSMetric = new OSSMetric();
			oSSMetric.setStatTime(context.stringValue("GetOSSStatisResponse.OssStatisList["+ i +"].StatTime"));
			oSSMetric.setStorageUtilization(context.longValue("GetOSSStatisResponse.OssStatisList["+ i +"].StorageUtilization"));

			ossStatisListList.add(oSSMetric);
		}
		getOSSStatisResponse.setOssStatisList(ossStatisListList);
	 
	 	return getOSSStatisResponse;
	}
}