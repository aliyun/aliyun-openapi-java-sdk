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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountsRequest extends RpcAcsRequest<DescribeAccountsResponse> {
	   

	private String productCode;

	private String packageId;

	private Integer pageSize;

	private String tableId;

	private String lang;

	private String key;

	private Integer queryType;

	private String loginName;

	private Integer featureType;

	private String columnId;

	private Integer currentPage;

	private String instanceId;

	private Long departId;

	private Integer operationId;
	public DescribeAccountsRequest() {
		super("Sddp", "2019-01-03", "DescribeAccounts", "sddp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
		if(packageId != null){
			putQueryParameter("PackageId", packageId);
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

	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
		if(tableId != null){
			putQueryParameter("TableId", tableId);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public Integer getQueryType() {
		return this.queryType;
	}

	public void setQueryType(Integer queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType.toString());
		}
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
		if(loginName != null){
			putQueryParameter("LoginName", loginName);
		}
	}

	public Integer getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(Integer featureType) {
		this.featureType = featureType;
		if(featureType != null){
			putQueryParameter("FeatureType", featureType.toString());
		}
	}

	public String getColumnId() {
		return this.columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
		if(columnId != null){
			putQueryParameter("ColumnId", columnId);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getDepartId() {
		return this.departId;
	}

	public void setDepartId(Long departId) {
		this.departId = departId;
		if(departId != null){
			putQueryParameter("DepartId", departId.toString());
		}
	}

	public Integer getOperationId() {
		return this.operationId;
	}

	public void setOperationId(Integer operationId) {
		this.operationId = operationId;
		if(operationId != null){
			putQueryParameter("OperationId", operationId.toString());
		}
	}

	@Override
	public Class<DescribeAccountsResponse> getResponseClass() {
		return DescribeAccountsResponse.class;
	}

}
