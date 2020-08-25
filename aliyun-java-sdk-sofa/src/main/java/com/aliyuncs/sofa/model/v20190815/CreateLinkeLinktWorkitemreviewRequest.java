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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeLinktWorkitemreviewRequest extends RpcAcsRequest<CreateLinkeLinktWorkitemreviewResponse> {
	   

	private String theme;

	private String workItemSign;

	private List<String> reviewersRepeatLists;

	private Long endDate;
	public CreateLinkeLinktWorkitemreviewRequest() {
		super("SOFA", "2019-08-15", "CreateLinkeLinktWorkitemreview", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
		if(theme != null){
			putBodyParameter("Theme", theme);
		}
	}

	public String getWorkItemSign() {
		return this.workItemSign;
	}

	public void setWorkItemSign(String workItemSign) {
		this.workItemSign = workItemSign;
		if(workItemSign != null){
			putBodyParameter("WorkItemSign", workItemSign);
		}
	}

	public List<String> getReviewersRepeatLists() {
		return this.reviewersRepeatLists;
	}

	public void setReviewersRepeatLists(List<String> reviewersRepeatLists) {
		this.reviewersRepeatLists = reviewersRepeatLists;	
		if (reviewersRepeatLists != null) {
			for (int i = 0; i < reviewersRepeatLists.size(); i++) {
				putBodyParameter("ReviewersRepeatList." + (i + 1) , reviewersRepeatLists.get(i));
			}
		}	
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putBodyParameter("EndDate", endDate.toString());
		}
	}

	@Override
	public Class<CreateLinkeLinktWorkitemreviewResponse> getResponseClass() {
		return CreateLinkeLinktWorkitemreviewResponse.class;
	}

}
