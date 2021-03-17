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

package com.aliyuncs.marketing_event.model.v20210101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TestAddRealCostRequest extends RpcAcsRequest<TestAddRealCostResponse> {
	   

	private Long id;

	private Long cost;

	private String empId;
	public TestAddRealCostRequest() {
		super("marketing_event", "2021-01-01", "TestAddRealCost");
		setMethod(MethodType.POST);
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Long getCost() {
		return this.cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
		if(cost != null){
			putQueryParameter("Cost", cost.toString());
		}
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
		if(empId != null){
			putQueryParameter("EmpId", empId);
		}
	}

	@Override
	public Class<TestAddRealCostResponse> getResponseClass() {
		return TestAddRealCostResponse.class;
	}

}
