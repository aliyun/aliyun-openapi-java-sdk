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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertSourceRequest extends RpcAcsRequest<DescribeAlertSourceResponse> {
	   

	private Long startTime;

	private List<String> levels;

	private Long endTime;
	public DescribeAlertSourceRequest() {
		super("cloud-siem", "2022-06-16", "DescribeAlertSource", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public List<String> getLevels() {
		return this.levels;
	}

	public void setLevels(List<String> levels) {
		this.levels = levels;	
		if (levels != null) {
			for (int i = 0; i < levels.size(); i++) {
				putBodyParameter("Level." + (i + 1) , levels.get(i));
			}
		}	
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	@Override
	public Class<DescribeAlertSourceResponse> getResponseClass() {
		return DescribeAlertSourceResponse.class;
	}

}
