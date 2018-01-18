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


import com.aliyuncs.cloudapi.model.v20160714.DescribeCatalogsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeCatalogsResponse.CatalogAttribute;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeCatalogsResponseUnmarshaller {

	public static DescribeCatalogsResponse unmarshall(DescribeCatalogsResponse describeCatalogsResponse, UnmarshallerContext context) {
		

		describeCatalogsResponse.setRequestId(context.stringValue("DescribeCatalogsResponse.RequestId"));

		describeCatalogsResponse.setTotalCount(context.integerValue("DescribeCatalogsResponse.TotalCount"));

		describeCatalogsResponse.setPageSize(context.integerValue("DescribeCatalogsResponse.PageSize"));

		describeCatalogsResponse.setPageNumber(context.integerValue("DescribeCatalogsResponse.PageNumber"));



		List<CatalogAttribute> catalogAttributes = new ArrayList<CatalogAttribute>();

		for (int i = 0; i < context.lengthValue("DescribeCatalogsResponse.CatalogAttributes.Length"); i++) {

			CatalogAttribute catalogAttribute = new CatalogAttribute();

			catalogAttribute.setCatalogId(context.stringValue("DescribeCatalogsResponse.CatalogAttributes["+ i +"].CatalogId"));

			catalogAttribute.setCatalogName(context.stringValue("DescribeCatalogsResponse.CatalogAttributes["+ i +"].CatalogName"));

			catalogAttribute.setDescription(context.stringValue("DescribeCatalogsResponse.CatalogAttributes["+ i +"].Description"));

			catalogAttribute.setParentId(context.stringValue("DescribeCatalogsResponse.CatalogAttributes["+ i +"].ParentId"));

			catalogAttribute.setCreatedTime(context.stringValue("DescribeCatalogsResponse.CatalogAttributes["+ i +"].CreatedTime"));

			catalogAttribute.setModifiedTime(context.stringValue("DescribeCatalogsResponse.CatalogAttributes["+ i +"].ModifiedTime"));

			catalogAttribute.setRegionId(context.stringValue("DescribeCatalogsResponse.CatalogAttributes["+ i +"].RegionId"));



			catalogAttributes.add(catalogAttribute);

		}

		describeCatalogsResponse.setCatalogAttributes(catalogAttributes);
	 
	 	return describeCatalogsResponse;
	}
}