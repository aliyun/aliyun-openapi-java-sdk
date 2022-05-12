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
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem.BidItem;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem.BidItem.Ad;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem.BidItem.Ad.Icon;
import com.aliyuncs.unimkt.model.v20181212.SearchAdvertisingResponse.Result.SeatBidItem.BidItem.Ad.Trackers;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAdvertisingResponseUnmarshaller {

	public static SearchAdvertisingResponse unmarshall(SearchAdvertisingResponse searchAdvertisingResponse, UnmarshallerContext _ctx) {
		
		searchAdvertisingResponse.setRequestId(_ctx.stringValue("SearchAdvertisingResponse.RequestId"));
		searchAdvertisingResponse.setExt(_ctx.mapValue("SearchAdvertisingResponse.Ext"));
		searchAdvertisingResponse.setErrorMsg(_ctx.stringValue("SearchAdvertisingResponse.ErrorMsg"));
		searchAdvertisingResponse.setErrorCode(_ctx.stringValue("SearchAdvertisingResponse.ErrorCode"));
		searchAdvertisingResponse.setSuccess(_ctx.booleanValue("SearchAdvertisingResponse.Success"));

		Header header = new Header();
		header.setCostTime(_ctx.longValue("SearchAdvertisingResponse.Header.CostTime"));
		header.setVersion(_ctx.stringValue("SearchAdvertisingResponse.Header.Version"));
		header.setRpcId(_ctx.stringValue("SearchAdvertisingResponse.Header.RpcId"));
		header.setTraceId(_ctx.stringValue("SearchAdvertisingResponse.Header.TraceId"));
		searchAdvertisingResponse.setHeader(header);

		Result result = new Result();
		result.setId(_ctx.stringValue("SearchAdvertisingResponse.Result.Id"));
		result.setBidid(_ctx.stringValue("SearchAdvertisingResponse.Result.Bidid"));

		List<SeatBidItem> seatbid = new ArrayList<SeatBidItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAdvertisingResponse.Result.Seatbid.Length"); i++) {
			SeatBidItem seatBidItem = new SeatBidItem();

			List<BidItem> bid = new ArrayList<BidItem>();
			for (int j = 0; j < _ctx.lengthValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid.Length"); j++) {
				BidItem bidItem = new BidItem();
				bidItem.setImpid(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Impid"));

				List<Ad> ads = new ArrayList<Ad>();
				for (int k = 0; k < _ctx.lengthValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads.Length"); k++) {
					Ad ad = new Ad();
					ad.setId(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Id"));
					ad.setBrandid(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Brandid"));
					ad.setType(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Type"));
					ad.setObjective(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Objective"));
					ad.setMarketingtype(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Marketingtype"));
					ad.setStyle(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Style"));
					ad.setCrid(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Crid"));
					ad.setInteracttype(_ctx.integerValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Interacttype"));
					ad.setCrurl(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Crurl"));
					ad.setTitle(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Title"));
					ad.setCommission(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Commission"));
					ad.setLabeltype(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Labeltype"));

					List<String> landingurls = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Landingurls.Length"); l++) {
						landingurls.add(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Landingurls["+ l +"]"));
					}
					ad.setLandingurls(landingurls);

					Trackers trackers = new Trackers();

					List<String> impressions = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Trackers.Impressions.Length"); l++) {
						impressions.add(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Trackers.Impressions["+ l +"]"));
					}
					trackers.setImpressions(impressions);
					ad.setTrackers(trackers);

					Icon icon = new Icon();
					icon.setUrl(_ctx.stringValue("SearchAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].icon.url"));
					ad.setIcon(icon);

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