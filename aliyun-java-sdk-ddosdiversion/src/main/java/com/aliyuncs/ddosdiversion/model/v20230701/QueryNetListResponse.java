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

package com.aliyuncs.ddosdiversion.model.v20230701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddosdiversion.transform.v20230701.QueryNetListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryNetListResponse extends AcsResponse {

	private Long code;

	private String requestId;

	private String message;

	private List<DataItem> data;

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long total;

		private Long page;

		private Long num;

		private List<Data> nets;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getNum() {
			return this.num;
		}

		public void setNum(Long num) {
			this.num = num;
		}

		public List<Data> getNets() {
			return this.nets;
		}

		public void setNets(List<Data> nets) {
			this.nets = nets;
		}

		public static class Data {

			private String userId;

			private String saleId;

			private String upstreamType;

			private String net;

			private String netType;

			private String mode;

			private Integer declaredState;

			private String gmtCreate;

			private String gmtModify;

			private Long netExtend;

			private Long fwdEffect;

			private String netMain;

			private List<DeclaredItem> declared;

			private DDoSDefense dDoSDefense;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getSaleId() {
				return this.saleId;
			}

			public void setSaleId(String saleId) {
				this.saleId = saleId;
			}

			public String getUpstreamType() {
				return this.upstreamType;
			}

			public void setUpstreamType(String upstreamType) {
				this.upstreamType = upstreamType;
			}

			public String getNet() {
				return this.net;
			}

			public void setNet(String net) {
				this.net = net;
			}

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public Integer getDeclaredState() {
				return this.declaredState;
			}

			public void setDeclaredState(Integer declaredState) {
				this.declaredState = declaredState;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public Long getNetExtend() {
				return this.netExtend;
			}

			public void setNetExtend(Long netExtend) {
				this.netExtend = netExtend;
			}

			public Long getFwdEffect() {
				return this.fwdEffect;
			}

			public void setFwdEffect(Long fwdEffect) {
				this.fwdEffect = fwdEffect;
			}

			public String getNetMain() {
				return this.netMain;
			}

			public void setNetMain(String netMain) {
				this.netMain = netMain;
			}

			public List<DeclaredItem> getDeclared() {
				return this.declared;
			}

			public void setDeclared(List<DeclaredItem> declared) {
				this.declared = declared;
			}

			public DDoSDefense getDDoSDefense() {
				return this.dDoSDefense;
			}

			public void setDDoSDefense(DDoSDefense dDoSDefense) {
				this.dDoSDefense = dDoSDefense;
			}

			public static class DeclaredItem {

				private String region;

				private String declared;

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getDeclared() {
					return this.declared;
				}

				public void setDeclared(String declared) {
					this.declared = declared;
				}
			}

			public static class DDoSDefense {

				private DjPolicy djPolicy;

				private CleanTh cleanTh;

				private HoleTh holeTh;

				public DjPolicy getDjPolicy() {
					return this.djPolicy;
				}

				public void setDjPolicy(DjPolicy djPolicy) {
					this.djPolicy = djPolicy;
				}

				public CleanTh getCleanTh() {
					return this.cleanTh;
				}

				public void setCleanTh(CleanTh cleanTh) {
					this.cleanTh = cleanTh;
				}

				public HoleTh getHoleTh() {
					return this.holeTh;
				}

				public void setHoleTh(HoleTh holeTh) {
					this.holeTh = holeTh;
				}

				public static class DjPolicy {

					private String policyName;

					public String getPolicyName() {
						return this.policyName;
					}

					public void setPolicyName(String policyName) {
						this.policyName = policyName;
					}
				}

				public static class CleanTh {

					private Integer mbps;

					private Integer pps;

					public Integer getMbps() {
						return this.mbps;
					}

					public void setMbps(Integer mbps) {
						this.mbps = mbps;
					}

					public Integer getPps() {
						return this.pps;
					}

					public void setPps(Integer pps) {
						this.pps = pps;
					}
				}

				public static class HoleTh {

					private Integer threshMbps;

					public Integer getThreshMbps() {
						return this.threshMbps;
					}

					public void setThreshMbps(Integer threshMbps) {
						this.threshMbps = threshMbps;
					}
				}
			}
		}
	}

	@Override
	public QueryNetListResponse getInstance(UnmarshallerContext context) {
		return	QueryNetListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
