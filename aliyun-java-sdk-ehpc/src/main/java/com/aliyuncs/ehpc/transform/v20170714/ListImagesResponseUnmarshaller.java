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

import com.aliyuncs.ehpc.model.v20170714.ListImagesResponse;
import com.aliyuncs.ehpc.model.v20170714.ListImagesResponse.OsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext context) {
		
		listImagesResponse.setRequestId(context.stringValue("ListImagesResponse.RequestId"));

		List<OsInfo> osTags = new ArrayList<OsInfo>();
		for (int i = 0; i < context.lengthValue("ListImagesResponse.OsTags.Length"); i++) {
			OsInfo osInfo = new OsInfo();
			osInfo.setOsTag(context.stringValue("ListImagesResponse.OsTags["+ i +"].OsTag"));
			osInfo.setPlatform(context.stringValue("ListImagesResponse.OsTags["+ i +"].Platform"));
			osInfo.setVersion(context.stringValue("ListImagesResponse.OsTags["+ i +"].Version"));
			osInfo.setArchitecture(context.stringValue("ListImagesResponse.OsTags["+ i +"].Architecture"));

			osTags.add(osInfo);
		}
		listImagesResponse.setOsTags(osTags);
	 
	 	return listImagesResponse;
	}
}