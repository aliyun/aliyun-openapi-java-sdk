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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.CreateBatchOperateCardsTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateBatchOperateCardsTaskResponse extends AcsResponse {

	private String requestId;

	private String batchOperateCardsTaskId;

	private String operateResultOssFilePath;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBatchOperateCardsTaskId() {
		return this.batchOperateCardsTaskId;
	}

	public void setBatchOperateCardsTaskId(String batchOperateCardsTaskId) {
		this.batchOperateCardsTaskId = batchOperateCardsTaskId;
	}

	public String getOperateResultOssFilePath() {
		return this.operateResultOssFilePath;
	}

	public void setOperateResultOssFilePath(String operateResultOssFilePath) {
		this.operateResultOssFilePath = operateResultOssFilePath;
	}

	@Override
	public CreateBatchOperateCardsTaskResponse getInstance(UnmarshallerContext context) {
		return	CreateBatchOperateCardsTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
