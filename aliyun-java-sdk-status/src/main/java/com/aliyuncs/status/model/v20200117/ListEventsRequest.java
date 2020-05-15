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

package com.aliyuncs.status.model.v20200117;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListEventsRequest extends RpcAcsRequest<ListEventsResponse> {
	   

	private String endDate;

	private String productId;

	private Integer numOfDay;
	public ListEventsRequest() {
		super("Status", "2020-01-17", "ListEvents", "StatusAPI");
		setMethod(MethodType.POST);
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId);
		}
	}

	public Integer getNumOfDay() {
		return this.numOfDay;
	}

	public void setNumOfDay(Integer numOfDay) {
		this.numOfDay = numOfDay;
		if(numOfDay != null){
			putQueryParameter("NumOfDay", numOfDay.toString());
		}
	}

	@Override
	public Class<ListEventsResponse> getResponseClass() {
		return ListEventsResponse.class;
	}

}
