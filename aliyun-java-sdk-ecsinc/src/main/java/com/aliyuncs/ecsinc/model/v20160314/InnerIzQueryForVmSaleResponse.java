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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerIzQueryForVmSaleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerIzQueryForVmSaleResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageNo;

	private Integer pageSize;

	private List<Item> data;

	private ErrorCode errorCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Item> getData() {
		return this.data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public static class Item {

		private String regionNo;

		private String status;

		private String no;

		private String enName;

		private String cnName;

		private List<IzResourceMode> izResourceModel;

		private List<String> supportedDiskCategories;

		private List<String> supportedNetworkCategories;

		private List<String> allowedResourceCreations;

		private List<String> supportedInstanceGenerations;

		private List<String> supportedInstanceTypeFamilies;

		private List<String> supportedInstanceTypeNames;

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNo() {
			return this.no;
		}

		public void setNo(String no) {
			this.no = no;
		}

		public String getEnName() {
			return this.enName;
		}

		public void setEnName(String enName) {
			this.enName = enName;
		}

		public String getCnName() {
			return this.cnName;
		}

		public void setCnName(String cnName) {
			this.cnName = cnName;
		}

		public List<IzResourceMode> getIzResourceModel() {
			return this.izResourceModel;
		}

		public void setIzResourceModel(List<IzResourceMode> izResourceModel) {
			this.izResourceModel = izResourceModel;
		}

		public List<String> getSupportedDiskCategories() {
			return this.supportedDiskCategories;
		}

		public void setSupportedDiskCategories(List<String> supportedDiskCategories) {
			this.supportedDiskCategories = supportedDiskCategories;
		}

		public List<String> getSupportedNetworkCategories() {
			return this.supportedNetworkCategories;
		}

		public void setSupportedNetworkCategories(List<String> supportedNetworkCategories) {
			this.supportedNetworkCategories = supportedNetworkCategories;
		}

		public List<String> getAllowedResourceCreations() {
			return this.allowedResourceCreations;
		}

		public void setAllowedResourceCreations(List<String> allowedResourceCreations) {
			this.allowedResourceCreations = allowedResourceCreations;
		}

		public List<String> getSupportedInstanceGenerations() {
			return this.supportedInstanceGenerations;
		}

		public void setSupportedInstanceGenerations(List<String> supportedInstanceGenerations) {
			this.supportedInstanceGenerations = supportedInstanceGenerations;
		}

		public List<String> getSupportedInstanceTypeFamilies() {
			return this.supportedInstanceTypeFamilies;
		}

		public void setSupportedInstanceTypeFamilies(List<String> supportedInstanceTypeFamilies) {
			this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
		}

		public List<String> getSupportedInstanceTypeNames() {
			return this.supportedInstanceTypeNames;
		}

		public void setSupportedInstanceTypeNames(List<String> supportedInstanceTypeNames) {
			this.supportedInstanceTypeNames = supportedInstanceTypeNames;
		}

		public static class IzResourceMode {

			private Boolean supportIoOptimized;

			private List<String> allowedResourceCreation;

			private List<String> supportedDataDiskCategories;

			private List<String> supportedInstanceGenerations1;

			private List<String> supportedNetworkCategories2;

			private List<String> supportedSystemDiskCategories;

			private List<String> supportedInstanceTypeFamilies3;

			private List<String> supportedInstanceTypes;

			public Boolean getSupportIoOptimized() {
				return this.supportIoOptimized;
			}

			public void setSupportIoOptimized(Boolean supportIoOptimized) {
				this.supportIoOptimized = supportIoOptimized;
			}

			public List<String> getAllowedResourceCreation() {
				return this.allowedResourceCreation;
			}

			public void setAllowedResourceCreation(List<String> allowedResourceCreation) {
				this.allowedResourceCreation = allowedResourceCreation;
			}

			public List<String> getSupportedDataDiskCategories() {
				return this.supportedDataDiskCategories;
			}

			public void setSupportedDataDiskCategories(List<String> supportedDataDiskCategories) {
				this.supportedDataDiskCategories = supportedDataDiskCategories;
			}

			public List<String> getSupportedInstanceGenerations1() {
				return this.supportedInstanceGenerations1;
			}

			public void setSupportedInstanceGenerations1(List<String> supportedInstanceGenerations1) {
				this.supportedInstanceGenerations1 = supportedInstanceGenerations1;
			}

			public List<String> getSupportedNetworkCategories2() {
				return this.supportedNetworkCategories2;
			}

			public void setSupportedNetworkCategories2(List<String> supportedNetworkCategories2) {
				this.supportedNetworkCategories2 = supportedNetworkCategories2;
			}

			public List<String> getSupportedSystemDiskCategories() {
				return this.supportedSystemDiskCategories;
			}

			public void setSupportedSystemDiskCategories(List<String> supportedSystemDiskCategories) {
				this.supportedSystemDiskCategories = supportedSystemDiskCategories;
			}

			public List<String> getSupportedInstanceTypeFamilies3() {
				return this.supportedInstanceTypeFamilies3;
			}

			public void setSupportedInstanceTypeFamilies3(List<String> supportedInstanceTypeFamilies3) {
				this.supportedInstanceTypeFamilies3 = supportedInstanceTypeFamilies3;
			}

			public List<String> getSupportedInstanceTypes() {
				return this.supportedInstanceTypes;
			}

			public void setSupportedInstanceTypes(List<String> supportedInstanceTypes) {
				this.supportedInstanceTypes = supportedInstanceTypes;
			}
		}
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	@Override
	public InnerIzQueryForVmSaleResponse getInstance(UnmarshallerContext context) {
		return	InnerIzQueryForVmSaleResponseUnmarshaller.unmarshall(this, context);
	}
}
