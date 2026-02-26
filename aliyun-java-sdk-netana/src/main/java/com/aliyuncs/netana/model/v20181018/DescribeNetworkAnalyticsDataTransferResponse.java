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

package com.aliyuncs.netana.model.v20181018;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.netana.transform.v20181018.DescribeNetworkAnalyticsDataTransferResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkAnalyticsDataTransferResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<DataTransferInfo> dataTransferInfos;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DataTransferInfo> getDataTransferInfos() {
		return this.dataTransferInfos;
	}

	public void setDataTransferInfos(List<DataTransferInfo> dataTransferInfos) {
		this.dataTransferInfos = dataTransferInfos;
	}

	public static class DataTransferInfo {

		private String dataType;

		private String ip;

		private String inBoundTotalBytes;

		private String outBoundTotalBytes;

		private String dateTime;

		private Carrier carrier;

		private Country country;

		private Province province;

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getInBoundTotalBytes() {
			return this.inBoundTotalBytes;
		}

		public void setInBoundTotalBytes(String inBoundTotalBytes) {
			this.inBoundTotalBytes = inBoundTotalBytes;
		}

		public String getOutBoundTotalBytes() {
			return this.outBoundTotalBytes;
		}

		public void setOutBoundTotalBytes(String outBoundTotalBytes) {
			this.outBoundTotalBytes = outBoundTotalBytes;
		}

		public String getDateTime() {
			return this.dateTime;
		}

		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
		}

		public Carrier getCarrier() {
			return this.carrier;
		}

		public void setCarrier(Carrier carrier) {
			this.carrier = carrier;
		}

		public Country getCountry() {
			return this.country;
		}

		public void setCountry(Country country) {
			this.country = country;
		}

		public Province getProvince() {
			return this.province;
		}

		public void setProvince(Province province) {
			this.province = province;
		}

		public static class Carrier {

			private String carrierCode;

			private String carrierCn;

			private String carrierEn;

			public String getCarrierCode() {
				return this.carrierCode;
			}

			public void setCarrierCode(String carrierCode) {
				this.carrierCode = carrierCode;
			}

			public String getCarrierCn() {
				return this.carrierCn;
			}

			public void setCarrierCn(String carrierCn) {
				this.carrierCn = carrierCn;
			}

			public String getCarrierEn() {
				return this.carrierEn;
			}

			public void setCarrierEn(String carrierEn) {
				this.carrierEn = carrierEn;
			}
		}

		public static class Country {

			private String countryCn;

			private String countryEn;

			private String countryCode;

			public String getCountryCn() {
				return this.countryCn;
			}

			public void setCountryCn(String countryCn) {
				this.countryCn = countryCn;
			}

			public String getCountryEn() {
				return this.countryEn;
			}

			public void setCountryEn(String countryEn) {
				this.countryEn = countryEn;
			}

			public String getCountryCode() {
				return this.countryCode;
			}

			public void setCountryCode(String countryCode) {
				this.countryCode = countryCode;
			}
		}

		public static class Province {

			private String provinceCode;

			private String provinceCn;

			private String provinceEn;

			public String getProvinceCode() {
				return this.provinceCode;
			}

			public void setProvinceCode(String provinceCode) {
				this.provinceCode = provinceCode;
			}

			public String getProvinceCn() {
				return this.provinceCn;
			}

			public void setProvinceCn(String provinceCn) {
				this.provinceCn = provinceCn;
			}

			public String getProvinceEn() {
				return this.provinceEn;
			}

			public void setProvinceEn(String provinceEn) {
				this.provinceEn = provinceEn;
			}
		}
	}

	@Override
	public DescribeNetworkAnalyticsDataTransferResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkAnalyticsDataTransferResponseUnmarshaller.unmarshall(this, context);
	}
}
