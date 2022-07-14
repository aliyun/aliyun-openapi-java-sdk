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

package com.aliyuncs.imarketing.transform.v20220704;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Header;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Result;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Result.SeatBidItem;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Result.SeatBidItem.BidItem;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Result.SeatBidItem.BidItem.Ad;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Result.SeatBidItem.BidItem.Ad.Icon;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Result.SeatBidItem.BidItem.Ad.Image;
import com.aliyuncs.imarketing.model.v20220704.ListAdvertisingResponse.Result.SeatBidItem.BidItem.Ad.Trackers;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAdvertisingResponseUnmarshaller {

	public static ListAdvertisingResponse unmarshall(ListAdvertisingResponse listAdvertisingResponse, UnmarshallerContext _ctx) {
		
		listAdvertisingResponse.setRequestId(_ctx.stringValue("ListAdvertisingResponse.RequestId"));
		listAdvertisingResponse.setExt(_ctx.mapValue("ListAdvertisingResponse.Ext"));
		listAdvertisingResponse.setErrormsg(_ctx.stringValue("ListAdvertisingResponse.Errormsg"));
		listAdvertisingResponse.setErrorcode(_ctx.stringValue("ListAdvertisingResponse.Errorcode"));
		listAdvertisingResponse.setSuccess(_ctx.booleanValue("ListAdvertisingResponse.Success"));

		Header header = new Header();
		header.setCostTime(_ctx.longValue("ListAdvertisingResponse.Header.CostTime"));
		header.setVersion(_ctx.stringValue("ListAdvertisingResponse.Header.Version"));
		header.setRpcId(_ctx.stringValue("ListAdvertisingResponse.Header.RpcId"));
		header.setTraceId(_ctx.stringValue("ListAdvertisingResponse.Header.TraceId"));
		listAdvertisingResponse.setHeader(header);

		Result result = new Result();
		result.setId(_ctx.stringValue("ListAdvertisingResponse.Result.Id"));
		result.setBidid(_ctx.stringValue("ListAdvertisingResponse.Result.Bidid"));

		List<SeatBidItem> seatbid = new ArrayList<SeatBidItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAdvertisingResponse.Result.Seatbid.Length"); i++) {
			SeatBidItem seatBidItem = new SeatBidItem();

			List<BidItem> bid = new ArrayList<BidItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid.Length"); j++) {
				BidItem bidItem = new BidItem();
				bidItem.setImpid(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Impid"));

				List<Ad> ads = new ArrayList<Ad>();
				for (int k = 0; k < _ctx.lengthValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads.Length"); k++) {
					Ad ad = new Ad();
					ad.setId(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Id"));
					ad.setSeat(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Seat"));
					ad.setType(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Type"));
					ad.setObjective(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Objective"));
					ad.setMarketingtype(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Marketingtype"));
					ad.setStyle(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Style"));
					ad.setCrid(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Crid"));
					ad.setInteracttype(_ctx.integerValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Interacttype"));
					ad.setCrurl(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Crurl"));
					ad.setTitle(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Title"));
					ad.setPrice(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Price"));
					ad.setLabeltype(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Labeltype"));

					List<String> landingurls = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Landingurls.Length"); l++) {
						landingurls.add(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Landingurls["+ l +"]"));
					}
					ad.setLandingurls(landingurls);

					Trackers trackers = new Trackers();

					List<String> imps = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Trackers.Imps.Length"); l++) {
						imps.add(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Trackers.Imps["+ l +"]"));
					}
					trackers.setImps(imps);
					ad.setTrackers(trackers);

					Icon icon = new Icon();
					icon.setUrl(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Icon.Url"));
					ad.setIcon(icon);

					List<Image> images = new ArrayList<Image>();
					for (int l = 0; l < _ctx.lengthValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Images.Length"); l++) {
						Image image = new Image();
						image.setUrl(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Images["+ l +"].Url"));
						image.setFormat(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Images["+ l +"].Format"));
						image.setDesc(_ctx.stringValue("ListAdvertisingResponse.Result.Seatbid["+ i +"].Bid["+ j +"].Ads["+ k +"].Images["+ l +"].Desc"));

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
		listAdvertisingResponse.setResult(result);
	 
	 	return listAdvertisingResponse;
	}
}