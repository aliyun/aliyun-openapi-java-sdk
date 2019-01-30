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

package com.aliyuncs.arms.model.v20181219;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ARMSQueryDataSetRequest extends RpcAcsRequest<ARMSQueryDataSetResponse> {
	
	public ARMSQueryDataSetRequest() {
		super("ARMS", "2018-12-19", "ARMSQueryDataSet");
	}

	private String dateStr;

	private Long minTime;

	private Boolean reduceTail;

	private Long maxTime;

	private List<OptionalDims> optionalDimss;

	private List<String> measuress;

	private Integer intervalInSec;

	private Boolean isDrillDown;

	private Boolean hungryMode;

	private String securityToken;

	private String orderByKey;

	private Integer limit;

	private List<RequiredDims> requiredDimss;

	private Long datasetId;

	private List<Dimensions> dimensionss;

	public String getDateStr() {
		return this.dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
		if(dateStr != null){
			putQueryParameter("DateStr", dateStr);
		}
	}

	public Long getMinTime() {
		return this.minTime;
	}

	public void setMinTime(Long minTime) {
		this.minTime = minTime;
		if(minTime != null){
			putQueryParameter("MinTime", minTime.toString());
		}
	}

	public Boolean getReduceTail() {
		return this.reduceTail;
	}

	public void setReduceTail(Boolean reduceTail) {
		this.reduceTail = reduceTail;
		if(reduceTail != null){
			putQueryParameter("ReduceTail", reduceTail.toString());
		}
	}

	public Long getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(Long maxTime) {
		this.maxTime = maxTime;
		if(maxTime != null){
			putQueryParameter("MaxTime", maxTime.toString());
		}
	}

	public List<OptionalDims> getOptionalDimss() {
		return this.optionalDimss;
	}

	public void setOptionalDimss(List<OptionalDims> optionalDimss) {
		this.optionalDimss = optionalDimss;	
		if (optionalDimss != null) {
			for (int depth1 = 0; depth1 < optionalDimss.size(); depth1++) {
				putQueryParameter("OptionalDims." + (depth1 + 1) + ".Type" , optionalDimss.get(depth1).getType());
				putQueryParameter("OptionalDims." + (depth1 + 1) + ".Value" , optionalDimss.get(depth1).getValue());
				putQueryParameter("OptionalDims." + (depth1 + 1) + ".Key" , optionalDimss.get(depth1).getKey());
			}
		}	
	}

	public List<String> getMeasuress() {
		return this.measuress;
	}

	public void setMeasuress(List<String> measuress) {
		this.measuress = measuress;	
		if (measuress != null) {
			for (int i = 0; i < measuress.size(); i++) {
				putQueryParameter("Measures." + (i + 1) , measuress.get(i));
			}
		}	
	}

	public Integer getIntervalInSec() {
		return this.intervalInSec;
	}

	public void setIntervalInSec(Integer intervalInSec) {
		this.intervalInSec = intervalInSec;
		if(intervalInSec != null){
			putQueryParameter("IntervalInSec", intervalInSec.toString());
		}
	}

	public Boolean getIsDrillDown() {
		return this.isDrillDown;
	}

	public void setIsDrillDown(Boolean isDrillDown) {
		this.isDrillDown = isDrillDown;
		if(isDrillDown != null){
			putQueryParameter("IsDrillDown", isDrillDown.toString());
		}
	}

	public Boolean getHungryMode() {
		return this.hungryMode;
	}

	public void setHungryMode(Boolean hungryMode) {
		this.hungryMode = hungryMode;
		if(hungryMode != null){
			putQueryParameter("HungryMode", hungryMode.toString());
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getOrderByKey() {
		return this.orderByKey;
	}

	public void setOrderByKey(String orderByKey) {
		this.orderByKey = orderByKey;
		if(orderByKey != null){
			putQueryParameter("OrderByKey", orderByKey);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public List<RequiredDims> getRequiredDimss() {
		return this.requiredDimss;
	}

	public void setRequiredDimss(List<RequiredDims> requiredDimss) {
		this.requiredDimss = requiredDimss;	
		if (requiredDimss != null) {
			for (int depth1 = 0; depth1 < requiredDimss.size(); depth1++) {
				putQueryParameter("RequiredDims." + (depth1 + 1) + ".Type" , requiredDimss.get(depth1).getType());
				putQueryParameter("RequiredDims." + (depth1 + 1) + ".Value" , requiredDimss.get(depth1).getValue());
				putQueryParameter("RequiredDims." + (depth1 + 1) + ".Key" , requiredDimss.get(depth1).getKey());
			}
		}	
	}

	public Long getDatasetId() {
		return this.datasetId;
	}

	public void setDatasetId(Long datasetId) {
		this.datasetId = datasetId;
		if(datasetId != null){
			putQueryParameter("DatasetId", datasetId.toString());
		}
	}

	public List<Dimensions> getDimensionss() {
		return this.dimensionss;
	}

	public void setDimensionss(List<Dimensions> dimensionss) {
		this.dimensionss = dimensionss;	
		if (dimensionss != null) {
			for (int depth1 = 0; depth1 < dimensionss.size(); depth1++) {
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Type" , dimensionss.get(depth1).getType());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Value" , dimensionss.get(depth1).getValue());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Key" , dimensionss.get(depth1).getKey());
			}
		}	
	}

	public static class OptionalDims {

		private String type;

		private String value;

		private String key;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class RequiredDims {

		private String type;

		private String value;

		private String key;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class Dimensions {

		private String type;

		private String value;

		private String key;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ARMSQueryDataSetResponse> getResponseClass() {
		return ARMSQueryDataSetResponse.class;
	}

}
