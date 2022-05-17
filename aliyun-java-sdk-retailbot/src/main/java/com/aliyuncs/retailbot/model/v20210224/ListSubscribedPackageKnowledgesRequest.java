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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSubscribedPackageKnowledgesRequest extends RpcAcsRequest<ListSubscribedPackageKnowledgesResponse> {
	   

	private List<String> packageCodes;

	private String operatorId;

	private Long categoryId;

	private String robotCode;

	private String operatorName;
	public ListSubscribedPackageKnowledgesRequest() {
		super("RetailBot", "2021-02-24", "ListSubscribedPackageKnowledges");
		setMethod(MethodType.POST);
	}

	public List<String> getPackageCodes() {
		return this.packageCodes;
	}

	public void setPackageCodes(List<String> packageCodes) {
		this.packageCodes = packageCodes;	
		if (packageCodes != null) {
			for (int depth1 = 0; depth1 < packageCodes.size(); depth1++) {
				putBodyParameter("PackageCodes." + (depth1 + 1) , packageCodes.get(depth1));
			}
		}	
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putBodyParameter("OperatorId", operatorId);
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putBodyParameter("CategoryId", categoryId.toString());
		}
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	@Override
	public Class<ListSubscribedPackageKnowledgesResponse> getResponseClass() {
		return ListSubscribedPackageKnowledgesResponse.class;
	}

}
