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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListProductBasicRequest extends RpcAcsRequest<ListProductBasicResponse> {
	   

	private String productCode;

	private List<Long> matchNameCategoryTypes;

	private String query;

	private List<String> channel;

	private String productLineGaapCode;

	private Boolean fetchContactInfo;

	private Integer pageNum;

	private List<Long> adminCategoryIds;

	private String doubleCalculationRate;

	@SerializedName("categoryIds")
	private List<CategoryIds> categoryIds;

	private Boolean returnPdManager;

	private String productCodeContains;

	private Boolean betaOrGaProduct;

	private Integer doubleCalculation;

	private String newProductLineCode;

	private Integer pageSize;

	private String doubleCalculationProductLineGaapCode;

	private List<String> productCodes;

	private String productName;

	private List<Long> ids;

	private List<Long> fetchCategoryPaths;
	public ListProductBasicRequest() {
		super("YunZhi", "2019-07-12", "ListProductBasic");
		setMethod(MethodType.GET);
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public List<Long> getMatchNameCategoryTypes() {
		return this.matchNameCategoryTypes;
	}

	public void setMatchNameCategoryTypes(List<Long> matchNameCategoryTypes) {
		this.matchNameCategoryTypes = matchNameCategoryTypes;	
		if (matchNameCategoryTypes != null) {
			String matchNameCategoryTypesArrVal = "";
			for(int depth1 = 0; depth1 < matchNameCategoryTypes.size(); depth1++) {
				matchNameCategoryTypesArrVal += matchNameCategoryTypes.get(depth1) + ",";
			}
			if (matchNameCategoryTypesArrVal.length() > 0) {
				matchNameCategoryTypesArrVal = matchNameCategoryTypesArrVal.substring(0, matchNameCategoryTypesArrVal.length() - 1);
			}
			putQueryParameter("MatchNameCategoryTypes" , matchNameCategoryTypesArrVal);
		}	
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
		}
	}

	public List<String> getChannel() {
		return this.channel;
	}

	public void setChannel(List<String> channel) {
		this.channel = channel;	
		if (channel != null) {
			String channelArrVal = "";
			for(int depth1 = 0; depth1 < channel.size(); depth1++) {
				channelArrVal += channel.get(depth1) + ",";
			}
			if (channelArrVal.length() > 0) {
				channelArrVal = channelArrVal.substring(0, channelArrVal.length() - 1);
			}
			putQueryParameter("Channel" , channelArrVal);
		}	
	}

	public String getProductLineGaapCode() {
		return this.productLineGaapCode;
	}

	public void setProductLineGaapCode(String productLineGaapCode) {
		this.productLineGaapCode = productLineGaapCode;
		if(productLineGaapCode != null){
			putQueryParameter("ProductLineGaapCode", productLineGaapCode);
		}
	}

	public Boolean getFetchContactInfo() {
		return this.fetchContactInfo;
	}

	public void setFetchContactInfo(Boolean fetchContactInfo) {
		this.fetchContactInfo = fetchContactInfo;
		if(fetchContactInfo != null){
			putQueryParameter("FetchContactInfo", fetchContactInfo.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public List<Long> getAdminCategoryIds() {
		return this.adminCategoryIds;
	}

	public void setAdminCategoryIds(List<Long> adminCategoryIds) {
		this.adminCategoryIds = adminCategoryIds;	
		if (adminCategoryIds != null) {
			String adminCategoryIdsArrVal = "";
			for(int depth1 = 0; depth1 < adminCategoryIds.size(); depth1++) {
				adminCategoryIdsArrVal += adminCategoryIds.get(depth1) + ",";
			}
			if (adminCategoryIdsArrVal.length() > 0) {
				adminCategoryIdsArrVal = adminCategoryIdsArrVal.substring(0, adminCategoryIdsArrVal.length() - 1);
			}
			putQueryParameter("AdminCategoryIds" , adminCategoryIdsArrVal);
		}	
	}

	public String getDoubleCalculationRate() {
		return this.doubleCalculationRate;
	}

	public void setDoubleCalculationRate(String doubleCalculationRate) {
		this.doubleCalculationRate = doubleCalculationRate;
		if(doubleCalculationRate != null){
			putQueryParameter("DoubleCalculationRate", doubleCalculationRate);
		}
	}

	public List<CategoryIds> getCategoryIds() {
		return this.categoryIds;
	}

	public void setCategoryIds(List<CategoryIds> categoryIds) {
		this.categoryIds = categoryIds;	
		if (categoryIds != null) {
			putQueryParameter("CategoryIds" , new Gson().toJson(categoryIds));
		}	
	}

	public Boolean getReturnPdManager() {
		return this.returnPdManager;
	}

	public void setReturnPdManager(Boolean returnPdManager) {
		this.returnPdManager = returnPdManager;
		if(returnPdManager != null){
			putQueryParameter("ReturnPdManager", returnPdManager.toString());
		}
	}

	public String getProductCodeContains() {
		return this.productCodeContains;
	}

	public void setProductCodeContains(String productCodeContains) {
		this.productCodeContains = productCodeContains;
		if(productCodeContains != null){
			putQueryParameter("ProductCodeContains", productCodeContains);
		}
	}

	public Boolean getBetaOrGaProduct() {
		return this.betaOrGaProduct;
	}

	public void setBetaOrGaProduct(Boolean betaOrGaProduct) {
		this.betaOrGaProduct = betaOrGaProduct;
		if(betaOrGaProduct != null){
			putQueryParameter("BetaOrGaProduct", betaOrGaProduct.toString());
		}
	}

	public Integer getDoubleCalculation() {
		return this.doubleCalculation;
	}

	public void setDoubleCalculation(Integer doubleCalculation) {
		this.doubleCalculation = doubleCalculation;
		if(doubleCalculation != null){
			putQueryParameter("DoubleCalculation", doubleCalculation.toString());
		}
	}

	public String getNewProductLineCode() {
		return this.newProductLineCode;
	}

	public void setNewProductLineCode(String newProductLineCode) {
		this.newProductLineCode = newProductLineCode;
		if(newProductLineCode != null){
			putQueryParameter("NewProductLineCode", newProductLineCode);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDoubleCalculationProductLineGaapCode() {
		return this.doubleCalculationProductLineGaapCode;
	}

	public void setDoubleCalculationProductLineGaapCode(String doubleCalculationProductLineGaapCode) {
		this.doubleCalculationProductLineGaapCode = doubleCalculationProductLineGaapCode;
		if(doubleCalculationProductLineGaapCode != null){
			putQueryParameter("DoubleCalculationProductLineGaapCode", doubleCalculationProductLineGaapCode);
		}
	}

	public List<String> getProductCodes() {
		return this.productCodes;
	}

	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;	
		if (productCodes != null) {
			String productCodesArrVal = "";
			for(int depth1 = 0; depth1 < productCodes.size(); depth1++) {
				productCodesArrVal += productCodes.get(depth1) + ",";
			}
			if (productCodesArrVal.length() > 0) {
				productCodesArrVal = productCodesArrVal.substring(0, productCodesArrVal.length() - 1);
			}
			putQueryParameter("ProductCodes" , productCodesArrVal);
		}	
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public List<Long> getIds() {
		return this.ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;	
		if (ids != null) {
			String idsArrVal = "";
			for(int depth1 = 0; depth1 < ids.size(); depth1++) {
				idsArrVal += ids.get(depth1) + ",";
			}
			if (idsArrVal.length() > 0) {
				idsArrVal = idsArrVal.substring(0, idsArrVal.length() - 1);
			}
			putQueryParameter("Ids" , idsArrVal);
		}	
	}

	public List<Long> getFetchCategoryPaths() {
		return this.fetchCategoryPaths;
	}

	public void setFetchCategoryPaths(List<Long> fetchCategoryPaths) {
		this.fetchCategoryPaths = fetchCategoryPaths;	
		if (fetchCategoryPaths != null) {
			String fetchCategoryPathsArrVal = "";
			for(int depth1 = 0; depth1 < fetchCategoryPaths.size(); depth1++) {
				fetchCategoryPathsArrVal += fetchCategoryPaths.get(depth1) + ",";
			}
			if (fetchCategoryPathsArrVal.length() > 0) {
				fetchCategoryPathsArrVal = fetchCategoryPathsArrVal.substring(0, fetchCategoryPathsArrVal.length() - 1);
			}
			putQueryParameter("FetchCategoryPaths" , fetchCategoryPathsArrVal);
		}	
	}

	public static class CategoryIds {

		@SerializedName("CategoryIds")
		private List<Long> categoryIds;

		@SerializedName("ProductCategoryTypeId")
		private Long productCategoryTypeId;

		public List<Long> getCategoryIds() {
			return this.categoryIds;
		}

		public void setCategoryIds(List<Long> categoryIds) {
			this.categoryIds = categoryIds;
		}

		public Long getProductCategoryTypeId() {
			return this.productCategoryTypeId;
		}

		public void setProductCategoryTypeId(Long productCategoryTypeId) {
			this.productCategoryTypeId = productCategoryTypeId;
		}
	}

	@Override
	public Class<ListProductBasicResponse> getResponseClass() {
		return ListProductBasicResponse.class;
	}

}
