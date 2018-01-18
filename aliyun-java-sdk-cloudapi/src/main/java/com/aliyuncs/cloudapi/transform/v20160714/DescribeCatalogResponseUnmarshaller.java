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
package com.aliyuncs.cloudapi.transform.v20160714;


import com.aliyuncs.cloudapi.model.v20160714.DescribeCatalogResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeCatalogResponseUnmarshaller {

	public static DescribeCatalogResponse unmarshall(DescribeCatalogResponse describeCatalogResponse, UnmarshallerContext context) {
		

		describeCatalogResponse.setRequestId(context.stringValue("DescribeCatalogResponse.RequestId"));

		describeCatalogResponse.setCatalogId(context.stringValue("DescribeCatalogResponse.CatalogId"));

		describeCatalogResponse.setCatalogName(context.stringValue("DescribeCatalogResponse.CatalogName"));

		describeCatalogResponse.setDescription(context.stringValue("DescribeCatalogResponse.Description"));

		describeCatalogResponse.setParentId(context.stringValue("DescribeCatalogResponse.ParentId"));

		describeCatalogResponse.setCreatedTime(context.stringValue("DescribeCatalogResponse.CreatedTime"));

		describeCatalogResponse.setModifiedTime(context.stringValue("DescribeCatalogResponse.ModifiedTime"));

		describeCatalogResponse.setRegionId(context.stringValue("DescribeCatalogResponse.RegionId"));



		List<String> apiIds = new ArrayList<String>();

		for (int i = 0; i < context.lengthValue("DescribeCatalogResponse.ApiIds.Length"); i++) {

			apiIds.add(context.stringValue("DescribeCatalogResponse.ApiIds["+ i +"]"));

		}

		describeCatalogResponse.setApiIds(apiIds);
	 
	 	return describeCatalogResponse;
	}
}