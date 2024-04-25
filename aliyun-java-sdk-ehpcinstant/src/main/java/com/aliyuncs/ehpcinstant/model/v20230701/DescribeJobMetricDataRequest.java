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

package com.aliyuncs.ehpcinstant.model.v20230701;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobMetricDataRequest extends RpcAcsRequest<DescribeJobMetricDataResponse> {
	   

	private String taskName;

	private String jobId;

	private String metricName;

	@SerializedName("arrayIndex")
	private List<Integer> arrayIndex;
	public DescribeJobMetricDataRequest() {
		super("EhpcInstant", "2023-07-01", "DescribeJobMetricData");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public List<Integer> getArrayIndex() {
		return this.arrayIndex;
	}

	public void setArrayIndex(List<Integer> arrayIndex) {
		this.arrayIndex = arrayIndex;	
		if (arrayIndex != null) {
			putQueryParameter("ArrayIndex" , new Gson().toJson(arrayIndex));
		}	
	}

	@Override
	public Class<DescribeJobMetricDataResponse> getResponseClass() {
		return DescribeJobMetricDataResponse.class;
	}

}
