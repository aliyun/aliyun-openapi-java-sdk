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

package com.aliyuncs.nlp_automl.model.v20191111;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlp_automl.transform.v20191111.CreateDatasetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDatasetResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> datasetId;

	private Integer code;

	private String message;

	private Boolean success;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getDatasetId() {
		return this.datasetId;
	}

	public void setDatasetId(Map<Object,Object> datasetId) {
		this.datasetId = datasetId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public CreateDatasetResponse getInstance(UnmarshallerContext context) {
		return	CreateDatasetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
