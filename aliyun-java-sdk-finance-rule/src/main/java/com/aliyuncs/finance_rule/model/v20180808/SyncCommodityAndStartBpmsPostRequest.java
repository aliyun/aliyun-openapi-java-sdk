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

package com.aliyuncs.finance_rule.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncCommodityAndStartBpmsPostRequest extends RpcAcsRequest<SyncCommodityAndStartBpmsPostResponse> {
	   

	private String serviceMode;

	private String code;

	private String gmtModified;

	private Long spId;

	private Long marketType;

	private String purchaseType;

	private Long id;

	private String saleMode;

	private String extendInfo;

	private String empId;

	private Long articleType;

	private String sceneCode;

	@SerializedName("conditionAttributes")
	private List<ConditionAttributes> conditionAttributes;

	private String sellingMode;

	private String firstItemName;

	private String gmtCreate;

	private String developmentMode;

	private String realName;

	private String firstItemCode;

	private Long goodsStatus;

	private String servCode;

	private String name;

	private String pipCode;

	private Long chargeType;

	private String bid;

	private String account;

	private String goodsType;
	public SyncCommodityAndStartBpmsPostRequest() {
		super("Finance-Rule", "2018-08-08", "SyncCommodityAndStartBpmsPost");
		setMethod(MethodType.POST);
	}

	public String getServiceMode() {
		return this.serviceMode;
	}

	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
		if(serviceMode != null){
			putBodyParameter("ServiceMode", serviceMode);
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putBodyParameter("Code", code);
		}
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putBodyParameter("GmtModified", gmtModified);
		}
	}

	public Long getSpId() {
		return this.spId;
	}

	public void setSpId(Long spId) {
		this.spId = spId;
		if(spId != null){
			putBodyParameter("SpId", spId.toString());
		}
	}

	public Long getMarketType() {
		return this.marketType;
	}

	public void setMarketType(Long marketType) {
		this.marketType = marketType;
		if(marketType != null){
			putBodyParameter("MarketType", marketType.toString());
		}
	}

	public String getPurchaseType() {
		return this.purchaseType;
	}

	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
		if(purchaseType != null){
			putBodyParameter("PurchaseType", purchaseType);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getSaleMode() {
		return this.saleMode;
	}

	public void setSaleMode(String saleMode) {
		this.saleMode = saleMode;
		if(saleMode != null){
			putBodyParameter("SaleMode", saleMode);
		}
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
		if(extendInfo != null){
			putBodyParameter("ExtendInfo", extendInfo);
		}
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
		if(empId != null){
			putBodyParameter("EmpId", empId);
		}
	}

	public Long getArticleType() {
		return this.articleType;
	}

	public void setArticleType(Long articleType) {
		this.articleType = articleType;
		if(articleType != null){
			putBodyParameter("ArticleType", articleType.toString());
		}
	}

	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
		if(sceneCode != null){
			putBodyParameter("SceneCode", sceneCode);
		}
	}

	public List<ConditionAttributes> getConditionAttributes() {
		return this.conditionAttributes;
	}

	public void setConditionAttributes(List<ConditionAttributes> conditionAttributes) {
		this.conditionAttributes = conditionAttributes;	
		if (conditionAttributes != null) {
			putBodyParameter("ConditionAttributes" , new Gson().toJson(conditionAttributes));
		}	
	}

	public String getSellingMode() {
		return this.sellingMode;
	}

	public void setSellingMode(String sellingMode) {
		this.sellingMode = sellingMode;
		if(sellingMode != null){
			putBodyParameter("SellingMode", sellingMode);
		}
	}

	public String getFirstItemName() {
		return this.firstItemName;
	}

	public void setFirstItemName(String firstItemName) {
		this.firstItemName = firstItemName;
		if(firstItemName != null){
			putBodyParameter("FirstItemName", firstItemName);
		}
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putBodyParameter("GmtCreate", gmtCreate);
		}
	}

	public String getDevelopmentMode() {
		return this.developmentMode;
	}

	public void setDevelopmentMode(String developmentMode) {
		this.developmentMode = developmentMode;
		if(developmentMode != null){
			putBodyParameter("DevelopmentMode", developmentMode);
		}
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
		if(realName != null){
			putBodyParameter("RealName", realName);
		}
	}

	public String getFirstItemCode() {
		return this.firstItemCode;
	}

	public void setFirstItemCode(String firstItemCode) {
		this.firstItemCode = firstItemCode;
		if(firstItemCode != null){
			putBodyParameter("FirstItemCode", firstItemCode);
		}
	}

	public Long getGoodsStatus() {
		return this.goodsStatus;
	}

	public void setGoodsStatus(Long goodsStatus) {
		this.goodsStatus = goodsStatus;
		if(goodsStatus != null){
			putBodyParameter("GoodsStatus", goodsStatus.toString());
		}
	}

	public String getServCode() {
		return this.servCode;
	}

	public void setServCode(String servCode) {
		this.servCode = servCode;
		if(servCode != null){
			putBodyParameter("ServCode", servCode);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getPipCode() {
		return this.pipCode;
	}

	public void setPipCode(String pipCode) {
		this.pipCode = pipCode;
		if(pipCode != null){
			putBodyParameter("PipCode", pipCode);
		}
	}

	public Long getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(Long chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putBodyParameter("ChargeType", chargeType.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putBodyParameter("Bid", bid);
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putBodyParameter("Account", account);
		}
	}

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
		if(goodsType != null){
			putBodyParameter("GoodsType", goodsType);
		}
	}

	public static class ConditionAttributes {

		@SerializedName("Conditions")
		private List<ConditionsItem> conditions;

		@SerializedName("Results")
		private List<ResultsItem> results;

		public List<ConditionsItem> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<ConditionsItem> conditions) {
			this.conditions = conditions;
		}

		public List<ResultsItem> getResults() {
			return this.results;
		}

		public void setResults(List<ResultsItem> results) {
			this.results = results;
		}

		public static class ConditionsItem {

			@SerializedName("FieldName")
			private String fieldName;

			@SerializedName("FieldCode")
			private String fieldCode;

			@SerializedName("FieldValue")
			private String fieldValue;

			public String getFieldName() {
				return this.fieldName;
			}

			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}

			public String getFieldCode() {
				return this.fieldCode;
			}

			public void setFieldCode(String fieldCode) {
				this.fieldCode = fieldCode;
			}

			public String getFieldValue() {
				return this.fieldValue;
			}

			public void setFieldValue(String fieldValue) {
				this.fieldValue = fieldValue;
			}
		}

		public static class ResultsItem {

			@SerializedName("FieldCode")
			private String fieldCode;

			@SerializedName("FieldValue")
			private String fieldValue;

			@SerializedName("FiledName")
			private String filedName;

			public String getFieldCode() {
				return this.fieldCode;
			}

			public void setFieldCode(String fieldCode) {
				this.fieldCode = fieldCode;
			}

			public String getFieldValue() {
				return this.fieldValue;
			}

			public void setFieldValue(String fieldValue) {
				this.fieldValue = fieldValue;
			}

			public String getFiledName() {
				return this.filedName;
			}

			public void setFiledName(String filedName) {
				this.filedName = filedName;
			}
		}
	}

	@Override
	public Class<SyncCommodityAndStartBpmsPostResponse> getResponseClass() {
		return SyncCommodityAndStartBpmsPostResponse.class;
	}

}
