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
import com.aliyuncs.ddosdiversion.transform.v20230701.ListInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceResponse extends AcsResponse {

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

		private List<Data> instances;

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

		public List<Data> getInstances() {
			return this.instances;
		}

		public void setInstances(List<Data> instances) {
			this.instances = instances;
		}

		public static class Data {

			private String userId;

			private String saleId;

			private String instanceId;

			private String name;

			private String status;

			private String comment;

			private String message;

			private String gmtExpire;

			private String gmtCreate;

			private String gmtModify;

			private Spec spec;

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

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getGmtExpire() {
				return this.gmtExpire;
			}

			public void setGmtExpire(String gmtExpire) {
				this.gmtExpire = gmtExpire;
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

			public Spec getSpec() {
				return this.spec;
			}

			public void setSpec(Spec spec) {
				this.spec = spec;
			}

			public static class Spec {

				private String idcNumbers;

				private String normalBandwidth;

				private String ipSubnetNums;

				private String coverage;

				private String edition;

				private String mitigationCapacity;

				private String mitigationNums;

				private String diversionType;

				private String mitigationAnalysis;

				private String mitigationAnalysisCapacity;

				private String initialInstallation;

				private String initialQty;

				public String getIdcNumbers() {
					return this.idcNumbers;
				}

				public void setIdcNumbers(String idcNumbers) {
					this.idcNumbers = idcNumbers;
				}

				public String getNormalBandwidth() {
					return this.normalBandwidth;
				}

				public void setNormalBandwidth(String normalBandwidth) {
					this.normalBandwidth = normalBandwidth;
				}

				public String getIpSubnetNums() {
					return this.ipSubnetNums;
				}

				public void setIpSubnetNums(String ipSubnetNums) {
					this.ipSubnetNums = ipSubnetNums;
				}

				public String getCoverage() {
					return this.coverage;
				}

				public void setCoverage(String coverage) {
					this.coverage = coverage;
				}

				public String getEdition() {
					return this.edition;
				}

				public void setEdition(String edition) {
					this.edition = edition;
				}

				public String getMitigationCapacity() {
					return this.mitigationCapacity;
				}

				public void setMitigationCapacity(String mitigationCapacity) {
					this.mitigationCapacity = mitigationCapacity;
				}

				public String getMitigationNums() {
					return this.mitigationNums;
				}

				public void setMitigationNums(String mitigationNums) {
					this.mitigationNums = mitigationNums;
				}

				public String getDiversionType() {
					return this.diversionType;
				}

				public void setDiversionType(String diversionType) {
					this.diversionType = diversionType;
				}

				public String getMitigationAnalysis() {
					return this.mitigationAnalysis;
				}

				public void setMitigationAnalysis(String mitigationAnalysis) {
					this.mitigationAnalysis = mitigationAnalysis;
				}

				public String getMitigationAnalysisCapacity() {
					return this.mitigationAnalysisCapacity;
				}

				public void setMitigationAnalysisCapacity(String mitigationAnalysisCapacity) {
					this.mitigationAnalysisCapacity = mitigationAnalysisCapacity;
				}

				public String getInitialInstallation() {
					return this.initialInstallation;
				}

				public void setInitialInstallation(String initialInstallation) {
					this.initialInstallation = initialInstallation;
				}

				public String getInitialQty() {
					return this.initialQty;
				}

				public void setInitialQty(String initialQty) {
					this.initialQty = initialQty;
				}
			}
		}
	}

	@Override
	public ListInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
