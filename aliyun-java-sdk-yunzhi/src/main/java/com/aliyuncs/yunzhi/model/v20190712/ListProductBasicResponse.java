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

package com.aliyuncs.yunzhi.model.v20190712;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.yunzhi.transform.v20190712.ListProductBasicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductBasicResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNum;

		private Integer pageSize;

		private List<Product> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Product> getList() {
			return this.list;
		}

		public void setList(List<Product> list) {
			this.list = list;
		}

		public static class Product {

			private String abbreviation;

			private String firstCategoryNameEn;

			private String productLineGaapCode;

			private String productName;

			private Integer doubleCalculation;

			private String logoUrl;

			private Long productId;

			private String feature;

			private String adminFirstCategoryName;

			private String department;

			private String serviceCode;

			private String productLineCode;

			private String secondCategoryName;

			private String doubleCalculationProductName;

			private String productLineGaapName;

			private String adminSecondCategoryName;

			private Long secondCategoryId;

			private String newProductLineCode;

			private String newProductLineName;

			private String secondCategoryNameEn;

			private String cloudType;

			private String productCode;

			private String doubleCalculationProductLineGaapCode;

			private String productLineName;

			private Long adminFirstCategoryId;

			private String doubleCalculationProductLineGaapName;

			private String firstCategoryName;

			private String doubleCalculationProductCode;

			private String doubleCalculationRate;

			private String productNameEn;

			private Long id;

			private Long adminSecondCategoryId;

			private Long firstCategoryId;

			private List<CategoryPathOfType> categoryPaths;

			private List<PublishStatus> publishStatusDTOList;

			private List<Pd> pds;

			private List<GaapPdManager> productLineGaapLinePdManagers;

			private List<GaapPdManager> productLineGaapPdManagers;

			private List<HelpDoc> helpDocs;

			private List<String> productAlias;

			private ProductOwner productOwner;

			private ProductContactInfo productContactInfo;

			private PdManager pdManager;

			private LineManager lineManager;

			public String getAbbreviation() {
				return this.abbreviation;
			}

			public void setAbbreviation(String abbreviation) {
				this.abbreviation = abbreviation;
			}

			public String getFirstCategoryNameEn() {
				return this.firstCategoryNameEn;
			}

			public void setFirstCategoryNameEn(String firstCategoryNameEn) {
				this.firstCategoryNameEn = firstCategoryNameEn;
			}

			public String getProductLineGaapCode() {
				return this.productLineGaapCode;
			}

			public void setProductLineGaapCode(String productLineGaapCode) {
				this.productLineGaapCode = productLineGaapCode;
			}

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}

			public Integer getDoubleCalculation() {
				return this.doubleCalculation;
			}

			public void setDoubleCalculation(Integer doubleCalculation) {
				this.doubleCalculation = doubleCalculation;
			}

			public String getLogoUrl() {
				return this.logoUrl;
			}

			public void setLogoUrl(String logoUrl) {
				this.logoUrl = logoUrl;
			}

			public Long getProductId() {
				return this.productId;
			}

			public void setProductId(Long productId) {
				this.productId = productId;
			}

			public String getFeature() {
				return this.feature;
			}

			public void setFeature(String feature) {
				this.feature = feature;
			}

			public String getAdminFirstCategoryName() {
				return this.adminFirstCategoryName;
			}

			public void setAdminFirstCategoryName(String adminFirstCategoryName) {
				this.adminFirstCategoryName = adminFirstCategoryName;
			}

			public String getDepartment() {
				return this.department;
			}

			public void setDepartment(String department) {
				this.department = department;
			}

			public String getServiceCode() {
				return this.serviceCode;
			}

			public void setServiceCode(String serviceCode) {
				this.serviceCode = serviceCode;
			}

			public String getProductLineCode() {
				return this.productLineCode;
			}

			public void setProductLineCode(String productLineCode) {
				this.productLineCode = productLineCode;
			}

			public String getSecondCategoryName() {
				return this.secondCategoryName;
			}

			public void setSecondCategoryName(String secondCategoryName) {
				this.secondCategoryName = secondCategoryName;
			}

			public String getDoubleCalculationProductName() {
				return this.doubleCalculationProductName;
			}

			public void setDoubleCalculationProductName(String doubleCalculationProductName) {
				this.doubleCalculationProductName = doubleCalculationProductName;
			}

			public String getProductLineGaapName() {
				return this.productLineGaapName;
			}

			public void setProductLineGaapName(String productLineGaapName) {
				this.productLineGaapName = productLineGaapName;
			}

			public String getAdminSecondCategoryName() {
				return this.adminSecondCategoryName;
			}

			public void setAdminSecondCategoryName(String adminSecondCategoryName) {
				this.adminSecondCategoryName = adminSecondCategoryName;
			}

			public Long getSecondCategoryId() {
				return this.secondCategoryId;
			}

			public void setSecondCategoryId(Long secondCategoryId) {
				this.secondCategoryId = secondCategoryId;
			}

			public String getNewProductLineCode() {
				return this.newProductLineCode;
			}

			public void setNewProductLineCode(String newProductLineCode) {
				this.newProductLineCode = newProductLineCode;
			}

			public String getNewProductLineName() {
				return this.newProductLineName;
			}

			public void setNewProductLineName(String newProductLineName) {
				this.newProductLineName = newProductLineName;
			}

			public String getSecondCategoryNameEn() {
				return this.secondCategoryNameEn;
			}

			public void setSecondCategoryNameEn(String secondCategoryNameEn) {
				this.secondCategoryNameEn = secondCategoryNameEn;
			}

			public String getCloudType() {
				return this.cloudType;
			}

			public void setCloudType(String cloudType) {
				this.cloudType = cloudType;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getDoubleCalculationProductLineGaapCode() {
				return this.doubleCalculationProductLineGaapCode;
			}

			public void setDoubleCalculationProductLineGaapCode(String doubleCalculationProductLineGaapCode) {
				this.doubleCalculationProductLineGaapCode = doubleCalculationProductLineGaapCode;
			}

			public String getProductLineName() {
				return this.productLineName;
			}

			public void setProductLineName(String productLineName) {
				this.productLineName = productLineName;
			}

			public Long getAdminFirstCategoryId() {
				return this.adminFirstCategoryId;
			}

			public void setAdminFirstCategoryId(Long adminFirstCategoryId) {
				this.adminFirstCategoryId = adminFirstCategoryId;
			}

			public String getDoubleCalculationProductLineGaapName() {
				return this.doubleCalculationProductLineGaapName;
			}

			public void setDoubleCalculationProductLineGaapName(String doubleCalculationProductLineGaapName) {
				this.doubleCalculationProductLineGaapName = doubleCalculationProductLineGaapName;
			}

			public String getFirstCategoryName() {
				return this.firstCategoryName;
			}

			public void setFirstCategoryName(String firstCategoryName) {
				this.firstCategoryName = firstCategoryName;
			}

			public String getDoubleCalculationProductCode() {
				return this.doubleCalculationProductCode;
			}

			public void setDoubleCalculationProductCode(String doubleCalculationProductCode) {
				this.doubleCalculationProductCode = doubleCalculationProductCode;
			}

			public String getDoubleCalculationRate() {
				return this.doubleCalculationRate;
			}

			public void setDoubleCalculationRate(String doubleCalculationRate) {
				this.doubleCalculationRate = doubleCalculationRate;
			}

			public String getProductNameEn() {
				return this.productNameEn;
			}

			public void setProductNameEn(String productNameEn) {
				this.productNameEn = productNameEn;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getAdminSecondCategoryId() {
				return this.adminSecondCategoryId;
			}

			public void setAdminSecondCategoryId(Long adminSecondCategoryId) {
				this.adminSecondCategoryId = adminSecondCategoryId;
			}

			public Long getFirstCategoryId() {
				return this.firstCategoryId;
			}

			public void setFirstCategoryId(Long firstCategoryId) {
				this.firstCategoryId = firstCategoryId;
			}

			public List<CategoryPathOfType> getCategoryPaths() {
				return this.categoryPaths;
			}

			public void setCategoryPaths(List<CategoryPathOfType> categoryPaths) {
				this.categoryPaths = categoryPaths;
			}

			public List<PublishStatus> getPublishStatusDTOList() {
				return this.publishStatusDTOList;
			}

			public void setPublishStatusDTOList(List<PublishStatus> publishStatusDTOList) {
				this.publishStatusDTOList = publishStatusDTOList;
			}

			public List<Pd> getPds() {
				return this.pds;
			}

			public void setPds(List<Pd> pds) {
				this.pds = pds;
			}

			public List<GaapPdManager> getProductLineGaapLinePdManagers() {
				return this.productLineGaapLinePdManagers;
			}

			public void setProductLineGaapLinePdManagers(List<GaapPdManager> productLineGaapLinePdManagers) {
				this.productLineGaapLinePdManagers = productLineGaapLinePdManagers;
			}

			public List<GaapPdManager> getProductLineGaapPdManagers() {
				return this.productLineGaapPdManagers;
			}

			public void setProductLineGaapPdManagers(List<GaapPdManager> productLineGaapPdManagers) {
				this.productLineGaapPdManagers = productLineGaapPdManagers;
			}

			public List<HelpDoc> getHelpDocs() {
				return this.helpDocs;
			}

			public void setHelpDocs(List<HelpDoc> helpDocs) {
				this.helpDocs = helpDocs;
			}

			public List<String> getProductAlias() {
				return this.productAlias;
			}

			public void setProductAlias(List<String> productAlias) {
				this.productAlias = productAlias;
			}

			public ProductOwner getProductOwner() {
				return this.productOwner;
			}

			public void setProductOwner(ProductOwner productOwner) {
				this.productOwner = productOwner;
			}

			public ProductContactInfo getProductContactInfo() {
				return this.productContactInfo;
			}

			public void setProductContactInfo(ProductContactInfo productContactInfo) {
				this.productContactInfo = productContactInfo;
			}

			public PdManager getPdManager() {
				return this.pdManager;
			}

			public void setPdManager(PdManager pdManager) {
				this.pdManager = pdManager;
			}

			public LineManager getLineManager() {
				return this.lineManager;
			}

			public void setLineManager(LineManager lineManager) {
				this.lineManager = lineManager;
			}

			public static class CategoryPathOfType {

				private String showCategoryPath;

				private Long relativeCategoryId;

				private String categoryTypeName;

				private Long categoryTypeId;

				private List<Path> categoryPath;

				public String getShowCategoryPath() {
					return this.showCategoryPath;
				}

				public void setShowCategoryPath(String showCategoryPath) {
					this.showCategoryPath = showCategoryPath;
				}

				public Long getRelativeCategoryId() {
					return this.relativeCategoryId;
				}

				public void setRelativeCategoryId(Long relativeCategoryId) {
					this.relativeCategoryId = relativeCategoryId;
				}

				public String getCategoryTypeName() {
					return this.categoryTypeName;
				}

				public void setCategoryTypeName(String categoryTypeName) {
					this.categoryTypeName = categoryTypeName;
				}

				public Long getCategoryTypeId() {
					return this.categoryTypeId;
				}

				public void setCategoryTypeId(Long categoryTypeId) {
					this.categoryTypeId = categoryTypeId;
				}

				public List<Path> getCategoryPath() {
					return this.categoryPath;
				}

				public void setCategoryPath(List<Path> categoryPath) {
					this.categoryPath = categoryPath;
				}

				public static class Path {

					private Long categoryId;

					private String categoryCode;

					private String categoryLogoUrl;

					private String categoryName;

					private Integer sort;

					private Integer categoryLevel;

					private Long categoryTypeId;

					private String categoryNameEn;

					private Long parentCategoryId;

					public Long getCategoryId() {
						return this.categoryId;
					}

					public void setCategoryId(Long categoryId) {
						this.categoryId = categoryId;
					}

					public String getCategoryCode() {
						return this.categoryCode;
					}

					public void setCategoryCode(String categoryCode) {
						this.categoryCode = categoryCode;
					}

					public String getCategoryLogoUrl() {
						return this.categoryLogoUrl;
					}

					public void setCategoryLogoUrl(String categoryLogoUrl) {
						this.categoryLogoUrl = categoryLogoUrl;
					}

					public String getCategoryName() {
						return this.categoryName;
					}

					public void setCategoryName(String categoryName) {
						this.categoryName = categoryName;
					}

					public Integer getSort() {
						return this.sort;
					}

					public void setSort(Integer sort) {
						this.sort = sort;
					}

					public Integer getCategoryLevel() {
						return this.categoryLevel;
					}

					public void setCategoryLevel(Integer categoryLevel) {
						this.categoryLevel = categoryLevel;
					}

					public Long getCategoryTypeId() {
						return this.categoryTypeId;
					}

					public void setCategoryTypeId(Long categoryTypeId) {
						this.categoryTypeId = categoryTypeId;
					}

					public String getCategoryNameEn() {
						return this.categoryNameEn;
					}

					public void setCategoryNameEn(String categoryNameEn) {
						this.categoryNameEn = categoryNameEn;
					}

					public Long getParentCategoryId() {
						return this.parentCategoryId;
					}

					public void setParentCategoryId(Long parentCategoryId) {
						this.parentCategoryId = parentCategoryId;
					}
				}
			}

			public static class PublishStatus {

				private String status;

				private String cloudType;

				private String date;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getCloudType() {
					return this.cloudType;
				}

				public void setCloudType(String cloudType) {
					this.cloudType = cloudType;
				}

				public String getDate() {
					return this.date;
				}

				public void setDate(String date) {
					this.date = date;
				}
			}

			public static class Pd {

				private String jobDesc;

				private String email;

				private Integer bucid;

				private String userId;

				private String workid;

				private String lastName;

				private String cname;

				private String dep;

				public String getJobDesc() {
					return this.jobDesc;
				}

				public void setJobDesc(String jobDesc) {
					this.jobDesc = jobDesc;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public Integer getBucid() {
					return this.bucid;
				}

				public void setBucid(Integer bucid) {
					this.bucid = bucid;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getWorkid() {
					return this.workid;
				}

				public void setWorkid(String workid) {
					this.workid = workid;
				}

				public String getLastName() {
					return this.lastName;
				}

				public void setLastName(String lastName) {
					this.lastName = lastName;
				}

				public String getCname() {
					return this.cname;
				}

				public void setCname(String cname) {
					this.cname = cname;
				}

				public String getDep() {
					return this.dep;
				}

				public void setDep(String dep) {
					this.dep = dep;
				}
			}

			public static class GaapPdManager {

				private String jobDesc;

				private String email;

				private Integer bucid;

				private String userId;

				private String workid;

				private String lastName;

				private String cname;

				private String dep;

				public String getJobDesc() {
					return this.jobDesc;
				}

				public void setJobDesc(String jobDesc) {
					this.jobDesc = jobDesc;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public Integer getBucid() {
					return this.bucid;
				}

				public void setBucid(Integer bucid) {
					this.bucid = bucid;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getWorkid() {
					return this.workid;
				}

				public void setWorkid(String workid) {
					this.workid = workid;
				}

				public String getLastName() {
					return this.lastName;
				}

				public void setLastName(String lastName) {
					this.lastName = lastName;
				}

				public String getCname() {
					return this.cname;
				}

				public void setCname(String cname) {
					this.cname = cname;
				}

				public String getDep() {
					return this.dep;
				}

				public void setDep(String dep) {
					this.dep = dep;
				}
			}

			public static class HelpDoc {

				private Long docId;

				private String docUrl;

				private String productCode;

				private String docName;

				public Long getDocId() {
					return this.docId;
				}

				public void setDocId(Long docId) {
					this.docId = docId;
				}

				public String getDocUrl() {
					return this.docUrl;
				}

				public void setDocUrl(String docUrl) {
					this.docUrl = docUrl;
				}

				public String getProductCode() {
					return this.productCode;
				}

				public void setProductCode(String productCode) {
					this.productCode = productCode;
				}

				public String getDocName() {
					return this.docName;
				}

				public void setDocName(String docName) {
					this.docName = docName;
				}
			}

			public static class ProductOwner {

				private String jobDesc;

				private String email;

				private Integer bucid;

				private String userId;

				private String workid;

				private String lastName;

				private String cname;

				private String dep;

				public String getJobDesc() {
					return this.jobDesc;
				}

				public void setJobDesc(String jobDesc) {
					this.jobDesc = jobDesc;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public Integer getBucid() {
					return this.bucid;
				}

				public void setBucid(Integer bucid) {
					this.bucid = bucid;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getWorkid() {
					return this.workid;
				}

				public void setWorkid(String workid) {
					this.workid = workid;
				}

				public String getLastName() {
					return this.lastName;
				}

				public void setLastName(String lastName) {
					this.lastName = lastName;
				}

				public String getCname() {
					return this.cname;
				}

				public void setCname(String cname) {
					this.cname = cname;
				}

				public String getDep() {
					return this.dep;
				}

				public void setDep(String dep) {
					this.dep = dep;
				}
			}

			public static class ProductContactInfo {

				private String treasurer;

				private String productName;

				private String productCode;

				private String documentManager;

				private String designer;

				private String pdStaffId;

				private String devOps;

				private String develop;

				private String productLineCode;

				private String console;

				private Long id;

				private String operative;

				private String productLine;

				public String getTreasurer() {
					return this.treasurer;
				}

				public void setTreasurer(String treasurer) {
					this.treasurer = treasurer;
				}

				public String getProductName() {
					return this.productName;
				}

				public void setProductName(String productName) {
					this.productName = productName;
				}

				public String getProductCode() {
					return this.productCode;
				}

				public void setProductCode(String productCode) {
					this.productCode = productCode;
				}

				public String getDocumentManager() {
					return this.documentManager;
				}

				public void setDocumentManager(String documentManager) {
					this.documentManager = documentManager;
				}

				public String getDesigner() {
					return this.designer;
				}

				public void setDesigner(String designer) {
					this.designer = designer;
				}

				public String getPdStaffId() {
					return this.pdStaffId;
				}

				public void setPdStaffId(String pdStaffId) {
					this.pdStaffId = pdStaffId;
				}

				public String getDevOps() {
					return this.devOps;
				}

				public void setDevOps(String devOps) {
					this.devOps = devOps;
				}

				public String getDevelop() {
					return this.develop;
				}

				public void setDevelop(String develop) {
					this.develop = develop;
				}

				public String getProductLineCode() {
					return this.productLineCode;
				}

				public void setProductLineCode(String productLineCode) {
					this.productLineCode = productLineCode;
				}

				public String getConsole() {
					return this.console;
				}

				public void setConsole(String console) {
					this.console = console;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getOperative() {
					return this.operative;
				}

				public void setOperative(String operative) {
					this.operative = operative;
				}

				public String getProductLine() {
					return this.productLine;
				}

				public void setProductLine(String productLine) {
					this.productLine = productLine;
				}
			}

			public static class PdManager {

				private String jobDesc;

				private String email;

				private Integer bucid;

				private String userId;

				private String workid;

				private String lastName;

				private String cname;

				private String dep;

				public String getJobDesc() {
					return this.jobDesc;
				}

				public void setJobDesc(String jobDesc) {
					this.jobDesc = jobDesc;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public Integer getBucid() {
					return this.bucid;
				}

				public void setBucid(Integer bucid) {
					this.bucid = bucid;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getWorkid() {
					return this.workid;
				}

				public void setWorkid(String workid) {
					this.workid = workid;
				}

				public String getLastName() {
					return this.lastName;
				}

				public void setLastName(String lastName) {
					this.lastName = lastName;
				}

				public String getCname() {
					return this.cname;
				}

				public void setCname(String cname) {
					this.cname = cname;
				}

				public String getDep() {
					return this.dep;
				}

				public void setDep(String dep) {
					this.dep = dep;
				}
			}

			public static class LineManager {

				private String jobDesc;

				private String email;

				private Integer bucid;

				private String userId;

				private String workid;

				private String lastName;

				private String cname;

				private String dep;

				public String getJobDesc() {
					return this.jobDesc;
				}

				public void setJobDesc(String jobDesc) {
					this.jobDesc = jobDesc;
				}

				public String getEmail() {
					return this.email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public Integer getBucid() {
					return this.bucid;
				}

				public void setBucid(Integer bucid) {
					this.bucid = bucid;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}

				public String getWorkid() {
					return this.workid;
				}

				public void setWorkid(String workid) {
					this.workid = workid;
				}

				public String getLastName() {
					return this.lastName;
				}

				public void setLastName(String lastName) {
					this.lastName = lastName;
				}

				public String getCname() {
					return this.cname;
				}

				public void setCname(String cname) {
					this.cname = cname;
				}

				public String getDep() {
					return this.dep;
				}

				public void setDep(String dep) {
					this.dep = dep;
				}
			}
		}
	}

	@Override
	public ListProductBasicResponse getInstance(UnmarshallerContext context) {
		return	ListProductBasicResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
