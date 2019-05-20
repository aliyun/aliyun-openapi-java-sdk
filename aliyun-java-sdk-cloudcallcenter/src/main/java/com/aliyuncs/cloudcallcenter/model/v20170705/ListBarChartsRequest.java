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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ListBarChartsRequest extends RpcAcsRequest<ListBarChartsResponse> {
	
	public ListBarChartsRequest() {
		super("CloudCallCenter", "2017-07-05", "ListBarCharts", "CloudCallCenter", "innerAPI");
	}

	private String date;

	private String instanceId;

	private String dimension;

	private List<String> indicatorNames;

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
		if(date != null){
			putQueryParameter("Date", date);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension);
		}
	}

	public List<String> getIndicatorNames() {
		return this.indicatorNames;
	}

	public void setIndicatorNames(List<String> indicatorNames) {
		this.indicatorNames = indicatorNames;	
		if (indicatorNames != null) {
			for (int i = 0; i < indicatorNames.size(); i++) {
				putQueryParameter("IndicatorName." + (i + 1) , indicatorNames.get(i));
			}
		}	
	}

	@Override
	public Class<ListBarChartsResponse> getResponseClass() {
		return ListBarChartsResponse.class;
	}

}
