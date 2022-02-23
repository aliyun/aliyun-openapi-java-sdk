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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem.BidItem;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem.BidItem.Ad;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem.BidItem.Ad.Trackers;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAdvertisingResponseUnmarshaller {

	public static SearchAdvertisingResponse unmarshall(SearchAdvertisingResponse searchAdvertisingResponse, UnmarshallerContext _ctx) {
		
		searchAdvertisingResponse.setSuccess(_ctx.booleanValue("SearchAdvertisingResponse.success"));
		searchAdvertisingResponse.setErrorCode(_ctx.stringValue("SearchAdvertisingResponse.errorCode"));
		searchAdvertisingResponse.setErrorMsg(_ctx.stringValue("SearchAdvertisingResponse.errorMsg"));

		Result result = new Result();
		result.setId(_ctx.stringValue("SearchAdvertisingResponse.result.id"));
		result.setBidid(_ctx.stringValue("SearchAdvertisingResponse.result.bidid"));

		List<SeatBidItem> seatbid = new ArrayList<SeatBidItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAdvertisingResponse.result.seatbid.Length"); i++) {
			SeatBidItem seatBidItem = new SeatBidItem();

			List<BidItem> bid = new ArrayList<BidItem>();
			for (int j = 0; j < _ctx.lengthValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid.Length"); j++) {
				BidItem bidItem = new BidItem();
				bidItem.setImpid(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].impid"));

				List<Ad> ads = new ArrayList<Ad>();
				for (int k = 0; k < _ctx.lengthValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads.Length"); k++) {
					Ad ad = new Ad();
					ad.setId(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].id"));
					ad.setBrandid(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].brandid"));
					ad.setType(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].type"));
					ad.setObjective(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].objective"));
					ad.setMarketingtype(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].marketingtype"));
					ad.setStyle(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].style"));
					ad.setCrid(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].crid"));
					ad.setInteracttype(_ctx.integerValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].interacttype"));
					ad.setCrurl(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].crurl"));

					List<String> landingurls = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].landingurls.Length"); l++) {
						landingurls.add(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].landingurls["+ l +"]"));
					}
					ad.setLandingurls(landingurls);

					Trackers trackers = new Trackers();

					List<String> impressions = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].trackers.impressions.Length"); l++) {
						impressions.add(_ctx.stringValue("SearchAdvertisingResponse.result.seatbid["+ i +"].bid["+ j +"].ads["+ k +"].trackers.impressions["+ l +"]"));
					}
					trackers.setImpressions(impressions);
					ad.setTrackers(trackers);

					ads.add(ad);
				}
				bidItem.setAds(ads);

				bid.add(bidItem);
			}
			seatBidItem.setBid(bid);

			seatbid.add(seatBidItem);
		}
		result.setSeatbid(seatbid);
		searchAdvertisingResponse.setResult(result);
	 
	 	return searchAdvertisingResponse;
	}
}