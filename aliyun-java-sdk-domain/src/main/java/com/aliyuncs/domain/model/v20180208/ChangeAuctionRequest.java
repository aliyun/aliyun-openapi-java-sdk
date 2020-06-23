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

package com.aliyuncs.domain.model.v20180208;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeAuctionRequest extends RpcAcsRequest<ChangeAuctionResponse> {
	   

	private List<AuctionList> auctionLists;
	public ChangeAuctionRequest() {
		super("Domain", "2018-02-08", "ChangeAuction", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AuctionList> getAuctionLists() {
		return this.auctionLists;
	}

	public void setAuctionLists(List<AuctionList> auctionLists) {
		this.auctionLists = auctionLists;	
		if (auctionLists != null) {
			for (int depth1 = 0; depth1 < auctionLists.size(); depth1++) {
				putBodyParameter("AuctionList." + (depth1 + 1) + ".Winner" , auctionLists.get(depth1).getWinner());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".ReserveRange" , auctionLists.get(depth1).getReserveRange());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".DomainName" , auctionLists.get(depth1).getDomainName());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".EndTime" , auctionLists.get(depth1).getEndTime());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".TimeLeft" , auctionLists.get(depth1).getTimeLeft());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".IsReserve" , auctionLists.get(depth1).getIsReserve());
				if (auctionLists.get(depth1).getBidRecordss() != null) {
					for (int depth2 = 0; depth2 < auctionLists.get(depth1).getBidRecordss().size(); depth2++) {
						putBodyParameter("AuctionList." + (depth1 + 1) + ".BidRecords." + (depth2 + 1) + ".CreateTime" , auctionLists.get(depth1).getBidRecordss().get(depth2).getCreateTime());
						putBodyParameter("AuctionList." + (depth1 + 1) + ".BidRecords." + (depth2 + 1) + ".Price" , auctionLists.get(depth1).getBidRecordss().get(depth2).getPrice());
						putBodyParameter("AuctionList." + (depth1 + 1) + ".BidRecords." + (depth2 + 1) + ".UserId" , auctionLists.get(depth1).getBidRecordss().get(depth2).getUserId());
					}
				}
				putBodyParameter("AuctionList." + (depth1 + 1) + ".WinnerPrice" , auctionLists.get(depth1).getWinnerPrice());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".Status" , auctionLists.get(depth1).getStatus());
				putBodyParameter("AuctionList." + (depth1 + 1) + ".ReservePrice" , auctionLists.get(depth1).getReservePrice());
			}
		}	
	}

	public static class AuctionList {

		private String winner;

		private String reserveRange;

		private String domainName;

		private String endTime;

		private Long timeLeft;

		private Integer isReserve;

		private List<BidRecords> bidRecordss;

		private Float winnerPrice;

		private String status;

		private Float reservePrice;

		public String getWinner() {
			return this.winner;
		}

		public void setWinner(String winner) {
			this.winner = winner;
		}

		public String getReserveRange() {
			return this.reserveRange;
		}

		public void setReserveRange(String reserveRange) {
			this.reserveRange = reserveRange;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Long getTimeLeft() {
			return this.timeLeft;
		}

		public void setTimeLeft(Long timeLeft) {
			this.timeLeft = timeLeft;
		}

		public Integer getIsReserve() {
			return this.isReserve;
		}

		public void setIsReserve(Integer isReserve) {
			this.isReserve = isReserve;
		}

		public List<BidRecords> getBidRecordss() {
			return this.bidRecordss;
		}

		public void setBidRecordss(List<BidRecords> bidRecordss) {
			this.bidRecordss = bidRecordss;
		}

		public Float getWinnerPrice() {
			return this.winnerPrice;
		}

		public void setWinnerPrice(Float winnerPrice) {
			this.winnerPrice = winnerPrice;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Float getReservePrice() {
			return this.reservePrice;
		}

		public void setReservePrice(Float reservePrice) {
			this.reservePrice = reservePrice;
		}

		public static class BidRecords {

			private String createTime;

			private Float price;

			private String userId;

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Float getPrice() {
				return this.price;
			}

			public void setPrice(Float price) {
				this.price = price;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public Class<ChangeAuctionResponse> getResponseClass() {
		return ChangeAuctionResponse.class;
	}

}
