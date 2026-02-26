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

package com.aliyuncs.cd.model.v2021127;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cd.transform.v2021127.GetMenuDataStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMenuDataStatusResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String code;

	private Integer httpStatusCode;

	private String requestId;

	private String productContainerId;

	private String batchId;

	private Long total;

	private Long failed;

	private List<String> failedProductContainerList;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProductContainerId() {
		return this.productContainerId;
	}

	public void setProductContainerId(String productContainerId) {
		this.productContainerId = productContainerId;
	}

	public String getBatchId() {
		return this.batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getFailed() {
		return this.failed;
	}

	public void setFailed(Long failed) {
		this.failed = failed;
	}

	public List<String> getFailedProductContainerList() {
		return this.failedProductContainerList;
	}

	public void setFailedProductContainerList(List<String> failedProductContainerList) {
		this.failedProductContainerList = failedProductContainerList;
	}

	@Override
	public GetMenuDataStatusResponse getInstance(UnmarshallerContext context) {
		return	GetMenuDataStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
