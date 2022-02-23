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

package com.aliyuncs.unimkt.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.SearchAdvertisingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchAdvertisingResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMsg;

	private Result result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String bidid;

		private List<SeatBidItem> seatbid;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBidid() {
			return this.bidid;
		}

		public void setBidid(String bidid) {
			this.bidid = bidid;
		}

		public List<SeatBidItem> getSeatbid() {
			return this.seatbid;
		}

		public void setSeatbid(List<SeatBidItem> seatbid) {
			this.seatbid = seatbid;
		}

		public static class SeatBidItem {

			private List<BidItem> bid;

			public List<BidItem> getBid() {
				return this.bid;
			}

			public void setBid(List<BidItem> bid) {
				this.bid = bid;
			}

			public static class BidItem {

				private String impid;

				private List<Ad> ads;

				public String getImpid() {
					return this.impid;
				}

				public void setImpid(String impid) {
					this.impid = impid;
				}

				public List<Ad> getAds() {
					return this.ads;
				}

				public void setAds(List<Ad> ads) {
					this.ads = ads;
				}

				public static class Ad {

					private String id;

					private String brandid;

					private String type;

					private String objective;

					private String marketingtype;

					private String style;

					private String crid;

					private Integer interacttype;

					private String crurl;

					private List<String> landingurls;

					private Trackers trackers;

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getBrandid() {
						return this.brandid;
					}

					public void setBrandid(String brandid) {
						this.brandid = brandid;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getObjective() {
						return this.objective;
					}

					public void setObjective(String objective) {
						this.objective = objective;
					}

					public String getMarketingtype() {
						return this.marketingtype;
					}

					public void setMarketingtype(String marketingtype) {
						this.marketingtype = marketingtype;
					}

					public String getStyle() {
						return this.style;
					}

					public void setStyle(String style) {
						this.style = style;
					}

					public String getCrid() {
						return this.crid;
					}

					public void setCrid(String crid) {
						this.crid = crid;
					}

					public Integer getInteracttype() {
						return this.interacttype;
					}

					public void setInteracttype(Integer interacttype) {
						this.interacttype = interacttype;
					}

					public String getCrurl() {
						return this.crurl;
					}

					public void setCrurl(String crurl) {
						this.crurl = crurl;
					}

					public List<String> getLandingurls() {
						return this.landingurls;
					}

					public void setLandingurls(List<String> landingurls) {
						this.landingurls = landingurls;
					}

					public Trackers getTrackers() {
						return this.trackers;
					}

					public void setTrackers(Trackers trackers) {
						this.trackers = trackers;
					}

					public static class Trackers {

						private List<String> impressions;

						public List<String> getImpressions() {
							return this.impressions;
						}

						public void setImpressions(List<String> impressions) {
							this.impressions = impressions;
						}
					}
				}
			}
		}
	}

	@Override
	public SearchAdvertisingResponse getInstance(UnmarshallerContext context) {
		return	SearchAdvertisingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
