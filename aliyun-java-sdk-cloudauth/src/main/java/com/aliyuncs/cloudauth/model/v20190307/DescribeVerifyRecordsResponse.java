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

package com.aliyuncs.cloudauth.model.v20190307;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.DescribeVerifyRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVerifyRecordsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer currentPage;

	private String queryId;

	private List<Records> recordsList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getQueryId() {
		return this.queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public List<Records> getRecordsList() {
		return this.recordsList;
	}

	public void setRecordsList(List<Records> recordsList) {
		this.recordsList = recordsList;
	}

	public static class Records {

		private String bizType;

		private String bizId;

		private String verifyId;

		private Long finishTime;

		private Integer status;

		private Float idCardFaceComparisonScore;

		private Float authorityComparisonScore;

		private Material material;

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getVerifyId() {
			return this.verifyId;
		}

		public void setVerifyId(String verifyId) {
			this.verifyId = verifyId;
		}

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Float getIdCardFaceComparisonScore() {
			return this.idCardFaceComparisonScore;
		}

		public void setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
			this.idCardFaceComparisonScore = idCardFaceComparisonScore;
		}

		public Float getAuthorityComparisonScore() {
			return this.authorityComparisonScore;
		}

		public void setAuthorityComparisonScore(Float authorityComparisonScore) {
			this.authorityComparisonScore = authorityComparisonScore;
		}

		public Material getMaterial() {
			return this.material;
		}

		public void setMaterial(Material material) {
			this.material = material;
		}

		public static class Material {

			private String faceImageUrl;

			private String idCardName;

			private String idCardNumber;

			private IdCardInfo idCardInfo;

			public String getFaceImageUrl() {
				return this.faceImageUrl;
			}

			public void setFaceImageUrl(String faceImageUrl) {
				this.faceImageUrl = faceImageUrl;
			}

			public String getIdCardName() {
				return this.idCardName;
			}

			public void setIdCardName(String idCardName) {
				this.idCardName = idCardName;
			}

			public String getIdCardNumber() {
				return this.idCardNumber;
			}

			public void setIdCardNumber(String idCardNumber) {
				this.idCardNumber = idCardNumber;
			}

			public IdCardInfo getIdCardInfo() {
				return this.idCardInfo;
			}

			public void setIdCardInfo(IdCardInfo idCardInfo) {
				this.idCardInfo = idCardInfo;
			}

			public static class IdCardInfo {

				private String frontImageUrl;

				private String backImageUrl;

				private String name;

				private String number;

				private String address;

				private String birth;

				private String sex;

				private String nationality;

				private String authority;

				private String startDate;

				private String endDate;

				public String getFrontImageUrl() {
					return this.frontImageUrl;
				}

				public void setFrontImageUrl(String frontImageUrl) {
					this.frontImageUrl = frontImageUrl;
				}

				public String getBackImageUrl() {
					return this.backImageUrl;
				}

				public void setBackImageUrl(String backImageUrl) {
					this.backImageUrl = backImageUrl;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNumber() {
					return this.number;
				}

				public void setNumber(String number) {
					this.number = number;
				}

				public String getAddress() {
					return this.address;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public String getBirth() {
					return this.birth;
				}

				public void setBirth(String birth) {
					this.birth = birth;
				}

				public String getSex() {
					return this.sex;
				}

				public void setSex(String sex) {
					this.sex = sex;
				}

				public String getNationality() {
					return this.nationality;
				}

				public void setNationality(String nationality) {
					this.nationality = nationality;
				}

				public String getAuthority() {
					return this.authority;
				}

				public void setAuthority(String authority) {
					this.authority = authority;
				}

				public String getStartDate() {
					return this.startDate;
				}

				public void setStartDate(String startDate) {
					this.startDate = startDate;
				}

				public String getEndDate() {
					return this.endDate;
				}

				public void setEndDate(String endDate) {
					this.endDate = endDate;
				}
			}
		}
	}

	@Override
	public DescribeVerifyRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVerifyRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
