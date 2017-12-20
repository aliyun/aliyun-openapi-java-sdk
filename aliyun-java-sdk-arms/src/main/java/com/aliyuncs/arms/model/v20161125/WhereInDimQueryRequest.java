/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.arms.model.v20161125;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class WhereInDimQueryRequest extends RpcAcsRequest<WhereInDimQueryResponse> {
	
	public WhereInDimQueryRequest() {
		super("ARMS", "2016-11-25", "WhereInDimQuery");
	}

	private String dateStr;

	private Long minTime;

	private Boolean reduceTail;

	private Long maxTime;

	private String whereInKey;

	private List<String> measuress;

	private Integer intervalInSec;

	private Boolean isDrillDown;

	private String orderByKey;

	private Integer limit;

	private Long datasetId;

	private List<String> whereInValuess;

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

	public String getWhereInKey() {
		return this.whereInKey;
	}

	public void setWhereInKey(String whereInKey) {
		this.whereInKey = whereInKey;
		if(whereInKey != null){
			putQueryParameter("WhereInKey", whereInKey);
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

	public Long getDatasetId() {
		return this.datasetId;
	}

	public void setDatasetId(Long datasetId) {
		this.datasetId = datasetId;
		if(datasetId != null){
			putQueryParameter("DatasetId", datasetId.toString());
		}
	}

	public List<String> getWhereInValuess() {
		return this.whereInValuess;
	}

	public void setWhereInValuess(List<String> whereInValuess) {
		this.whereInValuess = whereInValuess;	
		if (whereInValuess != null) {
			for (int i = 0; i < whereInValuess.size(); i++) {
				putQueryParameter("WhereInValues." + (i + 1) , whereInValuess.get(i));
			}
		}	
	}

	public List<Dimensions> getDimensionss() {
		return this.dimensionss;
	}

	public void setDimensionss(List<Dimensions> dimensionss) {
		this.dimensionss = dimensionss;	
		if (dimensionss != null) {
			for (int depth1 = 0; depth1 < dimensionss.size(); depth1++) {
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Key" , dimensionss.get(depth1).getKey());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Value" , dimensionss.get(depth1).getValue());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Type" , dimensionss.get(depth1).getType());
			}
		}	
	}

	public static class Dimensions {

		private String key;

		private String value;

		private String type;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<WhereInDimQueryResponse> getResponseClass() {
		return WhereInDimQueryResponse.class;
	}

}
