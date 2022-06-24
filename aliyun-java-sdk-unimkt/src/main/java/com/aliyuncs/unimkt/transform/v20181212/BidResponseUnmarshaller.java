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

import com.aliyuncs.unimkt.model.v20181212.BidResponse;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Result;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Result.SeatBidItem;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Result.SeatBidItem.BidItem;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Result.SeatBidItem.BidItem.Ad;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Result.SeatBidItem.BidItem.Ad.Icon;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Result.SeatBidItem.BidItem.Ad.Image;
import com.aliyuncs.unimkt.model.v20181212.BidResponse.Result.SeatBidItem.BidItem.Ad.Trackers;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BidResponseUnmarshaller {

	public static BidResponse unmarshall(BidResponse bidResponse, UnmarshallerContext _ctx) {
		
		bidResponse.setRequestId(_ctx.stringValue("BidResponse.RequestId"));
		bidResponse.setExt(_ctx.mapValue("BidResponse.Ext"));
		bidResponse.setErrormsg(_ctx.stringValue("BidResponse.Errormsg"));
		bidResponse.setErrorcode(_ctx.stringValue("BidResponse.Errorcode"));
		bidResponse.setSuccess(_ctx.booleanValue("BidResponse.Success"));

		Header header = new Header();
		header.setCostTime(_ctx.longValue("BidResponse.Header.CostTime"));
		header.setVersion(_ctx.stringValue("BidResponse.Header.Version"));
		header.setRpcId(_ctx.stringValue("BidResponse.Header.RpcId"));
		header.setTraceId(_ctx.stringValue("BidResponse.Header.TraceId"));
		bidResponse.setHeader(header);

		Result result = new Result();
		result.setId(_ctx.stringValue("BidResponse.Result.Id"));
		result.setBidid(_ctx.stringValue("BidResponse.Result.Bidid"));

		List<SeatBidItem> seatbid = new ArrayList<SeatBidItem>();
		for (int i = 0; i < _ctx.lengthValue("BidResponse.Result.Seatbid.Length"); i++) {
			SeatBidItem seatBidItem = new SeatBidItem();

			List<BidItem> bid = new ArrayList<BidItem>();
			for (int j = 0; j < _ctx.lengthValue("BidResponse.Result.Seatbid["+ i +"].Bid.Length"); j++) {
				BidItem bidItem = new BidItem();
				bidItem.setImpid(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Impid"));

				List<Ad> ads = new ArrayList<Ad>();
				for (int k = 0; k < _ctx.lengthValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads.Length"); k++) {
					Ad ad = new Ad();
					ad.setId(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Id"));
					ad.setSeat(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Seat"));
					ad.setType(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Type"));
					ad.setObjective(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Objective"));
					ad.setMarketingtype(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Marketingtype"));
					ad.setStyle(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Style"));
					ad.setCrid(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Crid"));
					ad.setInteracttype(_ctx.integerValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Interacttype"));
					ad.setCrurl(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Crurl"));
					ad.setTitle(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Title"));
					ad.setPrice(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Price"));
					ad.setLabeltype(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Labeltype"));

					List<String> landingurls = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Landingurls.Length"); l++) {
						landingurls.add(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Landingurls["+ l +"]"));
					}
					ad.setLandingurls(landingurls);

					Trackers trackers = new Trackers();

					List<String> imps = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Trackers.Imps.Length"); l++) {
						imps.add(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Trackers.Imps["+ l +"]"));
					}
					trackers.setImps(imps);
					ad.setTrackers(trackers);

					Icon icon = new Icon();
					icon.setUrl(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].icon.url"));
					ad.setIcon(icon);

					List<Image> images = new ArrayList<Image>();
					for (int l = 0; l < _ctx.lengthValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].images.Length"); l++) {
						Image image = new Image();
						image.setUrl(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].images["+ l +"].url"));
						image.setFormat(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].images["+ l +"].format"));
						image.setDesc(_ctx.stringValue("BidResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].images["+ l +"].desc"));

						images.add(image);
					}
					ad.setImages(images);

					ads.add(ad);
				}
				bidItem.setAds(ads);

				bid.add(bidItem);
			}
			seatBidItem.setBid(bid);

			seatbid.add(seatBidItem);
		}
		result.setSeatbid(seatbid);
		bidResponse.setResult(result);
	 
	 	return bidResponse;
	}
}