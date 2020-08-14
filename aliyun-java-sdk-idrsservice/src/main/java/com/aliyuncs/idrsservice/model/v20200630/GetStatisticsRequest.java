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

package com.aliyuncs.idrsservice.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetStatisticsRequest extends RpcAcsRequest<GetStatisticsResponse> {
	   

	private List<String> departmentIds;

	private String dateTo;

	private String dateFrom;
	public GetStatisticsRequest() {
		super("idrsservice", "2020-06-30", "GetStatistics", "idrsservice");
		setMethod(MethodType.POST);
	}

	public List<String> getDepartmentIds() {
		return this.departmentIds;
	}

	public void setDepartmentIds(List<String> departmentIds) {
		this.departmentIds = departmentIds;	
		if (departmentIds != null) {
			for (int i = 0; i < departmentIds.size(); i++) {
				putQueryParameter("DepartmentId." + (i + 1) , departmentIds.get(i));
			}
		}	
	}

	public String getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
		if(dateTo != null){
			putQueryParameter("DateTo", dateTo);
		}
	}

	public String getDateFrom() {
		return this.dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
		if(dateFrom != null){
			putQueryParameter("DateFrom", dateFrom);
		}
	}

	@Override
	public Class<GetStatisticsResponse> getResponseClass() {
		return GetStatisticsResponse.class;
	}

}
