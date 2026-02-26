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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.BindAuthToMachineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BindAuthToMachineResponse extends AcsResponse {

	private Integer resultCode;

	private Integer insufficientCount;

	private String requestId;

	private Integer unBindCount;

	private Integer bindCount;

	private Integer insufficientEcsCount;

	private Integer insufficientCoreCount;

	public Integer getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public Integer getInsufficientCount() {
		return this.insufficientCount;
	}

	public void setInsufficientCount(Integer insufficientCount) {
		this.insufficientCount = insufficientCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getUnBindCount() {
		return this.unBindCount;
	}

	public void setUnBindCount(Integer unBindCount) {
		this.unBindCount = unBindCount;
	}

	public Integer getBindCount() {
		return this.bindCount;
	}

	public void setBindCount(Integer bindCount) {
		this.bindCount = bindCount;
	}

	public Integer getInsufficientEcsCount() {
		return this.insufficientEcsCount;
	}

	public void setInsufficientEcsCount(Integer insufficientEcsCount) {
		this.insufficientEcsCount = insufficientEcsCount;
	}

	public Integer getInsufficientCoreCount() {
		return this.insufficientCoreCount;
	}

	public void setInsufficientCoreCount(Integer insufficientCoreCount) {
		this.insufficientCoreCount = insufficientCoreCount;
	}

	@Override
	public BindAuthToMachineResponse getInstance(UnmarshallerContext context) {
		return	BindAuthToMachineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
