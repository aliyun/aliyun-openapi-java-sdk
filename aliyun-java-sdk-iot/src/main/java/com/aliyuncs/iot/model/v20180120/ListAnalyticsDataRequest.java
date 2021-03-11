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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAnalyticsDataRequest extends RpcAcsRequest<ListAnalyticsDataResponse> {
	   

	private Integer pageNum;

	private String iotInstanceId;

	private Integer pageSize;

	private String isoId;

	private String apiPath;

	private List<Condition> conditions;
	public ListAnalyticsDataRequest() {
		super("Iot", "2018-01-20", "ListAnalyticsData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public String getIsoId() {
		return this.isoId;
	}

	public void setIsoId(String isoId) {
		this.isoId = isoId;
		if(isoId != null){
			putQueryParameter("IsoId", isoId);
		}
	}

	public String getApiPath() {
		return this.apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
		if(apiPath != null){
			putQueryParameter("ApiPath", apiPath);
		}
	}

	public List<Condition> getConditions() {
		return this.conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;	
		if (conditions != null) {
			for (int depth1 = 0; depth1 < conditions.size(); depth1++) {
				putQueryParameter("Condition." + (depth1 + 1) + ".FieldName" , conditions.get(depth1).getFieldName());
				putQueryParameter("Condition." + (depth1 + 1) + ".Operate" , conditions.get(depth1).getOperate());
				putQueryParameter("Condition." + (depth1 + 1) + ".BetweenStart" , conditions.get(depth1).getBetweenStart());
				putQueryParameter("Condition." + (depth1 + 1) + ".BetweenEnd" , conditions.get(depth1).getBetweenEnd());
				putQueryParameter("Condition." + (depth1 + 1) + ".Value" , conditions.get(depth1).getValue());
			}
		}	
	}

	public static class Condition {

		private String fieldName;

		private String operate;

		private String betweenStart;

		private String betweenEnd;

		private String value;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getOperate() {
			return this.operate;
		}

		public void setOperate(String operate) {
			this.operate = operate;
		}

		public String getBetweenStart() {
			return this.betweenStart;
		}

		public void setBetweenStart(String betweenStart) {
			this.betweenStart = betweenStart;
		}

		public String getBetweenEnd() {
			return this.betweenEnd;
		}

		public void setBetweenEnd(String betweenEnd) {
			this.betweenEnd = betweenEnd;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ListAnalyticsDataResponse> getResponseClass() {
		return ListAnalyticsDataResponse.class;
	}

}
