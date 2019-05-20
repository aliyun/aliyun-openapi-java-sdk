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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryNumber400ListRequest extends RpcAcsRequest<QueryNumber400ListResponse> {
	
	public QueryNumber400ListRequest() {
		super("CloudCallCenter", "2017-07-05", "QueryNumber400List", "CloudCallCenter", "innerAPI");
	}

	private Long specId;

	private String monthPrice;

	private String orderId;

	private Integer numberCount;

	private Integer levelId;

	private Long realNameInsId;

	public Long getSpecId() {
		return this.specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
		if(specId != null){
			putQueryParameter("SpecId", specId.toString());
		}
	}

	public String getMonthPrice() {
		return this.monthPrice;
	}

	public void setMonthPrice(String monthPrice) {
		this.monthPrice = monthPrice;
		if(monthPrice != null){
			putQueryParameter("MonthPrice", monthPrice);
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

	public Integer getNumberCount() {
		return this.numberCount;
	}

	public void setNumberCount(Integer numberCount) {
		this.numberCount = numberCount;
		if(numberCount != null){
			putQueryParameter("NumberCount", numberCount.toString());
		}
	}

	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
		if(levelId != null){
			putQueryParameter("LevelId", levelId.toString());
		}
	}

	public Long getRealNameInsId() {
		return this.realNameInsId;
	}

	public void setRealNameInsId(Long realNameInsId) {
		this.realNameInsId = realNameInsId;
		if(realNameInsId != null){
			putQueryParameter("RealNameInsId", realNameInsId.toString());
		}
	}

	@Override
	public Class<QueryNumber400ListResponse> getResponseClass() {
		return QueryNumber400ListResponse.class;
	}

}
