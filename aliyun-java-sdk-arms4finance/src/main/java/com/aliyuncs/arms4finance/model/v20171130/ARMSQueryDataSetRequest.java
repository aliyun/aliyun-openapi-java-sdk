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

package com.aliyuncs.arms4finance.model.v20171130;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ARMSQueryDataSetRequest extends RpcAcsRequest<ARMSQueryDataSetResponse> {
	
	public ARMSQueryDataSetRequest() {
		super("ARMS4FINANCE", "2017-11-30", "ARMSQueryDataSet", "arms4finance");
	}

	private List<String> measuress;

	private Integer intervalInSec;

	private String dateStr;

	private Boolean isDrillDown;

	private Long minTime;

	private Long datasetId;

	private Long maxTime;

	private List<Dimensions> dimensionss;

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

	public String getDateStr() {
		return this.dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
		if(dateStr != null){
			putQueryParameter("DateStr", dateStr);
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

	public Long getMinTime() {
		return this.minTime;
	}

	public void setMinTime(Long minTime) {
		this.minTime = minTime;
		if(minTime != null){
			putQueryParameter("MinTime", minTime.toString());
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

	public Long getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(Long maxTime) {
		this.maxTime = maxTime;
		if(maxTime != null){
			putQueryParameter("MaxTime", maxTime.toString());
		}
	}

	public List<Dimensions> getDimensionss() {
		return this.dimensionss;
	}

	public void setDimensionss(List<Dimensions> dimensionss) {
		this.dimensionss = dimensionss;	
		if (dimensionss != null) {
			for (int depth1 = 0; depth1 < dimensionss.size(); depth1++) {
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Value" , dimensionss.get(depth1).getValue());
				putQueryParameter("Dimensions." + (depth1 + 1) + ".Key" , dimensionss.get(depth1).getKey());
			}
		}	
	}

	public static class Dimensions {

		private String value;

		private String key;

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
