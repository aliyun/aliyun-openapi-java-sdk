/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.imagesearch.transform.v20190325;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imagesearch.model.v20190325.SearchImageResponse;
import com.aliyuncs.imagesearch.model.v20190325.SearchImageResponse.Auction;
import com.aliyuncs.imagesearch.model.v20190325.SearchImageResponse.Head;
import com.aliyuncs.imagesearch.model.v20190325.SearchImageResponse.PicInfo;
import com.aliyuncs.imagesearch.model.v20190325.SearchImageResponse.PicInfo.Category;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchImageResponseUnmarshaller {

	public static SearchImageResponse unmarshall(SearchImageResponse searchImageResponse, UnmarshallerContext context) {
		
		searchImageResponse.setRequestId(context.stringValue("SearchImageResponse.RequestId"));
		searchImageResponse.setSuccess(context.booleanValue("SearchImageResponse.Success"));
		searchImageResponse.setCode(context.integerValue("SearchImageResponse.Code"));
		searchImageResponse.setMsg(context.stringValue("SearchImageResponse.Msg"));

		Head head = new Head();
		head.setDocsReturn(context.integerValue("SearchImageResponse.Head.DocsReturn"));
		head.setDocsFound(context.integerValue("SearchImageResponse.Head.DocsFound"));
		head.setSearchTime(context.integerValue("SearchImageResponse.Head.SearchTime"));
		searchImageResponse.setHead(head);

		PicInfo picInfo = new PicInfo();
		picInfo.setCategoryId(context.integerValue("SearchImageResponse.PicInfo.CategoryId"));
		picInfo.setRegion(context.stringValue("SearchImageResponse.PicInfo.Region"));

		List<Category> allCategories = new ArrayList<Category>();
		for (int i = 0; i < context.lengthValue("SearchImageResponse.PicInfo.AllCategories.Length"); i++) {
			Category category = new Category();
			category.setId(context.integerValue("SearchImageResponse.PicInfo.AllCategories["+ i +"].Id"));
			category.setName(context.stringValue("SearchImageResponse.PicInfo.AllCategories["+ i +"].Name"));

			allCategories.add(category);
		}
		picInfo.setAllCategories(allCategories);
		searchImageResponse.setPicInfo(picInfo);

		List<Auction> auctions = new ArrayList<Auction>();
		for (int i = 0; i < context.lengthValue("SearchImageResponse.Auctions.Length"); i++) {
			Auction auction = new Auction();
			auction.setCategoryId(context.integerValue("SearchImageResponse.Auctions["+ i +"].CategoryId"));
			auction.setProductId(context.stringValue("SearchImageResponse.Auctions["+ i +"].ProductId"));
			auction.setPicName(context.stringValue("SearchImageResponse.Auctions["+ i +"].PicName"));
			auction.setCustomContent(context.stringValue("SearchImageResponse.Auctions["+ i +"].CustomContent"));
			auction.setSortExprValues(context.stringValue("SearchImageResponse.Auctions["+ i +"].SortExprValues"));
			auction.setIntAttr(context.integerValue("SearchImageResponse.Auctions["+ i +"].IntAttr"));
			auction.setStrAttr(context.stringValue("SearchImageResponse.Auctions["+ i +"].StrAttr"));

			auctions.add(auction);
		}
		searchImageResponse.setAuctions(auctions);
	 
	 	return searchImageResponse;
	}
}