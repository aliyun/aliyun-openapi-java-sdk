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
package com.aliyuncs.imagesearch.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imagesearch.model.v20180120.SearchItemResponse;
import com.aliyuncs.imagesearch.model.v20180120.SearchItemResponse.Auction;
import com.aliyuncs.imagesearch.model.v20180120.SearchItemResponse.Head;
import com.aliyuncs.imagesearch.model.v20180120.SearchItemResponse.PicInfo;
import com.aliyuncs.imagesearch.model.v20180120.SearchItemResponse.PicInfo.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchItemResponseUnmarshaller {

	public static SearchItemResponse unmarshall(SearchItemResponse searchItemResponse, UnmarshallerContext context) {
		
		searchItemResponse.setRequestId(context.stringValue("SearchItemResponse.RequestId"));
		searchItemResponse.setSuccess(context.booleanValue("SearchItemResponse.Success"));
		searchItemResponse.setMessage(context.stringValue("SearchItemResponse.Message"));
		searchItemResponse.setCode(context.integerValue("SearchItemResponse.Code"));

		Head head = new Head();
		head.setSearchTime(context.integerValue("SearchItemResponse.Head.SearchTime"));
		head.setDocsFound(context.integerValue("SearchItemResponse.Head.DocsFound"));
		head.setDocsReturn(context.integerValue("SearchItemResponse.Head.DocsReturn"));
		searchItemResponse.setHead(head);

		PicInfo picInfo = new PicInfo();
		picInfo.setCategory(context.stringValue("SearchItemResponse.PicInfo.Category"));
		picInfo.setRegion(context.stringValue("SearchItemResponse.PicInfo.Region"));

		List<Category> allCategory = new ArrayList<Category>();
		for (int i = 0; i < context.lengthValue("SearchItemResponse.PicInfo.AllCategory.Length"); i++) {
			Category category = new Category();
			category.setName(context.stringValue("SearchItemResponse.PicInfo.AllCategory["+ i +"].Name"));
			category.setId(context.stringValue("SearchItemResponse.PicInfo.AllCategory["+ i +"].Id"));

			allCategory.add(category);
		}
		picInfo.setAllCategory(allCategory);
		searchItemResponse.setPicInfo(picInfo);

		List<Auction> auctions = new ArrayList<Auction>();
		for (int i = 0; i < context.lengthValue("SearchItemResponse.Auctions.Length"); i++) {
			Auction auction = new Auction();
			auction.setCustContent(context.stringValue("SearchItemResponse.Auctions["+ i +"].CustContent"));
			auction.setProductId(context.stringValue("SearchItemResponse.Auctions["+ i +"].ProductId"));
			auction.setSortExprValues(context.stringValue("SearchItemResponse.Auctions["+ i +"].SortExprValues"));
			auction.setCatId(context.stringValue("SearchItemResponse.Auctions["+ i +"].CatId"));
			auction.setPicName(context.stringValue("SearchItemResponse.Auctions["+ i +"].PicName"));

			auctions.add(auction);
		}
		searchItemResponse.setAuctions(auctions);
	 
	 	return searchItemResponse;
	}
}