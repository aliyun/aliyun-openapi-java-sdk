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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListUserProducesRequest extends RpcAcsRequest<ListUserProducesResponse> {
	   

	private String intentionBizId;

	private Integer pageNum;

	private Integer pageSize;

	private String sortParam;

	private String extCondition;

	private String orderId;

	private List<Object> existStatus;

	private String bizType;

	private String bizId;

	private String solutionBizId;

	private Integer status;
	public ListUserProducesRequest() {
		super("Copyright", "2019-01-23", "ListUserProduces");
		setMethod(MethodType.POST);
	}

	public String getIntentionBizId() {
		return this.intentionBizId;
	}

	public void setIntentionBizId(String intentionBizId) {
		this.intentionBizId = intentionBizId;
		if(intentionBizId != null){
			putQueryParameter("IntentionBizId", intentionBizId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSortParam() {
		return this.sortParam;
	}

	public void setSortParam(String sortParam) {
		this.sortParam = sortParam;
		if(sortParam != null){
			putQueryParameter("SortParam", sortParam);
		}
	}

	public String getExtCondition() {
		return this.extCondition;
	}

	public void setExtCondition(String extCondition) {
		this.extCondition = extCondition;
		if(extCondition != null){
			putQueryParameter("ExtCondition", extCondition);
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
		}
	}

	public List<Object> getExistStatus() {
		return this.existStatus;
	}

	public void setExistStatus(List<Object> existStatus) {
		this.existStatus = existStatus;
		if(existStatus != null){
			putQueryParameter("ExistStatus", new Gson().toJson(existStatus));
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getSolutionBizId() {
		return this.solutionBizId;
	}

	public void setSolutionBizId(String solutionBizId) {
		this.solutionBizId = solutionBizId;
		if(solutionBizId != null){
			putQueryParameter("SolutionBizId", solutionBizId);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ListUserProducesResponse> getResponseClass() {
		return ListUserProducesResponse.class;
	}

}
