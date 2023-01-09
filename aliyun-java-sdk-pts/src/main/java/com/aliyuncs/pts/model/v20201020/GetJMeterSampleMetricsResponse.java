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

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.GetJMeterSampleMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJMeterSampleMetricsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Map<Object,Object> samplerMap;

	private String code;

	private Boolean success;

	private List<String> sampleMetricList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<Object,Object> getSamplerMap() {
		return this.samplerMap;
	}

	public void setSamplerMap(Map<Object,Object> samplerMap) {
		this.samplerMap = samplerMap;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<String> getSampleMetricList() {
		return this.sampleMetricList;
	}

	public void setSampleMetricList(List<String> sampleMetricList) {
		this.sampleMetricList = sampleMetricList;
	}

	@Override
	public GetJMeterSampleMetricsResponse getInstance(UnmarshallerContext context) {
		return	GetJMeterSampleMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
